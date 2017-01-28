package lab.tiyo.trigonometry.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import lab.tiyo.fraction.FractionDialog;
import lab.tiyo.fraction.listeners.FractionDialogListener;
import lab.tiyo.fraction.listeners.OnClickListener;
import lab.tiyo.fraction.models.TNumber;
import lab.tiyo.fraction.models.FractionView;
import lab.tiyo.trigonometry.R;
import lab.tiyo.trigonometry.helpers.AngleConverterHelper;
import lab.tiyo.trigonometry.helpers.NumberFormatHelper;
import lab.tiyo.trigonometry.helpers.TrigonometryHelper;


/**
 * A simple {@link Fragment} subclass.
 */
public class TriSegitigaSiku extends Fragment {
    String Tag = "TriSegitigaSiku";

    /**
     * flag
     */
    boolean angleAHasChanged = false, angleCHasChanged = false;

    /**
     * define view component
     */
    TextView angleALabel, angleBLabel, angleCLabel;
    EditText angleADeg, angleBDeg, angleCDeg;
    FractionView ABLength, BCLength, CALength;
    FractionView sinAVal, sinBVal, sinCVal;
    FractionView cosAVal, cosBVal, cosCVal;
    FractionView tanAVal, tanBVal, tanCVal;

    public TriSegitigaSiku() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tri_segitiga_siku, container, false);

        angleALabel = (TextView)view.findViewById(R.id.angle_a_label);
        angleBLabel = (TextView)view.findViewById(R.id.angle_b_label);
        angleCLabel = (TextView)view.findViewById(R.id.angle_c_label);

        angleADeg = (EditText)view.findViewById(R.id.angle_a_deg);
        angleBDeg = (EditText)view.findViewById(R.id.angle_b_deg);
        angleCDeg = (EditText)view.findViewById(R.id.angle_c_deg);

        ABLength = (FractionView)view.findViewById(R.id.ab_length);
        BCLength = (FractionView)view.findViewById(R.id.bc_length);
        CALength = (FractionView)view.findViewById(R.id.ca_length);

        sinAVal = (FractionView)view.findViewById(R.id.sin_a_val);
        sinBVal = (FractionView)view.findViewById(R.id.sin_b_val);
        sinCVal = (FractionView)view.findViewById(R.id.sin_c_val);

        cosAVal = (FractionView)view.findViewById(R.id.cos_a_val);
        cosBVal = (FractionView)view.findViewById(R.id.cos_b_val);
        cosCVal = (FractionView)view.findViewById(R.id.cos_c_val);

        tanAVal = (FractionView)view.findViewById(R.id.tan_a_val);
        tanBVal = (FractionView)view.findViewById(R.id.tan_b_val);
        tanCVal = (FractionView)view.findViewById(R.id.tan_c_val);

        /**
         * Angle B as siku siku
         */
        angleBDeg.setText(90 + "");

        sinBVal.setNumber(TrigonometryHelper.sinValue(90));
        cosBVal.setNumber(TrigonometryHelper.cosValue(90));
        tanBVal.setNumber(TrigonometryHelper.tanValue(90));

        /**
         * event handler definition
         */

        /**
         * angle A handler
         */
