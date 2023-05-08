package exerciseOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		mainArrayCreator();
		
		try {
			addToMainArray(mainArrayCreator());
		} catch (Exception e) {
			 System.out.println("YOU DID SOMETHING WRONG: " + e.getMessage() + " " + e);
		}
		
	}

	
	public static int[] mainArrayCreator() {
		
		int[] mainArray = new int[5];
		
		for(int i = 0; i <= mainArray.length -1; i++) {
			int randomNumberGenerator = (int) (Math.random() * 10 + 1);
			mainArray[i] = randomNumberGenerator;
		}
		
		return mainArray;
	}
	
	
	public static void addToMainArray(int[] mainArray) throws Exception {

        Scanner input = new Scanner(System.in);
        boolean quitProgram = false;

        int addedNumber = 0;

        do {
            System.out.println("Choose a number between 1 and 10 (choose 0 to quit program): ");
            addedNumber = input.nextInt(); 
            
        
            	 if(addedNumber == 0) {
            		 quitProgram = true;
                
            	 } else if(addedNumber >= 1 && addedNumber <= 10){
            		 System.out.println("Choose in which position you would like to add it to (pick between 1 and 5): ");
            		 int position = input.nextInt();

            		 try {
            			 mainArray[position - 1] = addedNumber;
            			 System.out.println(Arrays.toString(mainArray));
                
            		 } catch (ArrayIndexOutOfBoundsException e){
            			 System.out.println("YOU DID SOMETHING WRONG: " + e);
            			 quitProgram = true;
            			 input.close(); 
            		 };
              
            	 } else {
            		 throw new Exception();
            	 }
        
           

        } while (!quitProgram);

        System.out.println("Thank you for using our program!");
        input.close();              
    }
		
			
}
