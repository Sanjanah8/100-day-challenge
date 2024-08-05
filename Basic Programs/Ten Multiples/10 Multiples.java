import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int ctr = 1; ctr <= 10; ctr++) {
            System.out.print(N * ctr + " ");
        }
    }
}
