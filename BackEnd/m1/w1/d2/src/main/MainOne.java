package main;

public class MainOne {

	public static void main(String[] args) {
		
		
		Rettangolo rectangle = new Rettangolo(2, 8);
		
		System.out.println(rectangle.calcPerimetro());
		System.out.println(rectangle.calcArea());
		
		Rettangolo.stampaRettangolo(rectangle);
		
		Rettangolo rectangleTwo = new Rettangolo(6, 6);
		
		Rettangolo.stampaDueRettangoli(rectangle, rectangleTwo);
		
	}

}
