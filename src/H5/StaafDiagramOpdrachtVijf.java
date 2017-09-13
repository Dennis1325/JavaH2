package H5;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagramOpdrachtVijf extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;

    public void init(){
        Valerie = 40;
        Jeroen = 100;
        Hans = 70;
    }
    public void paint(Graphics g){
        g.drawRect(200, 20, 150, 160);
        g.drawLine(200, 140, 190, 140);
        g.drawLine(200, 160, 190, 160);
        g.drawLine(275, 180, 190, 180);
        g.drawLine(200, 100, 190, 100);
        g.drawLine(200, 120, 190, 120);
        g.drawLine(200, 80, 190, 80);
        g.setColor(Color.yellow);
        g.fillRect(200, 180-Hans, 50, Hans);
        g.drawString("Hans", 200, 200);
        g.setColor(Color.CYAN);
        g.fillRect(250, 180-Jeroen, 50, Jeroen);
        g.drawString("Jeroen", 250, 200);
        g.setColor(Color.GREEN);
        g.fillRect(300, 180-Valerie, 50, Valerie);
        g.drawString("Valerie", 300, 200);
        g.setColor(Color.black);
        g.drawLine(200, 20, 200, 180);
        g.drawString("0", 180, 180);
        g.drawString("20", 175, 160 );
        g.drawString("40", 175, 140);
        g.drawString("60", 175, 120);
        g.drawString("80", 175, 100);
        g.drawString("100", 165, 80);
    }
}
