package lab.tiyo.fraction.models;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import lab.tiyo.fraction.R;
import lab.tiyo.fraction.listeners.OnChangeListener;

/**
 * Created by root on 27/12/16.
 */
public class FractionView extends RelativeLayout{
    private View rootView;
    private EditText firstFractionInteger, secondFractionInteger;
    private EditText firstFractionRoot, secondFractionRoot;
    private RelativeLayout firstFractionContainer, secondFractionContainer;
    private TextView devider;
    private LinearLayout firstFraction, secondFraction;

    private TNumber number;

    private lab.tiyo.fraction.listeners.OnClickListener clickListener;

    public FractionView(Context context) {
        super(context);
        init(context);
    }

    public FractionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        rootView = inflate(context, R.layout.fraction_view, this);

        firstFraction = (LinearLayout)rootView.findViewById(R.id.first_fraction);
        firstFractionInteger = (EditText)rootView.findViewById(R.id.first_fraction_integer);
        firstFractionRoot = (EditText)rootView.findViewById(R.id.first_fraction_root);
        firstFractionContainer = (RelativeLayout)rootView.findViewById(R.id.first_fraction_container);

        secondFraction = (LinearLayout)rootView.findViewById(R.id.second_fraction);
        secondFractionInteger = (EditText)rootView.findViewById(R.id.second_fraction_integer);
        secondFractionRoot = (EditText)rootView.findViewById(R.id.second_fraction_root);
        secondFractionContainer = (RelativeLayout)rootView.findViewById(R.id.second_fraction_container);

        devider = (TextView)rootView.findViewById(R.id.devider);

        firstFractionInteger.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickListener != null){
                    clickListener.onClick(view);
                }
            }
        });

        firstFractionRoot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickListener != null){
                    clickListener.onClick(view);
                }
            }
        });

        secondFractionInteger.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickListener != null){
                    clickListener.onClick(view);
                }
            }
        });

        secondFractionRoot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickListener != null){
                    clickListener.onClick(view);
                }
            }
        });

        number = new TNumber();
        number.setOnChangeListener(new OnChangeListener() {
            @Override
            public void change() {
                rewrite();
            }
        });

        rewrite();
    }

    public TNumber getNumber() {
        return number;
    }

    public void setNumber(TNumber number) {
        this.number = number;
        this.number.setOnChangeListener(new OnChangeListener() {
            @Override
            public void change() {
                rewrite();
            }
        });

        rewrite();
    }

    public void setOnClickListener(lab.tiyo.fraction.listeners.OnClickListener listener){
        this.clickListener = listener;
    }

    private void reset(){
        this.firstFraction.setVisibility(GONE);
        this.firstFractionInteger.setVisibility(GONE);
        this.firstFractionContainer.setVisibility(GONE);

        this.devider.setVisibility(GONE);

        this.secondFraction.setVisibility(GONE);
        this.secondFractionInteger.setVisibility(GONE);
        this.secondFractionContainer.setVisibility(GONE);
    }

    private void rewrite(){
        this.reset();

        if(this.number.isIntegerNumber() && this.number.getIntegerNumber() != null){
            FractionNumber f = this.number.getIntegerNumber();

            /**
             * construct integer number
             */
            if(f.isIntegerType()){
                this.firstFraction.setVisibility(VISIBLE);
                this.firstFractionInteger.setVisibility(VISIBLE);

                this.firstFractionInteger.setText(f.getIntegerValue()+"");
            }else if(f.isRootType()){
                this.firstFraction.setVisibility(VISIBLE);
                this.firstFractionContainer.setVisibility(VISIBLE);

                this.firstFractionRoot.setText(f.getRootValue()+"");
            }else if(f.isIntegerRootType()){
                this.firstFraction.setVisibility(VISIBLE);
                this.firstFractionInteger.setVisibility(VISIBLE);
                this.firstFractionContainer.setVisibility(VISIBLE);

                if((int)f.getIntegerValue() == 1 || (int)f.getIntegerValue() == 0){
                    this.firstFractionInteger.setVisibility(GONE);
                }else{
                    this.firstFractionInteger.setText(f.getIntegerValue()+"");
                }

                this.firstFractionRoot.setText(f.getRootValue()+ "");
            }
        }else if(this.number.isFractionNumber() && this.number.getFraction() != null){
            Fraction fraction = this.number.getFraction();
            FractionNumber ff = fraction.getFirstFraction();
            FractionNumber sf = fraction.getSecondFraction();

            this.devider.setVisibility(VISIBLE);

            /**
             * construct first fraction
             */
            if(ff.isIntegerType()){
                this.firstFraction.setVisibility(VISIBLE);
                this.firstFractionInteger.setVisibility(VISIBLE);

                this.firstFractionInteger.setText(ff.getIntegerValue()+"");
            }else if(ff.isRootType()){
                this.firstFraction.setVisibility(VISIBLE);
                this.firstFractionContainer.setVisibility(VISIBLE);

                this.firstFractionRoot.setText(ff.getRootValue()+"");
            }else if(ff.isIntegerRootType()){
                this.firstFraction.setVisibility(VISIBLE);
                this.firstFractionInteger.setVisibility(VISIBLE);
                this.firstFractionContainer.setVisibility(VISIBLE);

                if((int)ff.getIntegerValue() == 1 || (int)ff.getIntegerValue() == 0){
                    this.firstFractionInteger.setVisibility(GONE);
                }else{
                    this.firstFractionInteger.setText(ff.getIntegerValue()+"");
                }

                this.firstFractionRoot.setText(ff.getRootValue()+ "");
            }

            /**
             * construct second fraction
             */
            if(sf.isIntegerType()){
                if((int)sf.getIntegerValue() != 1 && (int)sf.getIntegerValue() != 0){
                    this.secondFraction.setVisibility(VISIBLE);
                    this.secondFractionInteger.setVisibility(VISIBLE);

                    this.secondFractionInteger.setText(sf.getIntegerValue()+"");
                }else{
                    this.devider.setVisibility(GONE);
                }
            }else if(sf.isRootType()){
                this.secondFraction.setVisibility(VISIBLE);
                this.secondFractionContainer.setVisibility(VISIBLE);

                this.secondFractionRoot.setText(sf.getRootValue()+"");
            }else if(sf.isIntegerRootType()){
                if((int)sf.getIntegerValue() != 1 && (int)sf.getIntegerValue() != 0){
                    this.secondFraction.setVisibility(VISIBLE);
                    this.secondFractionInteger.setVisibility(VISIBLE);

                    this.secondFractionInteger.setText(sf.getIntegerValue()+"");
                }

                this.secondFractionContainer.setVisibility(VISIBLE);
                this.secondFractionRoot.setText(sf.getRootValue()+ "");
            }
        }
    }
}
