package bene.search;

import java.util.*;

public class SearchTerms {
	//Create variables to populate array
	private String beneName = "";
	private String victimName = "";
	private String date = "";
	private String location = "";
	
	ArrayList<String> searchList = new ArrayList<String>();
	
	//Get bene/victim name from user input
	public void populateSearchVariables(String bene, String victim, String dateOfHomicide, String city) {
		beneName = bene;
		victimName = victim;
		date = dateOfHomicide;
		location = city;
	}
	//Populate list of search terms provided by user and return list
	public ArrayList<String> getSearchList() {
		searchList.add(victimName + " murdered by " + beneName);
		searchList.add(victimName + " " + beneName + " homicide");
		searchList.add(victimName + " murdered by " + beneName + " on " + date);
		searchList.add(victimName + " murdered by " + beneName + " on " + date + " in " + location);
		
		return searchList;
	}
	
}
