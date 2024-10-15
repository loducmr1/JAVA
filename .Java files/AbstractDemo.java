abstract class Shape
{
int a=2;
int b=4;
abstract void Area();
}
class Rectangle extends Shape
{
void Area()
{
int r=(a*b);
System.out.println("Area of Rectangle="+r);
}
}
class Triangle extends Shape
{
void Area()
{
int t=(a*b)/2;
System.out.println("Area of Triangle="+t);
}
}
class Circle extends Shape
{
void Area()
{
double c=(3.14*a*a);
System.out.println("Area of Circle of Radius"+ a +"=" +c );
}
}
public class AbstractDemo
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Circle c=new Circle();
Shape s;
s=r;
s.Area();
s=t;
s.Area();
s=c;
s.Area();
}
}


