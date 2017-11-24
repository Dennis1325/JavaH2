package H13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {



    private void tekenboom(Graphics g, int x1, int y1, int width, int height, int startAngle, int endAngle){
        g.setColor(Color.orange);
        g.fillRect(x1,y1,width,height);
        g.setColor(Color.green);
        g.fillArc(x1 - 12,y1 - 10,width + width,height - 50, startAngle, endAngle);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 5; i++) {
            tekenboom(g,10 + (80 * i), 10,25,100, 0, 360);
            tekenboom(g,10 + (80 * i), 125,25,100, 0, 360);
        }
    }
}
