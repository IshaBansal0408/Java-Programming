import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Key_Listener extends Applet implements KeyListener
{
    char ch;
    String str;
    public void init(){
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e) { }
    public void keyReleased(KeyEvent e) { }
    public void keyTyped(KeyEvent e)
    {
        ch = e.getKeyChar();
        if(ch == 'a')
            str = "a for Apple!";
        else if(ch == 'e')
            str = "e for Egg!";
        else if(ch == 'i')
            str = "i for Ice cream!";
        else if(ch == 'o')
            str = "o for Orange! ";
        else if(ch == 'u')
            str = "u for Unicorn!";
        else
            str = "ONLY VOWELS!";
        repaint();
    }
    public void paint(Graphics g)
    {
        setBackground(Color.yellow);
        g.setColor(Color.black);
        g.setFont(new Font("Arial",Font.BOLD,30));
        g.drawString("Hello There! Type vowels: a,e,i,o,u", 50, 50);
        g.drawString(str, 100, 150);
        showStatus("You typed " + ch + " character");
    }
}