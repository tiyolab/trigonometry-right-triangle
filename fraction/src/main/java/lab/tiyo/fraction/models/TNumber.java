package lab.tiyo.fraction.models;

import lab.tiyo.fraction.listeners.OnChangeListener;

/**
 * Created by root on 26/12/16.
 */
public class TNumber {
    /**
     * 1 = integer number
     * 2 = fraction number
     */
    private int type = 1;
    private FractionNumber integerNumber;
    private Fraction fraction;

    private OnChangeListener changeListener;

    /**
     * constant
     */
    public static final int INTEGER_NUMBER = 1;
    public static final int FRACTION_NUMBER = 2;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public FractionNumber getIntegerNumber() {
        return integerNumber;
    }

    public void setIntegerNumber(FractionNumber integerNumber) {
        this.integerNumber = integerNumber;
        if(this.changeListener != null){
            this.changeListener.change();
        }
    }

    public Fraction getFraction() {
        return fraction;
    }

    public void setFraction(Fraction fraction) {
        this.fraction = fraction;
        this.fraction.setOnChangeListener(new OnChangeListener() {
            @Override
            public void change() {
                if(changeListener != null){
                    changeListener.change();
                }
            }
        });
    }

    public boolean isIntegerNumber(){
        return type == 1;
    }

    public boolean isFractionNumber(){
        return type == 2;
    }

    public double getValue(){
        if(this.type == INTEGER_NUMBER){
            return this.integerNumber.getDecimalValue();
        }else if(this.type == FRACTION_NUMBER){
            return this.fraction.getFractionValue();
        }

        return 0;
    }

    public void setOnChangeListener(OnChangeListener listener){
        this.changeListener = listener;
    }
}
