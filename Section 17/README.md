# Section 17: Regular Expressions

Regular expressions exploration

# What I Learned
* String.replace accepts regular expression
* Character class is like wild card, represents set or class of characters.
	*  `System.out.println(alphanumeric.replaceAll(".","Y"));`
		* Uses character class . matches any character
		* . is wild card for any character
		* Replaces all characters with Y
* Boundary matcher looks for boundaries
* ^ Boundary matcher, always followed by patterns
	* Must match beginning of the string
* System.out.println(alphanumeric.replaceAll("^abcDeee",  "YYY"));
	* `Replaces abcDeee with` -> `YYY`
	* Replace by does not be same size
* String.matches return true if regular expression is matched
	* Must match as whole string to regex, otherwise return false
* $ Boundary matcher, proceeded by pattern
* [] to match exact letters, looks for each individual character
	*`System.out.println(alphanumeric.replaceAll("[aei]",  "X"));`
		* a,e,i is being replaced with X
	*`System.out.println(alphanumeric.replaceAll("[aei][Fj]",  "X"));`
		* Looks for "aei" followed by "Fj", only then replaces with X