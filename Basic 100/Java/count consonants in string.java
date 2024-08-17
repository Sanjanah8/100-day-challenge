import java.util.Scanner;
public class CountConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                                           c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                count++;
            }
        }
        System.out.println("Number of consonants: " + count);
    }
}
