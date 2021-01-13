import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Action_Listener extends Applet implements ActionListener{
    String actionMessage="";
    public void init(){
        Button Button1 = new Button("Say Hello");
        Button Button2 = new Button("Say Bye");
        add(Button1);
        add(Button2);
        Button1.setBackground(Color.green);
        Button2.setBackground(Color.red);
        Button1.addActionListener(this);
        Button2.addActionListener(this);
    }
    public void paint(Graphics g){
        setBackground(Color.yellow);
        g.drawString(actionMessage,10,50);
    }
    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();
        if(action.equals("Say Hello"))
            actionMessage = "Hey There!";
        else if(action.equals("Say Bye"))
            actionMessage = "GoodBye! Have a nice day!";
        repaint();
    }
} 