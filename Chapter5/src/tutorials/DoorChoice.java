package tutorials;

import javax.swing.JOptionPane;

//Door Choice
//Author. Mr. Collins
public class DoorChoice {

	public static void main(String[] args) 
	{
		//Door Prize program
		String choiceString;
		int doorChoice;
		int response = 1;
		choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, or 3.",
				"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
		while(response == 1);{
		
		//if statement structure for door choice
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null,  "You win Nothing!! HAHAHAHA!");
			
		}
		if(doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null, "You win less than nothing! HAHAHAHAHA");
		
		}
		if(doorChoice == 3)
		{
			JOptionPane.showMessageDialog(null, "You win a brand new Huffy Bike! HAHAHAHA");
			
		}
		JOptionPane.showMessageDialog(null,"Would you like to choose another door? 1 for yes 2 for no");
	
	}
		JOptionPane.showMessageDialog(null, "You have exited the game");
	}
}
