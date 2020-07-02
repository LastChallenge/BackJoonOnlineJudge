/*
 * 백준 2675번 - 문자열 반복
 * 반복 횟수(R)와 문자열(S)가 주어지면 각 자리의 문자를 반복 횟수만큼 반복 하면서 출력
 * 
 */

package 문자열;
import java.util.Scanner;

public class N2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int i =0; i < T; i++) {
			int R = sc.nextInt();  //반복 횟수
			String S = sc.next(); // 문자열 S
			String str = null;
		
			
			for(int j = 0; j < S.length(); j++) { //문자열의 길이 ABC
				for(int k = 0; k < R; k++) { //반복 횟수
					str = Character.toString(S.charAt(j));
					str.concat(str);
					System.out.print(str);
				}
			}
			System.out.println();
		}
	}
}
