package MyGraph;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Serializable;
import java.awt.Graphics;

public class Straight_line  extends MyShape implements Serializable
{
    static  Locale myLocale = Locale.getDefault();
    static  ResourceBundle bundle6 = ResourceBundle.getBundle("mymenu" , myLocale);	
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private MyPoint A;
    private MyPoint B;
    Straight_line(int a,int b,int c,int d)
    {x1=a;
     y1=b;
     x2=c;
     y2=d;
    A=new MyPoint(x1,y1,"A");
    B=new MyPoint(x2,y2,"B");
    }
    
    public Straight_line(String s)
        {
        String str=s.substring(1);
        String[] value=str.split(",");
        int[] val=new int[4];
        for(int i=0;i<4;i++)
        {
        val[i]=Integer.parseInt(value[i]);
        }
        x1=val[0];
        y1=val[1];
        x2=val[2];
        y2=val[3];
        }
    public void draw(Graphics g)
    { 
        g.drawLine(x1,y1,x2,y2);
    }
public String toString()
{
return "["+bundle6.getString("graph_s1")+bundle6.getString("graph_s2")+A+bundle6.getString("graph_s3")+B+"]";

}

public String toShortString()       
{
return "(S"+x1+","+y1+","+x2+","+y2+")";
}
        
}
