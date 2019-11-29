import java.util.*;

interface SAFE_DRIVING
{
  int Safe_Speed=50;
 void  speed_Of_the_vehicle();
}

class Main implements SAFE_DRIVING
{ int Speed;
 
  Main()
  {
     System.out.println("Enter the speedin km/hr");
    Scanner s=new Scanner(System.in);
    Speed=s.nextInt();
  }
 
  public void  speed_Of_the_vehicle()
  {
    //System.out.println("Enter the speed limit");
   // Safe_speed=s.nextInt();
   
    if(Speed>=Safe_Speed)
      System.out.println("Drive Slow");
    else
      System.out.println("Safe Driving");
  }

  public static void main(String args[])
  {
   Main S1=new Main();
    S1.speed_Of_the_vehicle();
  }
}
