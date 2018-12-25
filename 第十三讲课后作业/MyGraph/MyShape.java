package MyGraph;
import java.io.Serializable;
import java.awt.Graphics;
public abstract class MyShape<T extends Number> implements Serializable
{
	public abstract void draw(Graphics g);
	
}
