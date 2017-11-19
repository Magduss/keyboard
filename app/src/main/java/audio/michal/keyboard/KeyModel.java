package audio.michal.keyboard;

import java.util.Date;

public class KeyModel {
    enum Color {
        BLACK,
        WHITE
    }
    enum Tone {
        C,
        C_SHARP,
        D,
        D_SHARP,
        E,
        F,
        F_SHARP,
        G,
        G_SHARP,
        A,
        A_SHARP,
        B
    }

    final int octave;
    final Color color;
    final Tone tone;

    public KeyModel(int octave, Color color, Tone tone) {
        this.octave = octave;
        this.color = color;
        this.tone = tone;
    }
}
