package ch13.ex02;

class ThreadTest1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("+");
		}
	}
}
class ThreadTest2 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("-");
		}
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// 멀티 쓰레드
		
		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2();
		
		
		t1.setPriority(9);
		t1.setPriority(2);
		
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
			
		
	}

}
