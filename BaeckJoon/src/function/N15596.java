package function;

import java.util.Arrays;

public class N15596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 20, 30};
		
		long ans = sum(a);
		
		System.out.println(ans);
	
	}
	
	public static long sum(int[] a) {
		long ans = 0;
		
		for(int value : a) {
            ans += value;
        }
		
		return ans;
	}

	

}
