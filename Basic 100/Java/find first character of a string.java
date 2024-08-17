import java.util.Scanner;
public class FirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            System.out.println("String is empty.");
        } else {
            System.out.println("First character: " + str.charAt(0));
        }
    }
}
