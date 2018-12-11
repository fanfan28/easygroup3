package MyGraph;

import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Serializable;

public class Circle<T extends Number> extends MyShape<T> implements Serializable{

       static  Locale myLocale = Locale.getDefault();
       static  ResourceBundle bundle3 = ResourceBundle.getBundle("mymenu" , myLocale);	
	public MyPoint<T> center;
	private double radius;
	public Circle(){}
	public Circle(double x,double y,double rad){
		super();
		center = new MyPoint(x,y,"C");
		radius = rad;
	}
	public double calArea(){
		return Math.PI * radius *radius;
	}
	public double calPerimeter(){
		return 2*Math.PI*radius;
	}
	public String toString()
        {
		return "["+bundle3.getString("graph_c1")+ radius+" :  "+bundle3.getString("graph_c2")+center+"]";
	}
}
