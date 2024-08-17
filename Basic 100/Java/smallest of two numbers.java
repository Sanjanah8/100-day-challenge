import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1 < num2) {
            System.out.println(num1 + " is smaller.");
        } else {
            System.out.println(num2 + " is smaller.");
        }
    }
}
