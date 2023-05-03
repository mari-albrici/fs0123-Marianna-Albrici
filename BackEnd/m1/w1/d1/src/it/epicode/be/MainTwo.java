package it.epicode.be;

import java.util.Scanner;

public class MainTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write string one: ");
		String stringOne = input.nextLine();
		System.out.println("Write string two: ");
		String stringTwo = input.nextLine();
		System.out.println("Write string three: ");
		String stringThree = input.nextLine();
		
		String finalString = stringOne.concat(stringTwo).concat(stringThree);
		System.out.println(finalString);
		String finalReversedString = stringThree.concat(stringTwo).concat(stringOne);
		System.out.println(finalReversedString);
		
		char character;
		String reversedString = "";
		
		for(int i = 0; i < finalString.length(); i++) {
			character = finalString.charAt(i);
			reversedString = character+reversedString;
		}
		System.out.println("The reverse is: " + reversedString);
		input.close();
		
	}

}
