public class factorial {
    public static void main(String[] args) {
        long factorialNo = 1;
        int num = 5;
        for (int i = 1; i <= num; i++){
             factorialNo *= i;

        }
        System.out.println(factorialNo);
    }
}
