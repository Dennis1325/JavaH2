package H6;

import java.applet.Applet;
import java.awt.*;

public class RekenOpdracht extends Applet {
    int Jan, Ali, Jeanette, Dennis;
    int verdeling;
    double uitkomst;

    public void init(){
        Jan = 30;
        Ali = 30;
        Jeanette = 33;
        Dennis = 20;
        verdeling= 4;
        uitkomst = (Jan+Ali+Jeanette+Dennis) / verdeling;

    }
    public void paint(Graphics g){

        g.drawString("uitkomst: " +uitkomst, 100, 100);
    }
}
