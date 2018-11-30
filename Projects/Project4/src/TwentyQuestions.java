/*
	Provided code by Dan Shervheim
	UMN 1103 TA Fall 2018

	Additions made by student: <massa077>
	main(String[] args)
	playLoop(Animal[] animals, Animal answer)
*/

import java.io.File;
import java.util.*;

public class TwentyQuestions {

	public static int randomInt(int min, int max) {
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	} // end randomInt

	public static void main(String[] args) {

		File animalFolder = new File("../animals");
		File[] animalTxtFiles = animalFolder.listFiles();
		Animal[] animalList = new Animal[animalTxtFiles.length];
		int randomIndex = randomInt(0, animalList.length - 1);
		Scanner r = new Scanner(System.in);

		for (int i = 0; i < animalList.length; i++) {
			animalList[i] = new Animal(animalTxtFiles[i]);
			// System.out.println("animalist array: " + animalList[i]);
		}

		// animalList[randomIndex] = new Animal ();

		Animal answer = animalList[randomIndex];

		System.out.println("----------");
		System.out.println("Welcome to 20 Questions: Animal Edition!");
		System.out.println();
		System.out.println("I'm going to think of a random animal. You have 20 yes/no questions to try to guess it.");
		System.out.println("----------");

		// System.out.println("random animal is: " + answer );

		playLoop(animalList, answer);

		System.out.println();
		System.out.println("Question's are up!");
		System.out.println("Make your final guess");

		if (r.hasNext());
		String finalGuess = r.nextLine();

		if (answer.getName().equals(finalGuess)) {
			System.out.println("Yay! You got it right! The anwer was " + finalGuess + ".");
			return;
		} else {
			System.out.println();
			System.out.println("Sorry, " + finalGuess + " is not it. You loose.");

		}

	}// end main

	private static void playLoop(Animal[] animalArray, Animal answer) {

		Scanner s = new Scanner(System.in);
		String input = "";
		int questionsLeft = 20;
		boolean checkInDatabase = false;

		while (questionsLeft > 0) {

			System.out.println();
			System.out.println("You get " + questionsLeft + " more questions to ask");
			System.out.println();
			System.out.printf(
					" \n 1. Ask a relational question \n 2. Ask an existential question \n 3. Make a guess \n 4. Lookup an animal in the database \n 5. Quit \n ");
			System.out.println();

			if (s.hasNext());
			input = s.nextLine();

			if (input.matches("1|2|3|4|5")) {
				System.out.println();
				questionsLeft--;

				if (input.equals("1")) {
					
					
					RelationalQuestion q1 = new RelationalQuestion (animalArray, answer);
					q1.AskQuestion();
					if (q1.AskQuestion() == false) {
						questionsLeft++; //neutalize decrement of questions if returned false
					}
				}
				if (input.equals("2")) {
					boolean dummyValue = true;
					System.out.println("You put 2!");
					// ExistentialQuestion eq1 = new ExistentialQuestion (animalArray, answer);
					// eq1.AskQuestion();
					if (dummyValue == false) {
						questionsLeft++;
					}
				}
				if (input.equals("3")) {
					System.out.println("Enter the animal you guess: ");
					if (s.hasNext()) {
						String animalName = s.nextLine();
						if (answer.getName().equals(animalName)) {
							System.out.println("Yay! You got it right! The anwer was " + animalName);
							return;
						} else {
							System.out.println();
							System.out.println("Sorry, " + animalName + " is not it :(");
						}
					}
				}
				if (input.equals("4")) {
					checkInDatabase = false;
					questionsLeft++; // free move, neutralize questions allowed to ask
					System.out.println("Check if an animal exists in the database --free move");
					if (s.hasNext()) {
						String checkAnimal = s.nextLine();
						for (int i = 0; i < animalArray.length; i++) {
							if (animalArray[i].getName().equals(checkAnimal)) {
								checkInDatabase = true;
								System.out.println(animalArray[i].toString());
							}
						}
						if (checkInDatabase == true) {
							System.out.println();
							System.out.println("Yes, " + checkAnimal + " exists in the database!");
						} else {
							System.out.println();
							System.out.println("Sorry, " + checkAnimal + " does not exist in the database");
						}
					}
				}
				if (input.equals("5")) {
					System.out.println("Okay. Goodbye.");
					System.out.println();
					return;
				}
			} else {
				System.out.println();
				System.out.println("Please enter a number");
				System.out.println();

			} // end input if
		} // end while
	}// end play loop
}// end TwentyQuestions
