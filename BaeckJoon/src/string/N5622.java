package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String S = st.nextToken();
		
		char[] list = new char[S.length()];
		int[] time = new int[26];
		int second = 3;
		int sum_sec = 0;
		
		for(int i =0; i < S.length(); i++) {  // 0 ~ 5
			
			list[i] = S.charAt(i);
		}
		
		for(int i = 0; i < time.length; i++) {  // 0 ~ 25
			
			if(i % 3 == 0 && i != 0) {
				second++;
			}
			
			time[i] = second;
			
			
			if(i == 18 | i == 21 | i == 24 | i == 25) {
				time[i] -= 1;
			}
			
			for(int j = 0; j < S.length(); j++) {
				if(list[j] - 'A' == i) {
					sum_sec += time[i];
				}
			}
			
		}
		
		System.out.println(sum_sec);
		
	}

}
