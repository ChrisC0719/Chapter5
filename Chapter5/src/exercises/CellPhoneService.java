package exercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) 
	{
		int phonePlan;
		double price;
		Scanner in = new Scanner(System.in);
		System.out.println("Select Phone Plan\n");
		System.out.println("PlanA) 49 per month 500 minutes of talk no text or data\nPlanB) $55 per monthfewer then 500 minutes and any text\nPlanC) $61 per month more then 500 minutes no data up to 100 text" +
		"\nPlanD) $70 per month for more then 100 text messages or more\nPlanE) $79 for any data up to 2 gigabytes\nPlanF) $87 up to 2 gigabytes or more");
		phonePlan = in.nextInt();
		in.nextLine();
		
		switch(phonePlan)
		{
		case 1:
			price = 49;
			System.out.println("You've selected Phone plan\nPlanA for $" + price + " a month!");
			break;
		
		case 2:
			price = 55;
			System.out.println("You've selected Phone plan\nPlanB for $" + price + " a month!");
			break;
		
		case 3:
			price = 61;
			System.out.println("You've selected Phone plan\nPlanC for $" + price + " a month!");
			break;
		case 4:
			price = 70;
			System.out.println("You've selected Phone plan\nPlanD for $" + price + " a month!");
			break;
		case 5:
			price = 79;
			System.out.println("You've selected Phone plan\nPlanE for $" + price + " a month!");
			break;
		case 6:
			price = 87;
			System.out.println("You've selected Phone plan\nPlanF for $" + price + " a month!");
			break;
			
		}
		}
		
		
		

	}

}
