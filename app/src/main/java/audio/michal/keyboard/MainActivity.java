package audio.michal.keyboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout ll = (LinearLayout) findViewById(R.id.keboard_linear_layout);
        /*
        KeyboardAdapter ka = new KeyboardAdapter();
        lv.setAdapter(ka);
        */
        KeyboardLayoutGenerator.fillKeyboard(ll);
        List<KeyModel> list = new ArrayList<>();
        for (int i=0; i<2; i++){
            // for (KeyModel.Tone t: KeyModel.Tone.values()){
            //     KeyModel key = new KeyModel(i,)
            // }
        }
    }

    public void openWebsite (View view){
        String webAddress = "@string/address";
        Intent intent = new Intent (Intent.ACTION_OPEN_DOCUMENT);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, webAddress);
        startActivity(intent);

    }

}
