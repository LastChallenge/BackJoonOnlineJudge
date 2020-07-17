package string;

import java.io.*;

public class N1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		int c_spacing = 0;
		
		s = s.trim();
		
		if(s.length() == 0) {
			System.out.println(0);
		} else {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != (char)32) {
					continue;
				} else {
					c_spacing++;
				}
			}
			System.out.println(c_spacing + 1);
		}
	}
}
