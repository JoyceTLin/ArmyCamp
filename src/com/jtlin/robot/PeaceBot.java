package jtlin.robot;
import kareltherobot.*;

public class PeaceBot extends UrRobot
{
  
  public PeaceBot(int r, int c, Direction dir, int b)
  {
    super(r, c, dir, b);
  }
  
  public boolean marry(Partner a, Partner b)
  {
    if (a.isAvailable() && b.isAvailable())
    {
      a.setSpouse(b);
      b.setSpouse(a);
      return true;
    }
    return false;
  }
  
  public static void main(String[] args)
  {
    LBot sally = new LBot(4,2,East,10);
    LBot harry = new LBot(5,2,East,4);
    PeaceBot judge = new PeaceBot(1,1,East,0);
   
    boolean gotMarried = judge.marry(sally,harry);
   
    if ( ! gotMarried 
       || sally.getSpouse() != harry 
       || harry.getSpouse() != sally ) 
    {
       System.out.println("they did not get married!?");
    }
    else System.out.println("successful");
  }
}