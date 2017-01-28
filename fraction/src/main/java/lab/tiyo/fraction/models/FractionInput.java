package lab.tiyo.fraction.models;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import lab.tiyo.fraction.R;

/**
 * Created by root on 31/12/16.
 */
public class FractionInput extends RelativeLayout{
    String Tag = "FractionDialog";
    boolean isRootFractionFocused = false;
    boolean isIntegerRootFocused = false;

    /**
     * number type of each fraction (1st fraction and 2nd fraction)
     * 1 = xxx
     *      ____
     * 2 = /xxx
     *         ____
     * 3 = xxx/xxx
     */
    private int numberTypeOfInteger = 1;
    private int numberTypeOfFirstFraction = 1;
    private int numberTypeOfSecondFraction = 1;
    /**
     * flag that determina which current fraction item is active
     * 0 = no one
     * 1 = firstFraction
     * 2 = secondFraction
     */
    private int fractionFlag = 0;

    /**
     * define view component
     */
    private View rootView;
    private EditText firstFractionInteger;
    private EditText firstFractionRoot;
    private EditText secondFractionInteger;
    private EditText secondFractionRoot;
    private FrameLayout firstFractionContainer;
    private FrameLayout secondFractionContainer;
    private FrameLayout integerRootContainer;
    private Button numberType1;
    private Button numberType2;
    private Button numberType3;
    private Button integerNumberType1;
    private Button integerNumberType2;
    private Button integerNumberType3;
    private RadioGroup numberTypeGroup;
    private RadioButton integersType, fractionsType;
    private RelativeLayout integersContainer;
    private RelativeLayout fractionsContainer;
    private EditText integerValue;
    private EditText integerRootValue;

    public FractionInput(Context context) {
        super(context);
        init(context);
    }

