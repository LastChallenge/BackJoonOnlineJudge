
package array;
import java.util.Scanner;

public class N8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int Tcase = sc.nextInt();
		
		
		String[] list = new String[Tcase];
		
		for(int i = 0; i < Tcase; i++) {
			int count = 0, sum = 0;
			list[i] = sc.next();
			
			for(int j = 0; j < list[i].length(); j++) {
				if(list[i].charAt(j) == 'O') {
					sum += ++count;
				} else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
		sc.close();
		
	}
}
