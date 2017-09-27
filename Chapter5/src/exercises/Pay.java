package exercises;

import javax.swing.JOptionPane;

public class Pay {

	public static void main(String[] args) 
	{
		
		double hoursWorked;
		double hourlyPayRate = 0;
		double regularPay;
		double overTimePay;
		double totalRegularOvertimePay;
		double totalDeductions;
		double netPay;
		String skillLevelInput, hoursWorkedString;
		
		skillLevelInput = JOptionPane.showInputDialog(null, "Skill level 1: $17.00 || " + " Skill level 2: $20.00 ||" + " Skill level 3: $22.00");
		int skillLevelINT = Integer.parseInt(skillLevelInput);
		
		hoursWorkedString = JOptionPane.showInputDialog("Hours worked?");
		hoursWorked = Integer.parseInt(hoursWorkedString);
		switch(skillLevelINT)
		{
		case 1:
			hourlyPayRate = 17;
			break;
		case 2:
			hourlyPayRate = 20;
			break;
		case 3:
			hourlyPayRate = 22;
			break;
		}
		if(hoursWorked <= 40)
		{
			System.out.println(hourlyPayRate * hoursWorked);
		}
		else
		{
			System.out.println(hourlyPayRate * (hourlyPayRate/2));
		}
			
		
		
		

		
		
	}

}
