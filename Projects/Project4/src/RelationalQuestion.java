
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

		while (waitingForValidAnswer = true){
			waitingForValidAnswer = false;
	

			if (q.hasNext());
			String relationalQuestionNumber = q.nextLine();
			waitingForValidAnswer = false;
		
			

		if (relationalQuestionNumber.matches("1|2|3|4|5|6|7|8|9")) {
			waitingForValidAnswer = false;

				System.out.println("VALID NUMBER");

				if (relationalQuestionNumber.equals("1")) {
					decideToDecrement = true;
				}

				if (relationalQuestionNumber.equals("9")) {
					System.out.println("Byee.");
					decideToDecrement = false;
				}

		} // end big if
		else {
			System.out.println("Please enter a number between 1-9");
		}
	}//end while

		return decideToDecrement;
	}// end AskQuestion
}// end RelationalQuestion

/*
			 * Setup a new scanner to read input from the player
			 * 
			 * If they typed in 9, then return false (this question should not count against
			 * the players 20).
			 * 
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
