import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        double squareRoot = Math.sqrt(num);
        System.out.println("Square root: " + squareRoot);
    }
}
