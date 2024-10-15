import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter upto which the prime numbers are to be printed");
int n=s.nextInt();
System.out.println("The prime numbers are");
for(int i=2;i<n;i++)
{
int p=0;
for(int j=2;j<i;j++)
{
if (i%j==0)
p=1;
}
if (p==0)
System.out.println(i);
}
}
}