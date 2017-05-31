package com.example;

import jm.JMC;
import jm.music.data.Note;
import jm.util.Play;

public class Music {

    //This is, where our program is going to start
    public static void main(String[] args) {

        //Play our first note!
        System.out.println("prior to");

        Note n = new Note();
        n.setPitch(JMC.GS4);

        Play.midi(n);
        n.setPitch(JMC.AS4);
        Play.midi(n);
        n.setPitch(JMC.B4);
        Play.midi(n);
        n.setPitch(JMC.CS5);
        Play.midi(n);
        n.setPitch(JMC.GS4);
        Play.midi(n);
        n.setPitch(JMC.AS4);
        Play.midi(n);
        n.setPitch(JMC.B4);
        Play.midi(n);
        Play.midi(n);
        n.setPitch(JMC.B4);
        Play.midi(n);
        n.setPitch(JMC.CS5);
        Play.midi(n);
        n.setPitch(JMC.GS4);

        Play.midi(new Note());
        Play.midi(new Note());

        Play.midi(new Note());

        Play.midi(new Note());

        System.out.println("after ");

        //Woo, we made it!

    }
}
