package ¹®ÀÚ¿­;

import java.io.*;

public class N2941 {
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		
		bf.close();
		
		String[] Croatia_Alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < Croatia_Alphabet.length; i++) {
			//ljes=njak
			if(s.contains(Croatia_Alphabet[i])) {
				s = s.replaceAll(Croatia_Alphabet[i], "*");
				
			}
		}
		
		int result = s.length();
		
		bw.write(result + "\n");
		
		bw.flush();
		bw.close();
	}

}
