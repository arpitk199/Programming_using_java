public class count_rabbits_and_chickens {
    public static void main(String[] args) {
        int heads = 150;
        int legs = 500;

        int chickens = 0;
        int rabbits = 0;
        boolean found = false;
        for (int c = 0; c <= heads; c++){
            rabbits = heads-c;
            if (2*c+4*rabbits == legs){
                chickens = c;
                found = true;
                break;

            }
        }
        if (found) {
            System.out.println("Number of Chickens :" + chickens);
            System.out.println("Number of Rabbits :" + rabbits);
        }else {
            System.out.println("Invalid input. No valid solution exists.");

        }
    }
}
