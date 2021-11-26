# Section 10: Java Generics

Section 10: Java Generics

# What I Learned
* OLD WAY `ArrayList items = new ArrayList();`
	* Allows to put many types
	* After generics, NEW WAY `ArrayList<Integer> items = new ArrayList<Integer>(); `
		* We are telling ArrayList what kind of object it can hold
	* Enforcing type safety
* Java 1.5 introducing generics
* <> is called diamond
* Earlier bug is detected cheaper it is to fix
	* If we can found them at runtime, better
* `public class Team<T extends Player> {`
	* Generic class T is Type
* Bounded type restrictions
	* `T extends Player`
		* Upper bound of T
		* Is extended of Player or accepts Player itself
			* Java allow multiple bounds
				* `public class Team<T extends Player & Coach & Manager> {`
					* Syntax for multiple upper bounds
* Argument passed to type parameter can be class or interface
*`public class Team<T extends Player> implements Comparable<Team<T>> `
	* Comparable, comparing teams to other teams
	* We are providing T, coz we don't wana compare football and baseball teams togeter