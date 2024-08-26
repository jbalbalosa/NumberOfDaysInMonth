import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        System.out.println("isLeapYear " + isLeapYear(-1600));
        System.out.println("isLeapYear " + isLeapYear(2017));
        System.out.println("isLeapYear " + isLeapYear(2000));


        System.out.println("isLeapYear " + isLeapYear(2020));
        System.out.println("isLeapYear " + isLeapYear(2018));
        System.out.println("isLeapYear " + isLeapYear(2020));
        System.out.println("isLeapYear " + isLeapYear(-2020));

        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
    }

    public static boolean isLeapYear(int year){

        if (year <= 0 || year > 9999)
        {
           return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; // Divisible by 400, so it is a leap year
                } else {
                    return false; // Divisible by 100 but not by 400, so it is not a leap year
                }
            } else {
                return true; // Divisible by 4 but not by 100, so it is a leap year
            }
        } else {
            return false; // No
        }
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12)
        {
            return -1;
        }

        if (year< 1 || year > 9999)
        {
            return -1;
        }

        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }
}
