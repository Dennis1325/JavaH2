package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht104 extends Applet{
    TextField tv;
    TextField tv2;
    Label label;
    String s, tekst, tekst2;
    int maand;
    int jaartal;


    public void init(){
        tv2 = new TextField(20);
        tv2.addActionListener(new TextListener());
        tv = new TextField(20);
        tv.addActionListener(new TextvakListener());
        add(tv);
        add(tv2);
    }
    public void paint(Graphics g){
        g.drawString( tekst, 50, 50);
        g.drawString(tekst2, 175, 50);
    }

    class TextListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            s = tv2.getText();
            jaartal = Integer.parseInt( s);
            if ((jaartal % 4 == 0 && ! (jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = "" + jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
    class TextvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tv.getText();
            maand = Integer.parseInt( s);
            switch (maand)  {
                case 1:
                    tekst = "Januari 31 dagen";
                    break;
                case 2:
                    tekst = "Februari 28 dagen";
                    break;
                case 3:
                    tekst = "Maart 31 dagen";
                    break;
                case 4:
                    tekst = "April 30 dagen";
                    break;
                case 5:
                    tekst = "Mei 31 dagen";
                    break;
                case 6:
                    tekst = "Juni 30 dagen";
                    break;
                case 7:
                    tekst = "Juli 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus 31 dagen";
                    break;
                case 9:
                    tekst = "September 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober 31 dagen";
                    break;
                case 11:
                    tekst = "November 30 dagen";
                    break;
                case 12:
                    tekst = "December 31 dagen";
                    break;
                default:
                    tekst = "U heeft een verkeerde nummer ingetikt";
                    break;
            }
            if (maand == 2 && (jaartal % 4 == 0 && ! (jaartal % 100 == 0)) ||
                    jaartal % 400 == 0  )
                tekst = "Februari 29 dagen";

            repaint();

        }
    }
}
