package TestMenu;
import MyGraph.Circle;
import static javax.swing.JOptionPane.*;
import static MyGraph.MyMenu.*;
import MyGraph.MyShape;
import MyGraph.Rectangle;
import MyGraph.Triangle;
import java.util.LinkedList;
import java.util.List;

public class ShapeMain{
	public static void main(String args[]){
		int total = Integer.parseInt(args[0]);
		System.out.println(total);
                List<MyShape> s=new LinkedList<>();
                int count = 0;
		while(true){
			List<String> ls1=new LinkedList<>();
                     ls1.add("[0] for create a new graph");
                     ls1.add("[1] for display all graphs");
                     ls1.add("[2] for calculate sum of area of all graphs");
                     ls1.add("[3] for quit");
                     String[] str = new String[ls1.size()];
                        ls1.toArray(str);
                      int num = input_choice(str);
			switch(num)
                        {case 0:
                            
                        {   if(count>total) {showMessageDialog(null,"Can't create more object than "+total);break;}
                            while(count<=total)
                        {    List<String> ls2=new LinkedList<>();
                             ls2.add("[0] Add a new Circle");
                             ls2.add("[1] Add a new Rectangle");
                             ls2.add("[2] Add a new Triangle");
                             ls2.add("[3] Come back to MainMenu");
                             String[] strA = new String[ls2.size()];
                             ls2.toArray(strA);
                                
			     int type = input_choice(strA);
					List<Double> nums=new LinkedList<>();String num1,num2,num3,num4,num5,num6;
				
                                        switch(type){
                                               
						case 0:
                                                       
					                num1 = showInputDialog("Input the x");
					                nums.add(Double.parseDouble(num1));
							num2 = showInputDialog("Input the y");
							nums.add(Double.parseDouble(num2));
							num3 = showInputDialog("Input the radius");
							nums.add(Double.parseDouble(num3));
							s.add(new Circle(nums.get(0),nums.get(1),nums.get(2)));	
                                                        ++count;
							break;
						
						case 1:
							
							num1 = showInputDialog("Input the x");
					                nums.add(Double.parseDouble(num1));
							num2 = showInputDialog("Input the y");
							nums.add(Double.parseDouble(num2));
							num3 = showInputDialog("Input the length");
							nums.add(Double.parseDouble(num3));
							num4 = showInputDialog("Input the width");
							nums.add(Double.parseDouble(num4));
							
                                                        s.add(new Rectangle(nums.get(0),nums.get(1),nums.get(2),nums.get(3)));
                                                        ++count;
                                                        break;						
						case 2:
							
							num1 = showInputDialog("Input the x1");
							nums.add(Double.parseDouble(num1));
							num2 = showInputDialog("Input the y1");
							nums.add(Double.parseDouble(num2));
							num3 = showInputDialog("Input the x2");
							nums.add(Double.parseDouble(num3));
							num4 = showInputDialog("Input the y2");
							nums.add(Double.parseDouble(num4));
							num5 = showInputDialog("Input the x3");
							nums.add ( Double.parseDouble(num5));
                                                        num6 = showInputDialog("Input the y3");
							nums.add(Double.parseDouble(num6));                                                       
							s.add(new Triangle(nums.get(0),nums.get(1),nums.get(2),nums.get(3),nums.get(4),nums.get(5)));
							++count;
                                                        break;
                                                case 3: //back to main menu
                                                        break;
                                                     }
                                        if(count>=total) {showMessageDialog(null,"图形已满"+total+"个！"); break;}
                                                  //end of create menu
                                        }
                              break;//end of count<total
                        }
		   case 1://display all graph objects                                
					disp_All_Object(s);
				        break;
		   case 2:
					disp_All_Object_Area(s);
					break;				
		   case 3:                                
					return;
			}//end of main menu
		}//end of while true
	}//end of main
}