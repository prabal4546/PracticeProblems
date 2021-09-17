import java.util.Scanner;

    class Student {
	String name;
	int registrationNum;
	int marks[] = new int[6];
	int year;
	int semester;

}

public class StudentMark 
{

    public static void main(String args[])
    {
        Student student = new Student();
        float total=0, avg;

        Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter Name: ");
          student.name=SC.nextLine();
          System.out.print("Enter Roll Number: ");
          student.registrationNum=SC.nextInt();
          System.out.print("Enter year: ");
          student.year=SC.nextInt();
          System.out.print("Enter semester: ");
          student.semester=SC.nextInt();
          System.out.print("Enter your marks:  \n");
          student.marks[0]=SC.nextInt();
          student.marks[1]=SC.nextInt();
          student.marks[2]=SC.nextInt();
          student.marks[3]=SC.nextInt();
          student.marks[4]=SC.nextInt();
          total = student.marks[0]+student.marks[1]+student.marks[2]+student.marks[3]+student.marks[4];
          avg = total/5;
          System.out.print("Your Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
