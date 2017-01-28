package lab.tiyo.trigonometry.helpers;

import lab.tiyo.fraction.helpers.FractionHelper;
import lab.tiyo.fraction.models.Fraction;
import lab.tiyo.fraction.models.FractionNumber;
import lab.tiyo.fraction.models.TNumber;

/**
 * Created by root on 03/01/17.
 */
public class MathHelper {
    public static TNumber add(TNumber n1, TNumber n2){
        TNumber result = new TNumber();
        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction();
        FractionNumber f1 = new FractionNumber();
        FractionNumber f2 = new FractionNumber();

        if(n1.isIntegerNumber()){
            if(n1.getIntegerNumber().isIntegerType()){
                if(n2.isIntegerNumber()){
                    switch (n2.getIntegerNumber().getNumberType()){
                        case FractionNumber.INTEGER_TYPE :
                            result.setType(TNumber.INTEGER_NUMBER);

                            f1.setNumberType(FractionNumber.INTEGER_TYPE);
                            f1.setIntegerValue(n1.getIntegerNumber().getIntegerValue() + n2.getIntegerNumber().getIntegerValue());
                            break;

                        case FractionNumber.ROOT_TYPE :

                        case FractionNumber.INTEGER_ROOT_TYPE :
                            result.setType(TNumber.INTEGER_NUMBER);

                            f1.setNumberType(FractionNumber.INTEGER_TYPE);
                            f1.setIntegerValue(n1.getIntegerNumber().getIntegerValue() + n2.getIntegerNumber().getDecimalValue());
                            break;
                    }

                    result.setIntegerNumber(f1);
                }else if(n2.isFractionNumber()){

                }
            }else if(n1.getIntegerNumber().isRootType()){

            }else if(n1.getIntegerNumber().isIntegerRootType()){

            }
        }
        return null;
    }

    public static TNumber product(TNumber n1, TNumber n2){
        TNumber result = new TNumber();

        int typeN1, typeN2;
        FractionNumber n1n = null, n2n = null;
        FractionNumber n1f1 = null, n1f2 = null, n2f1 = null, n2f2 = null;

        FractionNumber nrn = new FractionNumber();
        FractionNumber nrf1 = new FractionNumber();
        FractionNumber nrf2 = new FractionNumber();

        if(n1.getFraction() == null){
            n1n = n1.getIntegerNumber();
            typeN1 = TNumber.INTEGER_NUMBER;
        }else{
            n1f1 = n1.getFraction().getFirstFraction();
            n1f2 = n1.getFraction().getSecondFraction();
            typeN1 = TNumber.FRACTION_NUMBER;
        }

        if(n2.getFraction() == null){
            n2n = n2.getIntegerNumber();
            typeN2 = TNumber.INTEGER_NUMBER;
        }else{
            n2f1 = n2.getFraction().getFirstFraction();
            n2f2 = n2.getFraction().getSecondFraction();
            typeN2 = TNumber.FRACTION_NUMBER;
        }

        if(typeN1 == TNumber.INTEGER_NUMBER){
            if(typeN2 == TNumber.INTEGER_NUMBER){
                nrn.setIntegerValue(n1n.getIntegerValue() * n2n.getIntegerValue());
                nrn.setRootValue(n1n.getRootValue() * n2n.getRootValue());
            }else{
                nrf1.setIntegerValue(n1n.getIntegerValue() * n2f1.getIntegerValue());
                nrf1.setRootValue(n1n.getRootValue() * n2f1.getRootValue());

                nrf2.setIntegerValue(n2f2.getIntegerValue());
                nrf2.setRootValue(n2f2.getRootValue());
            }
        }else{
            if(typeN2 == TNumber.INTEGER_NUMBER){
                nrf1.setIntegerValue(n1f1.getIntegerValue() * n2n.getIntegerValue());
                nrf1.setRootValue(n1f1.getRootValue() * n2n.getRootValue());

                nrf2.setIntegerValue(n1f2.getIntegerValue());
                nrf2.setRootValue(n1f2.getRootValue());
            }else{
                nrf1.setIntegerValue(n1f1.getIntegerValue() * n2f1.getIntegerValue());
                nrf1.setRootValue(n1f1.getRootValue() * n2f1.getRootValue());

                nrf2.setIntegerValue(n1f2.getIntegerValue() * n2f2.getIntegerValue());
                nrf2.setRootValue(n1f2.getRootValue() * n2f2.getRootValue());
            }
        }

        if(typeN1 == TNumber.INTEGER_NUMBER && typeN2 == TNumber.INTEGER_NUMBER){
            if(nrn.getIntegerValue() == 1){
                if(nrn.getRootValue() == 1){
                    nrn.setNumberType(FractionNumber.INTEGER_TYPE);
                }else{
                    nrn.setNumberType(FractionNumber.ROOT_TYPE);
                }
            }else{
                if(nrn.getRootValue() == 1){
                    nrn.setNumberType(FractionNumber.INTEGER_TYPE);
                }else{
                    nrn.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
                }
            }

            result.setType(TNumber.INTEGER_NUMBER);
            result.setIntegerNumber(nrn);
        }else{
            if(nrf1.getIntegerValue() == 1){
                if(nrf1.getRootValue() == 1){
                    nrf1.setNumberType(FractionNumber.INTEGER_TYPE);
                }else{
                    nrf1.setNumberType(FractionNumber.ROOT_TYPE);
                }
            }else{
                if(nrf1.getRootValue() == 1){
                    nrf1.setNumberType(FractionNumber.INTEGER_TYPE);
                }else{
                    nrf1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
                }
            }

            if(nrf2.getIntegerValue() == 1){
                if(nrf2.getRootValue() == 1){
                    nrf2.setNumberType(FractionNumber.INTEGER_TYPE);
                }else{
                    nrf2.setNumberType(FractionNumber.ROOT_TYPE);
                }
            }else{
                if(nrf2.getRootValue() == 1){
                    nrf2.setNumberType(FractionNumber.INTEGER_TYPE);
                }else{
                    nrf2.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
                }
            }

            Fraction fr = new Fraction();
            fr.setFirstFraction(nrf1);
            fr.setSecondFraction(nrf2);

            result.setType(TNumber.FRACTION_NUMBER);
            result.setFraction(fr);
        }

        return result;
    }

