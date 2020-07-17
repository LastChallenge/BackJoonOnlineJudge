package function;

import java.util.Scanner;

public class N1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Hansu = 0;
		
		int N = sc.nextInt();
		
		if(N < 100) {
			System.out.println(N);
		}
		
		for(int i = 100; i <= N; i++) {
			Hansu += CheckHansu(i);
		}
		
		if(N >= 100) {
			System.out.println(Hansu + 99);
		}
		
	}
	
	// 201 = [1] [0] [2]
	public static int CheckHansu(int n) {
		
		int i = 0;
		int num_Hansu = 0;
		
		if(n == 1000) {
			return 0;
		} 
		
		int[] Hansulist = new int[3];
		
		
		//201 = [1] [0] [2]
		//       0   1   2
		//1000 = [0] [0] [0] [1]
		//        0   1   2   3
		while(n != 0){
			int res = n % 10;
			Hansulist[i] = res;
			 n /= 10;
			 i++;
		}
		 
		if(Hansulist[2] - Hansulist[1] == Hansulist[1] - Hansulist[0]) {
			num_Hansu++;
		}
		
		return num_Hansu;
	}
}
