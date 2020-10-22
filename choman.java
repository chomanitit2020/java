import java.util.Scanner;
class choman{
public static void main(String[]args){

Scanner s=new Scanner(System.in);
System.out.println(" enter size");

int size=s.nextInt();
String [] letter=new String[size];
String b;

for(int i=0;i<letter.length;i++)
{
	System.out.println("enter the letters");

b=s.next ();
letter[i]=b;
}

for(int i=0;i<letter.length;i++)
{
	System.out.print(letter[i]);
}
}
}