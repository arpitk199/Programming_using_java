public class For_loop {
    public static void main(String[] args) {
        int noOfCustomer = 20;
        String customerId = "";

        for (int counter = 1; counter <= noOfCustomer; counter++){
            if (counter <= 9)
                customerId = "C0" + counter;
            else
                customerId = "C" + counter;
            System.out.println("Customer Id for customer " + counter + " is " + customerId);

        }

    }
}
