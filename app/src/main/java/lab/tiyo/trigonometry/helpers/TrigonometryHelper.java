package lab.tiyo.trigonometry.helpers;

import lab.tiyo.fraction.models.Fraction;
import lab.tiyo.fraction.models.FractionNumber;
import lab.tiyo.fraction.models.TNumber;

/**
 * Created by root on 28/12/16.
 */
public class TrigonometryHelper {

    /**
     *
     * @param angle
     * angle in degree
     * @return
     */
    public static TNumber sinValue(double angle){
        TNumber n = new TNumber();
        if(angle == 0 || angle == 180 ||angle == 360){
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f1.setIntegerValue(0);

            n.setType(TNumber.INTEGER_NUMBER);
            n.setIntegerNumber(f1);
        }else if(angle == 30 || angle == 150 ||angle == 210 ||angle == 330){
            n.setType(TNumber.FRACTION_NUMBER);

            Fraction f = new Fraction();
            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f2.setNumberType(FractionNumber.INTEGER_TYPE);

            if(angle == 210 ||angle == 330)
                f1.setIntegerValue(-1);
            else
                f1.setIntegerValue(1);
            f2.setIntegerValue(2);

            f.setFirstFraction(f1);
            f.setSecondFraction(f2);

            n.setFraction(f);

        }else if(angle == 45 || angle == 135 || angle == 225 || angle == 315){
            n.setType(TNumber.FRACTION_NUMBER);

            Fraction f = new Fraction();
            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            f1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
            f2.setNumberType(FractionNumber.INTEGER_TYPE);

            if(angle == 225 || angle == 315)
                f1.setIntegerValue(-1);
            else
                f1.setIntegerValue(1);
            f1.setRootValue(2);
            f2.setIntegerValue(2);

            f.setFirstFraction(f1);
            f.setSecondFraction(f2);

            n.setFraction(f);

        }else if(angle == 60 || angle == 120 || angle == 240 || angle == 300){
            n.setType(TNumber.FRACTION_NUMBER);

            Fraction f = new Fraction();
            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            f1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
            f2.setNumberType(FractionNumber.INTEGER_TYPE);

            if(angle == 240 || angle == 300)
                f1.setIntegerValue(-1);
            else
                f1.setIntegerValue(1);
            f1.setRootValue(3);
            f2.setIntegerValue(2);

            f.setFirstFraction(f1);
            f.setSecondFraction(f2);

            n.setFraction(f);

        }else if(angle == 90 || angle == 270){
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f1.setIntegerValue(0);

            n.setType(TNumber.INTEGER_NUMBER);
            if(angle == 270){
                f1.setIntegerValue(-1);
                n.setIntegerNumber(f1);
            }else{
                f1.setIntegerValue(1);
                n.setIntegerNumber(f1);
            }
        }else{
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f1.setIntegerValue(NumberFormatHelper.format2Decimal(Math.sin(AngleConverterHelper.degToRad(angle))));

            n.setType(TNumber.INTEGER_NUMBER);
            n.setIntegerNumber(f1);
        }

        return n;
    }

