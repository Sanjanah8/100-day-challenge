import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String str = sc.nextLine();
        try {
            int num = Integer.parseInt(str);
            System.out.println("Converted integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }
}
