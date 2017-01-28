package lab.tiyo.trigonometry.helpers;

import java.text.DecimalFormat;

/**
 * Created by root on 25/12/16.
 */
public class NumberFormatHelper {
    public static double format2Decimal(double value){
        DecimalFormat format = new DecimalFormat("#.00");
        return Double.valueOf(format.format(value));
    }
}
