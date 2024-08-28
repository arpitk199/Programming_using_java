public class number_is_a_seed_of_another_number {
    public static void main(String[] args) {
        int x = 123;
        int y = 738;

        int ogX = x;
        int product = x;
        while (x > 0){
            int digit = x % 10;
            product = product * digit;
            x = x / 10;
        }
        if (product == y){
            System.out.println(ogX + " is a seed of " + y + ".");

        }else {
            System.out.println(ogX + " is not seed of " + y + ".");

        }
    }
}
