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
     String number=c.showInputDialog(null,"��������ѡ���ѡ�\n"+getItemsString(paramStr));
     int num=Integer.parseInt(number);
    while(!(num>=0&&num<paramStr.length))
   {
     number=c.showInputDialog(null,"������������ѡ���ѡ�\n"+getItemsString(paramStr));
    num=Integer.parseInt(number);
    }
       return num;
  }


    public  String input_choice2(String[] paramStr)
{ String content=JOptionPane.showInputDialog(c,"������ͼ�ε������Ϣ��\n"+getItemsString(paramStr));
       return content;}




  

      public  void confirm_choice(String[] paramStr)
     {
     JOptionPane.showMessageDialog(c,"ͼ�θ���:"+paramStr.length+"\n"+getItemsString(paramStr)+"Back: �������˵�");
 }


}
      
        