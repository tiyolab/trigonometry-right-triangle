package lab.tiyo.trigonometry.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import lab.tiyo.fraction.models.FractionInput;
import lab.tiyo.fraction.models.FractionNumber;
import lab.tiyo.fraction.models.TNumber;
import lab.tiyo.trigonometry.R;
import lab.tiyo.trigonometry.helpers.ConstantHelper;
import lab.tiyo.trigonometry.listeners.ItemDescriptionDialogListener;
import lab.tiyo.trigonometry.models.ItemDescriptionDialog;

/**
 * Created by root on 31/12/16.
 */
public class InputRightTriangleDescriptionItemDialog extends DialogFragment{
    private ItemDescriptionDialog itemDescriptionDialog;
    private ItemDescriptionDialogListener listener;

    /**
     * describe view
     */
    private View dialogLayout;
    private TextView message, numberTypeMessage;
    private EditText inputSize;
    private RadioGroup inputAngleGroup;
    private RadioButton angleA, angleB, angleC;
    private FractionInput inputFraction;
    private Button btnOk, btnCancel;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        /**
         * create layout inflanter
         */
        LayoutInflater inflater = getActivity().getLayoutInflater();

        /**
         * get view
         */
        dialogLayout = inflater.inflate(R.layout.dialog_input_right_triangle_description_item, null);
        message = (TextView)dialogLayout.findViewById(R.id.message);
        numberTypeMessage = (TextView)dialogLayout.findViewById(R.id.number_type_message);
        inputSize = (EditText)dialogLayout.findViewById(R.id.input_size);
        inputAngleGroup = (RadioGroup)dialogLayout.findViewById(R.id.input_angle);
        angleA = (RadioButton)dialogLayout.findViewById(R.id.radio_a);
        angleB = (RadioButton)dialogLayout.findViewById(R.id.radio_b);
        angleC = (RadioButton)dialogLayout.findViewById(R.id.radio_c);
        inputFraction = (FractionInput)dialogLayout.findViewById(R.id.input_fraction);
        btnOk = (Button)dialogLayout.findViewById(R.id.btn_ok);
        btnCancel = (Button)dialogLayout.findViewById(R.id.btn_cancel);

        this.hide();

        if(this.itemDescriptionDialog.getInputType().equals(ConstantHelper.INPUT_ANGLE_TYPE)){
            message.setVisibility(View.VISIBLE);
            inputSize.setVisibility(View.VISIBLE);

            message.setText("Input angle size in degree ?");
        }else if(this.itemDescriptionDialog.getInputType().equals(ConstantHelper.INPUT_LENGTH_TYPE)){
            numberTypeMessage.setVisibility(View.VISIBLE);
            inputFraction.setVisibility(View.VISIBLE);

            numberTypeMessage.setText("Input size and choose which type number you want.");
        }else if(this.itemDescriptionDialog.getInputType().equals(ConstantHelper.INPUT_TRIGO_TYPE)){
            message.setVisibility(View.VISIBLE);
            inputAngleGroup.setVisibility(View.VISIBLE);
            numberTypeMessage.setVisibility(View.VISIBLE);
            inputFraction.setVisibility(View.VISIBLE);

            message.setText("Choose which angle ?");
            numberTypeMessage.setText("Input size and choose which type number you want.");
        }

        /**
         * when ok button clicked
         */
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(itemDescriptionDialog.getInputType().equals(ConstantHelper.INPUT_LENGTH_TYPE)){
                    itemDescriptionDialog.setTNumber(inputFraction.getValue());
                }else if(itemDescriptionDialog.getInputType().equals(ConstantHelper.INPUT_ANGLE_TYPE)){
                    TNumber tNumber = new TNumber();
                    tNumber.setType(TNumber.INTEGER_NUMBER);

                    FractionNumber f = new FractionNumber();
                    f.setNumberType(FractionNumber.INTEGER_TYPE);
                    f.setIntegerValue(Double.parseDouble(inputSize.getText().toString()));
                    f.setRootValue(1);

                    tNumber.setIntegerNumber(f);
                    itemDescriptionDialog.setTNumber(tNumber);
                }

                if(listener != null){
                    listener.onClick(itemDescriptionDialog);
                }
            }
        });

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

    public void setPositiveButtonListener(ItemDescriptionDialogListener listener){
        this.listener = listener;
    }

    public void setItemDescriptionDialog(ItemDescriptionDialog itemDescriptionDialog) {
        this.itemDescriptionDialog = itemDescriptionDialog;
    }

    private void hide(){
        message.setVisibility(View.GONE);
        numberTypeMessage.setVisibility(View.GONE);
        inputSize.setVisibility(View.GONE);
        inputAngleGroup.setVisibility(View.GONE);
        inputFraction.setVisibility(View.GONE);
    }
}
