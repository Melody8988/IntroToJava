
/*
	Provided code by Dan Shervheim
	UMN 1103 TA Fall 2018

	Additions made by student: <YOURX500HERE>
	AskQuestion()
	<ADD ANY OTHER METHODS YOU WRITE HERE>
*/

import java.util.*;

public class RelationalQuestion extends Question {
	RelationalQuestion(Animal[] animals, Animal answer) {
		super(animals, answer);
	}

	public boolean AskQuestion() {

		Scanner q = new Scanner(System.in);
		boolean waitingForValidAnswer = true;
		Boolean waitingForValidGuess = true;
		boolean decideToDecrement = true;

		System.out.println("What do you want to know?");
		System.out.println();
		System.out.println("\t1. Is it heavier than another animal?");
		System.out.println("\t2. Is it taller than another animal?");
		System.out.println("\t3. Is it longer than another animal?");
		System.out.println("\t4. Is it faster than another animal?");
		System.out.println("\t5. Is it heavier than <x> lbs");
		System.out.println("\t6. Is it taller than <x> feet");
		System.out.println("\t7. Is it longer than <x> feet");
		System.out.println("\t8. Is it faster than <x> mph?");
		System.out.println("\t9. Go back");

		while (waitingForValidAnswer == true) {

			if (q.hasNext());
			String relationalQuestionNumber = q.nextLine();

			if (relationalQuestionNumber.matches("1|2|3|4|5|6|7|8|9")) {
				waitingForValidAnswer = false;

				//IS IT HEAVER THAN A
				if (relationalQuestionNumber.equals("1")) {
					System.out.println("Please enter the animal you wish to compare weight");
						if (q.hasNext()) {
							String heavierThanAnimal = q.next();
							System.out.println("Is it heavier than a " + heavierThanAnimal + " ?");
							int index = getIndexByName(heavierThanAnimal); 
							if (index == -1){
								System.out.println("There is no such animal in the database :( ");
								decideToDecrement = false;
							} else {
								decideToDecrement = true;
								if (animals[index].getWeight() < answer.getWeight() ){
									System.out.println("Yes, the animal is heavier than a " + animals[index].getName());
								} else {
									System.out.println("The animal is not heavier than a " +  animals[index].getName() );
								}//end else
							}//end valid animal else
						}//end hasNext if
				}//end if equals 1

				//IS IT TALLER THAN A
				if (relationalQuestionNumber.equals("2")) {
					System.out.println("Please enter the animal you wish to compare height");
						if (q.hasNext()) {
							String tallerThanAnimal = q.next();
							System.out.println("Is it taller than a " + tallerThanAnimal + " ?");
							int index = getIndexByName(tallerThanAnimal); 
							if (index == -1){
								System.out.println("There is no such animal in the database :( ");
								decideToDecrement = false;
							} else {
								decideToDecrement = true;
								if (animals[index].getHeight() < answer.getHeight() ){
									System.out.println("Yes, the animal is taller than a " + animals[index].getName());
								} else {
									System.out.println("The animal is not taller than a " +  animals[index].getName() );
								}//end else
							}//end valid animal else
						}//end hasNext if
				}//end if equals 2

				//IS IT LONGER THAN A
				if (relationalQuestionNumber.equals("3")) {
					System.out.println("Please enter the animal you wish to compare length");
						if (q.hasNext()) {
							String longerThanAnimal = q.next();
							System.out.println("Is it longer than a " + longerThanAnimal + " ?");
							int index = getIndexByName(longerThanAnimal); 
							if (index == -1){
								System.out.println("There is no such animal in the database :( ");
								decideToDecrement = false;
							} else {
								decideToDecrement = true;
								if (animals[index].getLength() < answer.getLength() ){
									System.out.println("Yes, the animal is longer than a " + animals[index].getName());
								} else {
									System.out.println("The animal is not longer than a " +  animals[index].getName() );
								}//end else
							}//end valid animal else
						}//end hasNext if
				}//end if equals 3

				//IS IT FASTER THAN A
				if (relationalQuestionNumber.equals("4")) {
					System.out.println("Please enter the animal you wish to compare speed");
						if (q.hasNext()) {
							String fasterThanAnimal = q.next();
							System.out.println("Is it faster than a " + fasterThanAnimal + " ?");
							int index = getIndexByName(fasterThanAnimal); 
							if (index == -1){
								System.out.println("There is no such animal in the database :( ");
								decideToDecrement = false;
							} else {
								decideToDecrement = true;
								if (animals[index].getSpeed() < answer.getSpeed() ){
									System.out.println("Yes, the animal is faster than a " + animals[index].getName());
								} else {
									System.out.println("The animal is not faster than a " +  animals[index].getName() );
								}//end else
							}//end valid animal else
						}//end hasNext if
				}//end if equals 4

                //IS IT HEAVIER
				if (relationalQuestionNumber.equals("5")) {
					decideToDecrement = false;
					System.out.println("Please enter how many lbs you guess");
					while (waitingForValidGuess == true) {
						if (q.hasNextInt()) {
							int lbs = q.nextInt();
							waitingForValidGuess = false;
							decideToDecrement = true;
							System.out.println("Is it heavier than " + lbs + " lbs?");
							if (lbs < answer.getWeight()) {
								System.out.println("Yes, the animal weighs more than " + lbs + " lbs");
							} else {
								System.out.println("No, the animal does not weigh more than  " + lbs + " lbs");
							}//end else
						} // end if int
						else if (q.hasNext()) {
							String badinput = q.next();
							System.out.println("Integers only, please. ");
						}//end else
					} // end while
				} // end if 5

				//IS IT TALLER
				if (relationalQuestionNumber.equals("6")) {
					decideToDecrement = false;
					System.out.println("Please enter how many feet you guess");
					while (waitingForValidGuess == true) {
						if (q.hasNextInt()) {
							int feet = q.nextInt();
							waitingForValidGuess = false;
							decideToDecrement = true;
							System.out.println("Is it taller than " + feet + " feet?");
							System.out.println(answer.getHeight());
							if (feet < answer.getHeight()) {
								System.out.println("Yes, the animal is taller than " + feet + " feet");
							} else {
								System.out.println("No, the animal is not taller than " + feet + " feet");
							}
						} // end if int
						else if (q.hasNext()) {
							String badinput = q.next();
							System.out.println("Integers only, please. ");
						}
					} // end while
				}//end if 6

				//IS IT LONGER
				if (relationalQuestionNumber.equals("7")) {
					decideToDecrement = false;
					System.out.println("Please enter how many feet you guess");
					while (waitingForValidGuess == true) {
						if (q.hasNextInt()) {
							int feet = q.nextInt();
							waitingForValidGuess = false;
							decideToDecrement = true;
							System.out.println("Is it longer than " + feet + " feet?");
							System.out.println(answer.getLength());
							if (feet < answer.getLength()) {
								System.out.println("Yes, the animal is longer than " + feet + " feet");
							} else {
								System.out.println("No, the animal is not longer than " + feet + " feet");
							}
						} // end if int
						else if (q.hasNext()) {
							String badinput = q.next();
							System.out.println("Integers only, please. ");
						}
					} // end while
				} // end if 7

				//IS IT FASTER
				if (relationalQuestionNumber.equals("8")) {
					decideToDecrement = false;
					System.out.println("Please enter how many mph you guess");
					while (waitingForValidGuess == true) {
						if (q.hasNextInt()) {
							int mph = q.nextInt();
							waitingForValidGuess = false;
							decideToDecrement = true;
							System.out.println("Is it faster than " + mph + " mph?");
							System.out.println(answer.getSpeed());
							if (mph < answer.getSpeed()) {
								System.out.println("Yes, the animal is faster than " + mph + " mph");
							} else {
								System.out.println("No, the animal is not faster than " + mph + " mph");
							}
						} // end if int
						else if (q.hasNext()) {
							String badinput = q.next();
							System.out.println("Integers only, please. ");
						}
					} // end while
				}//end if 8

				//GO BACK
				if (relationalQuestionNumber.equals("9")) {
					decideToDecrement = false;
				}
			} // end realtionalQuestion if
			else {
				System.out.println("Please enter a number between 1-9");
			}//end else
		} // end while
		return decideToDecrement;
	}// end AskQuestion
}// end RelationalQuestion

/*

 * If they entered 1-4 then prompt the user to input the name of another animal
 * to compare, and find its index using the "getIndexByName()" method inherited
 * from Question.java.
 * 
 * If they entered 5-8, prompt them to enter a value for x.
 * 
 * Then call the appropriate functions of the "answer" variable, passing in x or
 * the other animal as needed.
 * 
 * Do the proper comparison relative to the inputs 1-8, and print the result to
 * the terminal. Then return true.
 */
