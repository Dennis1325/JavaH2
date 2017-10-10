package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht11 extends Applet{
    TextField tekstvak;
    Button okknop;
    int input = 0;

    public void init(){
        tekstvak = new TextField(20);
        okknop = new Button("ok");
        okknop.addActionListener(new OkknopListener());
        add(okknop);
        add(tekstvak);
    }

    @Override
    public void paint(Graphics g) {
        int tafel = 0;
        int y = 0;

        for (tafel = 0; tafel < 50; tafel++){
            y += 20;
            g.drawString( input+ "x " + tafel + " =" + (tafel*input),50,y);
        }
    }
    class OkknopListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s;
            input = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }
}
