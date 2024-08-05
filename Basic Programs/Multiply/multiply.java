package multiply;
import java.util.Scanner;
public class Multiply {

   public static void main(String[] args) {
    int x, y, z;
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number:");
    x = sc.nextInt(); // 

    System.out.println("Enter a number:");
    y = sc.nextInt(); 

    z = x * y;  
    System.out.println("Multiplication is: " + z);
  }
} 
