 import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GridBagLayoutTest extends JFrame{
	 JLabel topLb = new JLabel("--------------Welcome To MyFrame--------------");
	 JLabel usernameLb = new JLabel("用户名");
	 JLabel passwordLb = new JLabel("密  码");
	 JTextField usernameJt = new JTextField("请输入用户名");
	 JPasswordField passwordJp = new JPasswordField("请输入密码");
	 JButton loginBt = new JButton("登录");
	 JButton exitBt = new JButton("退出");
	 
	 public GridBagLayoutTest(){
		  setBounds(300,300,500,300);//设置窗口大小及位置
		  GridBagLayout gbl = new GridBagLayout();//创建网格包布局管理器
		  setLayout(gbl);//设置布局方式
		  //为顶部标签创建网格包约束
		  GridBagConstraints cTop = new GridBagConstraints();
		  cTop.insets = new Insets(30,0,0,0);//new Insets(上,左,下,右)此处指定控件所在网格的四个方向的间距
		  cTop.fill = GridBagConstraints.BOTH;//此处指定控件在网格中的填充方式。
		  //为用户名密码控件创建网格包约束
		  GridBagConstraints cUserAndPassword = new GridBagConstraints();
		  cUserAndPassword.insets = new Insets(10,10,0,0);
		  cUserAndPassword.fill = GridBagConstraints.BOTH;
		  
		  //为登陆按钮创建网格包约束
		  GridBagConstraints cLogin = new GridBagConstraints();
		  cLogin.insets = new Insets(10,10,0,10);
		  cLogin.fill = GridBagConstraints.BOTH;
		  
		  //往JFrame中加入顶部标签      
		  cTop.gridx = 0;//设置顶部标签topLb在网格包布局中的x坐标，也就是从左往右数，放入第几个格子里，0为左边数第一个格子
		  cTop.gridy = 0;//设置顶部标签topLb在网格包布局中的y坐标，也就是从 上往下数，放入第几个格子里，0为上边数第一个格子
		  cTop.gridwidth = 3;//设置顶部标签从左到右占用网格数量作为顶部标签随着窗口大小改变时，伸缩的参考比例。  
		  gbl.setConstraints(topLb,cTop);//为顶部标签设置布局约束。用于把以上三项约束内容应用到顶部标签。
		  add(topLb);//在JFrame中加入约束好的顶部标签
		  topLb.setOpaque(true);//设置标签设置控件不透明，即可填充颜色
		  topLb.setBackground(Color.RED);//设置标签背景颜色为红色
		  //加入用户名文本 
		  cUserAndPassword.gridx = 0;
		  cUserAndPassword.gridy = 1;
		  cUserAndPassword.gridwidth=1;  
		  gbl.setConstraints(usernameLb, cUserAndPassword);
		  add(usernameLb);
		  //用户名输入框  
		  cUserAndPassword.gridx = 1;
		  cUserAndPassword.gridy = 1;
		  cUserAndPassword.gridwidth=1;
		  gbl.setConstraints(usernameJt, cUserAndPassword);
		  add(usernameJt);
		  usernameJt.setPreferredSize(new Dimension(100,20));
		  //登录按钮
		  cLogin.gridx = 2;
		  cLogin.gridy = 1;
		  cLogin.gridwidth = 1;
		  cLogin.gridheight = 2;
		  gbl.setConstraints(loginBt, cLogin);
		  add(loginBt);
		    
		  //密码文本
		  cUserAndPassword.gridx = 0;
		  cUserAndPassword.gridy = 2;
		  cUserAndPassword.gridwidth = 1;
		  gbl.setConstraints(passwordLb, cUserAndPassword);
		  add(passwordLb);  
		  
		  //密码输入框
		  cUserAndPassword.gridx = 1;
		  cUserAndPassword.gridy = 2;
		  cUserAndPassword.gridwidth = 1;
		  gbl.setConstraints(passwordJp, cUserAndPassword);
		  add(passwordJp); 
		  //退出按钮
		  cLogin.gridx = 2;
		  cLogin.gridy = 3;
		  cLogin.gridwidth = 1;
		  gbl.setConstraints(exitBt, cLogin);
		  add(exitBt); 
		  
		  setVisible(true);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  pack();//设置窗口内容紧凑
	 }
	 
	 public static void main(String[]args){  
	  new GridBagLayoutTest();
	 }
}