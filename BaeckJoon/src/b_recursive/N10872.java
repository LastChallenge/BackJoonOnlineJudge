package b_recursive;


import java.util.Scanner;

public class N10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		N10872 n10872 = new N10872();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.close();

		int result = n10872.facto(n);
		
		System.out.println(result);
	}
	
	public int facto(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * facto(n - 1);
		}
	}

}
