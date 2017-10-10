package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht10 extends Applet {
    int getal;
    TextField tekstvak;
    String tekst = "";

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new Tv1Listener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
    }

    class Tv1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            getal = Integer.parseInt( s);
            switch (getal){
                case 1:
                case 2:
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                case 9:
                case 10:
                    tekst = "goed";
                    break;
                default:
                    tekst = "u heeft een verkeerd nummer ingevoerd";
                    break;
            }
            repaint();
        }
    }

}
