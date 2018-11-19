public class Day {

    private int dayNumber;
    private String dayOfWeek;
    private String holiday;

    static private int dayIndex;

    public Day() {
        dayIndex++;
        dayNumber = dayIndex;
    }

    public String toString() {
        return dayNumber + " " + dayOfWeek + " " + holiday;
    }

    public int reset() {
        dayNumber = 1;
        return dayNumber;
    }

    public boolean equals(Day toEvaluate) {

        if (dayOfWeek == toEvaluate.getDay() && holiday == toEvaluate.getHoliday()) {
            return true;

        } else {
            return false;
        }
    }

    // GETTERS
    public int getNumber() {
        return dayNumber;
    }

    public String getDay() {
        return dayOfWeek;
    }

    public String getHoliday() {
        return holiday;
    }

    // SETTERS
    public void setNumber(int n) {
        dayNumber = n;
    }

    public void setDay(String d) {
        dayOfWeek = d;
    }

    public void setHoliday(String h) {
        holiday = h;

    }

    public static void main(String[] args) {
        Day d1 = new Day();
        Day d2 = new Day();
        Day d3 = new Day();

        d1.setDay("Tuesday");
        d1.setHoliday("Christmas");

        d2.setDay("Tuesday");
        d2.setHoliday("Christmas");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1.reset());
        System.out.println(d1.equals(d2));

    }
}

// Write a complete class called Day which will contain information about a day
// in a
// calendar. The following attributes, constructors, and methods should be
// provided:
// int dayNumber (1 for first day created, then incremented by 1 for each
// subsequent day created)
// String dayOfWeek (Monday, Tuesday, …)
// String holiday (used to enter special day information, Christmas, New Year,
// etc.)

// public accessors for the attributes above as appropriate
// public method reset() which will reset the dayNumber counter to 1.
// method toString() that overrides the one inherited
// method equals() that overrides the one inherited
// Constructor: default constructor only
// When you have the Day class complete, provide a main() test method within it
// to show that the class
// works according to the description above.