/*
 * 백준 11654번 - 아스키 코드
 * 입력한 단어를 아스키 코드로 변환하는 문제
 */

package 문자열;
import java.util.Scanner;

public class N11654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char asci = sc.next().charAt(0);
		
		
		int ascitoInt = (asci - '0') + 48;
		
		
		System.out.println(ascitoInt);

	}

}
