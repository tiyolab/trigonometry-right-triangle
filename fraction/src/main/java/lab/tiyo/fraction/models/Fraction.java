package lab.tiyo.fraction.models;

import lab.tiyo.fraction.listeners.OnChangeListener;

/**
 * Created by root on 26/12/16.
 */
public class Fraction {
    private FractionNumber firstFraction;
    private FractionNumber secondFraction;

    private OnChangeListener changeListener;

    public Fraction(){

    }

    public Fraction(FractionNumber firstFraction, FractionNumber secondFraction) {
        this.firstFraction = firstFraction;
        this.secondFraction = secondFraction;
    }

    public FractionNumber getFirstFraction() {
        return firstFraction;
    }

    public void setFirstFraction(FractionNumber firstFraction) {
        this.firstFraction = firstFraction;
        this.firstFraction.setOnChangeListener(new OnChangeListener() {
            @Override
            public void change() {
                if(changeListener != null){
                    changeListener.change();
                }
            }
        });
    }

    public FractionNumber getSecondFraction() {
        return secondFraction;
    }

    public void setSecondFraction(FractionNumber secondFraction) {
        this.secondFraction = secondFraction;
        this.secondFraction.setOnChangeListener(new OnChangeListener() {
            @Override
            public void change() {
                if(changeListener != null){
                    changeListener.change();
                }
            }
        });
    }

    public double getFractionValue(){
        return this.firstFraction.getDecimalValue() / this.secondFraction.getDecimalValue();
    }

    public void setOnChangeListener(OnChangeListener listener){
        this.changeListener = listener;
    }
}
