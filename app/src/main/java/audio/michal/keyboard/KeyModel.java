package audio.michal.keyboard;

import java.util.Date;

public class KeyModel {
    enum Color {
        BLACK,
        WHITE
    }
    enum Tone {
        C("C"),
        C_SHARP("C#"),
        D("D"),
        D_SHARP("D#"),
        E("E"),
        F("F"),
        F_SHARP("F#"),
        G("G"),
        G_SHARP("G#"),
        A("A"),
        A_SHARP("A#"),
        B("B");

        private String displayName;

        Tone(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
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
