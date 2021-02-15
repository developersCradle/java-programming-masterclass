package tutorial_293_lambda_expressions;

public class Main {

	public static void main(String[] args) {
		
		//Lambda
		// One liner
//		new Thread( () -> System.out.println("Printing from the Runnable!")).start();
		//Multiple Liner
		//07:00
		new Thread( () -> System.out.println("Printing from the Runnable!")).start();

		//new Thread(new CodeToRun()).start(); //Subclass type
		
//		new Thread(new Runnable() { // Anonymous type
//			
//			@Override
//			public void run() {
//				System.out.println("Printing from the Runnable!");
//				
//			}
//		}).start();
	}

	
}

class CodeToRun implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Printing from the Runnable!");
		
	}
	
}
