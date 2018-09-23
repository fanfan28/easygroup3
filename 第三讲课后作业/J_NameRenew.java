// ///////////////////////////////////////////////////////////////////////
//
// J_NameRenew.java
// 开发者：范钟元
//  //////////////////////////////////////////////////////////////////////
// 简介：
//     输出自己姓名字符和对应Unicode编码的程序,通过把“获取单个字符的编码”
// 功能设计成一个方法,在main中循环调用提高编程效率。
// ///////////////////////////////////////////////////////////////////////
 

public class J_NameRenew
{

public static String Name_number(char character)
 {
        
        return Integer.toHexString((int)character);      
 
      }


   public static void main(String args[])
   { 
    char []name={'范','钟','元'};
    System.out.println("姓名："+name[0]+name[1]+name[2]);
    System.out.println("对应Unicode编码：");
    for(int i=0;i<3;++i)
    {System.out.println(name[i]+":"+Name_number(name[i]));}
    }
}

