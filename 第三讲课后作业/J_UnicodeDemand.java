// ///////////////////////////////////////////////////////////////////////
//
// J_UnicodeDemand.java
// 开发者：范钟元
//  //////////////////////////////////////////////////////////////////////
// 简介：
//     通过命令行输入字符串数组类型的数据，将其转换成字符型数组，编写一个
// Unicode代码查询工具。
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
     System.out.println("对应Unicode编码：");
    for(int i=0;i<args.length;++i)
    {System.out.println(name[i]+":"+Name_number(name[i]));}
    }
}

