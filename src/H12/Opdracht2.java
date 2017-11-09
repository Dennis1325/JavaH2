package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet{
    Button knoppen[] = new Button[25];

    @Override
    public void init() {
        for (Button knop:knoppen) {
            knop = new Button();
            add(knop);
        }
    }
}
