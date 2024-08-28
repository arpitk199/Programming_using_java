public class LCM {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;


        int lcm;
        int max = (num1 > num2) ? num1 : num2;  // Start with the maximum of the two numbers

        // Loop until we find a common multiple
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max++;
        }

        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm + ".");
    }
}
