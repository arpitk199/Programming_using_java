import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Food_Corner {
    public static void main(String[] args) {
        char foodType = 'N';
        int quantity = 3;
        int distance = 10;

        int total;


        if ((foodType != 'V' && foodType != 'N') || distance < 1 || quantity < 1) {
            total = -1;
        } else {
            int costPerPlate = (foodType == 'V') ? 12 : 15;
            int foodCost = costPerPlate * quantity;

            int deliveryCharge;
            if (distance <= 3) {
                deliveryCharge = 0;
            } else if (distance <= 6) {
                deliveryCharge = 1;
            } else {
                deliveryCharge = 2;
            }
            total = foodCost + deliveryCharge;

        }
        System.out.println("The final bill amount is: $" + total);




    }
}
