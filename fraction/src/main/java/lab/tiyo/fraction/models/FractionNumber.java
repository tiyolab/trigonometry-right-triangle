package lab.tiyo.fraction.models;

import lab.tiyo.fraction.listeners.OnChangeListener;

/**
 * Created by root on 25/12/16.
 */
public class FractionNumber {
    /**
     * number type of each fraction (1st fraction and 2nd fraction)
     * 1 = xxx
     *      ____
     * 2 = /xxx
     *         ____
     * 3 = xxx/xxx
     */
    private int numberType = 1;
    private double decimalValue = 0;
    private double integerValue = 1;
    private int rootValue = 1;

    public static final int INTEGER_TYPE = 1;
    public static final int ROOT_TYPE = 2;
    public static final int INTEGER_ROOT_TYPE = 3;

    private OnChangeListener changeListener;

    public FractionNumber(int numberType, float decimalValue, float integerValue, int rootValue) {
        this.numberType = numberType;
        this.decimalValue = decimalValue;
        this.integerValue = integerValue;
        this.rootValue = rootValue;
    }

    public FractionNumber() {

    }

    public int getNumberType() {
        return numberType;
    }

    public void setNumberType(int numberType) {
        this.numberType = numberType;
    }

    public double getDecimalValue() {
        if(this.numberType == INTEGER_TYPE){
            return this.integerValue;
        }else if(this.numberType == ROOT_TYPE){
            return Math.sqrt(this.rootValue);
        }else if(this.numberType == INTEGER_ROOT_TYPE){
            return this.integerValue * Math.sqrt(this.rootValue);
        }

        return 0;
    }

    public double getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(double integerValue) {
        this.integerValue = integerValue;
        if(this.changeListener != null){
            changeListener.change();
        }
    }

    public int getRootValue() {
        return rootValue;
    }

    public void setRootValue(int rootValue) {
        this.rootValue = rootValue;
        if(this.changeListener != null){
            changeListener.change();
        }
    }

    public boolean isIntegerType(){
        return numberType == INTEGER_TYPE;
    }

    public boolean isRootType(){
        return numberType == ROOT_TYPE;
    }

    public boolean isIntegerRootType(){
        return numberType == INTEGER_ROOT_TYPE;
    }

    public void setOnChangeListener(OnChangeListener listener){
        this.changeListener = listener;
    }

}
