import java.util.*;
class Thread1 implements Runnable
{
	Thread t;
	Thread1()
	{
		t=new Thread(this,"Thread1");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("BMSCE\n");
		
			try
			{
				Thread.sleep(10000);
			}
		catch(InterruptedException e)
		{
			System.out.println("BMS thread Caught");
		}
		}
	}
}
class Thread2 implements Runnable
{
	Thread t;
	Thread2()
	{
		t=new Thread(this,"Thread2");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("CSE\n");
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("CSE thread Caught");
		}
		}
	}
}
class Multithread
{
	public static void main(String args[])
{
	Thread1 t =new Thread1();
	Thread2 t1 =new Thread2();
}
}
	