    public static TNumber division(TNumber n1, TNumber n2){
        TNumber result = new TNumber();

        int typeN1, typeN2;
        FractionNumber n1n = null, n2n = null;
        FractionNumber n1f1 = null, n1f2 = null, n2f1 = null, n2f2 = null;

        FractionNumber nrn = new FractionNumber();
        FractionNumber nrf1 = new FractionNumber();
        FractionNumber nrf2 = new FractionNumber();

        if(n1.getFraction() == null){
            n1n = n1.getIntegerNumber();
            typeN1 = TNumber.INTEGER_NUMBER;
        }else{
            n1f1 = n1.getFraction().getFirstFraction();
            n1f2 = n1.getFraction().getSecondFraction();
            typeN1 = TNumber.FRACTION_NUMBER;
        }

        if(n2.getFraction() == null){
            n2n = n2.getIntegerNumber();
            typeN2 = TNumber.INTEGER_NUMBER;
        }else{
            n2f1 = n2.getFraction().getFirstFraction();
            n2f2 = n2.getFraction().getSecondFraction();
            typeN2 = TNumber.FRACTION_NUMBER;
        }

        if(typeN1 == TNumber.INTEGER_NUMBER){
            if(typeN2 == TNumber.INTEGER_NUMBER){
                nrf1.setIntegerValue(n1n.getIntegerValue());
                nrf2.setIntegerValue(n2n.getIntegerValue());

                nrf1.setRootValue(n1n.getRootValue());
                nrf2.setRootValue(n2n.getRootValue());

            }else{
                /**
                 * a // b/c == a * c/b
                 */
                nrf1.setIntegerValue(n1n.getIntegerValue() * n2f2.getIntegerValue());
                nrf1.setRootValue(n1n.getRootValue() * n2f2.getRootValue());

                nrf2.setIntegerValue(n2f1.getIntegerValue());
                nrf2.setRootValue(n2f1.getRootValue());
            }
        }else{
            if(typeN2 == TNumber.INTEGER_NUMBER){
                /**
                 * a/b // c == a/(b * c)
                 */
                nrf1.setIntegerValue(n1f1.getIntegerValue());
                nrf1.setRootValue(n1f1.getRootValue());

                nrf2.setIntegerValue(n1f2.getIntegerValue()  * n2n.getIntegerValue());
                nrf2.setRootValue(n1f2.getRootValue() * n2n.getRootValue());
            }else{
                /**
                 * a/b // c/d == a/b * d/c
                 */
                nrf1.setIntegerValue(n1f1.getIntegerValue() * n2f2.getIntegerValue());
                nrf1.setRootValue(n1f1.getRootValue() * n2f2.getRootValue());

                nrf2.setIntegerValue(n1f2.getIntegerValue() * n2f1.getIntegerValue());
                nrf2.setRootValue(n1f2.getRootValue() * n2f1.getRootValue());
            }
        }

        if(nrf1.getIntegerValue() == 1) {
            if (nrf1.getRootValue() == 1) {
                nrf1.setNumberType(FractionNumber.INTEGER_TYPE);
            } else {
                nrf1.setNumberType(FractionNumber.ROOT_TYPE);
            }
        } else {
            if (nrf1.getRootValue() == 1) {
                nrf1.setNumberType(FractionNumber.INTEGER_TYPE);
            } else {
                nrf1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
            }
        }

        if (nrf2.getIntegerValue() == 1){
            if(nrf2.getRootValue() == 1){
                nrf2.setNumberType(FractionNumber.INTEGER_TYPE);
            }else{
                nrf2.setNumberType(FractionNumber.ROOT_TYPE);
            }
        }else{
            if(nrf2.getRootValue() == 1){
                nrf2.setNumberType(FractionNumber.INTEGER_TYPE);
            }else{
                nrf2.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
            }
        }

        Fraction fr = new Fraction();
        fr.setFirstFraction(nrf1);
        fr.setSecondFraction(nrf2);

        result.setType(TNumber.FRACTION_NUMBER);
        result.setFraction(fr);

        return result;
    }
}
