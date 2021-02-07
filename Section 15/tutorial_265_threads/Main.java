package tutorial_265_threads;


public class Main {

    public static void main(String[] args) {
    	System.out.println(ThreadColor.ANSI_PURPLE + "Hi from main thread");
    	
    	Thread anotherThread = new AnotherThread();
    	
    	anotherThread.start();
    	
    	new Thread() {
    		public void run() {
    			System.out.println(ThreadColor.ANSI_GREEN + "Hello from anynomous class thread");
    		}
    	}.start();
    	
    	System.out.println(ThreadColor.ANSI_BLUE + "Hello again from the main thread");
    	
//    	anotherThread.start();
    	
    	
    	
    	
    }
}
