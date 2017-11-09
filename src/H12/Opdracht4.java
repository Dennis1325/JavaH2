package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    private int[] tabel = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int gezocht;
    private TextField tekstvak;
    private Button knop;
    private boolean gevonden;
    private int index;

    private final int aantalVelden = 10;


    @Override
    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);
        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gevonden = false;
                gezocht = Integer.parseInt(tekstvak.getText());
                for (int i = 0; i < tabel.length; i++) {
                    if (gezocht == tabel[i]) {
                        gevonden = true;
                        index = i;
                    }

                }
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        if (gevonden){
            g.drawString("De waarde " + gezocht + " is gevonden", 50, 50);
            g.drawString("De index waarde is " + index, 50, 100);
        }else{
            g.drawString("De waarde " + gezocht + " is niet gevonden",50,50);
        }
    }
}
