// ///////////////////////////////////////////////////////////////////////
//
// J_NameRenew.java
// 开发者：范钟元
//  //////////////////////////////////////////////////////////////////////
// 简介：
//     输出自己姓名字符和对应Unicode编码的程序,利用循环语句、数组进行编程效率优化。
// ///////////////////////////////////////////////////////////////////////
public class J_NameRenew
{
   public static void main(String args[])
   {
    char []name={'范','钟','元'};
    String [] number=new String[3];
    for(int i=0;i<3;i++){number[i]=Integer.toHexString((int)name[i]);}
    
    System.out.println("姓名："+name[0]+name[1]+name[2]);
    System.out.println("对应Unicode编码：");
    for(int i=0;i<3;++i)
    {System.out.println(name[i]+":"+number[i]);}
    
    }
}



