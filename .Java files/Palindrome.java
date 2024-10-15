import java.util.*;
class Palindrome
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter a string: ");
String str=sc.nextLine();
StringBuffer s1= new StringBuffer(str);
StringBuffer s2= new StringBuffer(s1);
s1.reverse();
if(String.valueof(s1).compareTo(String.valueof(s2))==0)
System.out.println("Given string is Palindrome");
else
System.out.println("Not Palindrome");
}
}
