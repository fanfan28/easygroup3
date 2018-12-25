package MyGraph;

import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Serializable;
import java.awt.Graphics;

public class Oval extends MyShape implements Serializable{

       static  Locale myLocale = Locale.getDefault();
       static  ResourceBundle bundle3 = ResourceBundle.getBundle("mymenu" , myLocale);	
	private int x;
        private int y;
        private int width;
        private int height; 
        private MyPoint center;
	public Oval (){}
	public Oval(String o)
        {
        String str=o.substring(1);
        String[] value=str.split(",");
        int[] val=new int[4];
        for(int i=0;i<4;i++)
        {
        val[i]=Integer.parseInt(value[i]);
        }
        x=val[0];
        y=val[1];
        width=val[2];
        height=val[3];
        center=new MyPoint(x,y,"center");
        
       
        }
        public Oval(int x1,int y1,int width1,int height1){
		super();
		x=x1;
                y=y1;
                width=width1;
                height=height1;
                center=new MyPoint(x,y,"center");
		}
        
	public void draw(Graphics g){g.drawOval(x,y,width,height);}
	@Override
        public String toString()
        {
		  return "(O"+x+","+y+","+width+","+height+")";      
	}
      
       
        
}
