/*
Using class Thread
class Hi extends Thread
{
public void run()
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hi");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
	 System.out.println("Please");
 }
 }
 }
 }
 
class Hello extends Thread
{
 public void run()
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hello");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
 }
 }
 }
 }
 
 class TD
 {
 public static void main(String args[])
 {
 Hi o1=new Hi();
 Hello o2=new Hello();
 o1.start();
 try{
	 Thread.sleep(10);
 }
 catch(Exception e){}
 o2.start();
 
 }
 }
 */
 
/* 
 class Hi implements Runnable
{
public void run()
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hi");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
	 System.out.println("Please");
 }
 }
 }
 }
 
class Hello implements Runnable
{
 public void run()
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hello");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
 }
 }
 }
 }
 
 class TD
 {
 public static void main(String args[])
 {
 Hi o1=new Hi();
 Runnable o2=new Hello();
 
 Thread t1=new Thread(o1);
 Thread t2=new Thread(o2);
 t1.start();//not run as run is not defined in runnable
 try{
	 Thread.sleep(10);
 }
 catch(Exception e){}
 t2.start();
 
 }
 }
 */
 
 
/* USing lambda expression 
 class TD
 {
 public static void main(String args[])
 {
	 
 Runnable o1=()->
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hi");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
	 System.out.println("Please");
 }
 }
 };
	 
 Runnable o2=()->
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hello");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
 }
 }
 };
 
 Thread t1=new Thread(o1);
 Thread t2=new Thread(o2);
 t1.start();//not run as run is not defined in runnable
 try{
	 Thread.sleep(10);
 }
 catch(Exception e){}
 t2.start();
 
 }
 }
 
*/


/*join is alive
class TD
 {
 public static void main(String args[])
 {
	 
 Runnable o1=()->
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hi");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
	 System.out.println("Please");
 }
 }
 };
	 
 Runnable o2=()->
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hello");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
 }
 }
 };
 
 Thread t1=new Thread(o1);
 Thread t2=new Thread(o2);
 t1.start();//not run as run is not defined in runnable
 try{
	 Thread.sleep(10);
 }

 catch(Exception e){}
  
 t2.start();
 
 System.out.println(t1.isAlive());
 System.out.println(t2.isAlive());
 try{
 t1.join();
 }
 catch(InterruptedException e){}
 
 try{
 t2.join();
 }
 catch(InterruptedException e){}
 System.out.println(t1.isAlive());
 System.out.println(t2.isAlive());
 System.out.println("Bye");
 
 }
 }
 
 
 */
 /* Thread Priority
 
 class TD
 {
 public static void main(String args[])
 {
	 
 Runnable o1=()->
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hi");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
	 System.out.println("Please");
 }
 }
 };
	 
 Runnable o2=()->
{
 for(int i=0;i<5;i++)
 {
 System.out.println("Hello");
 try{
	 Thread.sleep(1000);
 }
 catch(Exception e)
 {
 }
 }
 };
 
 Thread t1=new Thread(o1);
 Thread t2=new Thread(o2);
 t1.setName("Hi Thread ");
 t2.setName("Hello Thread");
 t1.setPriority(Thread.MIN_PRIORITY);
 t2.setPriority(Thread.MAX_PRIORITY);
 System.out.println(t1.getPriority());
 System.out.println(t2.getPriority());
 System.out.println(t1.getName());
  System.out.println(t2.getName());
 t1.start();//not run as run is not defined in runnable
 try{
	 Thread.sleep(10);
 }

 catch(Exception e){}
  
 t2.start();
 
 System.out.println(t1.isAlive());
 System.out.println(t2.isAlive());
 try{
 t1.join();
 }
 catch(InterruptedException e){}
 
 try{
 t2.join();
 }
 catch(InterruptedException e){}
 System.out.println(t1.isAlive());
 System.out.println(t2.isAlive());
 System.out.println("Bye");
 
 }
 }
 
 */
 
 
 /* sync. thrrads
 class Counter
 {
	 int count;
	 public  synchronized void increment()//only 1 thread can use it at a time
	 {
		 count++;
	 }
 }
 
 class TD
 {
	 public static void main(String args[])
	 {
		 Counter c=new Counter();
		 
		 Thread t1=new Thread(new Runnable()
		 {
			 public void run()
			 {
				 for(int i=1;i<=1000;i++)
				 {
		 c.increment();
				 }}
		 });
		 
		  
		 Thread t2=new Thread(new Runnable()
		 {
			 public void run()
			 {
				 for(int i=1;i<=1000;i++)
				 {
		 c.increment();
				 }}
		 });
	 
	 
	 t1.start();
	 t2.start();
		try{t1.join();}
catch(Exception e){}	
try{t2.join();}
catch(Exception e){}		
		 System.out.println("Count" + c.count);
	 }
 }
 */
 
 
 /* Consumer Producer
 class Q{
	 int num;
	 boolean valueset=false;
	 
	 public synchronized void put(int num)
	 {
		 while(!valueset)
		 try{wait();}
		 catch(Exception e){}
		 
		 System.out.println("Put: "+num);
		 this.num=num;
		 valueset=false;
		 notify();
	 }
 
 public synchronized void get()
 { while(valueset)
		 try{wait();}//wait and ntify belong to object class
		 catch(Exception e){}
	 System.out.println("Get: "+num);
	 valueset=true;
		 notify();
 }
 }
 
 
 
 class Producer implements Runnable{
  Q q;
  Producer(Q q)
  {
	  
	  this.q=q;
	  Thread t=new Thread(this,"Producer");
	  t.start();
  }
  
  public void run()
  {
	  int i=0;
	  while(true)
	  {
		  q.put(i++);
		  try{Thread.sleep(1000);}
		  catch(Exception e){}
	  }
  }
 }
 
 
 class Consumer implements Runnable{
  Q q;
  Consumer(Q q)
  {
	  this.q=q;
	   Thread t=new Thread(this,"Consumer");
	  t.start();
  }
  
  public void run()
  {
	  int i=0;
	  while(true)
	  {
		  q.get();
		  try{Thread.sleep(2000);}
		  catch(Exception e){}
	  }
  }
 }
 
 public class TD
 {
	 public static void main(String args[])
	 {
		 Q q=new Q();
		Producer p= new Producer(q);
		Consumer c= new Consumer(q);
	 }
 }
		 
 */

