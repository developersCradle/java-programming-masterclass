#Section 12: Java Collections

Section 12: Java Collections

# What I Learned
* Interfaces in Collection allows framework to be extended
* <img src="hierarchy.PNG" alt="alt text" width="300"/>
* If declared as Collection, this can be implemented as any of type under collection
* LIST:
	* ArrayList
	* LinkedList
* Collection provides binary search
	* Object must implement Comparable
* ` List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);` Shallow copy
	* Copying data to another object, but they are same object, reference to same object
* Deep copy is when data is fully copied, not just references
* `Collections.reverse(seatCopy);` Reverse
* `Collections.shuffle(seatCopy);` Shuffle
* `Collections.min(seatCopy);` Puts min based on provided natural order
* `Collections.max(seatCopy);` Puts max based on provided natural order
* `Collections.swap(list, i, j);` swaps two elements
* We can create comparator to existing class or extend comparator in class
	* 
	`
	static {
        PRICE_ORDER = new Comparator<Seat>() {
        ...
        };
    } 
    `
* Map interface is part of Java Collection, but still separated
	* Replaces dictionary
	* Map keys to values
	* No strict order
	* No duplicates keys
	* put:ing many same values, most recent get overridden
* programming defensively means exposing only what is needed
* ` public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    } ` 
    	* Nothing outside of this class, cannot change exits¨
* <img src="adventureGame.PNG" alt="alt text" width="300"/>
* Making class immutable means after you create it, you cannot change it
* Getters and setters should be provided if class needs them
* If class field is setter final, it should be initialized in constructor
* [Immutable Objects]  (https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html)
* Set does not have ordering
	* Canno't contain duplicates 
	* Canno't retrieve item from set 
	* Operations for HashSet are very fast
* Set theory
	* Union of set contains all element of set
	* Set canno't hold duplicate values
	* `moons.addAll(planet.getSatellites());`
	* references are stored in sets
		* not objects itself
		* reference to String is same as reference to any other object
* Java 7 uses compressed pointers [Performance](https://docs.oracle.com/javase/8/docs/technotes/guides/vm/performance-enhancements-7.html)