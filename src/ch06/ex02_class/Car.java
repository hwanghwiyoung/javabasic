package ch06.ex02_class;

public class Car {
	//변수
	boolean powerOn;
	boolean wiperOn;
	int wheel;
	int speed;
	String color;
	
	//메소드
	void power() {
		powerOn = !powerOn;
	}
	void wiper() {
		wiperOn = !wiperOn;
	}
	void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
	

	

	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println(mycar.powerOn);
		System.out.println(mycar.color);
		System.out.println(mycar.speed);
		System.out.println(mycar.wheel);
		System.out.println(mycar.wiperOn);
		
		//momcar
		Car momcar = new Car();
		momcar.color = "red";
		momcar.speedUp();
		System.out.println(momcar.color);
		System.out.println(momcar.speed);
		
		//daddycar
		Car daddycar = new Car();
		daddycar.color = "blue";
		daddycar.wiper();
		System.out.println(daddycar.color);
		System.out.println(daddycar.speed);
	
	}
	

}
