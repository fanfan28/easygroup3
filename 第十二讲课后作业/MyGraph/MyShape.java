package MyGraph;
import java.io.Serializable;
public abstract class MyShape<T extends Number> implements Serializable
{
	public abstract double calArea();
	public abstract double calPerimeter();
	public String printArea(){
		return "Area = " + calArea();
	}
}
