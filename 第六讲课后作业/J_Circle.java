package MyGraph;
import MyGraph.MyPoint;


public class J_Circle extends MyShape
{  private int r;
   private MyPoint O;
  
  
   public J_Circle(int x,int y,int R)
  {  r=R;
     O=new MyPoint(x,y);
 }
   
   public double girth()
  {return 6.28*r;}
   public double area()
   {
     return 3.14*r*r;
    }
   public void display()
{
System.out.println("Ô²ÐÄ:("+O.getX()+","+O.getY()+")"+" Ô²ÐÎ°ë¾¶:"+r);

}
}
