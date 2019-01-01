package MyGraph;
import MyGraph.MyShape;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;

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
			String num = showInputDialog(bundle2.getString("menu11")+"\n" + concateStr);
			int number = Integer.parseInt(num);
			if(number >= 0 && number < paramStr.length)
				return number;
			System.out.println("ERROR, not in the range, enter it again");
		}
	}
        public static void disp_All_Object(MyShape[] p)
        {
         String msg="";
         for(MyShape x:p) if(x!=null)msg+=x+"\n";
         showMessageDialog(null,msg);
        }
    
         public static int disp_All_Object_Remove(MyShape[] s)
         { 
         String msg="";int i=0;
         
         for(MyShape x:s) {if(x!=null)msg+="["+i+"]"+x+"\n";i++;}
         int number=Integer.parseInt(showInputDialog(msg+bundle2.getString("menu2_0")));
         return number;
         }
         public static void input_filetmp(List<MyShape> myshape)
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
         
 public static List<MyShape> output_filetmp()
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
public static void input_file(List<MyShape> s)
{
        JFileChooser chooser = new JFileChooser();
		
		//后缀名过滤器
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "文本文件(*.txt)", "txt");
		chooser.setFileFilter(filter);
		int option = chooser.showSaveDialog(null);
		if(option==JFileChooser.APPROVE_OPTION){	
			File file = chooser.getSelectedFile();
			
			String fname = chooser.getName(file);	
			if(fname.indexOf(".txt")==-1){
				file=new File(chooser.getCurrentDirectory(),fname+".txt");
                        }
	            File fi = chooser.getSelectedFile();
                    String f = fi.getAbsolutePath();
    
   
    

                 try
                    {FileWriter fw = new FileWriter(f);
                     BufferedWriter bufw = new BufferedWriter(fw);
                     String myshape[]=new String[s.size()];
                    for(int i=0,j=s.size();i<j;i++)
                    {
                     myshape[i]=s.get(i).toString();
                     bufw.write(myshape[i]);
                     bufw.newLine();
                    }
                   bufw.close();
                    }
                catch(IOException e)
               {
                 System.err.println("发生异常"+e);
                 e.printStackTrace();
               }
}
}
public static List<MyShape> output_file()
{
    
List<MyShape> lists=new ArrayList<>();
JFileChooser fd = new JFileChooser();
	//fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	fd.showOpenDialog(null);
	File f = fd.getSelectedFile();
	if(f != null){}
try
{FileReader fr = new FileReader(f);
BufferedReader bufr = new BufferedReader(fr);
String s1;
for(s1=bufr.readLine();s1!=null;s1=bufr.readLine())
{String type=s1.substring(1,2);
switch(type)
{case "O":lists.add(new Oval(s1.substring(1,s1.length()-1)));break;
 case "R":lists.add(new Rectangle(s1.substring(1,s1.length()-1)));break;
 case "P":lists.add(new Polygon(s1.substring(1,s1.length()-1)));break;
 case "S":lists.add(new Straight_line(s1.substring(1,s1.length()-1)));break;
}
}   
bufr.close();
}

catch(IOException e)
{
 System.err.println("发生异常"+e);
 e.printStackTrace();
}
return lists;
 }
}


        