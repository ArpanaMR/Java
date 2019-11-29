import java.util.*;

interface IQueue
{
 void Enqueue(int item);
 int Dequeue();
 void Display();
 }
 
class Queue implements IQueue
{
 private int Q[];
 private int f;
 private int r;
 
 Queue(int size)
 {
  Q=new int[size];
  f=0;
  r=-1;
  }
  
 public void Enqueue(int item)
 {
  if(r==Q.length-1)
   System.out.println("Queue is full");
  else
    Q[++r]=item;
 }
 
 public int Dequeue()
 {
  if(r<f)
   System.out.println("The queue is empty");
   else
   {
     r--;
	 return Q[r];
	 }
	 
}

public void Diplay()
{
	int j;
	for(j=0;j<r;j++)
		System.out.println(Q[j]);
}
}

class demo
{
 public static void main(String args[])
 {
  int n,i;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter number of elements");
  n=s.nextInt();
  
  Queue q1=new Queue(n);
  
  for(i=0;i<n;i++)
  {System.out.println("enter element");
  
  q1.Enqueue(s.nextInt());
  }
  System.out.println("Element removed is : ");
  
  System.out.println(q1.Dequeue());

System.out.println("Elements are : ");
 
  q1.Display();
  
  }
  }
  