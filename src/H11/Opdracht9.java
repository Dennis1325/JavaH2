package H11;

import java.applet.Applet;
import java.awt.*;

import static java.awt.Color.black;
import static java.awt.Color.white;

public class Opdracht9 extends Applet {
    @Override
    public void paint(Graphics g) {
        int breedte = 25;
        int hoogte = 25;
        int x = 50;
        int y = 50;
        for (int width = 0; width < 8; width++) {
            for (int kolom = 0; kolom < 8; kolom++) {
                if ((kolom%2 == 0 && width%2 == 0)|| (kolom%2 == 1 && width%2 == 1)) {
                    g.setColor(black);
                    g.fillRect(x+(kolom*25), y+(width*25), breedte, hoogte);
                } else {
                    g.setColor(white);
                    g.fillRect(x+(kolom*25), y+(width*25), breedte, hoogte);
                }
            }

        }
    }
}
