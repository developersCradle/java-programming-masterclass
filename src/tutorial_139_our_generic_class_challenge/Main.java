package tutorial_139_our_generic_class_challenge;


public class Main {

    public static void main(String[] args) {
    	
    	League<Team<FootballPlayer>> fooballLeague = new League<>("Some league");
    	
	    FootballPlayer joe = new FootballPlayer("Joe");
 
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
    
        Team<BaseballPlayer> baseballTeam = new Team<>("BaseBall team");
     
        fooballLeague.add(adelaideCrows);
        fooballLeague.add(melbourne);
        fooballLeague.add(hawthorn);
        fooballLeague.add(fremantle);
        
        
//		  Does not work illegal type
//        fooballLeague.add(baseballTeam);
        
//        Works coz no type defined, Raw types. Be careful of this way
//        League<Team> fooballLeague2 = new League<>("Some league");
//        fooballLeague2.add(baseballTeam);
    }
}
