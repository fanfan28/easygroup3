package MyGraph;
import MyGraph.MyShape;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import java.util.LinkedList;
import java.util.List;

public class MyMenu{
	public static String getItemsString(String[] items){
		String ret = "";
		for(int i = 0; i < items.length;i++){
			ret += items[i] + "\n";
		}
		System.out.println(ret);
		return ret;
	}
	public static int input_choice(String[] paramStr){
		String concateStr = getItemsString(paramStr);
		while(true){
			String num = showInputDialog("Input the option index.\n" + concateStr);
			int number = Integer.parseInt(num);
			if(number >= 0 && number < paramStr.length)
				return number;
			System.out.println("ERROR, not in the range, enter it again.");
		}
	}
        public static void disp_All_Object(List<MyShape> l1)
        {
         String msg="";
         for(MyShape x:l1) if(x!=null)msg+=x+"\n";
         showMessageDialog(null,msg);
        }
        public static void disp_All_Object_Area(List<MyShape> l2)
        {
         String msg="";
         double areas=0.0d;
         for(MyShape x:l2){ if(x!=null){msg+=x+" "+x.printArea()+"\n";areas+=x.calArea();}}
         msg+="total Area is:"+areas;
         showMessageDialog(null,msg);
        }
}
