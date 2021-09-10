
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number: "); 
	    int n = sc.nextInt();
	    int sum=0;
	    int r=0,g;
	    g=n;
		while(n>0)
		{
		    n = n%10;
		    sum = sum + (r*r*r);
		    n=n/10;
		}
		if(sum==g){
		    System.out.println("yes");
		}
		else{
		    System.out.println("NOPE");
		}
	}
}

