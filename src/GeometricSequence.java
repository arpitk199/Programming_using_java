public class GeometricSequence {
    public static void main(String[] args) {
        int num = 5;
        int a = 1;
        int r = 2;

        System.out.println("GeometricSequence");
        for (int i = 0; i < num; i++){
            int term = a * (int) Math.pow(r,i);
            if (i < num - 1) {
                System.out.print(term + ", ");
            } else {
                System.out.print(term);
            }
        }

    }
}
