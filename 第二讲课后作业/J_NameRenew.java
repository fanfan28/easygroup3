// ///////////////////////////////////////////////////////////////////////
//
// J_NameRenew.java
// �����ߣ�����Ԫ
//  //////////////////////////////////////////////////////////////////////
// ��飺
//     ����Լ������ַ��Ͷ�ӦUnicode����ĳ���,����ѭ����䡢������б��Ч���Ż���
// ///////////////////////////////////////////////////////////////////////
public class J_NameRenew
{
   public static void main(String args[])
   {
    char []name={'��','��','Ԫ'};
    String [] number=new String[3];
    for(int i=0;i<3;i++){number[i]=Integer.toHexString((int)name[i]);}
    
    System.out.println("������"+name[0]+name[1]+name[2]);
    System.out.println("��ӦUnicode���룺");
    for(int i=0;i<3;++i)
    {System.out.println(name[i]+":"+number[i]);}
    
    }
}



