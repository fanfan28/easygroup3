package MyGraph;
import MyGraph.MyPoint;
import java.text.DecimalFormat;



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
   public String display1()
{
String tmp="Ô² r="+r;
return tmp;

}

 public String display2()
{
String R=String.valueOf(r);


String tmp="Ô² r="+r+" Ãæ»ý="+area();

return tmp;
}


}
