package lab.tiyo.trigonometry.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import lab.tiyo.fraction.models.FractionView;
import lab.tiyo.trigonometry.R;
import lab.tiyo.trigonometry.models.ItemDescriptionDialog;

/**
 * Created by root on 01/01/17.
 */
public class QuestionItemAdapter extends BaseAdapter {
    private ArrayList<ItemDescriptionDialog> listItems = new ArrayList<>();
    private Activity activity;
    private LayoutInflater layoutInflater;

    public QuestionItemAdapter(Activity activity, ArrayList<ItemDescriptionDialog> listItems){
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
    public View getView(int index, View convertView, ViewGroup viewGroup) {
        View itemView = convertView;

        if(itemView == null){
            itemView = layoutInflater.inflate(R.layout.item_question, null);

            ViewHolder holder = new ViewHolder();
            holder.itemNumber = (TextView)itemView.findViewById(R.id.item_number);
            holder.itemName = (TextView)itemView.findViewById(R.id.item_name);

            itemView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder)itemView.getTag();
        holder.itemNumber.setText((index + 1) + ".");
        holder.itemName.setText(listItems.get(index).getTitle());

        return itemView;
    }

    private static class ViewHolder{
        public TextView itemNumber, itemName;
    }
}
