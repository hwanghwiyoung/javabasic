package ch13.zoo;

public class Duck implements Runnable {
	@Override
	public void run() { 
		for (int i = 0; i < 10; i++) {
			System.out.println("²Ð²Ð~");
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			
		}
	}
	
}

		
	