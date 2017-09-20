package exercises;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args)
	{
		int n; //
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number. >>>>>>");
		n = input.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("This number is even");
		} else
		{
			System.out.println("This number is odd");
		}
	

	}

}
