package 정렬;

import java.util.Scanner;

public class N2108 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      N2108 main = new N2108();
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[] nums = new int[n];
      
      for(int i = 0; i < n; i++) {
         nums[i] = sc.nextInt();
      }
      sc.close();
      
      System.out.println(main.getAvg(nums));
      System.out.println(main.getMedian(nums));
      System.out.println(main.getRange(nums));
   }
   public int getAvg(int[] nums) {  //산술평균
     double sum = 0.0;
     
     for(int i = 0; i < nums.length; i++) {
    	 sum += nums[i];
     }
     
     sum = Math.floor(sum / nums.length + 0.5); 
      
      return (int)sum;
   }
   
   public int getMedian(int[] nums) {  //중앙값
      //1 3 8 -2 2
      //-2 1 2 3 8
	   
	   if(nums.length == 1) {
		   return nums[0];
	   }
	   
      nums = sort(nums, 0, nums.length - 1);
      int mid = nums[nums.length / 2];
      
      return mid;
   }
   
   public int getMode(int[] nums) {  //최빈값
      
      
      return 0;
   }
   
   public int getRange(int[] nums) {  //범위
	   //-3 -2 -2 -1 -1
      nums = sort(nums, 0, nums.length - 1);
      int range = nums[nums.length - 1] - nums[0];
      
      return Math.abs(range);
   }
   
   public int[] sort(int[] nums, int p, int r) {
      
 
      /* 버블 정렬
      for(int i = 0; i < nums.length; i++) {
         for(int j = 1; j < nums.length - i; j++) {
            if(nums[j] < nums[j - 1]) {
               int temp = nums[j];
               nums[j] = nums[j - 1];
               nums[j - 1] = temp;
            }
         }
      }
      */
	   
      /* 선택 정렬 
      for(int i = 0; i < nums.length - 1; i++) {
         int min = i;
         for(int j = i + 1; j < nums.length; j++) {
            if(nums[min] > nums[j]) {
            	min = j;
            }
         }
         int temp = nums[min];
         nums[min] = nums[i];
         nums[i] = temp;
      }
      */
	   
	   
	   //병합 정렬 O(n*nlogn)
	   if(p < r) {
		   int q = (p + r) / 2; // 중간 지점
		   sort(nums, p, q);
		   sort(nums, q+1, r);
		   merge(nums, p, q, r);
	   }
	   
      return nums;
   }
   public int[] merge(int[] nums, int p, int q, int r) {
	   int i = p;
	   int j = q+1;
	   int t = 0;
	   int[] tmp = new int[nums.length];
	   
	   while(i <= q && j <= r) {
		   if(nums[i] <= nums[j]) {
			   tmp[t++] = nums[i++];
		   } else {
			   tmp[t++] = nums[j++];
		   }
	   }
	   
	   while(i <= q) {
		   tmp[t++] = nums[i++];
	   }
	   
	   while(j <= r) {
		   tmp[t++] = nums[j++];
	   }
	   i = p;
	   t = 0;
	   while(i <= r) {
		   nums[i++] = tmp[t++];
	   }
	   
	   return tmp;
   }
   
   // 계수정렬 이용 해볼 예정...
   public int[] Csort(int[] nums) {
	   int[] cnt = new int[8001];
	   
	   for(int i = 0; i < cnt.length; i++) {
		   
	   }
	   
	   
	   return nums;
   }
   
}