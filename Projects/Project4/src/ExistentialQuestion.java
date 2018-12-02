
/*
	Provided code by Dan Shervheim
	UMN 1103 TA Fall 2018

	Additions made by student: <YOURX500HERE>
	AskQuestion()
	<ADD ANY OTHER METHODS YOU WRITE HERE>
*/

import java.util.*;

public class ExistentialQuestion extends Question {
	ExistentialQuestion(Animal[] animals, Animal answer) {
		super(animals, answer);
	}

	public boolean AskQuestion() {
        Scanner q = new Scanner(System.in);
		boolean decideToDecrement = true;
		boolean waitingForValidAnswer = true;

		// offer choices to player
		System.out.println("What do you want to know?");
		System.out.println();
		System.out.println("\t1. Does it have <x>?");
		System.out.println("\t2. Can it <x>?");
		System.out.println("\t3. Is it <x>?");
		System.out.println("\t4. Does it eat <x>?");
		System.out.println("\t5. Go back");

		while (waitingForValidAnswer == true) {

			if (q.hasNext());
			String existentialQuestionNumber = q.nextLine();
			

			if (existentialQuestionNumber.matches("1|2|3|4|5")) {
				waitingForValidAnswer = false;

				if (existentialQuestionNumber.equals("1")) {
					System.out.println("What do you want to know about what it has?");
						if (q.hasNext()) {
							String has = q.next();
							System.out.println("Does it have " + has + "?");
							if (answer.hasX(has) == true){
								System.out.println("Yes, it has " + has + "!");
							} else {
								System.out.println("No, it does not have" + has);
							}
						}//end hasNext if
				}//end if equals 1
				
				if (existentialQuestionNumber.equals("2")) {
					System.out.println("What do you want to know about what it can do?");
						if (q.hasNext()) {
							String ability = q.next();
							System.out.println("Can it " + ability + "?");
							if (answer.canX(ability) == true){
								System.out.println("Yes, it can " + ability + "!");
							} else {
								System.out.println("No, it cannot " + ability);
							}
						}//end hasNext if
				}//end if equals 2

				if (existentialQuestionNumber.equals("3")) {
					System.out.println("What is a characterisitc you want to know if it is?");
						if (q.hasNext()) {
							String characteristic = q.next();
							System.out.println("Is it " + characteristic + "?");
							if (answer.isX(characteristic) == true){
								System.out.println("Yes, it is " + characteristic + "!");
							} else {
								System.out.println("No, it is not " + characteristic);
							}
						}//end hasNext if
				}//end if equals 3
				
				if (existentialQuestionNumber.equals("4")) {
					System.out.println("What do you want to know it eats?");
						if (q.hasNext()) {
							String food = q.next();
							System.out.println("Does it eat " + food + "?");
							if (answer.eatsX(food) == true){
								System.out.println("Yes, it eats " + food + "!");
							} else {
								System.out.println("No, it does not eat " + food);
							}
						}//end hasNext if
				}//end if equals 4
				
				if (existentialQuestionNumber.equals("5")) {
					System.out.println("Okay!");
					decideToDecrement = false;
				}

			} // end existentialQuestion if
			else {
				System.out.println("Please enter a number between 1-5");
			} // end else
		} // end while
		return decideToDecrement;
	}// end askQuestion
}// ExistentialQuestion
