package H4;

import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        g.drawLine(50, 100, 200, 100);
        g.drawLine(50, 100, 125, 5);
        g.drawLine(200, 100, 125, 5);


    }
}
