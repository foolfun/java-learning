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
	 JLabel usernameLb = new JLabel("�û���");
	 JLabel passwordLb = new JLabel("��  ��");
	 JTextField usernameJt = new JTextField("�������û���");
	 JPasswordField passwordJp = new JPasswordField("����������");
	 JButton loginBt = new JButton("��¼");
	 JButton exitBt = new JButton("�˳�");
	 
	 public GridBagLayoutTest(){
		  setBounds(300,300,500,300);//���ô��ڴ�С��λ��
		  GridBagLayout gbl = new GridBagLayout();//������������ֹ�����
		  setLayout(gbl);//���ò��ַ�ʽ
		  //Ϊ������ǩ���������Լ��
		  GridBagConstraints cTop = new GridBagConstraints();
		  cTop.insets = new Insets(30,0,0,0);//new Insets(��,��,��,��)�˴�ָ���ؼ�����������ĸ�����ļ��
		  cTop.fill = GridBagConstraints.BOTH;//�˴�ָ���ؼ��������е���䷽ʽ��
		  //Ϊ�û�������ؼ����������Լ��
		  GridBagConstraints cUserAndPassword = new GridBagConstraints();
		  cUserAndPassword.insets = new Insets(10,10,0,0);
		  cUserAndPassword.fill = GridBagConstraints.BOTH;
		  
		  //Ϊ��½��ť���������Լ��
		  GridBagConstraints cLogin = new GridBagConstraints();
		  cLogin.insets = new Insets(10,10,0,10);
		  cLogin.fill = GridBagConstraints.BOTH;
		  
		  //��JFrame�м��붥����ǩ      
		  cTop.gridx = 0;//���ö�����ǩtopLb������������е�x���꣬Ҳ���Ǵ���������������ڼ��������0Ϊ�������һ������
		  cTop.gridy = 0;//���ö�����ǩtopLb������������е�y���꣬Ҳ���Ǵ� ��������������ڼ��������0Ϊ�ϱ�����һ������
		  cTop.gridwidth = 3;//���ö�����ǩ������ռ������������Ϊ������ǩ���Ŵ��ڴ�С�ı�ʱ�������Ĳο�������  
		  gbl.setConstraints(topLb,cTop);//Ϊ������ǩ���ò���Լ�������ڰ���������Լ������Ӧ�õ�������ǩ��
		  add(topLb);//��JFrame�м���Լ���õĶ�����ǩ
		  topLb.setOpaque(true);//���ñ�ǩ���ÿؼ���͸�������������ɫ
		  topLb.setBackground(Color.RED);//���ñ�ǩ������ɫΪ��ɫ
		  //�����û����ı� 
		  cUserAndPassword.gridx = 0;
		  cUserAndPassword.gridy = 1;
		  cUserAndPassword.gridwidth=1;  
		  gbl.setConstraints(usernameLb, cUserAndPassword);
		  add(usernameLb);
		  //�û��������  
		  cUserAndPassword.gridx = 1;
		  cUserAndPassword.gridy = 1;
		  cUserAndPassword.gridwidth=1;
		  gbl.setConstraints(usernameJt, cUserAndPassword);
		  add(usernameJt);
		  usernameJt.setPreferredSize(new Dimension(100,20));
		  //��¼��ť
		  cLogin.gridx = 2;
		  cLogin.gridy = 1;
		  cLogin.gridwidth = 1;
		  cLogin.gridheight = 2;
		  gbl.setConstraints(loginBt, cLogin);
		  add(loginBt);
		    
		  //�����ı�
		  cUserAndPassword.gridx = 0;
		  cUserAndPassword.gridy = 2;
		  cUserAndPassword.gridwidth = 1;
		  gbl.setConstraints(passwordLb, cUserAndPassword);
		  add(passwordLb);  
		  
		  //���������
		  cUserAndPassword.gridx = 1;
		  cUserAndPassword.gridy = 2;
		  cUserAndPassword.gridwidth = 1;
		  gbl.setConstraints(passwordJp, cUserAndPassword);
		  add(passwordJp); 
		  //�˳���ť
		  cLogin.gridx = 2;
		  cLogin.gridy = 3;
		  cLogin.gridwidth = 1;
		  gbl.setConstraints(exitBt, cLogin);
		  add(exitBt); 
		  
		  setVisible(true);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  pack();//���ô������ݽ���
	 }
	 
	 public static void main(String[]args){  
	  new GridBagLayoutTest();
	 }
}