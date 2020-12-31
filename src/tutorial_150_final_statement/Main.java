package tutorial_150_final_statement;

// Marking class as final, we can prevent class form subclassed 
//public class Main extends Math { 
public class Main {

    public static void main(String[] args) {
    	SomeClass one = new SomeClass("one");
    	SomeClass two = new SomeClass("two");
    	SomeClass three = new SomeClass("theree");
    	
    	
    	System.out.println(one.getInstanceNumber());
    	System.out.println(two.getInstanceNumber());
    	System.out.println(three.getInstanceNumber());
    	
    	
    	
    	int pw = 674312;
    	Password password = new Password(pw);
    	password.storePassword();
    	
    	
        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
//    	System.out.println(Math.PI);
    	
//    	Math m = new Math(); //private constructor, enforcing class not to be instanced
// 		
    }
}
