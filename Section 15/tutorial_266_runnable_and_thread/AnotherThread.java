package tutorial_266_runnable_and_thread;

public class AnotherThread extends Thread {

	
	@Override
	public void run() {

		System.out.println(ThreadColor.ANSI_CYAN + "Hello from " + currentThread().getName());
		
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e ) {
			System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
		}	
		System.out.println(ThreadColor.ANSI_BLUE + "Three seconds has passed and i'am awake");
	}
}
