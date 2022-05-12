package Core_Java;

public class leapyear {
    public static void main(String[] args) {

        // year to be checked
        int year = 2022;
        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 50 == 0) {

                // if year is divided by 50
                // then it is a leap year
                if (year % 50 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
