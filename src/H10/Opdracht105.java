package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht105 extends Applet {
    int count;
    int gemiddelde;
    Button knop;
    TextField tv;
    String tekst, geslaagd;

    public void init() {
        knop = new Button();
        knop.setLabel("ok");
        tv = new TextField(20);
        knop.addActionListener(new knopListener());
        add(knop);
        add(tv);

    }

    public void paint(Graphics g) {
        g.drawString("Ingevoerd getal: " + tekst, 25, 50);
        g.drawString("Gemiddelde: " + (gemiddelde / count), 25, 70);
        g.drawString("Geslaagd: : " + geslaagd, 25, 90);
    }

    class knopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tv.getText();
            int invoer = Integer.parseInt(s);
            if (invoer <= 5) {
                tekst = "onvoldoende";
                gemiddelde += invoer;
                count++;
            } else if (invoer > 5) {
                tekst = "voldoende";
                gemiddelde += invoer;
                count++;
            } else if (invoer > 10) {
                tekst = "error";
            } else if (invoer < 0) {
                tekst = "error";
            } else {
                tekst = "error";
            }

            if (gemiddelde / count <= 5) {
                geslaagd = "Nee";
            } else {
                geslaagd = "Ja";
            }
            repaint();
        }
    }

}
