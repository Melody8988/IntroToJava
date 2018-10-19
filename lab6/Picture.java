public class Picture {
    public static void main(String[] args) {
        int rows = Integer.valueOf(args(0));
        int cols = Integer.valueOf(args(1));
        int npix = Integer.valueOf(args(2));
        char [] [] frame ;

        if ( rows > 0 && cols > 0){

            frame = new char[rows] [cols];
        }

        //Initialize 2 dimensional array
        for (i = 0; i < frame.length; i++) {
            frame[i] = ' ';
        }
    }
}
  