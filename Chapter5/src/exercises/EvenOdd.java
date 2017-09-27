package exercises;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args)
	{
		int response = 1;
		int n; //
		Scanner input = new Scanner(System.in);
		while(response == 1) {
		
			System.out.println("Please enter a number. >>>>>>");
		n = input.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("This number is even");
		} else
		{
			System.out.println("This number is odd");
		}
	System.out.println("Would you like to enter another number? 1 for yes 2 for no >>>>");
	response = input.nextInt();
	}
		System.out.println("You have exited the game.");
	}

}
