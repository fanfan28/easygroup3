// ///////////////////////////////////////////////////////////////////////
//
// J_Average.java
// �����ߣ�����Ԫ
//  //////////////////////////////////////////////////////////////////////
// ��飺ͨ���������д�����ַ�������ת���ɸ��������ݣ�������ƽ��ֵ�ļ��㡣
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