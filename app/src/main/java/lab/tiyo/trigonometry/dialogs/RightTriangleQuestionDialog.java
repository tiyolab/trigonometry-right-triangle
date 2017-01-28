package lab.tiyo.trigonometry.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

import lab.tiyo.trigonometry.R;
import lab.tiyo.trigonometry.adapters.DescriptionDialogAdapter;
import lab.tiyo.trigonometry.adapters.QuestionDialogAdapter;
import lab.tiyo.trigonometry.helpers.ConstantHelper;
import lab.tiyo.trigonometry.listeners.ItemDescriptionDialogListener;
import lab.tiyo.trigonometry.models.ItemDescriptionDialog;

/**
 * Created by root on 01/01/17.
 */
public class RightTriangleQuestionDialog extends DialogFragment{
    private String dialogTitle = "";
    private ItemDescriptionDialogListener listener;

    /**
     * define view component
     */
    private View dialogLayout;
    private GridView itemsQuestionList;
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
        dialogLayout = inflater.inflate(R.layout.dialog_right_triangle_question, null);
        itemsQuestionList = (GridView)dialogLayout.findViewById(R.id.items_question_list);
        title = (TextView)dialogLayout.findViewById(R.id.dialog_title);

        /**
         * set dialog title
         */
        title.setText(this.dialogTitle);

        /**
         * describe ItemDescriptionDialog items
         */
        ArrayList<ItemDescriptionDialog> itemDescriptionDialogList = new ArrayList<>();

        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_A, "<A", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_B, "<B", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_C, "<C", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.SIN_A, "sin A", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.COS_A, "cos A", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.TAN_A, "tan A", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.SIN_B, "sin B", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.COS_B, "cos B", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.TAN_B, "tan B", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.SIN_C, "sin C", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.COS_C, "cos C", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.TAN_C, "tan C", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.AB_LENGTH, "AB", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.BC_LENGTH, "BC", null, null));
        itemDescriptionDialogList.add(new ItemDescriptionDialog(ConstantHelper.CA_LENGTH, "CA", null, null));

        /**
         * create DescriptionDialogAdapter
         */
        QuestionDialogAdapter adapter = new QuestionDialogAdapter(getActivity(), itemDescriptionDialogList);
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
        itemsQuestionList.setAdapter(adapter);

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
