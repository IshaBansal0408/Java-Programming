import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
public class Fifthcode extends JApplet implements ActionListener
{
    JButton b;
    JTextField t;
    public void init()
    {
        t=new JTextField();
        t.setBounds(30,40,220,50);
        b=new JButton("Click");
        b.setBounds(100,120,70,40);
        add(b);
        add(t);
        b.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        t.setText("Welcome to the Fifth program");
    }
}