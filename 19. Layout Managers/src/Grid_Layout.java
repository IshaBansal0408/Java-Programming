import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
public class Grid_Layout extends Applet{
    static final int row =10;
    static final int col =10;
    public void init(){
        setLayout(new GridLayout(row,col));
        setFont(new Font("SansSerif", Font.BOLD, 24));
        int k=1;
        for(int i = 1; i <= 10; i++){
            for(int j=1;j<=10;j++) {
                Button btn=new Button("" + k);
                if(i-j==0){
                    btn.setBackground(Color.yellow);
                }
                else if(i+j==7 || i+j==15){
                    btn.setBackground(Color.pink);
                }
                else if(i+j==8 || i+j==14){
                    btn.setBackground(Color.cyan);
                }
                else if(i+j==9 || i+j==13){
                    btn.setBackground(Color.red);
                }
                else if(i+j==10 || i+j==12){
                    btn.setBackground(Color.blue);
                }
                else if(i+j==11){
                    btn.setBackground(Color.orange);
                }
                else{
                    btn.setBackground(Color.green);
                }
                add(btn);
                k+=1;}}}}