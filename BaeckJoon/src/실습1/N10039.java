package ½Ç½À1;

import java.util.*;

public class N10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int total_score  = 0;
		
		try {
			
			while(sc.hasNextInt()) {
				int score = sc.nextInt();
				
				if(score < 40) {
					score = 40;
				}
				total_score += score;
			}
			
			total_score /= 5;
			System.out.println(total_score);
		} catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
