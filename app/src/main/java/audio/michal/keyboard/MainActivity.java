package audio.michal.keyboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private KeyboardAdapter keyboardAdapter = new KeyboardAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rc = findViewById(R.id.keyboard_recycler_view);
        LinearLayoutManager ll = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rc.setLayoutManager(ll);
        rc.setAdapter(keyboardAdapter);
        KeyboardModel keyboardModel = KeyboardFactory.getGrandPiano();
        keyboardAdapter.setKeyModels(keyboardModel.getKeyModels());
    }

    public void openWebsite(View view) {
        String webAddress = getResources().getString(R.string.address);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(webAddress));
        startActivity(browserIntent);

    }

}