/*
import java.awt.*;
import java.awt.event.*;

public class TD extends Frame implements MouseListener, MouseMotionListener{
	String msg="Hi";
	int mouseX=0,mouseY=0;
	
	public TD()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		//MyWindowAdapter adapter = new MyWindowAdapter(this);
// register it to receive those events
//addWindowListener(adapter);
		//addWindowListener(new WindowAdapter(this));
	}
	
	public void mouseEntered(MouseEvent me)
	{
		mouseX=100;
		mouseY=100;
		msg="Mouse Entered";
		repaint();
	}
	
	public void mouseClicked(MouseEvent me)
	{
		
		msg=msg +"--click recieved";
		repaint();
	}
	
	public void mouseExited(MouseEvent me)
	{
		mouseX=100;
		mouseY=100;
		msg="Mouse Exited";
		repaint();
	}
	
	public void mousePressed(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Button down";
		repaint();
	}
	
	public void mouseReleased(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Button released";
		repaint();
	}
	
	public void mouseDragged(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="*"+"mouse at "+mouseX +", " +mouseY;
		repaint();
	}
	
	
	public void mouseMoved(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Moving mouse at "+mouseX +", " +mouseY;
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
	}
	
	public static void main(String args[])
	{
		TD appwin=new TD();
		appwin.setSize(new Dimension(300,300));
		appwin.setTitle("MouseEventDemo");
		appwin.setVisible(true);
		Color C=new Color(255,134,100);
		appwin.setBackground(C);
		appwin.setForeground(Color.white);
		
	}
}
*/


/*
import java.awt.*;
import java.awt.event.*;

class TD extends Frame
{
	TD()
	{
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		}
		);
	}
	
	public void paint(Graphics G)
	{
		G.drawLine(10,20,30,20);
		G.drawRect(50,50,30,40);
		G.fillRect(60,70,10,5);
		G.drawRoundRect(90,90,5,5,10,10);
		G.fillOval(110,100,6,7);
		G.drawArc(80,75,10,10,10,80);
	}
	
	public static void main(String args[])
	{
		TD appwin=new TD();
		appwin.setSize(new Dimension(300,300));
		appwin.setTitle("MouseEventDemo");
		appwin.setVisible(true);
		Color C=new Color(255,134,100);
		appwin.setBackground(C);
		appwin.setForeground(Color.white);
		
	}
}
*/
/*
import java.util.*;

class TD
{
public static void main(String args[])
{
Thread t= Thread.currentThread();

System.out.println("Curren thread" +t);

t.setName("First thread");

System.out.println("Thread after name change" +t);

try{
	for(int i=0;i<5;i++)
	{
		System.out.println(i);
		Thread.sleep(5000);
	}
}
catch(InterruptedException e){}
}
}
*/

import java.util.*;

class TDemo implements Runnable
{
	Thread t;
	TDemo()
	{
		t=new Thread(this,"T");
		t.start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("CSE\n");
			
		try{
			Thread.sleep(2000);
		   }
		catch(InterruptedException e){}
		}
	}
}

class T2 implements Runnable
{
	
	Thread t2;
	T2()
	{
		t2=new Thread(this,"T2");
		t2.start();
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("BMSCE");
			try{Thread.sleep(10000);}
			catch(InterruptedException e){}
		}
	}
}
	
	
	class TD
	{
		public static void main(String args[])
		{
			TDemo o1=new TDemo();
			T2 o2=new T2();
			System.out.println("ThreadCSE alive: "+o1.t.isAlive());
			System.out.println("Thread BMSCE alive: "+o2.t2.isAlive());
			try{o1.t.join();
			o2.t2.join();
			}
			catch(InterruptedException e){}
			System.out.println("ThreadCSE alive: "+o1.t.isAlive());
			System.out.println("Thread BMSCE alive: "+o2.t2.isAlive());
			
		}
	}
	