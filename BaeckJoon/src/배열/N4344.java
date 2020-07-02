
package ¹è¿­;
import java.util.Scanner;

public class N4344 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		char per = '%';
		
		for(int i =0; i < C; i++) {
			int N = sc.nextInt();
			int[] list = new int[N];
			int sum = 0;
			int count = 0;
			
			for(int j =0; j < N; j++) {
				list[j] = sc.nextInt(); 
				sum += list[j];
			}
			double avg = (double)sum / N;
			
			for(int k = 0; k < N; k++) {
				if(list[k] > avg) {
					++count;
				}
			}
			double percentage = 100.0 * count / N;
			
			System.out.printf("%.3f%% \n", percentage);
		}
		
	}
}
