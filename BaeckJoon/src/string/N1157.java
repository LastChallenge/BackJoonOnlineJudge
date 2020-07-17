package string;

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
				max_cnt = cnt_word[i];  
			    answer = (char) (i + 65); 
			} else if(cnt_word[i] == max_cnt) { //
				answer = '?';
			}

			
		}
		System.out.println(answer);
	}

}
