import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class vvv {
    public static void main(String[] args) throws Exception {
        
        Frame f = new Frame("FlowLayout Demo");
        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        Button btn3 = new Button("Button3");
        Button btn4 = new Button("Button4");
        Button btn5 = new Button("Button5");
        Button btn6 = new Button("Button6");
        Button btn7 = new Button("Button7");
        
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,25,25));//设置向左对齐，垂直间距5，水平间距5
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        
        f.setBounds(100, 100, 500, 400);
        f.add(panel);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                super.windowClosing(e);
                System.exit(0);
            }
        });
        
    }
}