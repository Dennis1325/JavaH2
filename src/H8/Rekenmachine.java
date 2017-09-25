package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rekenmachine extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    TextField tekstvak;
    TextField tekstvak2;
    String schermtekst = ".....";

    public void init(){
        knop = new Button("+");
        knop2 = new Button("-");
        knop3 = new Button("*");
        knop4 = new Button("/");
        tekstvak = new TextField(10);
        tekstvak2 = new TextField(10);
        knop.addActionListener(new AL());
        knop2.addActionListener(new AL2());
        knop3.addActionListener(new AL3());
        knop4.addActionListener(new AL4());
        add(tekstvak);
        add(tekstvak2);
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);

    }
    public void paint(Graphics g){
        g.drawString(schermtekst, 50, 50);
    }
    class AL implements ActionListener{
        public void actionPerformed (ActionEvent e){
            schermtekst = "" + (Integer.parseInt(tekstvak.getText()) + Integer.parseInt(tekstvak2.getText()));
            repaint();
        }
    }
    class AL2 implements ActionListener{
        public void actionPerformed (ActionEvent e){
            schermtekst = "" + (Integer.parseInt(tekstvak.getText()) - Integer.parseInt(tekstvak2.getText()));
            repaint();
        }
    }
    class AL3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "" + (Integer.parseInt(tekstvak.getText()) * Integer.parseInt(tekstvak2.getText()));
            repaint();
        }
    }
    class AL4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "" + (Integer.parseInt(tekstvak.getText()) / Integer.parseInt(tekstvak2.getText()));
            repaint();
        }
    }
}
