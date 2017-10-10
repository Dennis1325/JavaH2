package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    @Override
    public void paint(Graphics g) {

        for (int teller = 0; teller < 5; teller++){

            g.drawRect(25+(25*teller), 25+(25*teller), 25, 25);

        }
    }
}
