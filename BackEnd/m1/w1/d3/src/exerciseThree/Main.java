package exerciseThree;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
    public static void main(String[] args) {
        

        while (true) { 
        	System.out.print("Usa la forza, Luke: ");
        	
        	Scanner scanner = new Scanner(System.in);

        	String input = scanner.nextLine();
        	
            if (input.equals(":q")) {
                System.out.println("May 4th be with you.");
                scanner.close();
                break;
            }

            String[] characters = input.split("");

            System.out.println(Arrays.toString(characters));
            
            
           
        }

      
    }
}
