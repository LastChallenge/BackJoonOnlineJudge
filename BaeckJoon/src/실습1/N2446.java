package ½Ç½À1;

import java.util.Scanner;

public class N2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int k =0; k < (n*2 - 1) - (i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 1; j < (n-1) - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <3+2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}
}
