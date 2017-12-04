package jtlin.robot;
import kareltherobot.*;

public class LBot extends UrRobot implements Partner
{
  private Partner spouse;
  
  public LBot(int r, int c, Direction dir, int b)
  {
    super(r, c, dir, b);
  }
  
  public Partner getSpouse()
  {
    return spouse;
  }
  
  public void setSpouse(Partner x)
  {
    spouse = x;
  }
  
  public boolean isAvailable()
  {
    return spouse == null;
  }
}