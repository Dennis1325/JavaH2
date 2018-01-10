package H14;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import static java.lang.Math.random;

public class Opdracht1 extends Applet {
    Button knop;
    String tekst;
    String[] kleuren;
    String[] kaarten;



    @Override
    public void init() {
        knop = new Button("Deel kaart");
        kleuren = new String[4];
        kaarten = new String[13];
        add(knop);
        tekst = "";
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        kleuren[0] = "Klaver";
        kleuren[1] = "Schoppen";
        kleuren[2] = "Harten";
        kleuren[3] = "Ruiten";
        kaarten[0] = "twee";
        kaarten[1] = "drie";
        kaarten[2] = "vier";
        kaarten[3] = "vijf";
        kaarten[4] = "zes";
        kaarten[5] = "zeven";
        kaarten[6] = "acht";
        kaarten[7] = "negen";
        kaarten[8] = "tien";
        kaarten[9] = "boer";
        kaarten[10] = "vrouw";
        kaarten[11] = "heer";
        kaarten[12] = "aas";

    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           int randomkleur = new Random().nextInt(kleuren.length);
           int randomgetal = new Random().nextInt( kaarten.length);
            tekst = (kleuren[randomkleur]) + " " + (kaarten[randomgetal]);
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
            g.drawString(tekst, 100, 100);

    }
}