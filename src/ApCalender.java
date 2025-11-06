public class ApCalender {
    private static boolean isLeapYear(int year){
        boolean four = year % 4 == 0;
        boolean hundred = year % 100 == 0;
        boolean fourHundred = year % 400 == 0;
        return four && (!hundred || fourHundred);
    }
    public static int numberOfLeapYears(int year1, int year2){
        int leap = 0;
        for (int i = year1; i <= year2; i++){
            if (isLeapYear(i)) leap++;
        }
        return leap;
    }
}
