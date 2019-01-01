/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGraph;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import MyGraph.MyMenu;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

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
                        public void actionPerformed(ActionEvent e,List<MyShape> s1)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            input_file(s1);
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                ); // 方法addActionListener调用结束
           
        
        m[0].insertSeparator(1); 
    } // J_Menu构造方法结束
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


}