import java.util.Scanner;

public class LargestDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int max_diff = 0;
        for(int i = 1; i < n.length(); i++) {
            int diff = Math.abs(n.charAt(i) - n.charAt(i-1));
            if(diff > max_diff) max_diff = diff;
        }
        System.out.println(max_diff);
    }
}
