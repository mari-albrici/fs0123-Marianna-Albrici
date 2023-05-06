package multimediaEntities;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("Choose a song and declare its duration:");
		Audio elementOne = new Audio(input.nextLine(), input.nextInt());
		input.nextLine();
		
		System.out.println("Choose a movie and declare its duration:");
		Video elementTwo = new Video(input.nextLine(), input.nextInt());
		input.nextLine();
		
		System.out.println("Choose a painting:");
		Image elementThree = new Image(input.nextLine());
		
		System.out.println("Choose a movie and declare its duration:");
		Video elementFour = new Video(input.nextLine(), input.nextInt());
		input.nextLine();
		
		System.out.println("Choose a painting:");
		Image elementFive = new Image(input.nextLine());
		
		Object [] availableMedias = {elementOne, elementTwo, elementThree, elementFour, elementFive };
		
		System.out.println("Great! Now you have 5 available media to choose from. Type a number between 1 and 5 to view details or type 0 to exit the program.");
		
		int chosenElement = -1;
		
		
		
		while(chosenElement != 0) {
			
			chosenElement = input.nextInt();
			input.nextLine();
			
			String answers;
					
			switch(chosenElement) {
				
				case 1 : {
					System.out.println("You have chosen: " + ((Audio) availableMedias[0]).title + ". Would you like to change the volume? Type y for yes and n for no.");
					answers = input.nextLine();
					
					if(answers.contains("y")) {
						System.out.println("Type + for volume up, type - for volume down.");
						answers = input.nextLine();
						
						if(answers.contains("+") ) {
							((Audio) availableMedias[0]).volumeUp();
							((Audio) availableMedias[0]).play();
							System.out.println("Volume is: " + ((Audio) availableMedias[0]).volume);
							
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
							
						} else if(answers.contains("-") ) {
							((Audio) availableMedias[0]).volumeDown();
							((Audio) availableMedias[0]).play();
							System.out.println("Volume is: " + ((Audio) availableMedias[0]).volume);
							
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
						}
						
					} else if(answers.contains("n")) {
						((Audio) availableMedias[0]).play();
						
						System.out.println();
						System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
						
						chosenElement = input.nextInt();
						input.nextLine();
					};
				}
				break;
				
				case 2: 
					System.out.println("You have chosen: " + ((Video) availableMedias[1]).title + ". Would you like to change the volume? Type y for yes and n for no.");
					answers = input.nextLine();
					
					if(answers.contains("y")) {
						System.out.println("Type + for volume up, type - for volume down.");
						
						if(answers.contains("+") ) {
							((Video) availableMedias[1]).volumeUp();
							System.out.println("Volume is: " + ((Video) availableMedias[1]).volume);
							
							System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
							
							if(answers.contains("y")) {
								System.out.println("Type + for brightness up, type - for brightness down.");
								if(answers.contains("+") ) {
									((Video) availableMedias[1]).brightnessUp();
									((Video) availableMedias[1]).play();
									
									System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
									
									
									System.out.println();
									System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
									
									chosenElement = input.nextInt();
									input.nextLine();
									break;
									
								} else if(answers.contains("-")) {
									((Video) availableMedias[1]).brightnessDown();
									((Video) availableMedias[1]).play();
									
									System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
									
									
									System.out.println();
									System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
									
									chosenElement = input.nextInt();
									input.nextLine();
									break;
								};
							};
								
							((Video) availableMedias[1]).play();
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
							
						} else if(answers.contains("-")) {
							((Video) availableMedias[1]).volumeDown();
							
							System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
							
							if(answers.contains("y")) {
								System.out.println("Type + for brightness up, type - for brightness down.");
								if(answers.contains("+") ) {
									((Video) availableMedias[1]).brightnessUp();
									((Video) availableMedias[1]).play();
									
									System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
									
									
									System.out.println();
									System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
									
									chosenElement = input.nextInt();
									input.nextLine();
									break;
									
								} else if(answers.contains("-")) {
									((Video) availableMedias[1]).brightnessDown();
									((Video) availableMedias[1]).play();
									
									System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
									
									
									System.out.println();
									System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
									
									chosenElement = input.nextInt();
									input.nextLine();
									break;
								};
							};
							
							
							((Video) availableMedias[1]).play();
							
							System.out.println("Volume is: " + ((Video) availableMedias[1]).volume);
							
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
						}
					} else if(answers.contains("n")){
						System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
						
						if(answers.contains("y")) {
							System.out.println("Type + for brightness up, type - for brightness down.");
							if(answers.contains("+") ) {
								((Video) availableMedias[1]).brightnessUp();
								((Video) availableMedias[1]).play();
								
								System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
								
								
								System.out.println();
								System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
								
								chosenElement = input.nextInt();
								input.nextLine();
								break;
								
							} else if(answers.contains("-")) {
								((Video) availableMedias[1]).brightnessDown();
								((Video) availableMedias[1]).play();
								
								System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
								
								
								System.out.println();
								System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
								
								chosenElement = input.nextInt();
								input.nextLine();
								break;
							}
							
						} else if (answers.contains("n")) {
							
							((Video) availableMedias[1]).play();
							

							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
						}
					}
					
					break;
				
				case 3: 
					System.out.println("You have chosen: " + ((Image) availableMedias[2]).title + ". Would you like to change the brightness? Type y for yes and n for no.");
					
					answers = input.nextLine();
					
					if(answers == "y") {
						System.out.println("Type + for volume up, type - for volume down.");
						
						if(answers == "+" ) {
							((Image) availableMedias[2]).brightnessUp();
							((Image) availableMedias[2]).show();
							
							System.out.println("Brightness is: " + ((Image) availableMedias[2]).brightness);
							
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
							
						} else if(answers == "-" ) {
							((Image) availableMedias[2]).brightnessDown();
							((Image) availableMedias[2]).show();
							
							System.out.println("Brightness is: " + ((Image) availableMedias[2]).brightness);
							
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
						}
					} else {
						((Image) availableMedias[2]).show();
						
						System.out.println();
						System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
						chosenElement = input.nextInt();
						input.nextLine();
					};
					
					break;
				
				case 4: 
					System.out.println("You have chosen: " + ((Video) availableMedias[3]).title + ". Would you like to change the volume? Type y for yes and n for no.");
					answers = input.nextLine();
					
					if(answers.contains("y")) {
						System.out.println("Type + for volume up, type - for volume down.");
						
						if(answers.contains("+") ) {
							((Video) availableMedias[3]).volumeUp();
							
							
							System.out.println("Volume is: " + ((Video) availableMedias[3]).volume);
							
							System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
							
							if(answers.contains("y")) {
								System.out.println("Type + for brightness up, type - for brightness down.");
								if(answers.contains("+") ) {
									((Video) availableMedias[1]).brightnessUp();
									((Video) availableMedias[1]).play();
									
									System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
									
									
									System.out.println();
									System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
									
									chosenElement = input.nextInt();
									input.nextLine();
									break;
									
								} else if(answers.contains("-")) {
									((Video) availableMedias[1]).brightnessDown();
									((Video) availableMedias[1]).play();
									
									System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
									
									
									System.out.println();
									System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
									
									chosenElement = input.nextInt();
									input.nextLine();
									break;
								}
							};
							
							((Video) availableMedias[3]).play();
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
							
						} else if(answers.contains("-")) {
							((Video) availableMedias[3]).volumeDown();
							System.out.println("Volume is: " + ((Video) availableMedias[3]).volume);
							
							System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
							
							if(answers.contains("y")) {
								System.out.println("Type + for brightness up, type - for brightness down.");
								if(answers.contains("+") ) {
									((Video) availableMedias[1]).brightnessUp();
									((Video) availableMedias[1]).play();
									
									System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
									
									
									System.out.println();
									System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
									
									chosenElement = input.nextInt();
									input.nextLine();
									break;
									
								} else if(answers.contains("-")) {
									((Video) availableMedias[1]).brightnessDown();
									((Video) availableMedias[1]).play();
									
									System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
									
									
									System.out.println();
									System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
									
									chosenElement = input.nextInt();
									input.nextLine();
									break;
								}
							};
							
							
							((Video) availableMedias[3]).play();
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
						}
					} else if(answers.contains("n")){
						System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
						
						if(answers.contains("y")) {
							System.out.println("Type + for brightness up, type - for brightness down.");
							if(answers.contains("+") ) {
								((Video) availableMedias[1]).brightnessUp();
								((Video) availableMedias[1]).play();
								
								System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
								
								
								System.out.println();
								System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
								
								chosenElement = input.nextInt();
								input.nextLine();
								break;
								
							} else if(answers.contains("-")) {
								((Video) availableMedias[1]).brightnessDown();
								((Video) availableMedias[1]).play();
								
								System.out.println("Brightness is: " + ((Video) availableMedias[1]).volume);
								
								
								System.out.println();
								System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
								
								chosenElement = input.nextInt();
								input.nextLine();
								break;
							}
							
						} else if (answers.contains("n")) {
							
							((Video) availableMedias[1]).play();
							

							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
						}
					}
					
					break;
				
				case 5: 
					System.out.println("You have chosen: " + ((Image) availableMedias[4]).title + ". Would you like to change the brightness? Type y for yes and n for no.");
					
					answers = input.nextLine();
					
					if(answers == "y") {
						System.out.println("Type + for volume up, type - for volume down.");
						
						if(answers == "+" ) {
							((Image) availableMedias[4]).brightnessUp();
							((Image) availableMedias[4]).show();
							
							System.out.println("Brightness is: " + ((Image) availableMedias[4]).brightness);
							
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
							
						} else if(answers == "-" ) {
							((Image) availableMedias[4]).brightnessDown();
							((Image) availableMedias[4]).show();
							
							System.out.println("Brightness is: " + ((Image) availableMedias[4]).brightness);
							
							
							System.out.println();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							
							chosenElement = input.nextInt();
							input.nextLine();
							break;
						}
					} else {
						((Image) availableMedias[2]).show();
						
						System.out.println();
						System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
						chosenElement = input.nextInt();
						input.nextLine();
					};
					
					break;
				
				case 0: 
					System.out.println("Thank you for using my Media Player! Have a nice rest of your day :)");
					break;
					
				default:
					System.out.println("Number not available. Please choose a number between 1 and 5 or type 0 to exit the program.");
				}
		}
		
		input.close();
		
		
	}

}
