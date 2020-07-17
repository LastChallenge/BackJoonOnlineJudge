package string;

import java.util.Scanner;

public class N2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int i =0; i < T; i++) {
			int R = sc.nextInt();  
			String S = sc.next();
			String str = null;
		
			
			for(int j = 0; j < S.length(); j++) { 
				for(int k = 0; k < R; k++) { 
					str = Character.toString(S.charAt(j));
					str.concat(str);
					System.out.print(str);
				}
			}
			System.out.println();
		}
	}
}
