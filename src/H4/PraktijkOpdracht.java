package H4;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet{

    public void init(){

    }
    public void paint(Graphics g){
        g.drawLine(50, 50, 250, 50);
        g.drawString("Lijn", 160, 65);
        g.drawRect(50, 75, 200, 100);
        g.drawString("Rechthoek", 150, 200);
        g.drawRoundRect(50, 225, 200, 100, 40, 40);
        g.drawString("Afgeronde rechthoek", 125, 350);
        g.setColor(Color.MAGENTA);
        g.fillArc(520, 75, 200, 100, 0, 45);
        g.fillArc(290, 225, 200, 100, 10, 500);
        g.fillRect(290, 75, 200, 100);
        g.setColor(Color.black);
        g.drawArc(290, 75, 200, 100, 50, 500);
        g.drawString("Gevulde rechthoek met ovaal", 310, 200);
        g.drawString("Gevulde ovaal", 350, 350);
        g.drawArc(520, 75, 200, 100, 50, 500);
        g.drawString("Taartpunt met een ovaal eromheen", 530, 200);
        g.drawArc(560, 220, 100, 100, 10, 500);
        g.drawString("Cirkel", 590, 350);

    }
}
