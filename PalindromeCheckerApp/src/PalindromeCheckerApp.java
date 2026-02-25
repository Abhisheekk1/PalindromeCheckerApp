import java.util.Deque;
import java.util.LinkedList;

public class NormalizedPalindrome {

    public static boolean isPalindrome(String text) {
        // Step 1: Normalize string
        text = text.toLowerCase().replaceAll("[^a-z0-9]", ""); // remove spaces & punctuation

        // Step 2: Use deque to check palindrome
        Deque<Character> deque = new LinkedList<>();
        for (char ch : text.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] tests = {
                "madam",
                "racecar",
                "hello",
                "A man, a plan, a canal, Panama",
                "No lemon, no melon"
        };

        for (String s : tests) {
            System.out.println("\"" + s + "\" -> " + isPalindrome(s));
        }
    }
}