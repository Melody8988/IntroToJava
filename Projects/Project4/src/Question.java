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

	protected int getIndexByName(String name) {
		int x = 0;
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].getName().equals(name)){
				x=i;
				return x; // return the index of the animal whose name is "name"
			} else { 
				x=-1; // -1 if an animal with name "name" was not found
			}
		} 
		return x;
	}//end getIndexByName
}// end Question
