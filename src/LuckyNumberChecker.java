public class LuckyNumberChecker {
    public static void main(String[] args) {
        int number = 1623;  // Example number
        int sum = 0;
        int position = 1;   // To track the position of each digit

        while (number > 0) {
            int digit = number % 10;

            // Check if the position is even
            if (position % 2 == 0) {
                sum += digit * digit;
            }

            // Move to the next digit and update the position
            number /= 10;
            position++;
        }

        // Check if the sum is a multiple of 9
        if (sum % 9 == 0) {
            System.out.println("The number is a lucky number.");
        } else {
            System.out.println("The number is not a lucky number.");
        }
    }
}
