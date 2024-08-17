import java.util.Scanner;
public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);
    }
}
