//Code from Fifteen.java used in this program
public class MyFifteen {
    public static void main(String[] args) {
        final int NROWS = 4;
        final int NCOLS = 4;
        
        int row,col;
        int count;
        int[][] puzzle = new int[NROWS][NCOLS];

        // initialize the puzzle to all zeroes FROM FIFTEEN.JAVA
        for (row = 0; row < puzzle.length; row++){
            for (col = 0; col < puzzle[row].length; col++){
                puzzle[row][col] = 0;
            }
        }
        
        // search for solution & print
        initSolution(puzzle);
        printPuzzle(puzzle);



    }//main

    //Set puzzle values
    static void initSolution(int[][] puzzleArray){
        int row, col;
        int[][] fifteenFilledPuzzle = new int[puzzleArray.length][puzzleArray.length]; 

        // - method FROM FIFTEEN.JAVA
        for (row = 0; row < fifteenFilledPuzzle.length; row++) 
            for (col = 0; col < fifteenFilledPuzzle[row].length; col++)  {
                fifteenFilledPuzzle[row][col] = row * fifteenFilledPuzzle[row].length + col + 1;
            }
        //Set bottom right corner to 0 FROM FIFTEEN.JAVA
        fifteenFilledPuzzle[fifteenFilledPuzzle.length - 1][fifteenFilledPuzzle[fifteenFilledPuzzle.length - 1].length - 1] = 0;
    
    }//end initsolution

    // print out the puzzle 
    static void printPuzzle(int[][] puzzleArray) {
        int row, col;
        int[][] printedPuzzle = new int[puzzleArray.length][puzzleArray.length];

        //- method from FIFTEEN.JAVA
        System.out.println();
        for (row = 0; row < printedPuzzle.length; row++) {
            for (col = 0; col < printedPuzzle[row].length; col++)
                System.out.printf("%4d   ", printedPuzzle[row][col] );
            System.out.println();
        }
        System.out.println();
    }//end printPuzzle
    
}