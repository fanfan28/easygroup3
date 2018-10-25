package MyGraph;
import MyGraph.MyPoint;
import java.lang.Math;
import MyGraph.MyShape;

public class J_Triangle extends MyShape
{ 
   private MyPoint A,B,C; 
   private double a,b,c;
    
  
public J_Triangle(int m,int n,int o,int p,int q,int s)
{   A=new MyPoint(m,n);
    B=new MyPoint(o,p);  
    C=new MyPoint(q,s); 
   

a=Math.sqrt(Math.pow(B.getX()-C.getX(),2)+Math.pow(B.getY()-C.getY(),2));
b=Math.sqrt(Math.pow(A.getX()-C.getX(),2)+Math.pow(A.getY()-C.getY(),2));
c=Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));


}
public double girth()
{return a+b+c;}
public double area()
{
double p=girth()/2;
return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}
 public void display()
{
System.out.println("三角形点坐标分别为:("+A.getX()+","+A.getY()+") ("+B.getX()+","+B.getY()+") ("+C.getX()+","+C.getY()+")");
System.out.println("三角形三边边长分别为："+a+","+b+","+c);

}
}