//        angleADeg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FractionDialog fdialog = new FractionDialog();
//                fdialog.setFractionDialogListener(new FractionDialogListener() {
//                    @Override
//                    public void onOk(TNumber tnumber) {
//                        if(tnumber.isIntegerNumber()){
//                            double angleADegVal = tnumber.getIntegerNumber();
//                            double angleCDegVal = 90 - tnumber.getIntegerNumber();
//
//                            /**
//                             * set angle to A and C
//                             */
//                            angleADeg.setText(angleADegVal + "");
//                            angleCDeg.setText(angleCDegVal + "");
//
//                            /**
//                             * set sin, cos and tan of A and C
//                             */
//                            sinAVal.setNumber(TrigonometryHelper.sinValue(angleADegVal));
//                            cosAVal.setNumber(TrigonometryHelper.cosValue(angleADegVal));
//                            tanAVal.setNumber(TrigonometryHelper.tanValue(angleADegVal));
//
//                            sinCVal.setNumber(TrigonometryHelper.sinValue(angleCDegVal));
//                            cosCVal.setNumber(TrigonometryHelper.cosValue(angleCDegVal));
//                            tanCVal.setNumber(TrigonometryHelper.tanValue(angleCDegVal));
//
//                            Log.i(Tag, "ab length = "  + ABLength.getNumber().getValue());
//                            if(ABLength.getNumber().getValue() != 0){
//                                double bc = ABLength.getNumber().getValue() * TrigonometryHelper.tanValue(angleADegVal).getValue();
//                                double ca = ABLength.getNumber().getValue() / TrigonometryHelper.cosValue(angleADegVal).getValue();
//                                BCLength.getNumber().setIntegerNumber(bc);
//                                CALength.getNumber().setIntegerNumber(ca);
//
//                            }else if(BCLength.getNumber().getValue() != 0){
//                                double ab = BCLength.getNumber().getValue() / TrigonometryHelper.tanValue(angleADegVal).getValue();
//                                double ca = BCLength.getNumber().getValue() / TrigonometryHelper.sinValue(angleADegVal).getValue();
//                                ABLength.getNumber().setIntegerNumber(ab);
//                                CALength.getNumber().setIntegerNumber(ca);
//                            }else if(CALength.getNumber().getValue() != 0){
//                                double ab = CALength.getNumber().getValue() * TrigonometryHelper.cosValue(angleADegVal).getValue();
//                                double bc = CALength.getNumber().getValue() * TrigonometryHelper.sinValue(angleADegVal).getValue();
//                                ABLength.getNumber().setIntegerNumber(ab);
//                                BCLength.getNumber().setIntegerNumber(bc);
//                            }
//
//                        }
//                    }
//                });
//                fdialog.show(getChildFragmentManager(), "angleADegDialog");
//            }
//        });
//
//        /**
//         * angle C handler
//         */
//        angleCDeg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FractionDialog fdialog = new FractionDialog();
//                fdialog.setFractionDialogListener(new FractionDialogListener() {
//                    @Override
//                    public void onOk(TNumber tnumber) {
//                        if(tnumber.isIntegerNumber()){
//                            double angleCDegVal = tnumber.getIntegerNumber();
//                            double angleADegVal = 90 - tnumber.getIntegerNumber();
//
//                            /**
//                             * set angle to A and C
//                             */
//                            angleADeg.setText(angleADegVal + "");
//                            angleCDeg.setText(angleCDegVal + "");
//
//                            /**
//                             * set sin, cos and tan of A and C
//                             */
//                            sinAVal.setNumber(TrigonometryHelper.sinValue(angleADegVal));
//                            cosAVal.setNumber(TrigonometryHelper.cosValue(angleADegVal));
//                            tanAVal.setNumber(TrigonometryHelper.tanValue(angleADegVal));
//
//                            sinCVal.setNumber(TrigonometryHelper.sinValue(angleCDegVal));
//                            cosCVal.setNumber(TrigonometryHelper.cosValue(angleCDegVal));
//                            tanCVal.setNumber(TrigonometryHelper.tanValue(angleCDegVal));
//
//                            if(ABLength.getNumber().getValue() != 0){
//                                double bc = ABLength.getNumber().getValue() / TrigonometryHelper.tanValue(angleCDegVal).getValue();
//                                double ca = ABLength.getNumber().getValue() / TrigonometryHelper.sinValue(angleCDegVal).getValue();
//                                BCLength.getNumber().setIntegerNumber(bc);
//                                CALength.getNumber().setIntegerNumber(ca);
//
//                            }else if(BCLength.getNumber().getValue() != 0){
//                                double ab = BCLength.getNumber().getValue() * TrigonometryHelper.tanValue(angleCDegVal).getValue();
//                                double ca = BCLength.getNumber().getValue() / TrigonometryHelper.cosValue(angleCDegVal).getValue();
//                                ABLength.getNumber().setIntegerNumber(ab);
//                                CALength.getNumber().setIntegerNumber(ca);
//                            }else if(CALength.getNumber().getValue() != 0){
//                                double ab = CALength.getNumber().getValue() * TrigonometryHelper.sinValue(angleCDegVal).getValue();
//                                double bc = CALength.getNumber().getValue() * TrigonometryHelper.cosValue(angleCDegVal).getValue();
//                                ABLength.getNumber().setIntegerNumber(ab);
//                                BCLength.getNumber().setIntegerNumber(bc);
//                            }
//
//                        }
//                    }
//                });
//                fdialog.show(getChildFragmentManager(), "angleCDegDialog");
//            }
//        });
//
//        /**
//         * handle AB length (a)
//         */
//        ABLength.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FractionDialog fdialog = new FractionDialog();
//                fdialog.setFractionDialogListener(new FractionDialogListener() {
//                    @Override
//                    public void onOk(TNumber tnumber) {
//                        ABLength.setNumber(tnumber);
//                        double ab = ABLength.getNumber().getValue();
//
//                        if(!angleADeg.getText().toString().isEmpty()){
//                            double bc = ab * TrigonometryHelper.tanValue(Double.parseDouble(angleADeg.getText().toString())).getValue();
//                            double ca = ab / TrigonometryHelper.cosValue(Double.parseDouble(angleADeg.getText().toString())).getValue();
//                            BCLength.getNumber().setIntegerNumber(bc);
//                            CALength.getNumber().setIntegerNumber(ca);
//                        }else if(!angleCDeg.getText().toString().isEmpty()){
//                            double bc = ab / TrigonometryHelper.tanValue(Double.parseDouble(angleCDeg.getText().toString())).getValue();
//                            double ca = ab / TrigonometryHelper.sinValue(Double.parseDouble(angleCDeg.getText().toString())).getValue();
//                            BCLength.getNumber().setIntegerNumber(bc);
//                            CALength.getNumber().setIntegerNumber(ca);
//                        }else{
//                            /**
//                             * if cos or tan A known
//                             */
//                            if(cosAVal.getNumber().getValue() != 0 && cosAVal.getNumber().isFractionNumber()){
//                                double tmpa = cosAVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpc = cosAVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double ca = tmpc * ab / tmpa;
//                                double bc = Math.sqrt(Math.pow(ca,2) - Math.pow(ab, 2));
//
//                                BCLength.getNumber().setIntegerNumber(bc);
//                                CALength.getNumber().setIntegerNumber(ca);
//
//                                sinAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                sinAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                tanAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                tanAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ab);
//                            }else if(tanAVal.getNumber().getValue() != 0 && tanAVal.getNumber().isFractionNumber()){
//                                double tmpb = tanAVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpa = tanAVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double bc = tmpb * ab / tmpa;
//                                double ca = Math.sqrt(Math.pow(ab,2) + Math.pow(bc, 2));
//
//                                sinAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                sinAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                cosAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                cosAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//                            }
//
//
//                            /**
//                             * if sin or tan C known
//                             */
//                            if(sinCVal.getNumber().getValue() != 0 && sinCVal.getNumber().isFractionNumber()){
//                                double tmpa = sinCVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpc = sinCVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double ca = tmpc * ab / tmpa;
//                                double bc = Math.sqrt(Math.pow(ca,2) - Math.pow(ab, 2));
//
//                                BCLength.getNumber().setIntegerNumber(bc);
//                                CALength.getNumber().setIntegerNumber(ca);
//
//                                cosCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                cosCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                tanCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                tanCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(bc);
//                            }else if(tanCVal.getNumber().getValue() != 0 && tanCVal.getNumber().isFractionNumber()){
//                                double tmpa = tanCVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpb = tanCVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double bc = tmpb * ab / tmpa;
//                                double ca = Math.sqrt(Math.pow(ab,2) + Math.pow(bc, 2));
//
//                                cosCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                cosCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                sinCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                sinCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//                            }
//                        }
//                    }
//                });
//                fdialog.show(getChildFragmentManager(), "ABLengthDialog");
//            }
//        });
//
//
//        /**
//         * handle BC length (b)
//         */
//        BCLength.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FractionDialog fdialog = new FractionDialog();
//                fdialog.setFractionDialogListener(new FractionDialogListener() {
//                    @Override
//                    public void onOk(TNumber tnumber) {
//                        BCLength.setNumber(tnumber);
//                        double bc = BCLength.getNumber().getValue();
//
//                        if(!angleADeg.getText().toString().isEmpty()){
//                            double ab = bc / TrigonometryHelper.tanValue(Double.parseDouble(angleADeg.getText().toString())).getValue();
//                            double ca = bc / TrigonometryHelper.sinValue(Double.parseDouble(angleADeg.getText().toString())).getValue();
//                            ABLength.getNumber().setIntegerNumber(ab);
//                            CALength.getNumber().setIntegerNumber(ca);
//                        }else if(!angleCDeg.getText().toString().isEmpty()){
//                            double ab = bc * TrigonometryHelper.tanValue(Double.parseDouble(angleCDeg.getText().toString())).getValue();
//                            double ca = bc / TrigonometryHelper.cosValue(Double.parseDouble(angleCDeg.getText().toString())).getValue();
//                            ABLength.getNumber().setIntegerNumber(ab);
//                            CALength.getNumber().setIntegerNumber(ca);
//                        }else{
//                            /**
//                             * if sin or tan A known
//                             */
//                            if(sinAVal.getNumber().getValue() != 0 && sinAVal.getNumber().isFractionNumber()){
//                                double tmpb = cosAVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpc = cosAVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double ca = tmpc * bc / tmpb;
//                                double ab = Math.sqrt(Math.pow(ca,2) - Math.pow(bc, 2));
//
//                                ABLength.getNumber().setIntegerNumber(ab);
//                                CALength.getNumber().setIntegerNumber(ca);
//
//                                cosAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                cosAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                tanAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                tanAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ab);
//                            }else if(tanAVal.getNumber().getValue() != 0 && tanAVal.getNumber().isFractionNumber()){
//                                double tmpb = tanAVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpa = tanAVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double ab = tmpa * bc / tmpb;
//                                double ca = Math.sqrt(Math.pow(ab,2) + Math.pow(bc, 2));
//
//                                sinAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                sinAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                cosAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                cosAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//                            }
//
//
//                            /**
//                             * if cos or tan C known
//                             */
//                            if(cosCVal.getNumber().getValue() != 0 && cosCVal.getNumber().isFractionNumber()){
//                                double tmpb = cosCVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpc = cosCVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double ca = tmpc * bc / tmpb;
//                                double ab = Math.sqrt(Math.pow(ca,2) - Math.pow(bc, 2));
//
//                                ABLength.getNumber().setIntegerNumber(ab);
//                                CALength.getNumber().setIntegerNumber(ca);
//
//                                sinCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                sinCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                tanCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                tanCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(bc);
//                            }else if(tanCVal.getNumber().getValue() != 0 && tanCVal.getNumber().isFractionNumber()){
//                                double tmpa = tanCVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpb = tanCVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double ab = tmpa * bc / tmpb;
//                                double ca = Math.sqrt(Math.pow(ab,2) + Math.pow(bc, 2));
//
//                                cosCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                cosCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                sinCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                sinCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//                            }
//                        }
//                    }
//                });
//                fdialog.show(getChildFragmentManager(), "BCLengthDialog");
//            }
//        });
//
//        /**
//         * handle CA length (bc)
//         */
//        CALength.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FractionDialog fdialog = new FractionDialog();
//                fdialog.setFractionDialogListener(new FractionDialogListener() {
//                    @Override
//                    public void onOk(TNumber tnumber) {
//                        CALength.setNumber(tnumber);
//                        double ca = CALength.getNumber().getValue();
//
//                        if(!angleADeg.getText().toString().isEmpty()){
//                            double ab = ca * TrigonometryHelper.cosValue(Double.parseDouble(angleADeg.getText().toString())).getValue();
//                            double bc = ca * TrigonometryHelper.sinValue(Double.parseDouble(angleADeg.getText().toString())).getValue();
//                            ABLength.getNumber().setIntegerNumber(ab);
//                            BCLength.getNumber().setIntegerNumber(bc);
//                        }else if(!angleCDeg.getText().toString().isEmpty()){
//                            double ab = ca * TrigonometryHelper.sinValue(Double.parseDouble(angleCDeg.getText().toString())).getValue();
//                            double bc = ca * TrigonometryHelper.cosValue(Double.parseDouble(angleCDeg.getText().toString())).getValue();
//                            ABLength.getNumber().setIntegerNumber(ab);
//                            BCLength.getNumber().setIntegerNumber(bc);
//                        }else{
//                            /**
//                             * if sin or cos A known
//                             */
//                            if(sinAVal.getNumber().getValue() != 0 && sinAVal.getNumber().isFractionNumber()){
//                                double tmpb = cosAVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpc = cosAVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double bc = tmpb * ca / tmpc;
//                                double ab = Math.sqrt(Math.pow(ca,2) - Math.pow(bc, 2));
//
//                                ABLength.getNumber().setIntegerNumber(ab);
//                                BCLength.getNumber().setIntegerNumber(bc);
//
//                                cosAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                cosAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                tanAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                tanAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ab);
//                            }else if(tanAVal.getNumber().getValue() != 0 && tanAVal.getNumber().isFractionNumber()){
//                                double tmpa = cosAVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpc = cosAVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double ab = tmpa * ca / tmpc;
//                                double bc = Math.sqrt(Math.pow(ca,2) - Math.pow(ab, 2));
//
//                                BCLength.getNumber().setIntegerNumber(bc);
//                                ABLength.getNumber().setIntegerNumber(ab);
//
//                                sinAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                sinAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                tanAVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                tanAVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ab);
//                            }
//
//
//                            /**
//                             * if sin or cos C known
//                             */
//                            if(cosCVal.getNumber().getValue() != 0 && cosCVal.getNumber().isFractionNumber()){
//                                double tmpb = cosCVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpc = cosCVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double bc = tmpb * ca / tmpc;
//                                double ab = Math.sqrt(Math.pow(ca,2) - Math.pow(bc, 2));
//
//                                ABLength.getNumber().setIntegerNumber(ab);
//                                BCLength.getNumber().setIntegerNumber(bc);
//
//                                sinCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                sinCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                tanCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                tanCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(bc);
//                            }else if(sinCVal.getNumber().getValue() != 0 && sinCVal.getNumber().isFractionNumber()){
//                                double tmpa = sinCVal.getNumber().getFraction().getFirstFraction().getDecimalValue();
//                                double tmpc = sinCVal.getNumber().getFraction().getSecondFraction().getDecimalValue();
//
//                                double ab = tmpa * ca / tmpc;
//                                double bc = Math.sqrt(Math.pow(ca,2) - Math.pow(ab, 2));
//
//                                BCLength.getNumber().setIntegerNumber(bc);
//                                ABLength.getNumber().setIntegerNumber(ab);
//
//                                cosCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(bc);
//                                cosCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(ca);
//
//                                tanCVal.getNumber().getFraction().getFirstFraction().setIntegerValue(ab);
//                                tanCVal.getNumber().getFraction().getSecondFraction().setIntegerValue(bc);
//                            }
//                        }
//                    }
//                });
//                fdialog.show(getChildFragmentManager(), "ABLengthDialog");
//            }
//        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_reset, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu_reset){
            Toast.makeText(getActivity(), "reset", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}
