package ����1;

import java.util.Scanner;

public class N1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		int FixedCost = sc.nextInt(); //�������
		int VariableCost = sc.nextInt(); //�������
		int Sale_Price = sc.nextInt(); //�ǸŰ���
		int sum_of_SalePrice = 0;
		*/
		
		int FixedCost = sc.nextInt(); //�������  A
		int VariableCost = sc.nextInt(); //������� B
		int Sale_Price = sc.nextInt(); //�ǸŰ���  C
		
		int margin = 0;
		
		if(Sale_Price <= VariableCost) {
			margin = -1;
		} else {
			 margin = FixedCost / (Sale_Price - VariableCost) + 1;
		}
		
		
		System.out.println(margin);
		
		sc.close();
	}

}
