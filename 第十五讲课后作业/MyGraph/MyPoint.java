package MyGraph;
import java.io.Serializable;
public class MyPoint<T extends Number> implements Serializable{
	 private T posx;
	 private T posy;
	 private String name;
	MyPoint(){};
	MyPoint(T x,T y,String name){
		posx = x;
		posy = y;
		this.name = name;
	}
        @Override
	public String toString(){
		return "Point " + name + "(" + posx + "," + posy + ")";
	}

    public T getPosx() {
        return posx;
    }

    public void setPosx(T posx) {
        this.posx = posx;
    }

    public T getPosy() {
        return posy;
    }

    public void setPosy(T posy) {
        this.posy = posy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
