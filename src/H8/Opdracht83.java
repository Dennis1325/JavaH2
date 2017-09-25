package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht83 extends Applet {
    Button knop;
    String schermtekst = "voer een bedrag in";
    TextField textfield;

    public void init(){
        knop = new Button("ok");
        knop.addActionListener(new KL());
        textfield = new TextField(20);
        textfield.addActionListener(new KL());
        add(knop);
        add(textfield);
    }
    public void paint(Graphics g){
        g.drawString(schermtekst, 50,50);

    }
    class KL implements ActionListener{
        public void actionPerformed(ActionEvent e){
            schermtekst = "" + (Integer.parseInt(textfield.getText())*1.21);
            repaint();
        }
    }
}
