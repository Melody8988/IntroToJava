/*
	Provided code by Dan Shervheim
	UMN 1103 TA Fall 2018

	Additions made by student: <massa077>
	getIndexByName()
	<ADD ANY OTHER METHODS YOU WRITE HERE>
*/

public class Question {
	// attributes
	protected Animal[] animals;
	protected Animal answer;

	// The animal array and answer gets passed in to the constructor
	Question(Animal[] animals, Animal answer) {
		this.animals = animals;
		this.answer = answer;
	}

	// Prints the answer to a question to the terminal, and returns
	// whether it should count against the players 20 questions or not.
	public boolean AskQuestion() {
		return true;
	}

	// Returns the index of the animal whose name is "name"
	// or -1 if an animal with name "name" was not found in
	// the array.
	protected int getIndexByName(String name) {
		System.out.println(animals.length);
		int x = 0;
		
	
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].getName().equals(name)){
				x=i;
				
			} else {
				x=-1;
				
			}
		} 
		return x;



		/*
			Step 1: Loop through the animals array and look
			for an animal whose name is "name". (You will need
			to use the getName() method).

			If you find it, then immediately return its index.
		*/

		/*
			Step 2: If you made it through the whole array without
			returning, then you didn't find that animal. so return -1.
		*/
	}//end getIndexByName
}// end Question
