package audio.michal.keyboard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by magda on 31.01.18.
 */

public class KeyboardFactory {

    public static List<KeyModel> makeOctaves (int octavesNumber){
        int firstKey = 9;
        int lastKey = octavesNumber*12;
        KeyModel.Tone[] tones = KeyModel.Tone.values();
        KeyModel.Color[] colors = {
                KeyModel.Color.WHITE,
                KeyModel.Color.BLACK,
                KeyModel.Color.WHITE,
                KeyModel.Color.BLACK,
                KeyModel.Color.WHITE,
                KeyModel.Color.WHITE,
                KeyModel.Color.BLACK,
                KeyModel.Color.WHITE,
                KeyModel.Color.BLACK,
                KeyModel.Color.WHITE,
                KeyModel.Color.BLACK,
                KeyModel.Color.WHITE,
        };

        List<KeyModel> keyList = new ArrayList<>();

        for (int i = firstKey; i <= lastKey; i++){
            int whichKey = i % 12;
            int octave = i / 12;
            KeyModel key = new KeyModel(octave, colors[whichKey], tones[whichKey]);
            keyList.add(key);
        }

        return keyList;
    }

    public static KeyboardModel getGrandPiano(){
        List<KeyModel> list = makeOctaves(8);
        return new KeyboardModel(list, "Grand Piano");
    }

    public static KeyboardModel getSynthesizer(){
        List<KeyModel> list = makeOctaves(4);
        return new KeyboardModel(list, "Synthesizer");
    }
}
