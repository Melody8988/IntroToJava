public class Windchill3 {
    public static void main(String[] args) {
        double windchill, windspeed, tempF, iteratedWind;
        windspeed = Double.valueOf(args[0]);
        tempF = Double.valueOf(args[1]);
        iteratedWind = Double.valueOf(args[0]) + 15;

        if (windspeed < 0) {
            System.out.println("Error: WindSpeeds cannot be below 0. ");
            return;
        }

        while (windspeed < iteratedWind) {

            // If windspeed is below 4, the windchill is just air temperature
            if (windspeed < 4) {
                windchill = tempF;

            } else {
                windchill = (0.6215 * tempF) - (35.75 * Math.pow(windspeed, 0.16))
                        + (0.4275 * tempF * Math.pow(windspeed, 0.16)) + 35.74;

            }

            System.out.printf("windspeed is %4.1f tempF is %4.1f windchill is = %4.1f\n", windspeed, tempF, windchill);
            windspeed++;

        }
    }
}