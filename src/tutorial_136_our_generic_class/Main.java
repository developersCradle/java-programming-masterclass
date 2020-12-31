package tutorial_136_our_generic_class;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    	
    	FootballPlayer joe = new FootballPlayer("Joe");
    	BaseballPlayer pat = new BaseballPlayer("Pat");
    	SoccerPlayer beckham = new SoccerPlayer("Beckham");
    	
    	Team adelaideCrows = new Team("Adelaide Crows");
    	adelaideCrows.addPlayer(joe);
    	adelaideCrows.addPlayer(pat);
    	adelaideCrows.addPlayer(beckham);
    	
    	
    	System.out.println(adelaideCrows.numPlayers());
    			}
}