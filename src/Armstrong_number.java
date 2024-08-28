public class Armstrong_number {
    public static void main(String[] args) {
        int number = 371;
        int sum = 0;
        int temp = number;
        int digits = 0;
        for (int n= number; n > 0;){
             n = n / 10;
             digits++;
        }
        while (temp>0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }
        System.out.println("Sum of the number" + sum);
        if (sum == number){
            System.out.println( number + " is an Armstrong number.");
        }else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

}
