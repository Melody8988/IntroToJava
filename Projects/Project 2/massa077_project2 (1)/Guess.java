// Melody Massard, massa077@umn.edu

public class Guess {
	public static void main(String[] args) { //main
		int min, max, guess, count;
		char evaluation;

		count = 1;

		//Greeting & set range of game
		System.out.println(
				"Hello! Let's play a game. Think of a number in that brain of yours. Let's see how many tries it takes me to guess it.");
		System.out.println(
				"First I need some kind of range. What's the lowest your number could be?");

		min = TextIO.getInt();
		System.out.println("minimum set as: " + min);

		System.out.println("Okay great, now what's the highest your number could be?");
		max = TextIO.getInt();
		System.out.println("The range is: " + min + " - " + max + "\n");

		//Check if min < max
		while (max < min) {
			System.out.println(
					"That doesn't make sense! The upper bound must be higher than the lower bound. Please enter another number:");
			max = TextIO.getInt();
		}

		//Initial guess & instructions to user
		guess = Guess.randomInt(min, max);
		System.out.println("Okay! My guess is: " + guess + "\n");
		System.out.println("If my guess was \n less than your number type < \n if it was greater than your number type > \n if it was equal type =");
		
		//User's input to the guess
		evaluation = TextIO.getChar();

		//Continuously require an evaluation if program guess doesn't equal user's number
		while (evaluation != '='){
			if(evaluation == '<'){
				min = guess+1;
				guess = Guess.randomInt(min, max);
				System.out.println("Okay, I'll guess higher");
				System.out.println("Is your number: " + guess);
			
			} else if (evaluation == '>'){
				max = guess-1;
				guess = Guess.randomInt(min, max);
				System.out.println("Okay, I'll guess lower");
				System.out.println("Is your number: " + guess);
			}
			count++;
			evaluation = TextIO.getChar();
		}

		//If user says program guess is equal to their number
		if (evaluation == '=' && count <= 5){
			System.out.println("Yay! I got it right! And it only took me " + count +  " tries!");
		}else if (evaluation == '=' && count <= 10){
			System.out.println("I got it right! It took me " + count +  " tries!");
		}else {
			System.out.println("I got it right after " + count + " tries. Not my best day ¯\\_(ツ)_/¯ But in my defense, you ether set a huge range, or you lied to me.");
		}
	} // end of main

	//Given randomizer
	public static int randomInt(int min, int max) { //random method
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	} //end of random method

} // end of Guess class
