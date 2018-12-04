package TestMenu;
import MyGraph.Circle;
import static javax.swing.JOptionPane.*;
import static MyGraph.MyMenu.*;
import MyGraph.MyShape;
import MyGraph.Rectangle;
import MyGraph.Triangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.util.Locale;
import java.text.MessageFormat;
public class ShapeMain{
    
	public static void main(String args[]){
	 Locale myLocale = Locale.getDefault();
         ResourceBundle bundle = ResourceBundle.getBundle("mymenu" , myLocale);	
            int total = Integer.parseInt(args[0]);
                System.out.println(total);
                List<MyShape> list = new ArrayList<>(); 
                int count = 0;
		while(true){
			String []option = new String[5];
			option[0] = bundle.getString("menu0");
			option[1] = bundle.getString("menu1");
			option[2] = bundle.getString("menu2");
                        option[3] = bundle.getString("menu3");
			option[4] = bundle.getString("menu4");
			int num = input_choice(option);
			switch(num){
				case 0: 
                                        if(count>=total)
                                            showMessageDialog(null,bundle.getString("menu0_4")+total);
                                        else{
                                        String []strA = new String[4];
					strA[0] = bundle.getString("menu0_0");
					strA[1] = bundle.getString("menu0_1");
					strA[2] = bundle.getString("menu0_2");
                                        strA[3] = bundle.getString("menu0_3");
					int type = input_choice(strA);
					double[] nums=null;String num1,num2,num3,num4,num5,num6;
					switch(type){
                                               
						case 0:
							nums= new double[3];
							num1 = showInputDialog(bundle.getString("menu0_0_0"));
							nums[0] = Double.parseDouble(num1);
							num2 = showInputDialog(bundle.getString("menu0_0_1"));
							nums[1] = Double.parseDouble(num2);
							num3 = showInputDialog(bundle.getString("menu0_0_2"));
							nums[2] = Double.parseDouble(num3);							
                                                        count++;
                                                        list.add(new Circle(nums[0],nums[1],nums[2]));
                                                        break;
						
						case 1:
							nums = new double[4];
							num1 = showInputDialog(bundle.getString("menu0_1_0)"));
							nums[0] = Double.parseDouble(num1);
							num2 = showInputDialog(bundle.getString("menu0_1_1"));
							nums[1] = Double.parseDouble(num2);
							num3 = showInputDialog(bundle.getString("menu0_1_2"));
							nums[2] = Double.parseDouble(num3);
							num4 = showInputDialog(bundle.getString("menu0_1_3"));
							nums[3] = Double.parseDouble(num4);
                                                        count++;
                                                        list.add(new Rectangle(nums[0],nums[1],nums[2],nums[3]));
							break;						
						case 2:
							nums = new double[6];
							num1 = showInputDialog(bundle.getString("menu0_2_0"));
							nums[0] = Double.parseDouble(num1);
							num2 = showInputDialog(bundle.getString("menu0_2_1"));
							nums[1] = Double.parseDouble(num2);
							num3 = showInputDialog(bundle.getString("menu0_2_2"));
							nums[2] = Double.parseDouble(num3);
							num4 = showInputDialog(bundle.getString("menu0_2_3"));
							nums[3] = Double.parseDouble(num4);
							num5 = showInputDialog(bundle.getString("menu0_2_4"));
							nums[4] = Double.parseDouble(num5);
                                                        num6 = showInputDialog(bundle.getString("menu0_2_5"));
							nums[5] = Double.parseDouble(num6);                                                       
							count++;
							list.add( new Triangle(nums[0],nums[1],nums[2],nums[3],nums[4],nums[5]));
                                                        break;
                                                case 3: //back to main menu
                                                        break;
                                                     }//end of create menu
                                        }//end of count<total
                                     break;
				case 1://display all graph objects  
                                MyShape []p3=new MyShape[list.size()];
                                for(int i=0;i<list.size();i++){
                                p3[i]=list.get(i);}
                                disp_All_Object(p3);
				break;
				case 2: 
                                Collections.sort(list, new AreaComparator()); 
                                MyShape []p4=new MyShape[list.size()];
                                for(int i=0;i<list.size();i++){
                                p4[i]=list.get(i);}
				disp_All_Object_Area(p4);
				break;				
                                case 3:
                                MyShape []p5=new MyShape[list.size()];
                                for(int i=0;i<list.size();i++){
                                p5[i]=list.get(i);}
                                int choice=disp_All_Object_Remove(p5);
                                list.remove(choice);
                                break;
                                case 4:                                
					return;
			}//end of main menu
		}//end of while true
	}//end of main
      static class AreaComparator implements Comparator {
	    @Override	
            public int compare(Object object1, Object object2) {// 实现接口中的方法
			MyShape p1 = (MyShape) object1; // 强制转换
			MyShape p2 = (MyShape) object2;
			return new Double(p2.calArea()).compareTo(p1.calArea());
		}
	}

}