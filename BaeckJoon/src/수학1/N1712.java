package 수학1;

import java.util.Scanner;

public class N1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		int FixedCost = sc.nextInt(); //고정비용
		int VariableCost = sc.nextInt(); //가변비용
		int Sale_Price = sc.nextInt(); //판매가격
		int sum_of_SalePrice = 0;
		*/
		
		int FixedCost = sc.nextInt(); //고정비용  A
		int VariableCost = sc.nextInt(); //가변비용 B
		int Sale_Price = sc.nextInt(); //판매가격  C
		
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
