import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String text = "HELLO";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue characters & Push characters
        for (int i = 0; i < text.length(); i++) {
            queue.add(text.charAt(i));   // FIFO
            stack.push(text.charAt(i));  // LIFO
        }

        System.out.println("Queue (FIFO) order:");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

        System.out.println("\nStack (LIFO) order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}