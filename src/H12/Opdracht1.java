package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double[] tabel;
    double[] gemiddelde;

    public void init() {
        tabel = new double[10];
        gemiddelde = new double[10];

        for (int teller = 0; teller < tabel.length; teller ++) {
            tabel[teller] = 1 * teller + 1;
        }
        gemiddelde[0] = ((tabel[0] + tabel[1] + tabel[2] + tabel[3] + tabel[4] + tabel[5] + tabel[6] + tabel[7] + tabel[8] + tabel[9]) / 10);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < tabel.length; teller ++) {
            g.drawString("" + gemiddelde[0], 100, 20);
            g.drawString("" + tabel[teller], 50, 20 * teller + 20);
        }
    }
}