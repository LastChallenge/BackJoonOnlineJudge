

package string;
import java.util.Scanner;

public class N10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		//baekjoon
		String str = sc.next();
		int size = str.length(); // 8
		
		int[] alphalist = new int[26];  // a ~ z
		
		for(int i =0; i < alphalist.length; i++) {
			alphalist[i] = -1;
		}
		
		
		for(int i =0; i < size; i++) {
			char word = str.charAt(i); //b  = 98 
			int listPo = word - 97; // 111 - 97 = 14
			
			if(alphalist[listPo] == -1) {
				alphalist[listPo] = i;
			}
		}
		
		for(int i = 0; i <alphalist.length; i++) {
			System.out.print(alphalist[i] + " ");
		}
	}
		
}
