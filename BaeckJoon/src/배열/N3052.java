
package ¹è¿­;
import java.util.Scanner;

public class N3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[10];
		int cnt = 10;
		
		for(int i =0; i <list.length; i++) {
			list[i] = sc.nextInt();
			
			list[i] = list[i] % 42;
		}
		
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = i+1; j < list.length; j++) {
				if(list[i] == list[j]) {
					cnt--;
					break;
				}
				
			}
			/*
			while(list[i] == list[j++]) { // 0 ~ 9
				if(i + 1 == j) {
					break;
				}
				if(list[i] == list[j]) {
					cnt--;
				}
			} */
		}
		System.out.print(cnt);
	}

}
