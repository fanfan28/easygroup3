package TestMenu;
import MyGraph.Oval;
import MyGraph.Straight_line;
import static javax.swing.JOptionPane.*;
import static MyGraph.MyMenu.*;
import MyGraph.MyShape;
import MyGraph.Rectangle;
import MyGraph.Polygon;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.util.Locale;
import java.text.MessageFormat;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class ShapeMain{
    
	public static void main(String args[]){
	 Locale myLocale = Locale.getDefault();
         ResourceBundle bundle = ResourceBundle.getBundle("mymenu" , myLocale);	
            
                List<MyShape> list = new ArrayList<>(); 
                int count = 0;
		while(true){
			String []option = new String[9];
			option[0] = bundle.getString("menu0");
			option[1] = bundle.getString("menu1");
			option[2] = bundle.getString("menu2");
                        option[3] = bundle.getString("menu3");
			option[4] = bundle.getString("menu7");
                        option[5] = bundle.getString("menu8");
                        option[6] = bundle.getString("menu9");
                        option[7] = bundle.getString("menu10");
                        option[8] = bundle.getString("menu4");
            
			int num = input_choice(option);
			switch(num){
				case 0: 
                                {
                                 
                                        String []strA = new String[5];
					strA[0] = bundle.getString("menu0_0");
					strA[1] = bundle.getString("menu0_1");
					strA[2] = bundle.getString("menu0_2");
                                        strA[3] = bundle.getString("menu0_3");
                                        strA[4] = bundle.getString("menu0_4");
					int type = input_choice(strA);
					double[] nums=null;String num_o,num_r,num_p,num_s;
					switch(type){
                                               
						case 0:
						
							num_o = showInputDialog(bundle.getString("menu0_0_0"));
                                                        list.add(new Oval(num_o));
                                                        count++;
                                                        break;
						
						case 1:
							num_r = showInputDialog(bundle.getString("menu0_1_0"));
                                                        list.add(new Rectangle(num_r));
                                                        count++;
                                                        break;						
						case 2:
							num_p = showInputDialog(bundle.getString("menu0_2_0"));
                                                        list.add(new Polygon(num_p));
                                                        count++;
                                                        break;
                                                case 3:num_s= showInputDialog(bundle.getString("menu0_3_0"));
                                                        list.add(new Straight_line(num_s));
                                                        count++;
                                                        break;
                                                case 4: //back to main menu
                                                        break;
                                                     }//end of create menu
                                       
                                     break;}
				case 1:
                                MyShape []p3=new MyShape[list.size()];
                                for(int i=0;i<list.size();i++){
                                p3[i]=list.get(i);}
                                disp_All_Object(p3);
				break;
				case 2: 
                              //功能暂时空缺
				
				break;				
                                case 3:
                                MyShape []p5=new MyShape[list.size()];
                                for(int i=0;i<list.size();i++){
                                p5[i]=list.get(i);}
                                int choice=disp_All_Object_Remove(p5);
                                list.remove(choice);
                                break;
                                case 4: input_filetmp(list);break;
                                case 5: list.addAll(output_filetmp());break;                          
                                case 6:input_file(list);break;
                                case 7:list.addAll(output_file());break;
                                case 8:	return;
			}//end of main menu
		}//end of while true
	}//end of main
     
	}

