package H4;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        g.drawRect(200, 20, 150, 155);
        g.setColor(Color.yellow);
        g.fillRect(200, 75, 50, 100);
        g.drawString("Hans", 200, 200);
        g.setColor(Color.CYAN);
        g.fillRect(250, 50, 50, 125);
        g.drawString("Jeroen", 250, 200);
        g.setColor(Color.GREEN);
        g.fillRect(300, 125, 50, 50);
        g.drawString("Valerie", 300, 200);
        g.setColor(Color.black);
        g.drawLine(200, 150, 190, 150);
        g.drawLine(200, 125, 190, 125);
        g.drawLine(275, 175, 190, 175);
        g.drawLine(200, 100, 190, 100);
        g.drawLine(200, 75, 190, 75);
        g.drawLine(200, 50, 190, 50);
        g.drawString("0", 180, 180);
        g.drawString("20", 175, 155 );
        g.drawString("40", 175, 130);
        g.drawString("60", 175, 105);
        g.drawString("80", 175, 80);
        g.drawString("100", 165, 55);

    }

}
