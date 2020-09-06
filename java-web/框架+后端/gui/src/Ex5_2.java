import javax.swing.*; 
import javax.swing.JTextField; 
import java.awt.*; 
import java.awt.event.*; 
import java.lang.*; 
import java.awt.Color; 
  
  
public class Ex5_2 extends JFrame implements ActionListener 
{ 
  private JPanel p1 = new JPanel(); //������� 
  private JPanel p2 = new JPanel(); 
  private JTextField t1;   //�ı���1������ʾ������Ϣ 
  private JTextField t2;   //�ı���2������ʾ�����Ϣ 
  private JLabel label;    //��ǩ��Ϣ 
  StringBuffer str;      //��ʾ������ʾ���ַ���  
  double x,y;         //x��y����������  
  int z;           //Z��ʾ��������һ�������.0��ʾ"+",1��ʾ"-",2��ʾ"*",3��ʾ"/"      
  private JButton b[] = new JButton[12]; //����һ����12����ť������ 
  private JButton b1,b2,b3,b4,b5,b6,b7,b8; //�������ܰ�ť 
  
  
  public Ex5_2() 
  { 
    super("���׼�����");   //�������� 
    Container c = getContentPane(); //�������������� 
  
    t1 = new JTextField(30); 
    t1.setEditable(false); //ֻ����ʾ�����ܱ༭ 
    t2 = new JTextField(30); 
    t2.setEditable(false); //ֻ����ʾ�����ܱ༭ 
    label = new JLabel("��ӭʹ��С�װ������^_^o~ Ŭ����"); 
    label.setForeground(Color.blue); 
  
    //����һ�����ַ���������  
    str=new StringBuffer();  
  
    p2.add(label); //��ӱ�ǩ����� 
    p2.add(t2);   //����ı������ 
    p2.add(t1);   //����ı������ 
    p2.setLayout(new GridLayout(4,1)); //����Ⲽ��Ϊ4��1�� 
  
    for(int i=0;i<10;i++)  //�ֱ�Ϊ������0~9�ŵİ�ť���ñ�ǩ����ע������� 
    { 
      String s=""+i; 
      b[i]= new JButton(s);   
      b[i].addActionListener(this);   
    } 
      
    //ʵ����������ť 
    b[10]= new JButton("-/+"); b[11]= new JButton("."); 
    b1= new JButton("/");    b2= new JButton("Back"); 
    b3= new JButton("*");    b4= new JButton("C"); 
    b5= new JButton("+");    b6= new JButton("Sqrt"); 
    b7= new JButton("-");    b8= new JButton("="); 
      
    //���ð�ťǰ��ɫ 
    for(int i=0;i<12;i++) 
    { 
      b[i].setForeground(Color.blue); 
    } 
  
    b1.setForeground(Color.red);  b3.setForeground(Color.red); 
    b5.setForeground(Color.red);  b7.setForeground(Color.red); 
    b2.setForeground(Color.blue);  b4.setForeground(Color.blue); 
    b6.setForeground(Color.red);   b8.setForeground(Color.blue); 
  
      
    //��ӵ���� 
    p1.add(b[7]); p1.add(b[8]); p1.add(b[9]); p1.add(b1); p1.add(b2); 
    p1.add(b[4]); p1.add(b[5]); p1.add(b[6]); p1.add(b3); p1.add(b4); 
    p1.add(b[1]); p1.add(b[2]); p1.add(b[3]); p1.add(b5); p1.add(b6); 
    p1.add(b[0]); p1.add(b[10]); p1.add(b[11]);p1.add(b7);p1.add(b8); 
    p1.setLayout(new GridLayout(4,5,5,5)); 
  
      
    //ע������� 
    b[10].addActionListener(this); b[11].addActionListener(this); 
    b1.addActionListener(this); b2.addActionListener(this); 
    b3.addActionListener(this); b4.addActionListener(this); 
    b5.addActionListener(this); b6.addActionListener(this); 
    b7.addActionListener(this); b8.addActionListener(this); 
    
    //�������ӵ�������� 
    c.add(p2); 
    c.add(p1); 
    c.setLayout(new FlowLayout()); //����Ϊ˳�򲼾� 
      
      
      
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ô��ڹرն��� 
    setVisible(true);  //����Ϊ�ɼ� 
    setResizable(false); //��ֹ������ܴ�С 
    setSize(400,300);  //���ô��ڴ�С 
  
  } 
  
    
  //������ʵ�ִ���һ������ 
  public static void main(String[] args) 
  { Ex5_2 f = new Ex5_2(); } 
  
    
  //��ť���¼����� 
  public void actionPerformed(ActionEvent e) 
  { 
  try
  { 
    if(e.getSource()==b4)  //ѡ��"C"���� 
    { 
      t1.setText("0"); //���ı������� 
      t1.setHorizontalAlignment(JTextField.RIGHT);  //�ı������ұ� 
      str.setLength(0); //����ַ�����������׼�������µ����������� 
    } 
    else if(e.getSource()==b[10])//����"+/-"ѡ����������������������Ǹ���  
    { 
      x=Double.parseDouble(t1.getText().trim());//trim����������ȥ���ַ����еĿո� 
      t1.setText(""+(-x)); 
      t1.setHorizontalAlignment(JTextField.RIGHT); 
    } 
    else if (e.getSource()==b5)//�����ӺŰ�ť���x��ֵ��z��ֵ�����y��ֵ 
    { 
      x=Double.parseDouble(t1.getText().trim()); 
      str.setLength(0); 
      y=0d; 
      z=0; 
    } 
    else if(e.getSource()==b7)//�������Ű�ť���x��ֵ��z��ֵ�����y��ֵ  
    { 
      x=Double.parseDouble(t1.getText().trim()); 
      str.setLength(0); 
      y=0d; 
      z=1; 
    } 
    else if(e.getSource()==b3)//�����˺Ű�ť���x��ֵ��z��ֵ�����y��ֵ  
    { 
      x=Double.parseDouble(t1.getText().trim()); 
      str.setLength(0); 
      y=0d; 
      z=2; 
    } 
    else if(e.getSource()==b1)//�������Ű�ť���x��ֵ��z��ֵ�����y��ֵ  
    { 
      x=Double.parseDouble(t1.getText().trim()); 
      str.setLength(0); 
      y=0d; 
      z=3; 
    } 
    else if(e.getSource()==b8)//�����ȺŰ�ť���������  
    { 
      str.setLength(0); 
      switch(z) 
      { 
        case 0: t1.setText(""+(x+y)); t1.setHorizontalAlignment(JTextField.RIGHT);break; 
        case 1: t1.setText(""+(x-y)); t1.setHorizontalAlignment(JTextField.RIGHT);break; 
        case 2: t1.setText(""+(x*y)); t1.setHorizontalAlignment(JTextField.RIGHT);break; 
        case 3: t1.setText(""+(x/y)); t1.setHorizontalAlignment(JTextField.RIGHT);break; 
      } 
    } 
    else if(e.getSource()==b[11])//����"."��ť����С��  
    { 
      if(t1.getText().trim().indexOf('.')!=-1)//�ж��ַ������Ƿ��Ѿ�������С���� 
      { 
      } 
      else //���û��С���� 
      { 
        if(t1.getText().trim().equals("0"))//�����ʱ��ʾΪ0  
        { 
          t1.setText(str.append(e.getActionCommand()).toString()); 
          t1.setHorizontalAlignment(JTextField.RIGHT); 
        } 
        else if(t1.getText().trim().equals(""))//�����ʱ��ʾΪ�������κβ��� 
        {} 
        else 
        {  
          t1.setText(str.append(e.getActionCommand()).toString());  
          t1.setHorizontalAlignment(JTextField.RIGHT); 
        } 
  
      } 
    y=0d; 
    } 
  
    else if(e.getSource()==b6) //��ƽ����  
    { 
      x=Double.parseDouble(t1.getText().trim());  
      if(x<0) 
      { 
        t1.setText("���ָ�ʽ�쳣"); 
        t1.setHorizontalAlignment(JTextField.RIGHT); 
      } 
      else
      { 
        t1.setText(""+Math.sqrt(x)); 
        t1.setHorizontalAlignment(JTextField.RIGHT); 
      } 
      str.setLength(0); 
      y=0d; 
    } 
  
    else
    { 
      if(e.getSource()==b[0])//���ѡ�����"0"������ּ�  
      { 
        if(t1.getText().trim().equals("0"))//�����ʾ����ʾ��Ϊ�㲻������  
        {} 
        else
          t1.setText(str.append(e.getActionCommand()).toString()); 
          t1.setHorizontalAlignment(JTextField.RIGHT); 
          y=Double.parseDouble(t1.getText().trim());  
      } 
      else if (e.getSource()==b2) //ѡ�����back�� 
      { 
        if(!t1.getText().trim().equals("0"))//�����ʾ����ʾ�Ĳ�����  
        { 
        if(str.length()!=1)  
        {  
          t1.setText(str.delete(str.length()-1,str.length()).toString());//�����׳��ַ���Խ���쳣  
          t1.setHorizontalAlignment(JTextField.RIGHT); 
        } 
        else 
        {  
          t1.setText("0"); t1.setHorizontalAlignment(JTextField.RIGHT); 
          str.setLength(0);  
        }  
      }  
      y=Double.parseDouble(t1.getText().trim());  
      } 
      else 
        { 
        t1.setText(str.append(e.getActionCommand()).toString());  
        t1.setHorizontalAlignment(JTextField.RIGHT); 
        y=Double.parseDouble(t1.getText().trim()); 
        } 
      } 
    } 
    catch(NumberFormatException e1){ t1.setText("���ָ�ʽ�쳣"); 
    t1.setHorizontalAlignment(JTextField.RIGHT); }  
  
    catch(StringIndexOutOfBoundsException e1){t1.setText("�ַ�������Խ��"); 
    t1.setHorizontalAlignment(JTextField.RIGHT);}  
  } 
} 