package H6;

import java.applet.Applet;
import java.awt.*;

public class JavaOpdracht62 extends Applet{
    int seconden;
    double uur;
    double dag;
    int jaar;
    double UrenInDag;
    double DagenInJaar;
    public  void init(){
        seconden = 60;
        UrenInDag = 24;
        DagenInJaar = 365;
        uur = (seconden*seconden);
        dag = (seconden*seconden*UrenInDag);
        jaar = (int) (seconden*seconden*UrenInDag*DagenInJaar);
    }
    public  void paint(Graphics g){

        g.drawString("uur is " +uur, 50, 50);
        g.drawString("dag is " +dag, 50, 75);
        g.drawString("jaar is " +jaar, 50, 100);

    }
}
