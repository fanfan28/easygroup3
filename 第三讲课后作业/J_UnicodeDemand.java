// ///////////////////////////////////////////////////////////////////////
//
// J_UnicodeDemand.java
// �����ߣ�����Ԫ
//  //////////////////////////////////////////////////////////////////////
// ��飺
//     ͨ�������������ַ����������͵����ݣ�����ת�����ַ������飬��дһ��
// Unicode�����ѯ���ߡ�
// ///////////////////////////////////////////////////////////////////////
public class J_UnicodeDemand
{
public static String Name_number(char character)
    {return Integer.toHexString((int)character);}

public static void main(String args[])
   { 
    char name[]=new char[args.length];   
    for(int i=0;i<args.length;++i)
    {name[i]=args[i].charAt(0);} 
     System.out.println("��ӦUnicode���룺");
    for(int i=0;i<args.length;++i)
    {System.out.println(name[i]+":"+Name_number(name[i]));}
    }
}

