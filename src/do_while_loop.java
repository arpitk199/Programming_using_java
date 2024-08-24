
import java.util.Scanner;
public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");
        int totalCost = 0;
        String wantToAddFoodItem = "Y";
        int unitPrice = 10;
        int quantity = 1;

        do {
            totalCost = totalCost + (quantity * unitPrice);
            System.out.println("Order placed successfully!");
            System.out.println("Total cost: " + totalCost);
            System.out.println("Do you want to add more food items to the order? Y or N");
            String input = sc.next();
            wantToAddFoodItem = String.valueOf(input.charAt(0));
        } while (wantToAddFoodItem.equals("Y"));

        System.out.println("Thank you for ordering the food! It will reach you shortly...");





    }
}
