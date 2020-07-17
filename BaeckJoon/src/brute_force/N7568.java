package brute_force;

import java.util.Scanner;

public class N7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		N7568 main = new N7568();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] bodyInfo = new int[n][n];
		int[] ranking = new int[n];
		
		for(int i = 0; i < n; i++) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			bodyInfo[i][0] = w;
			bodyInfo[i][1] = h;
		}

		ranking = main.getBodyrank(bodyInfo, n, ranking);
		
		for(int i = 0; i < n; i++) {
			System.out.print(ranking[i] + " ");
		}

	}
	
	public int[] getBodyrank(int[][] bi, int n, int[] ranking) {
		//55 185  0 0, 0 1
		//58 183  1 0, 1 1
		//88 186  2 0, 2 1
		//60 175  3 0, 3 1
		//46 155  4 0, 4 1
		for(int i = 0; i < n; i++) {
			int rank = 0;
			for(int j = 0; j < n; j++) {
				if(i == j) continue;
				if(bi[i][0] < bi[j][0] && bi[i][1] < bi[j][1]) rank++;
			}
			ranking[i] = rank + 1;
		}
		return ranking;
	}
}
