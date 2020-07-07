/*
 * 단어 공부 - 가장 많이 나온 단어를 출력하는 문제 단! 많이 나온 단어가 중복이면 '?' 출력
 * 2020-07-07
 */
package 문자열;

import java.util.Scanner;

public class N1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); //M i s s i s s i p i
		
		sc.close();
		s = s.toUpperCase(); // M I S S I S S I P I
		
		
		int[] cnt_word = new int[26];
		int max_cnt = 0;
		char answer = '?';
		
		for(int i = 0; i < s.length(); i++) {
			cnt_word[s.charAt(i) - 65]++;
		}
		
		
		for(int i = 0; i < cnt_word.length; i++) {
			if(max_cnt < cnt_word[i]) {
				max_cnt = cnt_word[i];  // 알파벳 등장 횟수
			    answer = (char) (i + 65); // 무슨 알파벳인지
			} else if(cnt_word[i] == max_cnt) { //
				answer = '?';
			}

			
		}
		System.out.println(answer);
	}

}
