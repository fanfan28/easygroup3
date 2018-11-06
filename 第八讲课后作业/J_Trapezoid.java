package MyGraph;
import java.lang.Math;
import MyGraph.MyShape;

public class J_Trapezoid extends MyShape
{  
   private double top,down,height;
    
public J_Trapezoid(int t,int d,int h)
{   top=t;
    down=d;
    height=h;
}

public double area()
{
return (top+down)*height/2;
}
public String display1()
{String tmp="梯形 t="+top+" d="+down+" h="+height;
return tmp;
}

 public String display2()
{
String tmp="梯形 t="+top+" d="+down+" h="+height+" 面积="+area();
return tmp;
}
public double girth()
{return 0.00;}
}