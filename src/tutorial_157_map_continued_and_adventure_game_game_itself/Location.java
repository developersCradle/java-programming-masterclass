package tutorial_157_map_continued_and_adventure_game_game_itself;


import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits); 
        /*
         * Nothing outside of our class canno't change our exits. We create new copy of exits for 3rd party
         * 	- This is one technique to make our class immutable
         */
    }
}
