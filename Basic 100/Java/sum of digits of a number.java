import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;  // Add the last digit to the sum
            num /= 10;        // Remove the last digit from the number
        }

        System.out.println("Sum of digits: " + sum);
    }
}
