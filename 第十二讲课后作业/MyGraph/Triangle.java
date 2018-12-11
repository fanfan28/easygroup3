package MyGraph;
import static java.lang.Math.*;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Serializable;
public class Triangle<T extends Number> extends MyShape<T> implements Serializable{
	 static  Locale myLocale = Locale.getDefault();
       static  ResourceBundle bundle5 = ResourceBundle.getBundle("mymenu" , myLocale);	
        public MyPoint p1,p2,p3;
	private double s1;
	private double s2;
	private double s3;
	public Triangle(){}
	public Triangle(T x1,T y1,T x2,T y2,T x3,T y3)
        {
		super();
		p1 = new MyPoint(x1,y1,"T1");
                p2 = new MyPoint(x1,y1,"T2");
                p3 = new MyPoint(x1,y1,"T3");
		s1 = sqrt(Math.pow(x1.doubleValue()-x2.doubleValue(),2)+
                          Math.pow(y1.doubleValue()-y2.doubleValue(),2));
		s2 = sqrt(Math.pow(x1.doubleValue()-x3.doubleValue(),2)+
                          Math.pow(y1.doubleValue()-y3.doubleValue(),2));
                s3 = sqrt(Math.pow(x3.doubleValue()-x2.doubleValue(),2)+
                          Math.pow(y3.doubleValue()-y2.doubleValue(),2));
	}
	public double calArea(){
		double p = calPerimeter() / 2;
		return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
	}
	public double calPerimeter(){
		return s1+s2+s3;
	}
	public String toString(){
		return bundle5.getString("graph_t")+"["+p1+","+p2+","+p3+"]";
	}
	
	
}
