package MyGraph;
import MyGraph.MyShape;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.List;
public class MyMenu{
              static  Locale myLocale2 = Locale.getDefault();
              static ResourceBundle bundle2 = ResourceBundle.getBundle("mymenu" , myLocale2);
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
			String num = showInputDialog(bundle2.getString("menu5")+"\n" + concateStr);
			int number = Integer.parseInt(num);
			if(number >= 0 && number < paramStr.length)
				return number;
			System.out.println(bundle2.getString("menu6"));
		}
	}
        public static void disp_All_Object(MyShape[] p)
        {
         String msg="";
         for(MyShape x:p) if(x!=null)msg+=x+"\n";
         showMessageDialog(null,msg);
        }
        public static void disp_All_Object_Area(MyShape[] p)
        {
         String msg="";
         double areas=0.0d;
         for(MyShape x:p){ if(x!=null){msg+=x+" "+x.printArea()+"\n";areas+=x.calArea();}}
         msg+=bundle2.getString("menu1_0")+areas;
         showMessageDialog(null,msg);
        }
         public static int disp_All_Object_Remove(MyShape[] s)
         { 
         String msg="";int i=0;
         
         for(MyShape x:s) {if(x!=null)msg+="["+i+"]"+x+"\n";i++;}
         int number=Integer.parseInt(showInputDialog(msg+bundle2.getString("menu2_0")));
         return number;
         }
         public static void input_file(List<MyShape> myshape)
         {
             try
          {ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream("GraphData.tmp"));
           f.writeObject(myshape);
           f.flush();
           f.close();      
       }
         catch(Exception e)
         {   System.err.println("发生异常："+e);
            e.printStackTrace(); }
         }
         
 public static List<MyShape> output_file()
 {    List<MyShape> lists=new ArrayList<MyShape>();    
     try
         {ObjectInputStream fin=new ObjectInputStream(new FileInputStream("GraphData.tmp"));
          lists=(ArrayList<MyShape>)fin.readObject();
          fin.close();
        }
   catch(Exception e)
   {System.err.println("发生异常："+e);
            e.printStackTrace(); }
       return lists;
     
 }
}

        