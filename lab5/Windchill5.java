public class Windchill5 {
    public static void main(String[] args) {
        double windchill, windspeed, tempF, iteratedTemp, lineCount;

        tempF = Double.valueOf(args[0]);
        iteratedTemp = Double.valueOf(args[0]) - 20;
        lineCount = 0;
        windchill=0;

        System.out.println("  Temp (F)     Wind=5    Wind=10    Wind=15    Wind=20    Wind=25 ");

        while (tempF > iteratedTemp) {
            if (lineCount % 5 == 0) {
                System.out.println("----------------------------------------------------------------\n");
            }
            System.out.printf("%10.1f", tempF);
            
        
        for (windspeed=5; windspeed<=25; windspeed+=5 ){
            
            if (windspeed % 5 == 0 ){
                windchill = (0.6215 * tempF) - (35.75 * Math.pow(windspeed, 0.16))
                        + (0.4275 * tempF * Math.pow(windspeed, 0.16)) + 35.74;
            
            System.out.printf("%10.1f", windchill);
            }
            
        }//end windspeed progress

        System.out.printf("\n");
            
            tempF--;
            lineCount++;
        }//end linecounting

    }//main
}