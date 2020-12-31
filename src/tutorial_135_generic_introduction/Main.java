package tutorial_135_generic_introduction;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	
//    	ArrayList items = new ArrayList(); //can contain anything, introduce type safety
    	ArrayList<Integer> items = new ArrayList<Integer>(); //Enforces type safty
    	items.add(1);
    	items.add(2);
    	items.add(3);
//    	items.add("tim");
    	items.add(4);
    	items.add(5);
    	
    
   
    	printDoubled(items);
    	
    }

	private static void printDoubled(ArrayList n) {
		
		for (Object i : n) {
			System.out.println((Integer) i * 2);
			
		}
		
	}
    
    }
