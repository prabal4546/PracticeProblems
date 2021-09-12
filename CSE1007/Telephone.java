import java.io.*;
class Telephone
{
int telno,no1;
String cname;
String ccity;
Telephone(){}
Telephone(int tno,String name,String city)
{

telno=tno;
cname=name;
ccity=city;

}
}
class Search
{
Telephone T[]=new Telephone[100];
int no;

public void searchMenu()throws IOException
{
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter How many Customer:=> ");
no=Integer.parseInt(br.readLine());
int tno;
String cname,ccity;

for(int i=0;i<no;i++)
{
System.out.println("“Enter Telephone Number :=> ”" );
tno=Integer.parseInt(br.readLine());
System.out.println("“Enter Customer Name :=> ” ");
cname=br.readLine();
System.out.println("“Enter Customer City :=> ”" );
ccity=br.readLine();
T[i]=new Telephone(tno,cname,ccity);
}

int ch;
do
{
System.out.println("“********************************** ”" );
System.out.println("“You Have Following Choice. :=> ”" );
System.out.println("“1. Search By Number. ”" );
System.out.println("“2. Search By Name. ”" );
System.out.println("“3. Search All Customer Of Given City. ”" );
System.out.println("“4. Exit.” ");
System.out.println("“********************************** ”" );
System.out.println("“Enter your choice:=> ”" );
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1 :

System.out.println("“********************************** ”" );
System.out.println("“Enter Number To Search:=> ”" );
int num = Integer.parseInt(br.readLine());
search(num);
break;
case 2 :
System.out.println("“********************************** ”" );
System.out.println("“Enter Customer Name To Search:=> ”" );
String name =br.readLine();
search(name,1);
break;
case 3 :
System.out.println("“********************************** ” ");
System.out.println("“Enter City Name To Search:=> ”" );
String city = br.readLine();
search(city,2);
break;
case 4 :
System.exit(0);
}
}while (true);
}

public void search(int num)
{
int f=0;
for(int i=0;i<no;i++)
{
if(num==T[i].telno)
{
System.out.println("“********************************** ” ");
System.out.println("” Customer Name :=> ”" +T[i].cname);
System.out.println("” Customer City :=> “"+T[i].ccity );
System.out.println("“********************************** ”" );
f=1;
}
}
if(f==0)
{
System.out.println("“********************************** ” ");
System.out.println("“Sorry…! No result found for given number.”");
System.out.println("“********************************** ”" );
}

}

public void search(String str,int flag)
{
int f1=0,f2=0;
if(flag==1)
{
for(int i=0;i<no;i++)
{
if(str.equals(T[i].cname))
{
System.out.println("“********************************** ” ");
System.out.println("The Telephone Number is "+T[i].telno);
System.out.println("“The City Is “"+T[i].ccity);
System.out.println("“********************************** ”" );
f1=1;
}
}
if(f1==0)
{
System.out.println("********************************** " );
System.out.println("“Sorry…! No result found for given customer name.”");
System.out.println("********************************** " );
}
}
if(flag==2)
{
for(int i=0;i<no;i++)
{
if(str.equals(T[i].ccity))
{
System.out.println("**********************************" );
System.out.println("The Telephone Number is "+T[i].telno);
System.out.println("“The Customer Name Is “"+T[i].cname);
System.out.println("“********************************** ”" );
f2=1;
}
}
if(f2==0)
{
System.out.println("“********************************** ”" );
System.out.println("“Sorry…! No result found for given city.”");
System.out.println("“********************************** ”" );
}
}
}
}
public class Main
{

public static void main(String args[])throws IOException
{

Search s=new Search();
s.searchMenu();
}}
