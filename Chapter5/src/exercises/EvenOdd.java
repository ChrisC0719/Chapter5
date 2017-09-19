package exercises;

import java.util.Scanner;

public class EvenOdd
{

	public static void main(String[] args) 
	{
		int number; //
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number. >>>>>>");
		number = input.nextInt();
		if(number <= 2)
		{
			System.out.println("Number is even");
		}
	}

}
