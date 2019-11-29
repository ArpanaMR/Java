import java.util.*;

interface IQueue
{
 void Enqueue(int item);
 int Dequeue();
 void Print();
 }
 
class Queue implements IQueue
{
	private int n;
 private int Q[];
 private int f;
 private int r;
 int j;
 
 Queue(int size)
 {
	 
  n=size;
  Q=new int[n];
  f=-1;
  r=-1;
  }
  
 public void Enqueue(int item)
 {
  if(r==n-1)
   System.out.println("Queue is full");
  else
	  r++;
    Q[r]=item;
 }
 
 public int Dequeue()
 {
  if(r<f)
   System.out.println("The queue is empty");
   else
   {
     f++;
	 return Q[f];
	 
	 }
	 return 0;
	 
}

public void Print()
{
	
	for(j=0;j<r;j++)
		System.out.println(Q[j]);
}

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
 
 q1.Print();
  
  
  }
}
  