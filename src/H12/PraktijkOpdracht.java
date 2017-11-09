package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    private TextField naamtextfield;
    private TextField telefoonnr;
    private String[] namen;
    private String[] telefoonnummers;
    private int aantalkliks;
    private final static int AANTAL_INVOER = 10;

    @Override
    public void init() {
        naamtextfield = new TextField(10);
        add(naamtextfield);
        telefoonnr = new TextField(10);
        add(telefoonnr);
        Button knop = new Button("Ok");
        add(knop);
        namen = new String[AANTAL_INVOER];
        telefoonnummers = new String[AANTAL_INVOER];
        aantalkliks = 0;

        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namen[aantalkliks] = naamtextfield.getText();
                telefoonnummers[aantalkliks] = telefoonnr.getText();
                aantalkliks++;
                if (aantalkliks == AANTAL_INVOER) {
                    repaint();
                    aantalkliks = 0;
                }

            }
        });
    }

    @Override
    public void paint(Graphics g) {
        if(aantalkliks != 0);
        int x1 = 50;
        int x2 = 150;
        int y = 70;
        for (int i = 0; i < AANTAL_INVOER; i++) {
            g.drawString(namen[i], x1, y);
            g.drawString(telefoonnummers[i], x2, y);
            y += 20;
        }
    }
}

