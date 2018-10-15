package MyGraph;

public class J_Triangle
{  public int a,b,c;
  
public J_Triangle(int x,int y,int z)
{  
a=x;
b=y;
c=z;
}
public int girth()
{return a+b+c;}
public double area()
{
double p=girth()/2;
return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}
}









