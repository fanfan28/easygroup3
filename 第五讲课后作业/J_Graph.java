import MyGraph.J_Triangle;
import MyGraph.J_Rectangle;
import MyGraph.J_Circle;


public class J_Graph
{
public static void main(String args[])
{  
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int k=Integer.parseInt(args[2]);
int s=Integer.parseInt(args[3]);
int q=Integer.parseInt(args[4]);
int w=Integer.parseInt(args[5]);

J_Triangle t=new J_Triangle(i,j,k);
J_Rectangle r=new J_Rectangle(s,q);
J_Circle c=new J_Circle(w);

System.out.println("�������ܳ���"+t.girth()+"�����������"+t.area());
System.out.println("�����ܳ���"+r.girth()+"���������"+r.area());
System.out.println("Բ���ܳ���"+c.girth()+"Բ�������"+c.area());


}
}