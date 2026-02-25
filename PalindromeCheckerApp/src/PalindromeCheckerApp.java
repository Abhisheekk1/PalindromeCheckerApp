public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Program starts

        String text = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        // Check if palindrome
        if (text.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Program exits
    }
}
