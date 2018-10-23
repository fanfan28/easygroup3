package MyGraph;
import MyGraph.MyPoint;
import java.lang.Math;
import MyGraph.MyShape;

public class J_Rectangle extends MyShape
{  
   private double width,length;
   private MyPoint A,C;

  
public J_Rectangle(int x,int y,int z,int q)
{   A=new MyPoint(x,y);
    C=new MyPoint(z,q);
   width= Math.abs(C.getX()-A.getX());
   length=Math.abs(C.getY()-A.getY());
   
}



public double girth()
{
return (width+length)*2;}
public double area()
{
return width*length;
}
public void display()
{
System.out.println("左下点坐标:("+A.getX()+","+A.getY()+") 右上点坐标:("+C.getX()+","+C.getY()+")");
System.out.println("矩形的长:"+length+" 矩形的宽:"+width);

}

}