// ///////////////////////////////////////////////////////////////////////
//
// J_Name.java
// 开发者：范钟元
//  //////////////////////////////////////////////////////////////////////
// 简介：
//     输出自己姓名字符和对应Unicode编码的程序
// ///////////////////////////////////////////////////////////////////////
public class J_Name
{
   public static void main(String args[])
   {
    char name1='范';
    char name2='钟';
    char name3='元';
    String number1=Integer.toHexString((int)name1);
    String number2=Integer.toHexString((int)name2);
    String number3=Integer.toHexString((int)name3);
    System.out.println("姓名："+name1+name2+name3);
    System.out.println("对应Unicode编码：");
    System.out.println(name1+":"+number1);
    System.out.println(name2+":"+number2);
    System.out.println(name3+":"+number3);
    }
}



