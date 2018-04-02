package audio.michal.keyboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by magda on 29.01.18.
 */

public class KeyboardModel {

    private List<KeyModel> keyModels = new ArrayList<>();
    private String name;

    public KeyboardModel(List<KeyModel> keyModels, String name) {
        this.keyModels.addAll(keyModels);
        this.name = name;
    }

    public List<KeyModel> getKeyModels() {
        return Collections.unmodifiableList(keyModels);
    }

    public String getName() {
        return name;
    }
}
