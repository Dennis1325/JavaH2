package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    int mannen = 0;
    int vrouwen = 0;
    int potentielemannen = 0;
    int potentielevrouwen = 0;


    public void init() {
        knop = new Button();
        knop2 = new Button();
        knop3 = new Button();
        knop4 = new Button();
        knop.setLabel("mannen");
        knop2.setLabel("vrouwen");
        knop3.setLabel("potentiele mannen");
        knop4.setLabel("potentiele vrouwen");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new Knop2Listener());
        knop3.addActionListener(new Knop3Listener());
        knop4.addActionListener(new Knop4Listener());
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);

    }

    public void paint(Graphics g) {
        g.drawString("mannen  " + mannen, 50, 75);
        g.drawString("vrouwen  " + vrouwen, 50, 100);
        g.drawString("potentiele mannen  " + potentielemannen, 50, 125);
        g.drawString("potentiele vrouwen  " + potentielevrouwen, 50, 150);
        g.drawString("totaal  " + (mannen + vrouwen + potentielevrouwen + potentielemannen), 50, 175);

    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();

        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            repaint();
        }
    }
    class Knop3Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            potentielemannen++;
            repaint();
        }
    }
    class Knop4Listener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            potentielevrouwen++;
            repaint();
        }
    }
}
