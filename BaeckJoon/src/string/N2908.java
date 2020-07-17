package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2908 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int number1 = Integer.parseInt(st.nextToken());  // 734
		int number2 = Integer.parseInt(st.nextToken());  // 893
		
		String Cnumber1 = Integer.toString(number1);  // "734"
		String Cnumber2 = Integer.toString(number2);  // "893"
		
		Cnumber1 = reverseString(Cnumber1);
		Cnumber2 = reverseString(Cnumber2);
		
		number1 = Integer.parseInt(Cnumber1);
		number2 = Integer.parseInt(Cnumber2);
		
		if(number1 > number2) {
			System.out.println(number1);
		} else {
			System.out.println(number2);
		}
		
	}
	
	public static String reverseString(String s) {
		return (new StringBuffer(s).reverse().toString());
	}

}
