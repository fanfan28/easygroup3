package MyGraph;


public class MyPoint
{
 private int x,y; 
 private String name;
 
 public MyPoint(){};
public MyPoint(int x1,int y1) 
{ 
  x=x1;
  y=y1;
 
 }
 public MyPoint(int x1,int y1,String n) 
{ 
  x=x1;
  y=y1;
  name=n;
 }

 public void setX(int x2)
{x=x2;}
 
 public int getX()
{return x;}

 public void setY(int y2)
{y=y2;}

 public int getY()
{return y;}

 public void setName(String n2)
{name=n2;}

 public String getName()
{return name;}


}