package tutorial_161_immutable_classes_challenge;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExit));
        
        
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));
        //ROOM 1
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));
        
        //ROOM 2
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));
        
        //ROOM 3
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));
        
        //ROOM 4
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));
        
        //ROOM 5
        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));
        
        Map<String, String> directions = new HashMap<String, String>();
        directions.put("QUIT", "Q");
        directions.put("NORTH", "N");
        directions.put("EAST",  "E");
        directions.put("SOUTH", "S");
        directions.put("WEST",  "W");
        
        
        
        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
           
            
            if (direction.length() > 1) {
				String[] split = direction.split(" ");
				
				for (String entry : split) {
					if (directions.containsKey(entry)) {
						direction = directions.get(entry);
						break;
					} 
					
					
				}
			}
            
  
            
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);

            } else {
                System.out.println("You cannot go in that direction");
            }
        }


    }
}
