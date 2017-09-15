package H6;

import java.applet.Applet;
import java.awt.*;

public class JavaOpdracht62 extends Applet{
    int seconden;
    double uur;
    double dag;
    int jaar;
    public  void init(){
        seconden = 60;
        uur = (seconden*seconden);
        dag = (seconden*seconden*24);
        jaar = (seconden*seconden*24*365);
    }
    public  void paint(Graphics g){

        g.drawString("uur is " +uur, 50, 50);
        g.drawString("dag is " +dag, 50, 75);
        g.drawString("jaar is " +jaar, 50, 100);

    }
}
