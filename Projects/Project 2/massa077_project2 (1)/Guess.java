public class Guess {
	public static void main(String[] args) { //main

		int min, max, guess, newGuess; 
		char evaluation, newEvaluation;

		// your code goes here
		System.out.println(
				"Hello! Let's play a game. I bet I can guess what number you are thinking. Let's see how many tries it takes.");
		System.out.println(
				"First I need you to set a range. What's the lowest your number could be? Please enter a value:");

		min = TextIO.getInt();
		System.out.println("min set as:" + min);

		System.out.println("Okay great, now what's the highest your number could be?");
		max = TextIO.getInt();

		while (max < min) {
			System.out.println(
					"That doesn't make sense! The upper bound must be higher than the lower bound. Please enter another number:");
			max = TextIO.getInt();
		}

		guess = Guess.randomInt(min, max);

		System.out.println("Okay! I am going to guess: " + guess);
		System.out.println("How did I do? If my guess was less than your number type <, if it was greater than your number type >, if it was equal type =");

		evaluation = TextIO.getChar();



		while (evaluation != '='){
			if(evaluation == '<'){
				guess = Guess.randomInt(guess+1, max);
				System.out.println("Okay, I'll guess higher");
				System.out.println("Is your number: " + guess);
			} else if (evaluation == '>'){
				guess = Guess.randomInt(min, guess-1);
				System.out.println("Okay, I'll guess lower");
				System.out.println("Is your number: " + guess);

			}
			evaluation = TextIO.getChar();
		}

		if (evaluation == '='){
			System.out.println("Yay! I got it right!");
		}

	

		
		



	} // end of main



	public static int randomInt(int min, int max) {
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	}
} // end of Guess class
