package Á¤·Ä;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10989 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] iArr = new int[N];
		int[] cnt_arr = new int[N];
		
		for(int i = 0; i <= cnt_arr.length - 1; i++) {
			cnt_arr[i] = 0;
		}
		for(int i = 0; i < N; i++) {
			iArr[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i = 0;  i < iArr.length; i++) {
			cnt_arr[iArr[i]] = cnt_arr[iArr[i]] + 1;
		}
		
		
		for(int i = 1; i < iArr.length; i++) {
			cnt_arr[i] = cnt_arr[i] + cnt_arr[i - 1];
		}
		sort(cnt_arr, iArr);
	}
	
	public static void sort(int[] cnt_arr, int[] iArr) {
		int[] b = new int[iArr.length];
		
		for(int i = 0; i < iArr.length; i++) {
			b[cnt_arr[iArr[i]] -1] = iArr[i];
			cnt_arr[iArr[i]] -= 1;
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
