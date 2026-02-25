import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp{

    public static boolean isPalindrome(String text) {
        Deque<Character> deque = new LinkedList<>();

        // Step 1: Insert characters into deque (ignore case and non-alphanumeric)
        for (char ch : text.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) { // optional: ignore spaces/punctuation
                deque.addLast(ch);
            }
        }

        // Step 2 & 3: Compare front and rear elements
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false; // mismatch found
            }
        }

        return true; // palindrome
    }

    public static void main(String[] args) {
        String[] tests = {"madam", "racecar", "hello", "A man, a plan, a canal, Panama"};

        for (String s : tests) {
            System.out.println("\"" + s + "\" -> " + isPalindrome(s));
        }
    }
}