// ///////////////////////////////////////////////////////////////////////
//
// J_OptionPane.java
// �����ߣ�����Ԫ
//  //////////////////////////////////////////////////////////////////////
// ��飺
//     ͨ����ʾ����Ի��򣬶�Ӧ���ַ�������ʾ�������Ϣ���У���дһ��
// Unicode�����ѯ���ߡ�
// ///////////////////////////////////////////////////////////////////////
import javax.swing.JOptionPane;
public class J_OptionPane
{
public static String Name_number(char character)
{return Integer.toHexString((int)character);}

public static void main(String args[])
{  
    
    char name=JOptionPane.showInputDialog(null, "��������Ҫ��ѯ���ַ���").charAt(0);
    JOptionPane.showMessageDialog(null,name+":"+Name_number(name));

    
    }
}


