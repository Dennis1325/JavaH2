package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int nieuw;

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int y = 20;
        int oud = 0;
        int nieuw = 1;
        for (int teller = 0; teller < 100; teller = oud + nieuw) {
            y += 20;
            oud = nieuw;
            nieuw = teller;
            g.drawString("  " + nieuw, y, 50);

        }

    }
}
