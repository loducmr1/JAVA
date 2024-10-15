class One
{
int calculate(int n)
{
return n;
}
}
class Two extends One
{
int calculate(int n)
{
return(n*n);
}
}
class MOR
{
public static void main(String args[])
{
Two t=new Two();
int m=t.calculate(3);
System.out.println("Multiplication is :"+m);
}
}