package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {
    private int[] tabel = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 10, 10, 10};
    private TextField tekstvak;
    private boolean gevonden;
    private int index;
    private int gezocht;


    @Override
    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);
        Button knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gezocht = Integer.parseInt(tekstvak.getText());
                gevonden = false;
                index = 0;
                for (int i = 0; i < tabel.length; i++) {
                    if (gezocht == tabel[i]){
                        gevonden = true;
                        index++;
                    }
                }

                repaint();

            }
        });
    }
    public void paint(Graphics g){
        if (gevonden){
            g.drawString("De waarde is gevonden",50,50);
            g.drawString("De waarde is " + index + " keer gevonden",50,100);
        }
        if (!gevonden){
            g.drawString("De waarde is niet gevonden probeer het opnieuw", 50,50);
        }

    }




}
