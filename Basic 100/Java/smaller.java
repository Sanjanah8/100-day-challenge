import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a==b)
	System.out.println("EQUAL");
	else if(a>b)
	System.out.println(b);
	else
	System.out.println(a);
	}
}
