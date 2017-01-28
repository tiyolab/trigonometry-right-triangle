package lab.tiyo.trigonometry.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import lab.tiyo.trigonometry.R;
import lab.tiyo.trigonometry.dialogs.InputRightTriangleDescriptionItemDialog;
import lab.tiyo.trigonometry.listeners.ItemDescriptionDialogListener;
import lab.tiyo.trigonometry.models.ItemDescriptionDialog;

/**
 * Created by root on 31/12/16.
 */
public class DescriptionDialogAdapter extends BaseAdapter{
    private ArrayList<ItemDescriptionDialog> listItems = new ArrayList<>();
    private Activity activity;
    private LayoutInflater layoutInflater;
    private ItemDescriptionDialogListener listener;

    public DescriptionDialogAdapter(Activity activity, ArrayList<ItemDescriptionDialog> listItems){
        this.activity = activity;
        this.listItems = listItems;

        layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int index, View convertView, ViewGroup viewGroup) {
        View itemView = convertView;
        if(itemView == null){
            itemView = layoutInflater.inflate(R.layout.item_description_dialog, null);

            ViewHolder holder = new ViewHolder();
            holder.title = (TextView)itemView.findViewById(R.id.title);
            holder.background = (ImageView)itemView.findViewById(R.id.background);

            itemView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder)itemView.getTag();
        holder.title.setText(listItems.get(index).getTitle());
        if(listItems.get(index).isBackgroundExists()){
            holder.background.setImageBitmap(listItems.get(index).getBackground());
        }

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final InputRightTriangleDescriptionItemDialog dialog = new InputRightTriangleDescriptionItemDialog();
                dialog.setItemDescriptionDialog(listItems.get(index));
                dialog.setPositiveButtonListener(new ItemDescriptionDialogListener() {
                    @Override
                    public void onClick(ItemDescriptionDialog itemDescription) {
                        dialog.dismiss();
                        if (listener != null) {
                            listener.onClick(itemDescription);
                        }
                    }
                });
                dialog.show(activity.getFragmentManager(), "InputRightTriangleDescriptionItemDialog");
            }
        });
        return itemView;
    }

    public void setOnItemChoosed(ItemDescriptionDialogListener listener){
        this.listener = listener;
    }

    private static class ViewHolder{
        public TextView title;
        public ImageView background;
    }
}
