package exercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) 
	{
		int view;
		double price;
		Scanner in = new Scanner(System.in);
		System.out.println("Select View\n");
		System.out.println("1)Park view\n2)Golf course view\n3 Lake view \n");
		view = in.nextInt();
		in.nextLine();
		switch(view)
		{
			case 1:
			price = 150000;
				System.out.println("You've selected Park view\nPrice is $"+ price);
				break;
			case 2:
			price = 170000;
			System.out.println("You've selected Golf course view\nPrice is $"+ price);
			break;
			case 3:
			price = 210000;
				System.out.println("You've selected Lake view\nPrice is $"+ price);
				break;
			default:
			price=0;
			System.out.println("Invalid \nprice is $"+price);
		}

	}

}
