package MyGraph;
import static java.lang.Math.*;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Serializable;
import java.awt.Graphics;
public class Polygon extends MyShape implements Serializable{
	 static  Locale myLocale = Locale.getDefault();
       static  ResourceBundle bundle5 = ResourceBundle.getBundle("mymenu" , myLocale);	
        public MyPoint p1,p2,p3;
	private int[] xPoints;
        private int[] yPoints;
        private int nPoints;
        private MyPoint[] points;
	public Polygon(){}
	public Polygon(int[] xPoints1,int[] yPoints1,int nPoints1)
        {
		super();
		for(int i=0;i<nPoints;++i)
                {xPoints[i]=xPoints1[i];
                 yPoints[i]=yPoints1[i];
                points[i]=new MyPoint(xPoints[i],yPoints[i]," ");}
		xPoints[nPoints]=xPoints[0];
                yPoints[nPoints]=yPoints[0];
	}
	 public Polygon(String p)
        {
        String str=p.substring(1);
        String[] value=str.split(",");
        int[] val=new int[value.length];
        for(int i=0;i<value.length;i++)
        {
        val[i]=Integer.parseInt(value[i]);
        }
      for(int i=0,j=0;i<nPoints;++i,j=j+2)
      {xPoints[i]=val[j];
       yPoints[i]=val[j+1];
        }
       xPoints[nPoints]=xPoints[0];
       yPoints[nPoints]=yPoints[0];
        }
      
	
        public void draw(Graphics g)
        {
	g.drawPolygon(xPoints,yPoints,nPoints);
	
	}
	public String toString(){
	
            String ret=bundle5.getString("graph_p")+"[";
            for(int i=0;i<nPoints-1;++i)
            {ret+=points[i];}
              ret+="]"; 
             return ret;
	}
        public String toShortString()
        { String ret="(P";
            for(int i=0;i<nPoints-1;++i)
        {ret+=xPoints[i]+","+yPoints[i]+",";}
          ret+=xPoints[nPoints-1]+")";
            return ret;
        }
	
	
}
