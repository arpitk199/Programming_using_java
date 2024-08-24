public class three_positive_integer_values {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 8;
        int display = 0;
        if (b != 7){
            if (c == 7){
                display = -1;
            }
            else {
                display = b*c;
            }

        } else if (c != 7) {
            display = c;
        }
        System.out.println(display);

    }
}
