package MyGraph;
import javax.swing.JOptionPane;

public class Menu
{
    
      public JOptionPane c=new JOptionPane();
      public Menu(){}
       
       public  String getItemsString(String[] items)
     {
      String str=new String();
      for(int i=0;i<items.length;++i)
      {
      str+=("["+i+"]"+items[i]+"\n");}
      return str;
      }
       


       public  int input_choice1(String[] paramStr)
     {
     String number=c.showInputDialog(null,"请输入你选择的选项：\n"+getItemsString(paramStr));
     int num=Integer.parseInt(number);
    while(!(num>=0&&num<paramStr.length))
   {
     number=c.showInputDialog(null,"请重新输入你选择的选项：\n"+getItemsString(paramStr));
    num=Integer.parseInt(number);
    }
       return num;
  }


    public  String input_choice2(String[] paramStr)
{ String content=JOptionPane.showInputDialog(c,"请输入图形的相关信息：\n"+getItemsString(paramStr));
       return content;}




  

      public  void confirm_choice(String[] paramStr)
     {
     JOptionPane.showMessageDialog(c,"图形个数:"+paramStr.length+"\n"+getItemsString(paramStr)+"Back: 返回主菜单");
 }


}
      
        