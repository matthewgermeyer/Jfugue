package com.example;
import jm.JMC;
import jm.music.data.*;
import jm.music.tools.*;
import jm.util.*;

/**
 * This class turns a series of pitches into a repeating arpeggio
 * @author Andrew Brown
 */

public class Arpeggio implements JMC {

    public static void main(String[] args) {
        new Arpeggio();
    }

    public Arpeggio() {
        int[] pitches = {C4, F4, BF4, D5, F5, BF5,  C6, BF5, F5, D5, F4, BF3};
        // turn pitches into a phrase
        Phrase arpPhrase = new Phrase();
        for(int i = 0; i < pitches.length; i++) {
            Note n = new Note(pitches[i], SEMI_QUAVER);
            arpPhrase.addNote(n);
        }

        // repeat the arpeggio a few times
        Mod.repeat(arpPhrase, 8);

        // save it as a file
        Write.midi(arpPhrase, "Arpeggio1.mid");
        Play.midi(arpPhrase);

    }
}
