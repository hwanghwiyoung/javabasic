package ch08.ex01_abstract;

abstract class Shape {
	double area;
	
	abstract void showArea(double w, double h);
}

class Rec extends Shape {
	@Override
	void showArea(double w, double h) {
		area = w*h;
	}
}

class Tri extends Shape {
	@Override
	void showArea(double w, double h) {
		area = (w*h)/2;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		new Rec().showArea(10, 50);
		new Tri().showArea(30, 15.9);
		
		
	}

}
