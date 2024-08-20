import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Mango", 3);
        
        System.out.println("Apple: " + map.get("Apple"));
        System.out.println("Banana: " + map.get("Banana"));
        System.out.println("Mango: " + map.get("Mango"));
    }
}
