package exerciseFour;

import java.util.Scanner;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		timer();
	}
	
	public static void timer() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a number and get ready to count down:");
		
		int number = input.nextInt();
		
		for (int i = number-1; i>= 0; i--) {

		            System.out.println(i);
		}
		
		input.close();
	}

}
