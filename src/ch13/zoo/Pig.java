package ch13.zoo;

public class Pig implements Runnable{
	@Override
	public void run() { 
		for (int i = 0; i < 10; i++) {
			System.out.println("²Ü²Ü~");
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			
		}
	}
}
