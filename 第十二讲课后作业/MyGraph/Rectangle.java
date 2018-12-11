package MyGraph;

import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Serializable;

public class Rectangle<T extends Number> extends MyShape implements Serializable{
	
     static  Locale myLocale = Locale.getDefault();
       static  ResourceBundle bundle4 = ResourceBundle.getBundle("mymenu" , myLocale);	
       public MyPoint<T> left_top_point;
	private T length;
	private T width;
	public Rectangle(){}
	public Rectangle(T x,T y,T l,T w){
		super();
		left_top_point = new MyPoint(x,y,"R");
		length = l;
		width = w;
	}
	public double calArea(){
		return length.longValue()*width.doubleValue();
	}
	public double calPerimeter(){
		return 2*(length.doubleValue()+width.doubleValue());
	}
        @Override
	public String toString(){
		String ret ="["+bundle4.getString("graph_r1") + left_top_point;
		ret+=bundle4.getString("graph_r2")+width;
                ret+=bundle4.getString("graph_r3")+length+"]";
		return ret;}
}
