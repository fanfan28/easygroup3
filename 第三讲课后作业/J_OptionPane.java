// ///////////////////////////////////////////////////////////////////////
//
// J_OptionPane.java
// 开发者：范钟元
//  //////////////////////////////////////////////////////////////////////
// 简介：
//     通过显示输入对话框，对应的字符编码显示在输出消息框中，编写一个
// Unicode代码查询工具。
// ///////////////////////////////////////////////////////////////////////
import javax.swing.JOptionPane;
public class J_OptionPane
{
public static String Name_number(char character)
{return Integer.toHexString((int)character);}

public static void main(String args[])
{  
    
    char name=JOptionPane.showInputDialog(null, "请输入您要查询的字符：").charAt(0);
    JOptionPane.showMessageDialog(null,name+":"+Name_number(name));

    
    }
}


