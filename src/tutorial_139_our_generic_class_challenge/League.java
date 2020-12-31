package tutorial_139_our_generic_class_challenge;

import java.util.ArrayList;
import java.util.Collections;


// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
public class League<T extends Team> {

	public String name;
	private ArrayList<T> leagueTable = new ArrayList<T>();
	
	

	
	public League(String name) {
		this.name = name;
	}
	
	public boolean add (T team)
	{
		if (leagueTable.contains(team)) {
			return false;
		} 
		leagueTable.add(team);
		return true;
	}

	
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
	public void showLeagueTable()
	{
		Collections.sort(leagueTable);
		

		for(T t : leagueTable)
		{
			System.out.println(t.getName() + ": " + t.ranking());
		}
		
	}
    
}
