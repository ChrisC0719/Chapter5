package tutorials;

import java.util.Scanner;

public class StudentSwitchProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int user;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your student nunmber. >>>>>");
		user = input.nextInt();
		
		switch(user)
		{
		case 311508:
			System.out.println("Hello Keegan");
			break;
		case 132043:
			System.out.println("Hello Alyssa");
			break;
		case 201524:
			System.out.println("Hello Dylan");
			break;
		case 131512:
			System.out.println("Hello Austin");
			break;
		case 131973:
			System.out.println("Hello Chris");
			break;
		
		}

	}

}
