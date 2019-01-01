package TestMenu;
import MyGraph.Oval;
import MyGraph.Straight_line;
import static javax.swing.JOptionPane.*;
import static MyGraph.MyMenu.*;
import MyGraph.MyShape;
import MyGraph.Rectangle;
import MyGraph.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.util.Locale;
import java.text.MessageFormat;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;
public class ShapeMain{
    public class J_Menu extends JFrame
{
    public J_Menu( )
    {
        super("图形菜单");
        JMenuBar mBar = new JMenuBar( );
        setJMenuBar(mBar); // 设置菜单栏

        JMenu [ ] m = { new JMenu("文件"), new JMenu("创建") ,new JMenu("操作")};
       
        JMenuItem [ ] [ ] mI =
        {
            {new JMenuItem("保存"), new JMenuItem("打开")},
            {new JMenuItem("圆"), new JMenuItem("矩形"),new JMenuItem("三角形"),new JMenuItem("直线")},
            {new JMenuItem("显示"),new JMenuItem("计算"),new JMenuItem("删除")}
        };
        int i, j;
        
        
        for (i=0; i < m.length; i++)
        {
            mBar.add(m[i]); // 添加下拉式菜单
           
            for (j=0; j < mI[i].length; j++)
            {m[i].add(mI[i][j]);}}// 添加命令式菜单项
               
                mI[0][0].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            input_file(list);
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
                
                 mI[0][1].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            list.addAll(output_file());
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
                 
                mI[1][0].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                           
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
                
                mI[1][1].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            list.addAll(output_file());
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
           mI[1][2].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            list.addAll(output_file());
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
        mI[1][2].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            list.addAll(output_file());
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
        
        mI[1][3].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            list.addAll(output_file());
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
        mI[2][0].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            list.addAll(output_file());
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
        mI[2][1].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            list.addAll(output_file());
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
        
        mI[2][2].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            list.addAll(output_file());
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                );
        m[0].insertSeparator(1); 
    } // J_Menu构造方法结束
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

