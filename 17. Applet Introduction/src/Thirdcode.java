import java.awt.*;
import java.applet.*;


public class Thirdcode extends Applet {
    Image picture;
    public void init() {
        picture = getImage(getDocumentBase(),"icon.png");
    }
    public void paint(Graphics g) {
        g.drawImage(picture, 30,30, this);
    }

}