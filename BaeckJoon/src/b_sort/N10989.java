package b_sort;

import java.io.*;

public class N10989 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		int[] cnt_arr = new int[10001];
		
		for(int i = 0; i < N; i++) {
			cnt_arr[Integer.parseInt(bf.readLine())] += 1;
		}
		
		bf.close();
		/*
		for(int i = 0;  i < iArr.length; i++) {
			cnt_arr[iArr[i]] = cnt_arr[iArr[i]] + 1;
		}
		
		
		for(int i = 1; i < iArr.length; i++) {
			cnt_arr[i] = cnt_arr[i] + cnt_arr[i - 1];
		}
		
		iArr = sort(cnt_arr, iArr);
		*/
		
		for(int i = 0; i < cnt_arr.length; i++) {
			if(cnt_arr[i] > 0) {
				for(int j = 0; j < cnt_arr[i]; j++) {
					bw.write(Integer.toString(i) +  "\n");
				}
			}
		}
		
		bw.close();
		
	}
	
	public static int[] sort(int[] cnt_arr, int[] iArr) {
		int[] b = new int[iArr.length];
		
		for(int i = 0; i < iArr.length; i++) {
			b[cnt_arr[iArr[i]] -1] = iArr[i];
			cnt_arr[iArr[i]] -= 1;
		}
		
		return b;
	}

}
