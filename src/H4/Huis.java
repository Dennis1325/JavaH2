package H4;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        g.drawRect(150, 100, 100, 100);
        g.drawLine(150, 100, 200, 25);
        g.drawLine(250, 100, 200, 25);
        g.drawLine(150, 100, 250, 100);
        g.drawLine(200, 200, 200, 170);
        g.drawLine(225, 170, 200, 170);
        g.drawLine(225, 170, 225, 200);
        g.drawRect(175, 125, 25, 25);
        g.drawRect(225, 210, 75, 40);
        g.drawLine(225, 210, 225, 280);
        g.drawOval(220, 180, 3, 3);
        g.drawLine(240, 85 ,240, 35);
        g.drawLine(240, 35, 230, 35);
        g.drawLine(230, 35, 230, 70);
        g.setColor(Color.red);
        g.fillRect(225, 210, 75, 17);
        g.setColor(Color.blue);
        g.fillRect(225, 240, 75, 17);




    }
}
