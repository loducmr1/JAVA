class Q
{
int n;
boolean valueSet=false;
synchronized int get()
{
while(!valueSet)
try
{
Thread.sleep(2000);
wait();
}
catch(InterruptedException e)
{
System.out.println("Interrupted Exception caught");
}
System.out.println("Got: "+n);
valueSet=false;
notify();
return n;
}
synchronized void put(int n)
{
while(valueSet)
try
{
Thread.sleep(2000);
wait();
}
catch (InterruptedException e)
{
System.out.println("Interrupted Exception caught");
}
this.n=n;
valueSet=true;
System.out.println("Put: "+n);
notify();
}
}
class Producer implements Runnable
{
Q q;
Producer(Q q)
{
this.q=q;
new Thread(this, "Producer").start();
}
public void run()
{
int i=0;
while(true)
{
q.put(i++);
}
}
}
class Consumer implements Runnable
{
Q q;
Consumer(Q q)
{
this.q=q;
new Thread(this, "Consumer").start();
}
public void run()
{
while (true)
{
q.get();
}
}
}
public class PC
{
public static void main(String args[])
{
Q q=new Q();
System.out.println("Press control-c to stop.");
new Producer(q);
new Consumer(q);
}
}
