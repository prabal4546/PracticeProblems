
import java.util.*;
import java.io.*;
interface Num{
        int reverse(int number);
        boolean isPalindrome(int number);

}
class Sample implements Num{
    public  int reverse(int number) {
		String reverse = ""; 	
		String n = number + ""; 
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); 
	}
	public  boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}
}
public class Palindrome 
{
    
	public static void main(String[] args) {
	    Sample obj = new Sample();
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		System.out.println(number + (obj.isPalindrome(number) ? " is " : " is not ") +
			"a palindrome.");
	}
}



