package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onlineclothingshoppingapp.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import model.Items;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>{
    Context mContext;
    List<Items>itemsList;
    public ItemsAdapter(Context mContext, List<Items> itemsList) {
        this.mContext = mContext;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item,viewGroup,false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder itemsViewHolder, int i) {
        Items items = itemsList.get(i);
        itemsViewHolder.itemImg.setImageResource(items.getimageId());
        itemsViewHolder.itemName.setText(items.getItemName());
        itemsViewHolder.itemPrice.setText(items.getItemPrice());
//        itemsViewHolder.itemDescription.setText(items.getItemDescription());

        
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ItemsViewHolder extends RecyclerView.ViewHolder {
        CircleImageView itemImg;
        TextView itemName, itemPrice;
        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImg = itemView.findViewById(R.id.itemImg);
            itemName = itemView.findViewById(R.id.itemName);
            itemPrice = itemView.findViewById(R.id.itemPrice);
//            itemDescription = itemView.findViewById(R.id.itemDescription);
        }
    }
}
