package b_while;

import java.util.*;

public class plus_cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int count = 0;
		int n = number;
	
		try {
			do {
				n = n % 10 * 10 + (n / 10 + n % 10) % 10;
				count++;
			} while(n != number);
			
			System.out.println(count);
			
		} catch(NoSuchElementException e) {
			return;
		}

	}

}
