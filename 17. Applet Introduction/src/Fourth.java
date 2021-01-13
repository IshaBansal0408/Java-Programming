import java.awt.*;
import java.applet.*;
public class Fourth extends Applet
{
    Image p;
    public void init() {
        p = getImage(getDocumentBase(),"ball.gif"); }
    public void paint(Graphics g) {
        for(int i=0;i<500;i++) {
            g.drawImage(p, i,50, this);
            try {
                Thread.sleep(100); }
            catch(Exception e)
            {}}}
}  