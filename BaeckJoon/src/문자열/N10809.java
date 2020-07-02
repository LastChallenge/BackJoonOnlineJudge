/*
 * 백준 10809번 - 알파벳 찾기

 * 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제
 * 
 * 
 */

package 문자열;
import java.util.Scanner;

public class N10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		//baekjoon
		String str = sc.next();
		int size = str.length(); // 8
		
		int[] alphalist = new int[26];  // a ~ z
		
		for(int i =0; i < alphalist.length; i++) {
			alphalist[i] = -1;
		}
		
		
		for(int i =0; i < size; i++) {
			char word = str.charAt(i); //b  = 98 
			int listPo = word - 97; // 111 - 97 = 14
			
			if(alphalist[listPo] == -1) {
				alphalist[listPo] = i;
			}
		}
		
		for(int i = 0; i <alphalist.length; i++) {
			System.out.print(alphalist[i] + " ");
		}
	}
		
}
