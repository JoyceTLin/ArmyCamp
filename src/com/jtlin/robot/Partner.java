package jtlin.robot;
import kareltherobot.*;

public interface Partner
{
  public Partner getSpouse();
  
  public void setSpouse(Partner x);
  
  public boolean isAvailable();
}