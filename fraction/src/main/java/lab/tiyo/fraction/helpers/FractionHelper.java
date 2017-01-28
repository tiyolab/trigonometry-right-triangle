package lab.tiyo.fraction.helpers;

import java.util.ArrayList;

import lab.tiyo.fraction.models.FractionNumber;

/**
 * Created by root on 25/12/16.
 */
public class FractionHelper {
    public static FractionNumber toDecimalValue(float integerValue, int rootValue){
        FractionNumber f = new FractionNumber();
        f.setIntegerValue(integerValue);
        f.setRootValue(rootValue);

        return f;
    }

    public static FractionNumber toIrrationalValue(int decimal){
        int A = decimal;
        ArrayList<Integer> B = new ArrayList<>();
        FractionNumber f = new FractionNumber();

        int x = 3, y = 2;

        while(true){
            if(A % 2 == 0){
                if(A >= Math.pow(y, 2)){
                    if(A/Math.pow(y, 2) == (int)(A/Math.pow(y, 2))){
                        B.add(y);
                        A = (int)(A/Math.pow(y, 2));
                        if(A == 1){
                            break;
                        }
                    }else{
                        y += 2;
                    }
                }else{
                    break;
                }
            }else{
                if(A >= Math.pow(x, 2)){
                    if(A/Math.pow(x, 2) == (int)(A/Math.pow(x, 2))){
                        B.add(x);
                        A = (int)(A/Math.pow(x, 2));
                        if(A == 1){
                            break;
                        }
                    }else{
                        x += 2;
                    }
                }else{
                    break;
                }
            }
        }

        float tmpRoot = 1;
        for(Integer i : B){
            tmpRoot *= (int)i;
        }

        f.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
        f.setIntegerValue(tmpRoot);
        f.setRootValue(A);

        return f;
    }
}
