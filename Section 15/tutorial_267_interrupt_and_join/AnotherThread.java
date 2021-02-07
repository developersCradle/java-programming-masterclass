package tutorial_267_interrupt_and_join;

public class AnotherThread extends Thread {

	
	@Override
	public void run() {

		System.out.println(ThreadColor.ANSI_CYAN + "Hello from " + currentThread().getName());
		
		
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e ) {
			System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
			return;
		}	
		System.out.println(ThreadColor.ANSI_BLUE + "Three seconds has passed and i'am awake");
	}
}
