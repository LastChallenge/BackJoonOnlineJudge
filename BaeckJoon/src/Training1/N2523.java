package Training1;
import java.util.*;

public class N2523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int loop = 2 * N - 1;
		
		for(int i = 0; i < loop; i++) {
			if(i <= N) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int j = 0; j < 2*N-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} 
		}
	}
}
