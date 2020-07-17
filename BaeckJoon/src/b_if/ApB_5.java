package b_if;

import java.util.*;

public class ApB_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
	
			while(sc.hasNextInt()) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				System.out.println(A+B);
			}
			sc.close();
		} catch(NoSuchElementException e) {
			
		}
	}
}
