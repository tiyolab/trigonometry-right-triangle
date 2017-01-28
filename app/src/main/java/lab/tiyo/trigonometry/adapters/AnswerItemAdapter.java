package lab.tiyo.trigonometry.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import lab.tiyo.fraction.models.FractionView;
import lab.tiyo.trigonometry.R;
import lab.tiyo.trigonometry.helpers.ConstantHelper;
import lab.tiyo.trigonometry.models.ItemAnswer;
import lab.tiyo.trigonometry.models.ItemDescriptionDialog;

/**
 * Created by root on 01/01/17.
 */
public class AnswerItemAdapter extends BaseAdapter {
    private ArrayList<ItemAnswer> listItems = new ArrayList<>();
    private Activity activity;
    private LayoutInflater layoutInflater;

    public AnswerItemAdapter(Activity activity, ArrayList<ItemAnswer> listItems){
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
            itemView = layoutInflater.inflate(R.layout.item_answer, null);

            ViewHolder holder = new ViewHolder();
            holder.itemNumber = (TextView)itemView.findViewById(R.id.item_number);
            holder.itemAnswer = (LinearLayout)itemView.findViewById(R.id.item_answer);

            itemView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder)itemView.getTag();
        holder.itemNumber.setText((index + 1) + ".");

        if (listItems.get(index).getLeftOperand().getInputType().equals(ItemDescriptionDialog.INPUT_CONSTANTA)) {
            TextView leftOperandView = new TextView(activity);
            leftOperandView.setText(listItems.get(index).getLeftOperand().getTitle());

            holder.itemAnswer.addView(leftOperandView);
        } else {
            FractionView leftOperandView = new FractionView(activity);
            leftOperandView.setNumber(listItems.get(index).getLeftOperand().getTNumber());

            holder.itemAnswer.addView(leftOperandView);
        }

        TextView equalView = new TextView(activity);
        equalView.setText("=");
        holder.itemAnswer.addView(equalView);

        for(ItemDescriptionDialog i : listItems.get(index).getRightOperand()){
            if (i.getInputType().equals(ItemDescriptionDialog.INPUT_CONSTANTA)) {
                TextView rightOperandView = new TextView(activity);
                rightOperandView.setText(i.getTitle());

                holder.itemAnswer.addView(rightOperandView);
            } else {
                FractionView rightOperandView = new FractionView(activity);
                rightOperandView.setNumber(i.getTNumber());

                holder.itemAnswer.addView(rightOperandView);
            }
        }


        return itemView;
    }

    private static class ViewHolder{
        public TextView itemNumber;
        public LinearLayout itemAnswer;
    }
}
