class Overloading_Demo
{
int x,y;
void display()
{
x=5;
System.out.println(x);
}
void display(int a)
{
x=a;
System.out.println(x*x);
}
void display(int a,int b)
{
x=a;
y=b;
System.out.println(x+y);
}

public static void main(String args[])
{
Overloading_Demo m=new Overloading_Demo();
m.display();
m.display(10);
m.display(10,20);
}
}