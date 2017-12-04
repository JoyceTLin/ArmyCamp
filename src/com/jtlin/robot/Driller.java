package com.jtlin.robot;
import kareltherobot.*;

public class Driller extends UrRobot
{
  
  private Movement trainee1;
  private Movement trainee2;
  
  public Driller(int r, int c, Direction dir, int b, Movement t1, Movement t2)
  {
    super(r, c, dir, b);
    trainee1 = t1;
    trainee2 = t2;
  }
  
  public void bootCamp()
  {
    trainee1.march();
    trainee1.march();
    trainee1.march();
    trainee2.crawl();
    trainee2.crawl();
    trainee2.crawl();
  }
  
  public static void main(String[] args)
  {
    World.setVisible(true);
    World.setDelay(20);
    
    Army a = new Army(1, 1, East, 0);
    Army b = new Army(2, 1, East, 0);
    Driller gibbs = new Driller(10, 10, North, 0, a, b);
    gibbs.bootCamp();
  }
}
  