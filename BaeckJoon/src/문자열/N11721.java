package ¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11721 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		N11721 n11721 = new N11721();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String S = bf.readLine();
		
		char[] word = new char[S.length()];
		
		if(S.length() < 10) {
			System.out.println(S);
		} else {
			word = n11721.splitWord(S, word);
			n11721.wordBreak(word);
		}
	}
	
	public char[] splitWord(String S, char[] word) {

		for(int i = 0; i < S.length(); i++) {
			word[i] = S.charAt(i);		
		}
		
		return word;
	}
	
	public void wordBreak(char[] word) {
		
		//BaekjoonOnlineJudge  19
		//BaekjoonOn  10
		//lineJudge    9
		
	
		for(int i = 0; i < word.length; i++) {
			if(i % 10 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(word[i]);
		}
		
		
		
	}
}
