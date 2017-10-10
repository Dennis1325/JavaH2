package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht102 extends Applet {
    int getal;
    TextField tekstvak;
    int uitkomst;
    int uitkomst2;

    public void init(){
        tekstvak = new TextField(10);
        tekstvak.addActionListener(new TekstVakListener());
        add(tekstvak);
    }
    public void paint(Graphics g){
        g.drawString(String.valueOf(uitkomst), 50, 50);
        g.drawString(String.valueOf(uitkomst2), 50, 100);
    }
    class TekstVakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if (getal > uitkomst ){
                uitkomst = getal;
            }
            if (uitkomst2 == 0) uitkomst2 = getal;
            if (uitkomst2 > getal) uitkomst2 = getal;
            repaint();
        }
    }
}
