/*
 * ���� 2675�� - ���ڿ� �ݺ�
 * �ݺ� Ƚ��(R)�� ���ڿ�(S)�� �־����� �� �ڸ��� ���ڸ� �ݺ� Ƚ����ŭ �ݺ� �ϸ鼭 ���
 * 
 */

package ���ڿ�;
import java.util.Scanner;

public class N2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int i =0; i < T; i++) {
			int R = sc.nextInt();  //�ݺ� Ƚ��
			String S = sc.next(); // ���ڿ� S
			String str = null;
		
			
			for(int j = 0; j < S.length(); j++) { //���ڿ��� ���� ABC
				for(int k = 0; k < R; k++) { //�ݺ� Ƚ��
					str = Character.toString(S.charAt(j));
					str.concat(str);
					System.out.print(str);
				}
			}
			System.out.println();
		}
	}
}
