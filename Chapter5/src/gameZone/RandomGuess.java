package gameZone;

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args)
	{
		int random;
		
		final int MIN = 1;
		final int MAX = 10;
		
		int userNum;
		int randomize = (1 + (int)(Math.random()* 10));
		String userInput;
		String message = "";

		userInput = JOptionPane.showInputDialog("Guess my number it's between 1-10");
		if (userInput != Integer.toString(randomize)) {
			message = " you guessed wrong";
		}
		
		
		JOptionPane.showMessageDialog(null,"The number is "+ randomize + message);
		
	}

}
