public class display_the_next_date {
    public static void main(String[] args) {
        int day = 5;
        int month = 9;
        int year = 2015;

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }
        day++;

        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;

            // Check if the month exceeds 12
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.printf("%d-%d-%d\n", day, month, year);
    }
}
