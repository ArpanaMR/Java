import java.util.*;

class asc implements Runnable
{ int i;
 Thread t;
 asc()
 {
  t=new Thread(this,"asc");
  t.start();
  }
  
  public void run()
  {
  try
  {
   //for(i=0;i<10;i++)
   System.out.println(i);
   }
   catch(InterruptedException e)
   {
    System.out.println("asc thread interrupted");
	}
	}
}


class dsc implements Runnable
{int i;
 Thread t;
 dsc()
 {
  t=new Thread(this,"dsc");
  t.start();
  }
  
  public void run()
  {
  try
  {
   for(i=10;i>0;i++)
   System.out.println(i);
   }
   catch(InterruptedException e)
   {
    System.out.println("dsc thread interrupted");
	}
	}
}

class Print
{
	public static void main(String args[])
{
	asc t =new asc();
	dsc t1 =new dsc();
}
}
	