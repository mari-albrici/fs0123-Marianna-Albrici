package it.epicode.be;
import java.util.Scanner;

public class MainThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Value One");
		double a = input.nextDouble();
		System.out.println("Value Two");
		double b = input.nextDouble();
		System.out.println("Il perimetro è: " + perimetroRettangolo(a, b));
		
		
		System.out.println("Choose a number");
		int omega = input.nextInt();
		System.out.println(pariDispari(omega));
	
		
		System.out.println("Side one:");
		double alpha = input.nextDouble();
		System.out.println("Side two:");
		double beta = input.nextDouble();
		System.out.println("Side three:");
		double gamma = input.nextDouble();
		System.out.println(perimetroTriangolo(alpha, beta, gamma));
		
		input.close();

	}
	
	public static double perimetroRettangolo(double a, double b) {
		double perimeter = (a+b)*2;
		return perimeter;
	}
	
	public static int pariDispari(int a) {
		if(a % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static double perimetroTriangolo(double a, double b, double c) {
		double p = (a+b+c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
		
	}

}
