package add;
import java.util.Scanner;
public class Add {

   public static void main(String[] args) {
    int x, y, sum;
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number:");
    x = sc.nextInt(); // 

    System.out.println("Enter a number:");
    y = sc.nextInt(); 

    sum = x + y;  
    System.out.println("Sum is: " + sum);
  }
} 
