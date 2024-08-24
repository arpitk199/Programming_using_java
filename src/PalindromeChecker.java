public class PalindromeChecker {
    public static void main(String[] args) {
        int num = 78900987;
        String numberStr = Integer.toString(num);
        String reversedStr = "";

        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedStr += numberStr.charAt(i);
        }
        if (numberStr.equals(reversedStr)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
