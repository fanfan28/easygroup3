import javax.swing.JOptionPane;
class J_Tool
{ 
public static  int[] getUnicodes(String str)
{ 
char[] cs1 = str.toCharArray();
int num1[]=new int [cs1.length];
for(int i=0;i<cs1.length;++i)
{num1[i]=cs1[i];}
return num1;}


public static String[] getUnicodeString(String s) 
{ int num2[]=getUnicodes(s);
String sz[]=new String[num2.length];
for(int i=0;i<num2.length;++i)
{sz[i]=Integer.toHexString(num2[i]);}
return sz;}

public static String[] getStrings()
{String []str1=JOptionPane.showInputDialog(null, "请输入您要查询的字符并用空格分隔：").split(" ");
return str1;}
}

public class J_Test
{
  public static void main (String args[])
 {
 int a[]=J_Tool.getUnicodes(args[0]);
 for(int i=0;i<a.length;++i)
{  System.out.println (args[0].charAt(i)+"对应的Unicode整数编码为："+a[i]);}
 System.out.println ();
 int b[]=J_Tool.getUnicodes(args[1]);
 for(int i=0;i<b.length;++i)
{  System.out.println (args[1].charAt(i)+"对应的Unicode十六进制编码数为："+b[i]);}
  System.out.println ();
  
String c[]=J_Tool.getStrings();
System.out.println ("字符串分隔后的字符分别为：");
for(int i=0;i<c.length;++i)
{ System.out.println (c[i]);}

}
 
}





