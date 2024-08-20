import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
