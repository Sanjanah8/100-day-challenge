import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedStr);
    }
}
