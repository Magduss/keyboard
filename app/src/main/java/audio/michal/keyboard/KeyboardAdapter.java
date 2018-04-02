package audio.michal.keyboard;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class KeyboardAdapter extends RecyclerView.Adapter<KeyboardAdapter.KeyViewHolder> {

    private List<KeyModel> keyModels = new ArrayList<>();

    static class KeyViewHolder extends RecyclerView.ViewHolder {

        private Button button;

        public KeyViewHolder(Button itemView) {
            super(itemView);
            button = itemView;
        }

        void bind(KeyModel keyModel){
            switch (keyModel.color) {
                case BLACK:{
                    button.setBackgroundResource(R.drawable.key_black_color);
                    button.setTextColor(Color.WHITE);
                    break;
                }
                case WHITE:{
                    //int color = button.getContext().getColor(android.R.color.white);
                    button.setBackgroundResource(R.drawable.key_white_color);
                    button.setTextColor(Color.BLACK);
                    break;
                }
            }
            String label = button.getContext().getString(R.string.key_label, keyModel.tone.getDisplayName(), keyModel.octave);
            button.setText(label);
        }
    }

    @Override
    public KeyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        Button view = (Button) li.inflate(R.layout.key_layout, parent, false);
        return new KeyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KeyViewHolder holder, int position) {
        holder.bind(keyModels.get(position));
    }

    @Override
    public int getItemCount() {
        return keyModels.size();
    }

    public void setKeyModels(List<KeyModel> list) {
        this.keyModels = list;
        notifyDataSetChanged();
    }
}
