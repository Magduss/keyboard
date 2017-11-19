package audio.michal.keyboard;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class KeyboardLayoutGenerator{
    final static int KEYCOUNT = 12;

    static void fillKeyboard (LinearLayout ll){
        LayoutInflater li = LayoutInflater.from(ll.getContext());
        for (int i=0; i<KEYCOUNT; i++){
            View v = li.inflate(R.layout.key_layout, ll);
            //ll.addView(v);
        }
    }
}
