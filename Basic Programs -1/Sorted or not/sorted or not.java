import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("SORTED");
        } else if (num1 >= num2 && num2 >= num3) {
            System.out.println("SORTED");
        } else {
            System.out.println("NOTSORTED");
        }
    }
}
