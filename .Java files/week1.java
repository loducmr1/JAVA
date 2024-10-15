import java.util.Scanner;
class roots 
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter A,B,C values");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=(b*b)-(4*a*c);
double r1=(-b+Math.sqrt(d))/2*a;
double r2=(-b-Math.sqrt(d))/2*a;
if(d>0)
{
System.out.println("Roots are r1="+r1+"r2="+r2);
System.out.println("Roots are real and different");
}
else if(d==0)
{
System.out.println("Roots are r1="+r1+"r2="+r2);
System.out.println("Roots are real and equal");
}
else
{
System.out.println("Roots are r1="+r1+"r2="+r2);
System.out.println("Roots are imaginary");
}
}
}