package audio.michal.keyboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by magda on 29.01.18.
 */

public class KeyboardModel {

    private List<KeyModel> list = new ArrayList<>();
    private String name;

    public KeyboardModel(List<KeyModel> list, String name) {
        this.list.addAll(list);
        this.name = name;
    }

    public List<KeyModel> getList() {
        return Collections.unmodifiableList(list);
    }

    public String getName() {
        return name;
    }
}
