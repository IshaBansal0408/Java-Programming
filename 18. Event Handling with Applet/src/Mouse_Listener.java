import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Mouse_Listener extends Applet implements MouseMotionListener{
    public void init() {
        addMouseMotionListener(this);
        setBackground(Color.black);
    }
    public void mouseDragged(MouseEvent me) {
        Graphics g = getGraphics();
        g.setColor(Color.white);
        g.fillOval(me.getX(), me.getY(), 10, 10);
    }
    public void mouseMoved(MouseEvent me) {
    }
}