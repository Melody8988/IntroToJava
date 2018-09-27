public class Sort3 {
    public static void main (String [] args){
        double varA, varB, varC, small, middle, large;

        varA = Double.valueOf(args[0]);
        varB = Double.valueOf(args[1]);
        varC = Double.valueOf(args[2]);

        if (varA < varB && varB < varC){
            small = varA;
            middle = varB;
            large = varC;

        } else if (varA < varC && varC < varB) {
            small = varA;
            middle = varC;
            large = varB;
            
        } else if (varB < varA && varA < varC) {
            small = varB;
            middle = varA;
            large = varC;
           
        } else if (varB < varC && varC < varA) {
            small = varB;
            middle = varC;
            large = varA;

        } else if (varC < varB && varB < varA)  {
            small = varC;
            middle = varB;
            large = varA;
            
        } else {
            small = varC;
            middle = varA;
            large = varB;
            
        }

        System.out.println(" Small = " + small + " middle = " + middle + " large = " + large );

    }
}