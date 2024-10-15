SDFSSinterface Printable
{
void print();
}
interface Showable
{
void show();
}
class multinher implements Printable, Showable
{
public void print()
{
System.out.println("HELLO");
}
public void show()
{
System.out.println("WELCOME");
}
}
class MI
{
public static void main(String args[])
{
multinher obj = new multinher();
obj.print();
obj.show();
}
}