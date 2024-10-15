public class MultipleCatchBlock67
{
public static void main(String[]args)
{
try
{
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
int a[]=new int[5];
a[0]=x/y;
System.out.println("Division ="+a[0]);
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array Index Out Of Bounds Exception occurs");
}
catch(NumberFormatException e)
{
System.out.println("Number Format Exception occurs");
}
catch (Exception e)
{
System.out.println("Parent Exception occurs");
}

System.out.println("rest of the code");
}
}