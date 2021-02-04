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