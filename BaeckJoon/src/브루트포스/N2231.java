package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2231 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		N2231 main = new N2231();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		if(n < 10) {
			System.out.println(0);
		} else {
			int result = main.get_constructor(n);
			System.out.println(result);
		}
	
	}
	
	public int get_constructor(int n) {
		//216
		int Digit = get_DigitSize(n);  // 3
		int minest_Decompo = n - (9 * Digit); // 189
		
		while(!(n == minest_Decompo)) { // 216 == 189 ~ ...
			int compNum = get_compareNum(minest_Decompo);
			
			if(n == compNum) {
				return minest_Decompo;
			} else {
				minest_Decompo += 1;
			}
		}
		return 0;
	}
	
	public int get_DigitSize(int n) {
		int cunt = 0;
		while(n > 0) {
			cunt++;
			n /= 10;
		}
		
		return cunt;
	}
	public int get_compareNum(int n) {
		int sum = 0;
		int div = n;
		
		while(div> 0) {
			sum += div % 10;
			div /= 10;
		}
		return (n + sum);
	}
}
