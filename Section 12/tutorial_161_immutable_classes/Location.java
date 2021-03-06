package tutorial_161_immutable_classes;

/*
 * Immutable is recommended 
 * 	-3rd part software
 */

import java.util.HashMap;
import java.util.Map;


public class Location {
	/*
	 * Use of final make 2 things clear
	 *  - Any one using the code, field should not change
	 *  - Do not change fields if we change code in class, in future
	 */
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    
    /*
     * class field or element  of immutable class
     * 	-is needed to setup inside constructor
     */
    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q", 0);
    }
    
//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }
    
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
