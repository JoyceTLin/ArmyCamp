package com.jtlin.robot;
import kareltherobot.*;

public class Army extends MyBot implements Movement
{
  public Army(int r, int c, Direction dir, int b)
  { 
    super(r, c, dir, b);
  }
  
  public void march()
  {
    move();
    move();
    move();
    move();
  }
  
  public void crawl()
  {
    move();
    move();
    move();
  }
}