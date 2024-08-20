import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        
        System.out.println(stack.pop()); // Third
        System.out.println(stack.pop()); // Second
        System.out.println(stack.pop()); // First
    }
}
