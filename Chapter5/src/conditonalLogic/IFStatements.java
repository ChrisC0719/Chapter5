package conditonalLogic;

import java.util.Scanner;

public class IFStatements 
{

	public static void main(String[] args) 
	{
			int age; //
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your age? >>>>>");
			age = input.nextInt();
			if(age <= 18)
			{
				System.out.println("User is less than 18. ");
			}
			if (age >= 23 & age <= 30)
			{
				System.out.println("User is around 24 to 30 years old.");
			}
			if (age > 31 & age <= 50)
			{
				System.out.println("User is between the age 31 and 50.");
			}
			if (age >= 50 & age <= 65)
			{
				System.out.println("User is between the age 51 and 65");
			}
			if (age >= 66 & age <= 100)
			{
				System.out.println("User is between the age 66 and 100");
			}


	}

}
