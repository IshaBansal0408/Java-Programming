import java.applet.*;
import java.awt.*;
public class Secondcode extends Applet
{
    int height, width;
    public void init()
    {
        height = getSize().height;
        width = getSize().width;
        setName("MyApplet");
    }
    public void paint(Graphics g)
    {
        //g.drawRoundRect(10, 30, 120, 120, 2, 3);
        g.setColor(Color.red);
        g.fillOval(170,200,30,30);
        g.drawArc(90,150,30,30,30,270);
        g.setColor(Color.blue);
        g.fillArc(270,150,30,30,0,180);
        g.drawLine(21,31,20,300);
        g.setColor(Color.cyan);
        g.drawRect(70,100,30,30);
        g.fillRect(170,100,30,30);
        g.setColor(Color.GREEN);
        g.drawOval(70,200,30,30);
    }
}