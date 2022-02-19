package ch13.zoo;

public class Zoo {

	public static void main(String[] args) {
		Cat c = new Cat();
		Pig p = new Pig();
		Duck d = new Duck();
		
		Thread catThread = new Thread(c);
		Thread pigThread = new Thread(p);
		Thread duckThread = new Thread(d);
		
		catThread.start();
		pigThread.start();
		
		try {
			catThread.join();
			pigThread.join();c
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		duckThread.start()
}
	}


