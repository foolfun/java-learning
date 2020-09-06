

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 /*���׼�����*/ 
public class Simple_jisuanqi {
  public static  void main(String args []) {

       Caculate mycacu = new Caculate();
       mycacu.setTitle("Java������");
       
  }
}
class Caculate extends JFrame implements ActionListener{
	
     Container  mycon;    //��������������
     JPanel  jpanel_1,jpanel_2;    //��������������
     myJButton button []= new myJButton [20];
     JTextField mytext;
     JLabel label;
     GridLayout grid = new GridLayout(4,4);
     Caculate(){          //���캯��
        mycon = getContentPane();
        jpanel_1 = new JPanel();  /*Ĭ�ϵĸ�ʽΪFlowLayout*/
        jpanel_2 =new JPanel();
        jpanel_2.setLayout(grid);
        mytext = new JTextField(14);
        mytext.setEditable(false);   //���ó�Ϊ����
        mytext.setFont(new Font("Arial",Font.BOLD,22));
        button[0] = new myJButton(" ����  ",22);
        button[0].addActionListener(this);
        button[1] = new myJButton("  ����  ",22);
        button[1].addActionListener(this);
        jpanel_1.add(button[0]);
        jpanel_1.add(mytext);
        jpanel_1.add(button[1]);
        for(int i=2;i<12;i++)
            button[i]=new myJButton(" "+i+" ",26);
        char str[][]={{'7','8','9','/'},{'4','5','6','*'},{'1','2','3','-'},{'0','.','+','='}};
        for(int i=0;i<4;i++)
          for(int j=0;j<4;j++){
              button[2+i*4+j] =new myJButton("  "+str[i][j]+"  ",26);
              button[2+i*4+j].addActionListener(this);
              jpanel_2.add(button[2+i*4+j]);
            }
       mycon.add(jpanel_1,BorderLayout.CENTER);
       mycon.add(jpanel_2,BorderLayout.SOUTH);
         init();
   }
   void init() /*��������һϵ�еĳ�ʼ��*/
   {
     setBounds(100, 100, 477, 280);
     setVisible(true);
     setResizable(false);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   }
   String str ="";   
@Override
public void actionPerformed(ActionEvent e) {
     if(e.getSource()==button[0]||e.getSource()==button[1])
      {
            if(e.getSource()==button[0]){
             
            if(!str.isEmpty()){     
              str=str.substring(0, str.length()-1) ; //����һ�� 
             }
            }
            else str="";
      }
     else
     {
      if(e.getSource()==button[17]){ 
        //���ںŵ�ʱ���ָ���δ���  ������ʽ
        //System.out.println(e.getActionCommand());
         /*System.out.println(sove_calc(str));*/
          Double judge=sove_calc(str.trim());
          if(judge==Double.MAX_VALUE)
          {
              mytext.setText("error!");
              validate();
              return;
          }
          else str=judge.toString();
      }
      else{
          str+=e.getActionCommand().toString().trim();
      }
     }
     if(str.isEmpty())  mytext.setText("0");
     else mytext.setText(str);
        validate();
}
private Double sove_calc(String str){
    /*��ô����ַ�����������������*/
    Pattern mypa = Pattern.compile("\\+|\\-|\\*|\\/");
      Matcher mtma = mypa.matcher(str);
      List<String> listhoge = new ArrayList();
      while(mtma.find()) listhoge.add(mtma.group());
       String [] hoge = listhoge.toArray(new String [0]);  //��ȡ�������
   /*ͻȻ����һ��������ô���ַ������𸡵��������أ�*/
     Pattern mypart = Pattern.compile("\\.\\d|\\d+(\\.\\d+)?");    
     Matcher mtmatcher =mypart.matcher(str);
     List<String> listval = new ArrayList();
     while(mtmatcher.find())
       listval.add(mtmatcher.group());
     String [] val=listval.toArray(new String[0]); 
     double sum=Double.parseDouble(val[0]);
    for( int i=0;i<hoge.length;i++)
    {
         //System.out.println(hoge[i].charAt(0));
       switch(hoge[i].charAt(0))
       {
         case '+':  sum += Double.parseDouble(val[i+1]); break;
         case '-':  sum -= Double.parseDouble(val[i+1]); break;
         case '*':  sum *= Double.parseDouble(val[i+1]); break;
         case '/':
         {
            Double tem=Double.parseDouble(val[i+1]);
            if(tem.equals(0))  return Double.MAX_VALUE;
            sum/=tem;
            break;
         }
         default :  System.out.println("error!"); break;
       }
   }
  return sum;
}
}
class  myJButton extends JButton{
  public myJButton(String name,int size) 
  {
        // TODO Auto-generated constructor stub
      super(name);
      setFont(new Font("����",Font.BOLD,size));
    setMargin(new Insets(2,2,2,2));
    setBorder(BorderFactory.createRaisedBevelBorder());
    setBackground(Color.LIGHT_GRAY);
  }     
}