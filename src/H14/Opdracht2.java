package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class Opdracht2 extends Applet {

    private Button knop;
    private String[] speler1;
    private String[] speler2;
    private String[] speler3;
    private String[] speler4;
    private String[] deck;
    private URL pad;
    private AudioClip sound;
    private boolean geklikt;
    int y = 75;


    @Override
    public void init() {
        geklikt = false;
        deck = new String[52];
        deck[0] = "Schoppen Twee";
        deck[1] = "Schoppen Drie";
        deck[2] = "Schoppen Vier";
        deck[3] = "Schoppen Vijf";
        deck[4] = "Schoppen Zes";
        deck[5] = "Schoppen Zeven";
        deck[6] = "Schoppen Acht";
        deck[7] = "Schoppen Negen";
        deck[8] = "Schoppen Tien";
        deck[9] = "Schoppen Boer";
        deck[10] = "Schoppen Vrouw";
        deck[11] = "Schoppen Heer";
        deck[12] = "Schoppen Aas";

        deck[13] = "Harten  Twee";
        deck[14] = "Harten  Drie";
        deck[15] = "Harten  Vier";
        deck[16] = "Harten  Vijf";
        deck[17] = "Harten  Zes";
        deck[18] = "Harten  Zeven";
        deck[19] = "Harten  Acht";
        deck[20] = "Harten  Negen";
        deck[21] = "Harten  Tien";
        deck[22] = "Harten  Boer";
        deck[23] = "Harten  Vrouw";
        deck[24] = "Harten  Heer";
        deck[25] = "Harten  Aas";

        deck[26] = "Ruiten Twee";
        deck[27] = "Ruiten Drie";
        deck[28] = "Ruiten Vier";
        deck[29] = "Ruiten Vijf";
        deck[30] = "Ruiten Zes";
        deck[31] = "Ruiten Zeven";
        deck[32] = "Ruiten Acht";
        deck[33] = "Ruiten Negen";
        deck[34] = "Ruiten Tien";
        deck[35] = "Ruiten Boer";
        deck[36] = "Ruiten Vrouw";
        deck[37] = "Ruiten Heer";
        deck[38] = "Ruiten Aas";

        deck[39] = "Klaver  Twee";
        deck[40] = "Klaver  Drie";
        deck[41] = "Klaver  Vier";
        deck[42] = "Klaver  Vijf";
        deck[43] = "Klaver  Zes";
        deck[44] = "Klaver  Zeven";
        deck[45] = "Klaver  Acht";
        deck[46] = "Klaver  Negen";
        deck[47] = "Klaver  Tien";
        deck[48] = "Klaver  Boer";
        deck[49] = "Klaver  Vrouw";
        deck[50] = "Klaver  Heer";
        deck[51] = "Klaver  Aas";

        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];
        pad = Opdracht2.class.getResource("/Sounds/");
        sound = getAudioClip(pad, "Cards_bridge_fast_shuffle_BLASTWAVEFX_15909.wav");

        knop = new Button("Deel kaarten");

        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sound.play();
                geklikt = true;
                alleSpelers();
                repaint();

            }
        });
        add(knop);
    }

    private void alleSpelers() {
        for (int i = 0; i < speler1.length; i++) {
            speler1[i] = deelkaart();
            speler2[i] = deelkaart();
            speler3[i] = deelkaart();
            speler4[i] = deelkaart();
        }
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("Speler1", 25, 50);
        g.drawString("Speler2", 125, 50);
        g.drawString("Speler3", 225, 50);
        g.drawString("Speler4", 325, 50);
        
        if (geklikt) {
            for (int i = 0; i < 13; i++) {
                y += 15;
                g.drawString(speler1[i],  25, y);
                g.drawString(speler2[i], 125, y);
                g.drawString(speler3[i], 225, y);
                g.drawString(speler4[i], 325, y);
            }
        }
    }

    private String deelkaart() {

        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulplijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulplijst[hulpindex] = deck[i];
                hulpindex++;
            }

        }

        deck = hulplijst;
        return kaart;
    }
}
