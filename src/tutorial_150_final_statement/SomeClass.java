package tutorial_150_final_statement;

public class SomeClass {
	
	private static int classCounter = 0;
	private final int  instanceNumber;
	private final String name; //Since not constant, no upper case
	
	
	
	public SomeClass(String name)
	{
		this.name = name;// final, but not constant 
		classCounter++;
		instanceNumber = classCounter; 
		System.out.println(name + " created, instance is " + instanceNumber);
	}
	
	public int getInstanceNumber()
	{
		return instanceNumber;
	}
}
