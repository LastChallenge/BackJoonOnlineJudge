package 브루트포스;

import java.util.Scanner;

public class N2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		N2798 main = new N2798();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] card = new int[N];
		
		for(int i =0; i < N; i++) {
			card[i] = sc.nextInt();
		}		
		
		System.out.println(main.checkNearNumber(N, M, card));
		sc.close();
	}
	
	public int checkNearNumber(int N, int M, int card[]) {
		//5 21
		//5 6 7 8 9
		
		int max = 0;
		
		
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					if(max <= (card[i] + card[j] + card[k]) && M >= (card[i] + card[j] + card[k])) {
						max = card[i] + card[j] + card[k];
					}
				}
			}
		}
		return max;
	}

}
