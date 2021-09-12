
import java.io.*;
import java.util.*;
public class Main
{
    
    static void appendString(String s)
    {
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer(100);
        StringBuffer s3=new StringBuffer("luke");
        
        s3.append(s);
        System.out.println(s3);
    }
    static void insertString(String s)
    {
        StringBuffer s1=new StringBuffer();//initial size 16B
    StringBuffer s2=new StringBuffer(100);//set buffer size.
    StringBuffer s3=new StringBuffer(" luke");
        
        s3.insert(3,s);
        System.out.println(s3);
    }
    static void deleteString(String s)
    {
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer(100);
        StringBuffer s3=new StringBuffer("luke");
        
        s3.replace(3,4,s);
        System.out.println(s3);
    }
    
	public static void main(String[] args) {
		System.out.println("1: Append");
        System.out.println("2: Insert");
        System.out.println("3: Delete");
        System.out.print("Make your choice: "); 
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                appendString("Skywalker");
                break;
            case 2:
                insertString("U");
                break;
            case 3:
                deleteString("jedi");
                break;
            // default:
            // System.out.print("Hello World");
            // break;
        }
	}
}

