package kobighor.com.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import kobighor.com.Interface.ItemClickListner;
import kobighor.com.R;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    // cardview ar jonno je item layout design kora hobe se gulo ke ai khan a find kora hobe

    public TextView textView_kobita_title;
    public ItemClickListner listner;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_kobita_title = itemView.findViewById(R.id.titleId);
    }

    public void setItemClickListner(ItemClickListner listner){
        this.listner=listner;
    }

    @Override
    public void onClick(View v) {

        listner.onClick(v,getAdapterPosition(),false);
    }
}
