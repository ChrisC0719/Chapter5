package exercises;

import java.util.Scanner;

public class CondoSales2 
{
	static int price;
	static String view;
	public static void main(String[] args) 
	{
		int viewChoice;
		int price;
		String garageYesNo;
		String view;
		final int ParkView = 1;
		final  int GolfCourseView = 2;
		final int LakeView = 3;
		final String Park = "park view";
		final String GolfCourse = "golf course view";
		final String Lake = "lake view";
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("Choose a condo with Park:" + ParkView + ", GolfCourse: " + GolfCourseView + ", or Lake:" + LakeView + "");
		viewChoice = input.nextInt();
		
		switch(viewChoice)
		{
		case(ParkView):
			view = Park;
			price = 150000;
			displayGarage();
			break;
		
		case(GolfCourseView):
			view = GolfCourse;
			price = 170000;
			displayGarage();
			break; 
			
		case(LakeView):
			view = Lake;
			price = 210000;
			displayGarage();
			break;
		default:
			view = "Invalid";
			price = 0;
			break;
			
			
		}
		
		
	}	
	public static  void displayGarage()
	{
		//garage or parking space?	
	Scanner input = new Scanner(System.in);
	String garageYesNo = "You'll get a parking space. "; 
	System.out.println("Would you like a 1) garage or 2) parking space?");
	int garageOrNot = input.nextInt();
	switch(garageOrNot)
	
	
	{ 
	case 1: // garage
		price += 5000;
		garageYesNo = " You'll get a garage! ";
		System.out.println(garageYesNo + " 5,000 will be added to your price! ");
		break;
	case 2: // parking space
		System.out.println(garageYesNo);
		break;
		
	case 3: // input not recognized
		System.out.println("Input not recognize " + garageYesNo);
		
		System.out.println("\n You have choosen the condo with the " + view + "for $" + price + ".\n " + garageYesNo);
		
	}
	}
	

	

}
