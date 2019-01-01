package MyGraph;

import java.util.Locale;
import java.util.ResourceBundle;
import java.awt.Graphics;
import java.io.Serializable;

public class Circle<T extends Number> extends MyShape <T> implements Serializable{

       static  Locale myLocale = Locale.getDefault();
       static  ResourceBundle bundle3 = ResourceBundle.getBundle("mymenu" , myLocale);	
	public MyPoint<T> center;
	private T radius;
	public Circle(){}
	public Circle(T x,T y,T rad){
		super();
		center = new MyPoint(x,y,"C");
		setRadius(rad);
	}

    
	
	public String toString()
        {       
		return "["+bundle3.getString("graph_c1")+ radius+" :  "+bundle3.getString("graph_c2")+center+"]";
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getPosx().intValue(), center.getPosy().intValue(),radius.intValue(), radius.intValue());
	}

    public void setRadius( T radius)
    {
        this.radius = radius;
    }
}
