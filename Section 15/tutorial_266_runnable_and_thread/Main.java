package tutorial_266_runnable_and_thread;


public class Main {

    public static void main(String[] args) {
    	System.out.println(ThreadColor.ANSI_PURPLE + "Hi from main thread");
    	
    	Thread anotherThread = new AnotherThread();
    	
    	anotherThread.setName("== Another Thread ==");
    	anotherThread.start();
    	
    	new Thread() {
    		@Override
    		public void run() {
    			System.out.println(ThreadColor.ANSI_GREEN + "Hello from anynomous class thread");
    		}
    	}.start();
    	
    	
    	
    	
    	Thread myRunnableThread = new Thread(new MyRunnable() {
    		@Override
    		public void run() {

    			System.out.println(ThreadColor.ANSI_RED + "Hello from anynomous class implementation");
    		}
    		
    		
    	});
//    	Thread myRunnableThread = new Thread(new MyRunnable());
    	myRunnableThread.start();
    	
    	System.out.println(ThreadColor.ANSI_BLUE + "Hello again from the main thread");
    	
//    	anotherThread.start();
    	
    	
    	
    	
    }
}
