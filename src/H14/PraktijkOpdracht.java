package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PraktijkOpdracht extends Applet {

    TextField tekstvak;
    int aantal = 23;
    boolean gespeeld;
    boolean computerBeurt;
    boolean gewonnen;
    boolean verloren;
    boolean onjuist;
    boolean winning;
    boolean opnieuw;
    Button knop;
    Button resetKnop;

    private Image gewoneSmiley;
    private Image sadSmiley;
    private Image evilSmiley;
    private Image happySmiley;
    private URL link1;
    private URL link2;
    private URL link3;
    private URL link4;


    @Override
    public void init() {

        opnieuw = false;
        computerBeurt = false;
        winning = false;
        gespeeld = false;
        gewonnen = false;
        verloren = false;

        tekstvak = new TextField(10);
        resetKnop = new Button("reset");
        knop = new Button("Speel");

        link1 = PraktijkOpdracht.class.getResource("/Img/");
        gewoneSmiley = getImage(link1, "serieuzeSmiley.png");
        link2 = PraktijkOpdracht.class.getResource("/Img/");
        sadSmiley = getImage(link2,"sad_face.png");
        link3 = PraktijkOpdracht.class.getResource("/Img/");
        evilSmiley = getImage(link3,"evil-smiley-face.png");
        link4 = PraktijkOpdracht.class.getResource("/Img/");
        happySmiley = getImage(link4, "blijeSmiley.png");

        add(knop);
        add(tekstvak);
        add(resetKnop);


        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gespeeld = true;
                int aftrekken = Integer.parseInt(tekstvak.getText());

                if(gespeeld){
                    computerBeurt = true;
                    if (aftrekken == 3){
                        onjuist = false;
                        aantal = aantal - aftrekken;
                    }
                    if (aftrekken == 2){
                        onjuist = false;
                        aantal = aantal - aftrekken;
                    }
                    if (aftrekken == 1){
                        onjuist = false;
                        aantal = aantal - aftrekken;
                    }
                    if (aftrekken >= 4){
                        onjuist = true;
                    }
                    if (aftrekken <=0){
                        onjuist = true;
                    }
                    if(aantal == 1){
                        gewonnen = true;
                        verloren = false;
                    }
                    if(aantal <= 0){
                        verloren = true;
                        gewonnen = false;
                    }
                }
                if (computerBeurt){
                    if (aantal == 22){
                        winning = true;
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 21){
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 20){
                        winning = true;
                        aantal = aantal - 3;
                        repaint();
                    }
                    else if (aantal == 19){
                        winning = true;
                        aantal = aantal - 2;
                        repaint();
                    }
                    else if (aantal == 18){
                        winning = true;
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 17){
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 16){
                        winning = true;
                        aantal = aantal - 3;
                        repaint();
                    }
                    else if (aantal == 15){
                        winning = true;
                        aantal = aantal - 2;
                        repaint();
                    }
                    else if (aantal == 14){
                        winning = true;
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 13){
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 12){
                        winning = true;
                        aantal = aantal - 3;
                        repaint();
                    }
                    else if (aantal == 11){
                        winning = true;
                        aantal = aantal - 2;
                        repaint();
                    }
                    else if (aantal == 10){
                        winning = true;
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 9){
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 8) {
                        winning = true;
                        aantal = aantal - 3;
                        repaint();
                    }
                    else if (aantal == 7){
                        winning = true;
                        aantal = aantal - 2;
                        repaint();
                    }
                    else if (aantal == 6){
                        winning = true;
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 5){
                        aantal = aantal - 3;
                        repaint();
                    }
                    else if (aantal == 4){
                        winning = true;
                        aantal = aantal - 3;
                        repaint();
                    }
                    else if (aantal == 3){
                        winning = true;
                        aantal = aantal - 2;
                        repaint();
                    }
                    else if (aantal == 2){
                        winning = true;
                        aantal = aantal - 1;
                        repaint();
                    }
                    else if (aantal == 1){
                        aantal = aantal - 1;
                        repaint();
                    }
                    if (winning){
                        gewoneSmiley = happySmiley;
                        repaint();
                    }


                }
                repaint();
            }
        });
        resetKnop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                aantal = 23;
                gewoneSmiley = getImage(link1, "serieuzeSmiley.png");
                verloren = false;
                gewonnen = false;
                winning = false;
                computerBeurt = false;
                gespeeld = false;
                repaint();

            }
        });



    }

    @Override
    public void paint(Graphics g) {
        if (onjuist){
            g.setColor(Color.red);
            g.drawString("Onjuiste invoer", 95, 45);
            g.drawString("(u kunt alleen de getallen 1, 2 en 3 gebruiken)", 95, 55);
        }
        else{
            if (gewonnen){
                g.drawString("Jammer, je hebt gewonnen...",125,50);
                g.drawImage(sadSmiley, 80,80,250,251,this);
            }else if (verloren){
                g.drawString("HAHA JE HEBT VERLOREN", 125,50);
                g.drawImage(evilSmiley,80,80,250,251,this);
            }
            else if (!gewonnen || !verloren){
                if (aantal == 1){
                    g.drawString("Er is nog " + aantal + " smiley over",135,45);
                    g.drawImage(gewoneSmiley, 75,75,40,40,this);
                }else{
                    g.drawString("Er zijn nog " + aantal + " smileys over", 135,45);
                }
            }


        }
        if(aantal != 1){
            int y = 75;
            int x = 75;

            for (int i = 0; i < aantal; i++) {
                g.drawImage(gewoneSmiley, x,y,40,40,this);
                x += 50;
                if (i == 4){
                    x = 75;
                    y += 50;
                }
                if (i == 9){
                    x = 75;
                    y += 50;
                }
                if (i == 14){
                    x = 75;
                    y += 50;
                }
                if (i == 19){
                    x = 75;
                    y += 50;
                }

            }
        }





    }
}