    /**
     *
     * @param angle
     * angle in degree
     * @return
     */
    public static TNumber cosValue(double angle){
        TNumber n = new TNumber();
        if(angle == 90 || angle == 270){
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f1.setIntegerValue(0);

            n.setType(TNumber.INTEGER_NUMBER);
            n.setIntegerNumber(f1);
        }else if(angle == 60 || angle == 120 ||angle == 240 ||angle == 300){
            n.setType(TNumber.FRACTION_NUMBER);

            Fraction f = new Fraction();
            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f2.setNumberType(FractionNumber.INTEGER_TYPE);

            if(angle == 120 ||angle == 240)
                f1.setIntegerValue(-1);
            else
                f1.setIntegerValue(1);
            f2.setIntegerValue(2);

            f.setFirstFraction(f1);
            f.setSecondFraction(f2);

            n.setFraction(f);

        }else if(angle == 45 || angle == 135 || angle == 225 || angle == 315){
            n.setType(TNumber.FRACTION_NUMBER);

            Fraction f = new Fraction();
            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            f1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
            f2.setNumberType(FractionNumber.INTEGER_TYPE);

            if(angle == 135 || angle == 225)
                f1.setIntegerValue(-1);
            else
                f1.setIntegerValue(1);
            f1.setRootValue(2);
            f2.setIntegerValue(2);

            f.setFirstFraction(f1);
            f.setSecondFraction(f2);

            n.setFraction(f);

        }else if(angle == 30 || angle == 150 || angle == 210 || angle == 330){
            n.setType(TNumber.FRACTION_NUMBER);

            Fraction f = new Fraction();
            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            f1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
            f2.setNumberType(FractionNumber.INTEGER_TYPE);

            if(angle == 150 || angle == 210)
                f1.setIntegerValue(-1);
            else
                f1.setIntegerValue(1);
            f1.setRootValue(3);
            f2.setIntegerValue(2);

            f.setFirstFraction(f1);
            f.setSecondFraction(f2);

            n.setFraction(f);

        }else if(angle == 0 || angle == 180 || angle == 360){
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);


            n.setType(TNumber.INTEGER_NUMBER);
            if(angle == 180){
                f1.setIntegerValue(-1);
                n.setIntegerNumber(f1);
            }else{
                f1.setIntegerValue(1);
                n.setIntegerNumber(f1);
            }
        }else{
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f1.setIntegerValue(NumberFormatHelper.format2Decimal(Math.cos(AngleConverterHelper.degToRad(angle))));

            n.setType(TNumber.INTEGER_NUMBER);
            n.setIntegerNumber(f1);
        }

        return n;
    }

    /**
     *
     * @param angle
     * angle in degree
     * @return
     */
    public static TNumber tanValue(double angle){
        TNumber n = new TNumber();
        if(angle == 0 || angle == 180 || angle == 360){
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f1.setIntegerValue(0);

            n.setType(TNumber.INTEGER_NUMBER);
            n.setIntegerNumber(f1);
        }else if(angle == 30 || angle == 150 || angle == 210 || angle == 330){
            n.setType(TNumber.FRACTION_NUMBER);

            Fraction f = new Fraction();
            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            f1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
            f2.setNumberType(FractionNumber.INTEGER_TYPE);

            if(angle == 150 ||angle == 330)
                f1.setIntegerValue(-1);
            else
                f1.setIntegerValue(1);
            f1.setRootValue(3);
            f2.setIntegerValue(3);

            f.setFirstFraction(f1);
            f.setSecondFraction(f2);

            n.setFraction(f);

        }else if(angle == 45 || angle == 135 || angle == 225 || angle == 315){
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);

            n.setType(TNumber.INTEGER_NUMBER);

            if(angle == 135 || angle == 135){
                f1.setIntegerValue(-1);
                n.setIntegerNumber(f1);
            }else {
                f1.setIntegerValue(1);
                n.setIntegerNumber(f1);
            }

        }else if(angle == 60 || angle == 120 || angle == 240 || angle == 300){
            n.setType(TNumber.FRACTION_NUMBER);

            Fraction f = new Fraction();
            FractionNumber f1 = new FractionNumber();
            FractionNumber f2 = new FractionNumber();

            f1.setNumberType(FractionNumber.INTEGER_ROOT_TYPE);
            f2.setNumberType(FractionNumber.INTEGER_TYPE);

            if(angle == 120 || angle == 300)
                f1.setIntegerValue(-1);
            else
                f1.setIntegerValue(1);
            f1.setRootValue(3);
            f2.setIntegerValue(1);

            f.setFirstFraction(f1);
            f.setSecondFraction(f2);

            n.setFraction(f);

        }else if(angle == 90 || angle == 270){
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f1.setIntegerValue(2);

            n.setType(TNumber.INTEGER_NUMBER);
            n.setIntegerNumber(f1);

        }else{
            FractionNumber f1 = new FractionNumber();
            f1.setNumberType(FractionNumber.INTEGER_TYPE);
            f1.setIntegerValue(NumberFormatHelper.format2Decimal(Math.tan(AngleConverterHelper.degToRad(angle))));

            n.setType(TNumber.INTEGER_NUMBER);
            n.setIntegerNumber(f1);
        }

        return n;
    }
}
