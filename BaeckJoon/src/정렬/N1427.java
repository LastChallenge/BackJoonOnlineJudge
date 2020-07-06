package Á¤·Ä;

import java.io.*;
import java.util.*;

public class N1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		List <Integer> list = new ArrayList<>();
		
		while(n != 0) {
			int num = n % 10;
			list.add(num);
			n /= 10;
		}
		
		Collections.sort(list);
		
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
		
	}
}
