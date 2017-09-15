package H6;

import java.applet.Applet;
import java.awt.*;

public class JavaOpdracht63 extends Applet{
    int a;
    int b;
    int uitkomst;
    public void init(){
        a = 2147483647;
        b = 2147483646;
        uitkomst = (a+b);
    }
    public void paint(Graphics g){

        g.drawString("uitkomst is " +uitkomst, 100, 100);
    }
}
