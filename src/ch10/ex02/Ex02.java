package ch10.ex02;

class Card {
	
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		//kind = spade , number = 1
		return "Kind = " + kind + ", nummber = " + number;
	}
	
	
	
	
}










public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		System.out.println(c1.toString());
		Card c2 = new Card("HEART" ,10);
		System.out.println(c2.toString());
	}
	

}
