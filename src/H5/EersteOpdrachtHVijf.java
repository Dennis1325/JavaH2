package H5;

import java.applet.Applet;
import java.awt.*;

public class EersteOpdrachtHVijf extends Applet{

    Color opvulkleur;
    Color lijnkleur;
    int hoogte;
    int breedte;

    public void init(){

        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        hoogte = 100;
        breedte = 200;
    }
    public void paint(Graphics g){
        g.drawString("lijn",200, 95 );
        g.drawLine(100, 75, 300, 75);
        g.drawRect(100, 100, breedte, hoogte);
        g.drawString("Rechthoek", 175, 215);
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 150, 350);
        g.drawString("Gevulde rechthoek met ovaal", 335, 215);
        g.drawString("Gevulde ovaal", 365, 350);
        g.drawString("Taarpunt met ovaal eromheen", 535, 215);
        g.drawString("Cirkel", 600, 350);
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(565, 225, 110, 110);
        g.drawArc(525, 100, breedte, hoogte, 50, 500);
        g.drawOval(315, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        g.fillArc(525, 100, breedte, hoogte, 10, 45);





    }

}
