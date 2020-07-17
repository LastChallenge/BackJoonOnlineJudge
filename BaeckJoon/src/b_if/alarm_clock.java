package b_if;

import java.util.*;

public class alarm_clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt(); 
		
	
		if(M >= 45) {
			M = M - 45;
		} else if(M < 45) {
			if(H == 0) {
				H = 23;
			} else {
				H = H - 1;
			}
			int t = 15;
			M = t + M;
		}
		
		System.out.println(H + " " + M);
		
	}

}
