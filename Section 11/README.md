# Section 11


# What I Learned
* Private constructor prevents class instantiation
* Marking class final, prevents class subclassed
* Marking methods final prevents methods overridden
	* Example `public final void storePassword() `
* Static initializer is only ran once, once class is loaded to program
	* `	static {
	...
	}
	`