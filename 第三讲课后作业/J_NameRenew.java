// ///////////////////////////////////////////////////////////////////////
//
// J_NameRenew.java
// �����ߣ�����Ԫ
//  //////////////////////////////////////////////////////////////////////
// ��飺
//     ����Լ������ַ��Ͷ�ӦUnicode����ĳ���,ͨ���ѡ���ȡ�����ַ��ı��롱
// ������Ƴ�һ������,��main��ѭ��������߱��Ч�ʡ�
// ///////////////////////////////////////////////////////////////////////
 

public class J_NameRenew
{

public static String Name_number(char character)
 {
        
        return Integer.toHexString((int)character);      
 
      }


   public static void main(String args[])
   { 
    char []name={'��','��','Ԫ'};
    System.out.println("������"+name[0]+name[1]+name[2]);
    System.out.println("��ӦUnicode���룺");
    for(int i=0;i<3;++i)
    {System.out.println(name[i]+":"+Name_number(name[i]));}
    }
}

