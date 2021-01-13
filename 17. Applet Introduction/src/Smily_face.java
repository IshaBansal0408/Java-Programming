import java.applet.Applet;
import java.awt.*;
public class Smily_face extends Applet {
    public void paint(Graphics g)
    {
        setBackground(Color.darkGray);
        g.setColor(Color.YELLOW);
        g.fillOval(80, 70, 150, 150);
        g.setColor(Color.black);
        g.fillOval(120, 120, 20, 20);
        g.fillOval(170, 120, 20, 20);
        g.setColor(Color.red);
        g.drawArc(130, 150, 50, 20, 180, 180);
    }
}