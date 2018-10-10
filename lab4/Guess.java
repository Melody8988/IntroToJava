public class Guess
{
	public static void main(String[] args) {
		System.out.println("Think of a number, and let's see how many tries it takes me to guess.");
		System.out.println("First, I need some range. Please enter what the lowest value your number could be:");

		int min = TextIO.getInteger();

		System.out.println("Awesome, thanks! Now, what's the highest value your number could be?");

	

		

		// end of your code
	} // end of main

	public static int randomInt(int min, int max)
	{
		return (int)((Math.random()*((max-min)+1))+min);
	}
} // end of Guess class