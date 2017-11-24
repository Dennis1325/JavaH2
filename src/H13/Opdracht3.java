package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet{
    private boolean geklikt1;
    private boolean geklikt2;

    @Override
    public void init() {
        Button knop1 = new Button("Ok");
        Button knop2 = new Button("Ok");
        knop1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                geklikt1 = true;
                geklikt2 = false;
                repaint();
            }
        });
        knop2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                geklikt1 = false;
                geklikt2 = true;
                repaint();
            }
        });

        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {
        if(geklikt1){
            setBackground(Color.red);
            tekenMuur(g, 50, 50, 100, 50);
        }
        if (geklikt2){
            setBackground(Color.gray);
            tekenmuurgrijs(g, 50, 50, 200, 100);
        }

    }

    private void tekenMuur(Graphics g, int x1, int y1, int x2, int y2) {
        for (int teller = 10; teller < 11; teller++) {
            for (int i = 0; i < 10; i++) {

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

    private void tekenmuurgrijs(Graphics g, int x1, int y1, int x2, int y2){
        for (int teller = 10; teller < 11; teller++) {
            for (int i = 0; i < 10; i++) {

                int optel = 100;

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
