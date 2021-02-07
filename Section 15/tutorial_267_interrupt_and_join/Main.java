package tutorial_267_interrupt_and_join;


public class Main {

    public static void main(String[] args) {
    	System.out.println(ThreadColor.ANSI_PURPLE + "Hi from main thread");
    	
    	Thread anotherThread = new AnotherThread();
    	
    	anotherThread.setName("== Another Thread ==");
    	anotherThread.start();
    	
    	new Thread() {
    		public void run() {
    			System.out.println(ThreadColor.ANSI_GREEN + "Hello from anynomous class thread");
    		}
    	}.start();
    	
    	
    	
    	
    	Thread myRunnableThread = new Thread(new MyRunnable() {
    		@Override
    		public void run() {

    			System.out.println(ThreadColor.ANSI_RED + "Hello from anynomous class implementation");
    			
    			try {
					anotherThread.join(2000);
					System.out.println(ThreadColor.ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
				} catch (InterruptedException e) {
					System.out.println(ThreadColor.ANSI_RED + "I couldn't wait after all. I was interrupted");
				}
    		}
    		
    		
    	});
//    	Thread myRunnableThread = new Thread(new MyRunnable());
    	myRunnableThread.start();
//    	
//    	anotherThread.interrupt();
//    	
    	System.out.println(ThreadColor.ANSI_BLUE + "Hello again from the main thread");
    	
//    	anotherThread.start();
    	
    	
    	
    	
    }
}
