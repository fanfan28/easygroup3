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
System.out.println("Բ���ܳ���"+c.girth()+"Բ�������"+c.area());
break;}

 case 'R':{J_Rectangle r=new J_Rectangle(Integer.parseInt(temp),Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]));
System.out.println("�����ܳ���"+r.girth()+"���������"+r.area());
break;}

 case 'T':{J_Triangle t=new J_Triangle(Integer.parseInt(temp),Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4]),Integer.parseInt(a[5]));
System.out.println("�������ܳ���"+t.girth()+"�����������"+t.area());
break;}
}

}
}
}