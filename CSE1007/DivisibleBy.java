import java.util.*;
class Factor{
    boolean isFactor(int n, int m){
        if(m%n==0){
            return true;
        }else{
            return false;
        }
    }
}
class Divisible2 extends Factor{
    boolean isFactor(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
}
class DivisibleBy3 extends Factor{
    boolean isFactor(int n){
        if(n%3==0 ){
            return true;
        }else{
            return false;
        }
    }
}
public class DivisibleBy
{
	public static void main(String[] args) {
	    Divisible2 obj = new Divisible2();
	    DivisibleBy3 newObj = new DivisibleBy3();
		System.out.println("Enter a number: ");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(obj.isFactor(a) == true && newObj.isFactor(a) == true){
		    System.out.println("Yes, Divisible By 6");
		}else{
		    System.out.println("Not divisible by 6");
		}
		
	}
}

