import java.util.Scanner;

public class EvenPrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        if(number.contains("2"))
            System.out.println("Contains Even Prime");
        else
            System.out.println("Does Not Contain Even Prime");
    }
}
