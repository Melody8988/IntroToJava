public class Day {
  
        private int dayNumber = 1;
        private String dayOfWeek;
        private String holiday;

        public Day(){

    }


    public String toString() {
        return dayNumber + " " + dayOfWeek + " " + holiday;
    }

    //GETTERS
    public int getNumber() {
        return numerator;
    }

    public int getDay() {
        return denominator;
    }

    public int getHoliday() {
        return denominator;
    }

    //SETTERS
    public void setNumber(int n) {
        dayNumber= n;
    }

    public void setDay(String d) {
        dayOfWeek = d;
    }

    public void setHoliday(String h){
        holiday = h;

    }

    public static void main (String[] args){
        Day d1 = new Day(1, "Monday", "None");
        Day d2 = new Day (2, "Tuesday", "None");

        System.out.println(Day.length);
    }
}


// Write a complete class called Day which will contain information about a day in a
// calendar. The following attributes, constructors, and methods should be provided:
// int dayNumber (1 for first day created, then incremented by 1 for each subsequent day created)
// String dayOfWeek (Monday, Tuesday, …)
// String holiday (used to enter special day information, Christmas, New Year, etc.)

// public accessors for the attributes above as appropriate
// public method reset() which will reset the dayNumber counter to 1.
// method toString() that overrides the one inherited
// method equals() that overrides the one inherited
// Constructor: default constructor only
// When you have the Day class complete, provide a main() test method within it to show that the class
// works according to the description above.