package MyGraph;

import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Serializable;
import java.awt.Graphics;

public class Rectangle extends MyShape implements Serializable{
	
     static  Locale myLocale = Locale.getDefault();
       static  ResourceBundle bundle4 = ResourceBundle.getBundle("mymenu" , myLocale);	
        private int x;
        private int y;
	private int length;
	private int width;
        private MyPoint left_top_point;
	public Rectangle(){}
	public Rectangle(int x1,int y1,int l,int w){
		super();
		length = l;
		width = w;
                left_top_point=new MyPoint(x,y,"left_top_point");
	}
        public Rectangle(String r)
        {
        String str=r.substring(1);
        String[] value=str.split(",");
        int[] val=new int[4];
        for(int i=0;i<4;i++)
        {
        val[i]=Integer.parseInt(value[i]);
        }
        x=val[0];
        y=val[1];
        width=val[2];
        length=val[3];
        left_top_point=new MyPoint(x,y,"left_top_point");
        
        }
	public void draw(Graphics g)
        {
	g.drawRect(x,y,width,length);
	
	}
	
        @Override
public String toString(){
		String ret ="["+bundle4.getString("graph_r1") + left_top_point;
		ret+=bundle4.getString("graph_r2")+width;
                ret+=bundle4.getString("graph_r3")+length+"]";
		return ret;}
public String toShortString()       
{
return "(R"+x+","+y+","+width+","+length+")";
}



}
