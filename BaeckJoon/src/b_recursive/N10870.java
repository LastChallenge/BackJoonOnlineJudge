package b_recursive;

import java.util.Scanner;

public class N10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N10870 n10870 = new N10870();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = n10870.fibo(n);
		
		System.out.println(result);

	}
	
	public int fibo(int n) {
		if(n == 0) {
			return 0;
		} else  if(n == 1){
			return 1;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

}
