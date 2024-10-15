import java.util.*;
class InvalidAgeException extends Exception
{
InvalidAgeException(String s)
{
super(s);
}
}

class TestCustomException67
{
static void validate(int age)throws InvalidAgeException
{
if(age<18)
 throw new InvalidAgeException("Not applicable to vote");
else
 System.out.println("Welcome to Vote");
}

public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("Enter Your Age");
int n=a.nextInt();
try
{
validate(n);
}
catch(Exception m){System.out.println("Exception occured: "+m);}

System.out.println("Custom exception Demo completed...");
}
}