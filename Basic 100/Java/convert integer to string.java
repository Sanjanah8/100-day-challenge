import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Convert the integer to a string
        String str = Integer.toString(num);

        System.out.println("Converted string: " + str);
    }
}
