// ///////////////////////////////////////////////////////////////////////
//
// J_Name.java
// �����ߣ�����Ԫ
//  //////////////////////////////////////////////////////////////////////
// ��飺
//     ����Լ������ַ��Ͷ�ӦUnicode����ĳ���
// ///////////////////////////////////////////////////////////////////////
public class J_Name
{
   public static void main(String args[])
   {
    char name1='��';
    char name2='��';
    char name3='Ԫ';
    String number1=Integer.toHexString((int)name1);
    String number2=Integer.toHexString((int)name2);
    String number3=Integer.toHexString((int)name3);
    System.out.println("������"+name1+name2+name3);
    System.out.println("��ӦUnicode���룺");
    System.out.println(name1+":"+number1);
    System.out.println(name2+":"+number2);
    System.out.println(name3+":"+number3);
    }
}



