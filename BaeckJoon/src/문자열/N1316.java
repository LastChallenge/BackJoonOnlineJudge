package 문자열;

import java.util.Scanner;


public class N1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		N1316 n1316 = new N1316();
		
		int check_count = 0;
		
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			
			char[] word = new char[S.length()];
			boolean[] diction = new boolean[26];
			
			word = n1316.word_break(S, word);
			
			boolean isGroupWord = n1316.check_GroupWord(word, diction);
			
			if(isGroupWord) {
				check_count++;
			}
		}
		
		System.out.println(check_count);
		sc.close();
	}
	
	public char[] word_break(String S, char[] word) {
	
		for(int i = 0; i < S.length(); i++) {
			word[i] = S.charAt(i);
		}
		return word;
	}
	
	public boolean check_GroupWord(char[] word, boolean[] diction) {
		
		for(int i = 0; i < word.length; i++) {
			if(diction[word[i] - 97] == false) {  //占쌔댐옙풔占� 占쌤어가 diction占썼열占쏙옙 占쌘몌옙占쏙옙 占썸문 占쏙옙占쌩다몌옙
				diction[word[i] - 97] = true;
			} else {
				if(word[i] == word[i - 1]) { //占쏙옙占쏙옙 占쏙옙占쏙옙 占쌤억옙占� 占쌔댐옙 占쌤어가 占쏙옙占쏙옙占쏙옙 占쏙옙
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
