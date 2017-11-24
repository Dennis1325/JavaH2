package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Opdracht2 extends Applet {

    @Override
    public void paint(Graphics g) {
        tekenMuur(g, 50, 50, 100, 50);

    }

    private void tekenMuur(Graphics g, int x1, int y1, int x2, int y2) {
        for (int teller = 10; teller < 11; teller++) {
            for (int i = 0; i < 10; i++) {
                setBackground(Color.red);
                int optel = 50;

                //eerste rij blokken
                g.drawRect(x1,y1,x2,y2);
                g.drawRect(x1 + optel + optel,y1,x2,y2);
                g.drawRect(x1 + optel + optel + optel + optel,y1,x2,y2);
                g.drawRect(x1 + optel + optel + optel + optel + optel + optel,y1,x2,y2);

                //tweede rij blokken
                g.drawRect(x1 + optel,y1 + optel,x2,y2);
                g.drawRect(x1 + optel + optel + optel,y1 + optel,x2,y2);
                g.drawRect(x1 + optel + optel + optel + optel + optel,y1 + optel,x2,y2);

                //derde rij blokken
                g.drawRect(x1 + optel + optel + optel + optel,y1 + optel + optel,x2,y2);
                g.drawRect(x1 + optel + optel,y1 + optel + optel,x2,y2);
                g.drawRect(x1 + optel + optel + optel + optel + optel + optel,y1 + optel + optel,x2,y2);
                g.drawRect(x1,y1 + optel + optel,x2,y2);


                teller++;
            }
        }

    }
}