    public FractionInput(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        rootView = inflate(context, R.layout.fractoin_input, this);

        /**
         * get view
         */
        integerRootContainer = (FrameLayout)rootView.findViewById(R.id.integer_root_container);
        integerValue = (EditText)rootView.findViewById(R.id.integer_value);
        integerRootValue = (EditText)rootView.findViewById(R.id.integer_root_value);

        firstFractionContainer = (FrameLayout)rootView.findViewById(R.id.first_fraction_container);
        firstFractionInteger = (EditText)rootView.findViewById(R.id.first_fraction_integer);
        firstFractionRoot = (EditText)rootView.findViewById(R.id.first_fraction_root);

        secondFractionContainer = (FrameLayout)rootView.findViewById(R.id.second_fraction_container);
        secondFractionInteger = (EditText)rootView.findViewById(R.id.second_fraction_integer);
        secondFractionRoot = (EditText)rootView.findViewById(R.id.second_fraction_root);

        numberType1 = (Button)rootView.findViewById(R.id.numberType1);
        numberType2 = (Button)rootView.findViewById(R.id.numberType2);
        numberType3 = (Button)rootView.findViewById(R.id.numberType3);
        integerNumberType1 = (Button)rootView.findViewById(R.id.integer_number_type1);
        integerNumberType2 = (Button)rootView.findViewById(R.id.integer_number_type2);
        integerNumberType3 = (Button)rootView.findViewById(R.id.integer_number_type3);

        numberTypeGroup = (RadioGroup)rootView.findViewById(R.id.number_type_group);
        integersType = (RadioButton)rootView.findViewById(R.id.integers_type);
        fractionsType = (RadioButton)rootView.findViewById(R.id.fractions_type);
        integersContainer = (RelativeLayout)rootView.findViewById(R.id.integers_container);
        fractionsContainer = (RelativeLayout)rootView.findViewById(R.id.fractions_container);


        /**
         * radio button handler
         */
        integersType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    integersContainer.setVisibility(View.VISIBLE);
                    fractionsContainer.setVisibility(View.GONE);
                }
            }
        });

        fractionsType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    integersContainer.setVisibility(View.GONE);
                    fractionsContainer.setVisibility(View.VISIBLE);
                }
            }
        });

        /**
         * set flagFraction
         */
        integerValue.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean isFocus) {
                if (isFocus) {
                    isIntegerRootFocused = false;
                    constructIntegerView();
                }
            }
        });

        integerRootValue.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean isFocus) {
                if (isFocus) {
                    isIntegerRootFocused = true;
                    constructIntegerView();
                }
            }
        });

        firstFractionInteger.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean isFocus) {
                if(isFocus){
                    isRootFractionFocused = false;
                    setfractionFocus(1);
                }
            }
        });

        firstFractionRoot.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean isFocus) {
                if(isFocus){
                    isRootFractionFocused = true;
                    setfractionFocus(1);
                }
            }
        });

        secondFractionInteger.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean isFocus) {
                if (isFocus) {
                    isRootFractionFocused = false;
                    setfractionFocus(2);
                }
            }
        });

        secondFractionRoot.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean isFocus) {
                if (isFocus) {
                    isRootFractionFocused = true;
                    setfractionFocus(2);
                }
            }
        });

        /**
         * set fraction type
         */
        numberType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constructActiveNumberType(1);
            }
        });

        numberType2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constructActiveNumberType(2);
            }
        });

        numberType3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                constructActiveNumberType(3);
            }
        });

        integerNumberType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberTypeOfInteger = 1;
                constructIntegerView();
            }
        });

        integerNumberType2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberTypeOfInteger = 2;
                constructIntegerView();
            }
        });

        integerNumberType3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberTypeOfInteger = 3;
                constructIntegerView();
            }
        });
    }

    private void constructActiveNumberType(int type){
        if(fractionFlag != 0){
            if(fractionFlag == 1){
                numberTypeOfFirstFraction = type;
            }else if(fractionFlag == 2){
                numberTypeOfSecondFraction = type;
            }

            constructNumberTypeView(type, fractionFlag);
        }
    }

    private void constructNumberTypeView(int type, int fractionFlag){
        numberType1.setBackgroundColor(getResources().getColor(R.color.numberTypeInActive));
        numberType2.setBackgroundColor(getResources().getColor(R.color.numberTypeInActive));
        numberType3.setBackgroundColor(getResources().getColor(R.color.numberTypeInActive));

        RelativeLayout.LayoutParams firstFractionIntegerLayout = (RelativeLayout.LayoutParams)firstFractionInteger.getLayoutParams();
        RelativeLayout.LayoutParams firstFractionContainerLayout = (RelativeLayout.LayoutParams)firstFractionContainer.getLayoutParams();

        RelativeLayout.LayoutParams secondFractionIntegerLayout = (RelativeLayout.LayoutParams)secondFractionInteger.getLayoutParams();
        RelativeLayout.LayoutParams secondFractionContainerLayout = (RelativeLayout.LayoutParams)secondFractionContainer.getLayoutParams();

        switch (type){
            case 1 :
                if(fractionFlag == 1){
                    firstFractionInteger.setVisibility(View.VISIBLE);
                    firstFractionIntegerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    firstFractionIntegerLayout.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);

                    firstFractionContainer.setVisibility(View.GONE);

                    firstFractionInteger.requestFocus();
                }else if(fractionFlag == 2){
                    secondFractionInteger.setVisibility(View.VISIBLE);
                    secondFractionIntegerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    secondFractionIntegerLayout.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);

                    secondFractionContainer.setVisibility(View.GONE);

                    secondFractionInteger.requestFocus();
                }

                numberType1.setBackgroundColor(getResources().getColor(R.color.numberTypeActive));
                break;
            case 2 :
                if(fractionFlag == 1){
                    firstFractionInteger.setVisibility(View.GONE);

                    firstFractionContainer.setVisibility(View.VISIBLE);
                    firstFractionContainerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    firstFractionContainerLayout.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);

                    firstFractionRoot.requestFocus();
                }else if(fractionFlag == 2){
                    secondFractionInteger.setVisibility(View.GONE);

                    secondFractionContainer.setVisibility(View.VISIBLE);
                    secondFractionContainerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    secondFractionContainerLayout.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);

                    secondFractionRoot.requestFocus();
                }


                numberType2.setBackgroundColor(getResources().getColor(R.color.numberTypeActive));
                break;
            case 3 :
                if(fractionFlag == 1){
                    firstFractionInteger.setVisibility(View.VISIBLE);
                    firstFractionIntegerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                    firstFractionIntegerLayout.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

                    firstFractionContainer.setVisibility(View.VISIBLE);
                    firstFractionContainerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                    firstFractionContainerLayout.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

                    if(isRootFractionFocused){
                        firstFractionRoot.requestFocus();
                    }else{
                        firstFractionInteger.requestFocus();
                    }
                }else if(fractionFlag == 2){
                    secondFractionInteger.setVisibility(View.VISIBLE);
                    secondFractionIntegerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                    secondFractionIntegerLayout.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

                    secondFractionContainer.setVisibility(View.VISIBLE);
                    secondFractionContainerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                    secondFractionContainerLayout.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

                    if(isRootFractionFocused){
                        secondFractionRoot.requestFocus();
                    }else{
                        secondFractionInteger.requestFocus();
                    }
                }

                numberType3.setBackgroundColor(getResources().getColor(R.color.numberTypeActive));
                break;

        }
    }

    private void setfractionFocus(int whichFraction){
        switch (whichFraction){
            case 1 :
                fractionFlag = 1;
                constructNumberTypeView(numberTypeOfFirstFraction, fractionFlag);
                break;
            case 2 :
                fractionFlag = 2;
                constructNumberTypeView(numberTypeOfSecondFraction, fractionFlag);
                break;
        }
    }

    private void constructIntegerView(){
        integerNumberType1.setBackgroundColor(getResources().getColor(R.color.numberTypeInActive));
        integerNumberType2.setBackgroundColor(getResources().getColor(R.color.numberTypeInActive));
        integerNumberType3.setBackgroundColor(getResources().getColor(R.color.numberTypeInActive));

        RelativeLayout.LayoutParams integerLayout = (RelativeLayout.LayoutParams)integerValue.getLayoutParams();
        RelativeLayout.LayoutParams rootLayout = (RelativeLayout.LayoutParams)integerRootContainer.getLayoutParams();

        switch (numberTypeOfInteger){
            case 1 :
                integerValue.setVisibility(View.VISIBLE);
                integerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
                integerLayout.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);

                integerRootContainer.setVisibility(View.GONE);

                integerNumberType1.setBackgroundColor(getResources().getColor(R.color.numberTypeActive));
                break;
            case 2 :
                integerValue.setVisibility(View.GONE);

                integerRootContainer.setVisibility(View.VISIBLE);
                rootLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
                rootLayout.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);


                integerNumberType2.setBackgroundColor(getResources().getColor(R.color.numberTypeActive));
                break;
            case 3 :
                integerValue.setVisibility(View.VISIBLE);
                integerLayout.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                integerLayout.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

                integerRootContainer.setVisibility(View.VISIBLE);
                rootLayout.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                rootLayout.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

                integerNumberType3.setBackgroundColor(getResources().getColor(R.color.numberTypeActive));
                break;

        }
    }

    private void showError(String msg){
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public TNumber getValue(){
        TNumber tNumber = new TNumber();
        if(integersType.isChecked()){
            if(!integerValue.getText().toString().isEmpty()){
                tNumber.setType(TNumber.INTEGER_NUMBER);
                FractionNumber f = new FractionNumber();

                switch (numberTypeOfInteger){
                    case FractionNumber.INTEGER_TYPE :
                        if(!integerValue.getText().toString().isEmpty()){
                            f.setNumberType(FractionNumber.INTEGER_TYPE);
                            f.setIntegerValue(Double.parseDouble(integerValue.getText().toString()));
                            f.setRootValue(1);
                        }else{
                            showError("Number cannot be blank");
                        }

                        break;

                    case FractionNumber.ROOT_TYPE :
                        if(!integerRootValue.getText().toString().isEmpty()){
                            f.setNumberType(FractionNumber.ROOT_TYPE);
                            f.setIntegerValue(1);
                            f.setRootValue(Integer.parseInt(integerRootValue.getText().toString()));
                        }else{
                            showError("Number cannot be blank");
                        }
                        break;
                    case FractionNumber.INTEGER_ROOT_TYPE:
                        if(!integerValue.getText().toString().isEmpty() && !integerRootValue.getText().toString().isEmpty()){
                            f.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
                            f.setIntegerValue(Double.parseDouble(integerValue.getText().toString()));
                            f.setRootValue(Integer.parseInt(integerRootValue.getText().toString()));
                        }else{
                            showError("Number cannot be blank");
                        }

                        break;
                }

                tNumber.setIntegerNumber(f);
            }else{
                showError("Number cannot be blank");
            }
        }else if(fractionsType.isChecked()){
            tNumber.setType(TNumber.FRACTION_NUMBER);

            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            switch (numberTypeOfFirstFraction){
                case FractionNumber.INTEGER_TYPE :
                    if(!firstFractionInteger.getText().toString().isEmpty()){
                        f1.setNumberType(FractionNumber.INTEGER_TYPE);
                        f1.setIntegerValue(Double.parseDouble(firstFractionInteger.getText().toString()));
                        f1.setRootValue(1);
                    }else{
                        showError("Number cannot be blank");
                    }

                    break;

                case FractionNumber.ROOT_TYPE :
                    if(!firstFractionRoot.getText().toString().isEmpty()){
                        f1.setNumberType(FractionNumber.ROOT_TYPE);
                        f1.setIntegerValue(1);
                        f1.setRootValue(Integer.parseInt(firstFractionRoot.getText().toString()));
                    }else{
                        showError("Number cannot be blank");
                    }
                    break;
                case FractionNumber.INTEGER_ROOT_TYPE:
                    if(!firstFractionRoot.getText().toString().isEmpty() && !firstFractionInteger.getText().toString().isEmpty()){
                        f1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
                        f1.setIntegerValue(Double.parseDouble(firstFractionInteger.getText().toString()));
                        f1.setRootValue(Integer.parseInt(firstFractionRoot.getText().toString()));
                    }else{
                        showError("Number cannot be blank");
                    }

                    break;
            }

            switch (numberTypeOfSecondFraction){
                case FractionNumber.INTEGER_TYPE :
                    if(!secondFractionInteger.getText().toString().isEmpty()){
                        f2.setNumberType(FractionNumber.INTEGER_TYPE);
                        f2.setIntegerValue(Double.parseDouble(secondFractionInteger.getText().toString()));
                        f2.setRootValue(1);
                    }else{
                        showError("Number cannot be blank");
                    }

                    break;

                case FractionNumber.ROOT_TYPE :
                    if(!secondFractionRoot.getText().toString().isEmpty()){
                        f2.setNumberType(FractionNumber.ROOT_TYPE);
                        f2.setIntegerValue(1);
                        f2.setRootValue(Integer.parseInt(secondFractionRoot.getText().toString()));
                    }else{
                        showError("Number cannot be blank");
                    }

                    break;
                case FractionNumber.INTEGER_ROOT_TYPE:
                    if(!secondFractionInteger.getText().toString().isEmpty() && !secondFractionRoot.getText().toString().isEmpty()){
                        f2.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
                        f2.setIntegerValue(Double.parseDouble(secondFractionInteger.getText().toString()));
                        f2.setRootValue(Integer.parseInt(secondFractionRoot.getText().toString()));
                    }else{
                        showError("Number cannot be blank");
                    }

                    break;
            }

            Fraction fraction = new Fraction();
            fraction.setFirstFraction(f1);
            fraction.setSecondFraction(f2);

            tNumber.setFraction(fraction);
        }

        return tNumber;
    }
}
