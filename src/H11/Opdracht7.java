package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void paint(Graphics g) {
        for (int teller = 0; teller < 50; teller++){
            g.drawArc(100+(10*teller),100+(10*teller),1000-(20*teller),1000-(20*teller),0,500);
        }
    }
}
