package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {


    @Override
    public void paint(Graphics g) {

        for (int tafel = 0; tafel < 80; tafel++ ){
            g.drawString(tafel+"X3="+(tafel*3),50,50+(15*tafel));
        }
    }
}
