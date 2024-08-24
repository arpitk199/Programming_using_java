public class ExactChange {
    public static void main(String[] args) {
        // Input values
        int x = 3;  // Number of $5 notes
        int y = 3;   // Number of $1 notes
        int z = 19;  // Amount to purchase

        int fiveDollarNotesUsed = 0;
        int oneDollarNotesUsed = 0;

        // Maximum number of $5 notes that can be used
        int maxFiveDollarNotes = Math.min(z / 5, x);

        // Calculate remaining amount after using $5 notes
        int remainingAmount = z - (maxFiveDollarNotes * 5);

        // Check if we can pay the remaining amount with $1 notes
        if (remainingAmount <= y) {
            fiveDollarNotesUsed = maxFiveDollarNotes;
            oneDollarNotesUsed = remainingAmount;
            System.out.println("$1 notes needed: " + oneDollarNotesUsed);
            System.out.println("$5 notes needed: " + fiveDollarNotesUsed);

        } else {
            System.out.println(-1);  // Exact change is not possible
        }
    }
}
