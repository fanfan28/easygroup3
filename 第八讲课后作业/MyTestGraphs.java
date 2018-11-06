import MyGraph.MyShape;
import MyGraph.MyPoint;
import MyGraph.J_Triangle;
import MyGraph.J_Rectangle;
import MyGraph.J_Trapezoid;
import MyGraph.J_Circle;
import MyGraph.Menu;
import javax.swing.JOptionPane;
import java.util.Iterator;

public class MyTestGraphs
{
public static void main(String args[])
{  
Menu m=new Menu();
int size=Integer.parseInt(args[0]);
MyShape[] graphs=new MyShape[size];
int count=0;

String[] window=new String[4];
window[0]="create:建立图形对象";
window[1]="Display：显示所有图形对象";
window[2]="Compute Area：算出所有图形的面积总和";
window[3]="Exit:退出图形系统";

String[] window0=new String[5];
window0[0]="Circle:新加一个圆对象";
window0[1]="Rectangle:新加一个矩形对象";
window0[2]="Triangle：新加一个三角形对象";
window0[3]="Trapezoid：新加一个梯形对象";
window0[4]="Back:选择主功能选择对话框";


for(int j=0;j<4;++j)
{int choose1=m.input_choice1(window);
switch(choose1)
{case 0:
  {for(int i=0;i<size;++i)
{  String a=m.input_choice2(window0);
   int choose2=Integer.parseInt(a);
   switch(choose2)
   {case 0:{String x1=JOptionPane.showInputDialog(null,"请输入圆的相关参数："); String[] x2=x1.split(",");
graphs[i]=new J_Circle(Integer.parseInt(x2[0]),Integer.parseInt(x2[1]),Integer.parseInt(x2[2]));
break;}

    case 1:{String x1=JOptionPane.showInputDialog(null,"请输入矩形的相关参数："); String[] x2=x1.split(",");
graphs[i]=new J_Rectangle(Integer.parseInt(x2[0]),Integer.parseInt(x2[1]),Integer.parseInt(x2[2]),Integer.parseInt(x2[3]));
break;}

    case 2:{String x1=JOptionPane.showInputDialog(null,"请输入三角形的相关参数："); String[] x2=x1.split(",");
graphs[i]=new J_Triangle(Integer.parseInt(x2[0]),Integer.parseInt(x2[1]),Integer.parseInt(x2[2]),Integer.parseInt(x2[3]),Integer.parseInt(x2[4]),Integer.parseInt(x2[5]));
break;}

   case 3:{String x1=JOptionPane.showInputDialog(null,"请输入梯形的相关参数："); String[] x2=x1.split(",");
graphs[i]=new J_Trapezoid(Integer.parseInt(x2[0]),Integer.parseInt(x2[1]),Integer.parseInt(x2[2]));
break;}}++count;
}
break;}
case 1:
{String[] window1=new String[count];
for(int i=0;i<count;++i)
{window1[i]=graphs[i].display1();}
m.confirm_choice(window1);break;}

case 2:
{String[] window2=new String[count];
for(int i=0;i<count;++i)
{window2[i]=graphs[i].display2();}
m.confirm_choice(window2);break;}


}
}
}
}




