package tutorial_265_threads;

public class AnotherThread extends Thread {

	
	@Override
	public void run() {

		System.out.println(ThreadColor.ANSI_CYAN + "Hello from another thread");
		
	}
}
