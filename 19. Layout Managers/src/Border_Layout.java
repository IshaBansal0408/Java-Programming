import java.awt.*;
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Border_Layout extends Applet{
    static final int row =10;
    static final int col =10;
    public void init(){
        setLayout(new BorderLayout());
        add(new Button("You have reached the top"), BorderLayout.NORTH);
        add(new Button("You have reached the bottom"),BorderLayout.SOUTH);
        add(new Button("You have reached the right"), BorderLayout.EAST);
        add(new Button("You have reached the left"), BorderLayout.WEST);
        String str =
                "\t\t\tQuotes of the Day\n\n" +
                        "1. If you don't like the road you're walking, " +
                        "start paving another one.\n" +
                        "2. The most beautiful things in the world cannot be seen " +
                        "or even touched. They must be felt with the heart.\n" +
                        "3. Love yourself first and everything else falls into line." +
                        "4. Don't give it five minutes if you're not going to give it five years.\n" +
                        "\n\t\t\tTHANK YOU!";
        add(new TextArea(str), BorderLayout.CENTER);
    }
}