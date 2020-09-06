import javax.swing.*;
import java.awt.*;//引包
public class BorderLayoutDemo extends JFrame {//继承
  public BorderLayoutDemo(){  
	//构造函数，初始化对象值
	//设置为边界布局，组件间横向、纵向间距均为5像素
	setLayout(new BorderLayout(5,5)); 
	 setFont(new Font("Helvetica", Font.PLAIN, 14));
	 //定义并创建需要的组件 
	 getContentPane().add("North", new JButton("North"));   
	  //将按钮添加到窗口中(添加组件 )
	getContentPane().add("South", new JButton("South"));
	     getContentPane().add("East",  new JButton("East"));
	     getContentPane().add("West",  new JButton("West"));
	     getContentPane().add("Center",new JButton("Center"));
	  }  
  public static void main(String args[]) {
	     BorderLayoutDemo f = new BorderLayoutDemo();
	     f.setTitle("边界布局");
	     f.pack();
	     f.setVisible(true);
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     f.setLocationRelativeTo(null);        
     //让窗体居中显示(设置并显示窗体)
    }
  }
