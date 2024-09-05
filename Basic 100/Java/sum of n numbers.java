import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int counter=1;
while(counter<=n){
    sum+=sc.nextInt();
    counter++;
    
}
System.out.println(sum);
	}
}
