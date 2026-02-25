public class PalindromeCheckerApp{

    // Recursive helper function
    private static boolean isPalindromeHelper(String text, int start, int end) {
        // Base condition: crossed or met pointers
        if (start >= end) return true;

        // Compare characters
        if (text.charAt(start) != text.charAt(end)) return false;

        // Recurse inward
        return isPalindromeHelper(text, start + 1, end - 1);
    }

    // Public method: prepares string and calls helper
    public static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[^a-z0-9]", ""); // optional: ignore non-alphanumeric
        return isPalindromeHelper(text, 0, text.length() - 1);
    }

    public static void main(String[] args) {
        String[] tests = {"madam", "racecar", "hello", "A man, a plan, a canal, Panama"};

        for (String s : tests) {
            System.out.println("\"" + s + "\" -> " + isPalindrome(s));
        }
    }
}