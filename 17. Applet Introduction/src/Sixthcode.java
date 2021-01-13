import java.applet.Applet;
import java.awt.*;
public class Sixthcode extends Applet{
    public void paint(Graphics g){
        setBackground(Color.yellow);
        g.setColor(Color.red);
        g.fillRect(120, 50, 200, 200);
        g.setColor(Color.cyan);
        g.fillRect(155, 85, 130, 130);
        g.setColor(Color.black);
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.drawString("Rectagle One", 160, 70);
        g.setColor(Color.black);
        g.setFont(new Font("Arial",Font.BOLD,14));
        g.drawString("Rectagle Two", 168, 160);
    }}