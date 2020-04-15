package bene.search;

import java.util.*;
import java.awt.*;


public class BeneSearch {

	public static void main(String[] args) {
		//Create standard variables for bene name, victim name, and user input
		Scanner userInput = new Scanner(System.in);
		String beneName = "";
		String victimName = "";
		int choice = 0;
		//Create list to store search sentences
		
		
		//Main options menu
		System.out.println("Welcome to the Homicide Search Tool.");
		System.out.println("\nChoose an option to begin:");
		System.out.println("1) Conduct search");
		System.out.println("2) Print results");
		System.out.println("3) Clear search data");
		System.out.println("9) Clear data and exit");
		
		//Switch cases to branch down options
		choice = userInput.nextInt();
		
		switch (choice) {
			case 1:
				UserInput userChoice = new UserInput();								//Create instance userBeneChoice to access UserInput methods
				beneName = userChoice.getBeneName(beneName);						//Run get bene name method and assign to bene name
				victimName = userChoice.getVictimName(victimName);					//Run get bene name method and assign to bene name
				
				System.out.println("Searching online for an incident where " + beneName + " murdered " + victimName + ".");
				
				
			
			case 2:
				//Implement print to a notepad
				
			case 3:
				//Clear variable data
				
			case 9:
				//Clear var data and exit program
		
		
		}
		
		
	userInput.close();
	
	}
}
