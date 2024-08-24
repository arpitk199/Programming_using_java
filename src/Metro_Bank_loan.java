public class Metro_Bank_loan {
    public static void main(String[] args) {

        int accountNumber = 1001;
        int salary = 40000;
        int accountBalance = 250000;
        String loanType = "CAR";
        int loanAmountExpected = 300000;
        int emisExpected = 30;

        if (accountNumber >= 1000 && accountNumber <= 1999 && accountBalance > 1000) {
            if (salary > 25000 && loanType.equals("CAR")) {
                System.out.println("Eligible for Loan amount = 500000");
                System.out.println("Eligible EMIs = 36");
            } else if (salary > 50000 && loanType.equals("HOUSE")) {
                System.out.println("Eligible for Loan amount = 6000000");
                System.out.println("Eligible EMIs = 60");
            } else if (salary > 75000 && loanType.equals("BUSINESS")) {
                System.out.println("Eligible for Loan amount = 7500000");
                System.out.println("Eligible EMIs = 84");
            } else {
                System.out.println("Not eligible for loan based on salary and loan type.");
            }
        } else {
            System.out.println("Not eligible for loan based on account number or account balance.");
        }
    }
}
