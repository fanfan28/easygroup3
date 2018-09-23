// ///////////////////////////////////////////////////////////////////////
//
// J_Average.java
// 开发者：范钟元
//  //////////////////////////////////////////////////////////////////////
// 简介：通过将命令行传入的字符串数组转化成浮点型数据，进行求平均值的计算。
//    
// ///////////////////////////////////////////////////////////////////////
 
public class J_Average
{

public static void main(String args[])
{
float  number[]=new float[args.length];
for(int i=0;i<args.length;++i) 
{number[i]=Float.parseFloat(args[i]);}
float sum=0;
float average=0;

for(int j=0;j<args.length;++j)
{ sum+=number[j];}
average=sum/args.length;

System.out.print("[");
for(int i=0;i<args.length;++i)
{if (i!=args.length-1) System.out.print(args[i]+",");
 else System.out.print(args[i]);}
System.out.print("].Average="+average);
}
}