import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        if (divisor != 0) {
            double quotient = (double) dividend / divisor;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}
