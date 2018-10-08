public class Windchill5 {
    public static void main(String[] args) {
        double windchill5, windchill10, windchill15, windchill20, windchill25, tempF, iteratedTemp, lineCount;
        // windspeed = Double.valueOf(args[0]); //No longer taking windspeed

        tempF = Double.valueOf(args[0]);
        iteratedTemp = Double.valueOf(args[0]) - 20;
        lineCount = 0;

        // if (windspeed < 0) {
        //     System.out.println("Error: WindSpeeds cannot be below 0. ");
        //     return;
        // } //No longer taking windspeed 

        System.out.println("  Temp (F)     Wind=5    Wind=10    Wind=15    Wind=20    Wind=25 ");

        while (tempF > iteratedTemp) {

            if (lineCount % 5 == 0) {
                System.out.println("-------------------------------------------------------------------\n");

            }

            // If windspeed is below 4, the windchill is just air temperature
            // if (windspeed < 4) {
            //     windchill = tempF;
            // } //No longer accepting windchill
       

            windchill5 = (0.6215 * tempF) - (35.75 * Math.pow(5, 0.16))
                        + (0.4275 * tempF * Math.pow(5, 0.16)) + 35.74;

            windchill10 = (0.6215 * tempF) - (35.75 * Math.pow(10, 0.16))
                        + (0.4275 * tempF * Math.pow(10, 0.16)) + 35.74;

            windchill15 = (0.6215 * tempF) - (35.75 * Math.pow(15, 0.16))
                        + (0.4275 * tempF * Math.pow(15, 0.16)) + 35.74;

            windchill20 = (0.6215 * tempF) - (35.75 * Math.pow(20, 0.16))
                        + (0.4275 * tempF * Math.pow(20, 0.16)) + 35.74;

            windchill25 = (0.6215 * tempF) - (35.75 * Math.pow(25, 0.16))
                        + (0.4275 * tempF * Math.pow(25, 0.16)) + 35.74;
    
            System.out.printf("%10.1f %10.1f %10.1f %10.1f %10.1f %10.1f\n", tempF, windchill5, windchill10, windchill15, windchill20, windchill25 );
            tempF--;
            lineCount++;
        }
    }
}