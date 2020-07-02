package ½Ç½À1;
import java.util.*;

public class N5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int[] burger_list = new int[3];
		int[] drink_list = new int[2];
		
	
		try {
			
			for(int i = 0; i < 5; i++) {
				int menu = sc.nextInt();
				
				if(count <= 2) {
					burger_list[count] = menu; 
				} else {
					drink_list[count - 3] = menu;
				}
				count++;
			}
			
			Arrays.sort(burger_list);
			Arrays.sort(drink_list);
			
			int chipest_menu = burger_list[0] + drink_list[0] - 50;
			System.out.println(chipest_menu);
			
		} catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}

}
