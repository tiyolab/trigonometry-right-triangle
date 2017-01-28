package lab.tiyo.trigonometry.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

import lab.tiyo.trigonometry.R;
import lab.tiyo.trigonometry.adapters.DescriptionDialogAdapter;
import lab.tiyo.trigonometry.helpers.ConstantHelper;
import lab.tiyo.trigonometry.listeners.ItemDescriptionDialogListener;
import lab.tiyo.trigonometry.models.ItemDescriptionDialog;

/**
 * Created by root on 31/12/16.
 */
public class RightTriangleDescriptionDialog extends DialogFragment{
    private String dialogTitle = "";
    private ItemDescriptionDialogListener listener;

    /**
     * define view component
     */
    private View dialogLayout;
    private GridView itemsDescriptionList;
    private TextView title;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        /**
         * create layout inflanter
         */
        LayoutInflater inflater = getActivity().getLayoutInflater();

        /**
         * get view
         */
        dialogLayout = inflater.inflate(R.layout.dialog_right_triangle_description, null);
        itemsDescriptionList = (GridView)dialogLayout.findViewById(R.id.items_description_list);
        title = (TextView)dialogLayout.findViewById(R.id.dialog_title);

        /**
         * set dialog title
         */
        title.setText(this.dialogTitle);

        /**
         * describe ItemDescriptionDialog items
         */
        ArrayList<ItemDescriptionDialog> itemDescriptionDialogList = new ArrayList<>();

        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_A, "<A", null, ConstantHelper.INPUT_ANGLE_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_B, "<B", null, ConstantHelper.INPUT_ANGLE_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_C, "<C", null, ConstantHelper.INPUT_ANGLE_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.SIN_A, "sin A", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.COS_A, "cos A", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.TAN_A, "tan A", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.SIN_B, "sin B", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.COS_B, "cos B", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.TAN_B, "tan B", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.SIN_C, "sin C", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.COS_C, "cos C", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.TAN_C, "tan C", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.AB_LENGTH, "AB", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.BC_LENGTH, "BC", null, ConstantHelper.INPUT_LENGTH_TYPE));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.CA_LENGTH, "CD", null, ConstantHelper.INPUT_LENGTH_TYPE));

        /**
         * create DescriptionDialogAdapter
         */
        DescriptionDialogAdapter adapter = new DescriptionDialogAdapter(getActivity(), itemDescriptionDialogList);
        adapter.setOnItemChoosed(new ItemDescriptionDialogListener() {
            @Override
            public void onClick(ItemDescriptionDialog itemDescription) {
                if(listener != null){
                    listener.onClick(itemDescription);
                }
            }
        });

        /**
         * set adapter to itemsDescriptionList gridView
         */
        itemsDescriptionList.setAdapter(adapter);

        /**
         * create dialog
         */
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());

        /**
         * set layout view to dialog
         */
        dialog.setView(dialogLayout);

        return dialog.create();

    }

    public void setTitle(String title){
        this.dialogTitle = title;
    }

    public void setOnItemChoosed(ItemDescriptionDialogListener listener){
        this.listener = listener;
    }
}
