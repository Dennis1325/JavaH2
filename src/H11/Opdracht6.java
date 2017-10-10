package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    @Override
    public void paint(Graphics g) {
        for (int teller = 0; teller < 5; teller++){
            g.drawArc(100+(10*teller),100+(10*teller),100-(20*teller),100-(20*teller),0,500);
        }
    }
}
