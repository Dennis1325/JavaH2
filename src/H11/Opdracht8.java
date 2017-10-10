package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    @Override
    public void paint(Graphics g) {
        for (int teller = 0; teller <= 100; teller++){
            g.drawArc(50,50, 50+(5*teller), 50+(5*teller), 0, 360);
        }
    }
}
