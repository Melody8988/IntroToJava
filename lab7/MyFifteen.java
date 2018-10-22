//Code from Fifteen.java used in this program
public class MyFifteen {
    public static void main(String[] args) {
        final int NROWS = 4;
        final int NCOLS = 4;

        int row, col;
        int[][] puzzle = new int[NROWS][NCOLS];
        int[][] secondPuzzle = new int[NROWS][NCOLS];

        // initialize the puzzle to all zeroes FROM FIFTEEN.JAVA
        for (row = 0; row < puzzle.length; row++) {
            for (col = 0; col < puzzle[row].length; col++) {
                puzzle[row][col] = 0;
            }
        }

        // initialize the secondPuzzle to all zeroes 
        for (row = 0; row < secondPuzzle.length; row++) {
            for (col = 0; col < secondPuzzle[row].length; col++) {
                secondPuzzle[row][col] = 0;
            }
        }

        // search for solution & print
        initSolution(puzzle);
        printPuzzle(puzzle);
        System.out.println("hi");

        System.out.println("Evaluate if the two puzzles are equal: ");
        System.out.println(puzzleEqual(puzzle, secondPuzzle));

    }// main

    // Set puzzle values
    static void initSolution(int[][] puzzleArray) {
        int row, col;
        int[][] fifteenFilledPuzzle = new int[puzzleArray.length][puzzleArray.length];

        // - method FROM FIFTEEN.JAVA
        for (row = 0; row < fifteenFilledPuzzle.length; row++)
            for (col = 0; col < fifteenFilledPuzzle[row].length; col++) {
                fifteenFilledPuzzle[row][col] = row * fifteenFilledPuzzle[row].length + col + 1;
            }
        // Set bottom right corner to 0 FROM FIFTEEN.JAVA
        fifteenFilledPuzzle[fifteenFilledPuzzle.length - 1][fifteenFilledPuzzle[fifteenFilledPuzzle.length - 1].length
                - 1] = 0;

    }// end initsolution

    // print out the puzzle
    static void printPuzzle(int[][] puzzleArray) {
        int row, col;
        int[][] printedPuzzle = new int[puzzleArray.length][puzzleArray.length];

        // - method from FIFTEEN.JAVA
        System.out.println();
        for (row = 0; row < printedPuzzle.length; row++) {
            for (col = 0; col < printedPuzzle[row].length; col++)
                System.out.printf("%4d   ", printedPuzzle[row][col]);
            System.out.println();
        }
        System.out.println();
    }// end printPuzzle


    //Evaluate puzzles
    static boolean puzzleEqual(int[][] onePuzzle, int[][] anotherPuzzle) {

        for (int row = 0; row < onePuzzle.length; row++) {
            for (int col = 0; col < onePuzzle[row].length; col++) {
                if (onePuzzle[row][col] == anotherPuzzle[row][col]){  
                    continue;
                } 
                else {
                  return false;
                }
            }
        }
        return true;

    }// end puzzleEqual

}