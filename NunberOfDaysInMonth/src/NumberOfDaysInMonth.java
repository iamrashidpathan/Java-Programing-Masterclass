public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year) {
        boolean leap = false;
        if (year <=1 || year >= 9999) return leap;
        if (year % 4 ==0) {
            if (year % 100 ==0) {
                if (year % 400 == 0) {
                    leap = true;
                }//else leap = false;
            }else leap = true;
        }//else leap = true;
        return leap;
    }

    public static int getDaysInMonth (int month, int year) {
        if (month<1 || month >12 || year<1 || year>9999) return -1;
        if (month==2) {
            boolean leap = isLeapYear(year);
            if (leap) return (29);
            else return 28;
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
        }return 0;
    }
}
