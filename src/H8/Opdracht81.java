package H8;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht81 extends Applet {


    Button knop;
    Button knop2;
    TextField textfield;
    String tekstvak = "start";


    public void init(){
        knop2 = new Button();
        knop = new Button();
        textfield = new TextField(20);
        knop.setLabel("ok");
        knop2.setLabel("reset");
        knop.addActionListener(new SendAction());
        knop2.addActionListener(new ResetAction());
        add(textfield);
        add(knop);
        add(knop2);
    }


    public void paint(Graphics g) {

        g.drawString(tekstvak, 75, 50);
    }


    class SendAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak = textfield.getText();
            repaint();
        }
    }


    class ResetAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tekstvak = "start";
            repaint();
        }
    }
}
