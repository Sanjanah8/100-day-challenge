import java.util.Scanner;
public class ReplaceChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter replacement character: ");
        char newChar = sc.next().charAt(0);
        String newStr = str.replace(oldChar, newChar);
        System.out.println("Modified string: " + newStr);
    }
}
