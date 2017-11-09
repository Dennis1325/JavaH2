package H12;

import sun.rmi.runtime.Log;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Opdracht3 extends Applet {
    TextField tekstvakken[];
    Button knop;
    int aantalVelden = 5;

    @Override
    public void init() {
       tekstvakken = new TextField[aantalVelden];
        for (int i = 0; i < aantalVelden; i++) {
            tekstvakken[i] = new TextField(5);
            add(tekstvakken[i]);
        }
        knop = new Button("Ok");
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] invoer = new int[aantalVelden];
                for (int i = 0; i < aantalVelden; i++) {
                    invoer[i] = Integer.parseInt(String.valueOf(tekstvakken[i].getText()));
                }
                Arrays.sort(invoer);
                for (int i = 0; i < aantalVelden; i++) {
                    tekstvakken[i].setText(String.valueOf(invoer[i]));
                }
            }
        });
        add(knop);
    }
}