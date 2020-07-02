package 브루트포스;

import java.util.Scanner;

public class N1018 {
	public static char[][] trans;
	static char[][] arr;
	public static char[][] Wboard = {
			/*
			 * 8*8의 하얀색으로 시작하는 체스판
			 */
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
	};
	
	public static char[][] Bboard = {
			/*
			 * 8*8의 검은색으로 시작하는 체스판
			 */
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
			{'B','W','B','W','B','W','B','W'},
			{'W','B','W','B','W','B','W','B'},
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N1018 main = new N1018();
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] board = new char[N][M];
		int min = Integer.MAX_VALUE;
		
		// N = 10, M = 13
		for(int i = 0; i < N; i++) {
			String row = sc.next();
			for(int j = 0; j < M; j++) {
				board[i][j] = row.charAt(j);
			}
		}
		
		for(int i = 0; i <= N-8; i++) {  // 0 ~ 2 (3)
			for(int j = 0; j <= M - 8; j++) { // 0 ~ 5 (
				min = main.get_newBoard(i, j, min);
			}
		}
		System.out.println(min);
	}
	
	public int get_newBoard(int x, int y, int min) { //x = 0 ~ 2, y = 0 ~ 5, min
		int cnt_b = 0;
		int cnt_w = 0;
		int k = 0;
		StringBuffer sb = new StringBuffer("");
		
		for(int i = x; i < x+8; i++) {
			sb.setLength(0);
			
			for(int j = y; j < y+8; j++) {
				sb.append(arr[i][j]);
			}
			for(int j = 0; j < sb.length(); j++) {
				trans[k][j] = sb.charAt(j);
			}
			k++;
		}
		
		for(int i = 0; i < trans.length; i++) {
			for(int j = 0; j < trans.length; j++) {
				if(trans[i][j] != Bboard[i][j]) {
					cnt_b++;
				}
				if(trans[i][j] != Wboard[i][j]) {
					cnt_w++;
				}
			}
		}
		return Math.min(Math.min(cnt_w, cnt_b), min);
	}
}
