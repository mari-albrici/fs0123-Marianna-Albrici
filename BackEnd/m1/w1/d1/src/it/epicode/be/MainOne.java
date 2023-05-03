package it.epicode.be;
import java.util.Scanner;
import java.util.Arrays;

public class MainOne {

	public static void main(String[] args) {
//		Moltiplica();
//		Concatena();
		inserisciInArray();
		
	}
	
	public static void Moltiplica() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a number");
		int a = input.nextInt();
		System.out.println("Choose another number");
		int b = input.nextInt();
		int results = a * b;
		System.out.println("The result is: " + results);
		input.close();
	}
	
	public static void Concatena() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write your name");
		String name = input.nextLine();
		System.out.println("Write your age");
		int age = input.nextInt();
		String username = name+age;
		System.out.println("Your new username is " + username);
		input.close();
	}
	
	public static void inserisciInArray() {
		Scanner input = new Scanner(System.in);
		String[] stringArray = {"a", "b", "c", "d", "e", ""};
		
		String newElement;
		System.out.println("Write your fave word: ");
		
		newElement = input.nextLine();
		for (int i = stringArray.length - 2 ; i >= 2; i-- ){	
			stringArray[i+1] = stringArray[i];	
		};
		
		stringArray[2] = newElement;
		
		System.out.println("The final array is: " + Arrays.toString(stringArray));
		input.close();
	}

}
