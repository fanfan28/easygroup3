import MyGraph.MyShape;
import MyGraph.MyPoint;
import MyGraph.J_Triangle;
import MyGraph.J_Rectangle;
import MyGraph.J_Circle;


public class MyTestGraphs
{
public static void main(String args[])
{  

for(int i=0;i<args.length;++i)
{String[] a=args[i].split(",");
String temp=a[0].substring(1);
char type=a[0].charAt(0);
switch(type)
{case 'C':{J_Circle c=new J_Circle(Integer.parseInt(temp),Integer.parseInt(a[1]),Integer.parseInt(a[2]));
c.display();
System.out.println("圆形周长："+c.girth()+" 圆形面积："+c.area());
System.out.println();

break;}

 case 'R':{J_Rectangle r=new J_Rectangle(Integer.parseInt(temp),Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]));
r.display();
System.out.println("矩形周长："+r.girth()+"矩形面积："+r.area());
System.out.println();
break;}

 case 'T':{J_Triangle t=new J_Triangle(Integer.parseInt(temp),Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4]),Integer.parseInt(a[5]));
t.display();
System.out.println("三角形周长："+t.girth()+"三角形面积："+t.area());
System.out.println();
break;}
}

}
}
}