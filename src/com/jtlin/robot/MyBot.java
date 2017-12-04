package com.jtlin.robot;
import kareltherobot.*;

public class MyBot extends UrRobot
{
  public MyBot(int street, int avenue, Direction dir, int beepers)
  {
    super(street, avenue, dir, beepers);
  }
  
  public void turnRight()
  {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  
  public void turnHalf()
  {
    turnLeft();
    turnLeft();
  }
  
  public void moveTwo()
  {
    move();
    move();
  }
  
}

