public class sum_of_its_digits {
    public static void main(String[] args) {
        int number = 2250;
        int originalNumber = number;
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits = sumOfDigits + number % 10;
            number /= 10;
        }
        if (originalNumber % sumOfDigits == 0){
            System.out.println(originalNumber + " is divisible by the sum of its digits");
        }else {
            System.out.println(originalNumber + " is not divisible by the sum of its digits");
        }
    }
}
