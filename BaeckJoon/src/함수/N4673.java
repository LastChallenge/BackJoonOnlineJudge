package ÇÔ¼ö;
public class N4673 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Max = 10000;
		boolean[] SelfNumlist = new boolean[Max];
		
		for(int i =1; i < Max; i++) {
			if(SelfNumber(i) <= Max) {
				SelfNumlist[SelfNumber(i) - 1] = true;
			}
		}
		
		for(int i =0; i < 10000; i++) {
			if(!SelfNumlist[i]) {
				System.out.println(i + 1);
			}
		}
		
	}
	
	public static int SelfNumber(int n) {
		
		int sum = n;
		
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}


