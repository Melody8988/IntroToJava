public class Windchill2 {
    public static void main (String[] args) {
        double windchill, windspeed, tempF; 
        windspeed = Double.valueOf(args[0]);
        tempF = Double.valueOf(args[1]);
        
        if (windspeed < 0 ){
            
            // windchill =  ( 0.6215 * tempF ) - 
            //              ( 35.75 * Math.pow( windspeed, 0.16 )) + 
            //              ( 0.4275 * tempF * Math.pow( windspeed, 0.16 )) + 
            //              35.74;

            System.out.println("Error: WindSpeeds cannot be below 0. ");
            return;
        }
        
        // If windspeed is below 4, the whindchill is just air temperature
        if (windspeed < 4 ) {
            windchill = tempF;

        } else {
        
            windchill =  ( 0.6215 * tempF ) - 
                         ( 35.75 * Math.pow( windspeed, 0.16 )) + 
                         ( 0.4275 * tempF * Math.pow( windspeed, 0.16 )) + 
                         35.74;

        }

        System.out.println("windspeed is " + args[0] + " miles per hour");
        System.out.println("tempF is " + args[1] + " degrees Farenheit");
        System.out.println("WINDCHILL IS: " + windchill + " degrees Farenheit");


    }
}