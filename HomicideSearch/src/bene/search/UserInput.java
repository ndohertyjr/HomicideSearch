package bene.search;

import java.util.Scanner;

public class UserInput {
	Scanner userIn = new Scanner(System.in);
	//Obtain bene's name
	public String getBeneName(String beneName) {
		System.out.println("What is the beneficiary's name: ");
		beneName = userIn.nextLine();
				
		return beneName;
	}
	//Obtain victim's name
	public String getVictimName(String victimName) {
		System.out.println("What is the victim's name: ");
		victimName = userIn.nextLine();
		return victimName;
	}
	//Obtain date of the crime
	public String getDate(String date) {
		System.out.println("When was the date of the crime: ");
		date = userIn.nextLine();
		return date;
	}
	//Obtain location of the crime
	public String getCity(String city) {
		System.out.println("Where did the homicide take place: ");
		city = userIn.nextLine();
		return city;
	}
	
}
