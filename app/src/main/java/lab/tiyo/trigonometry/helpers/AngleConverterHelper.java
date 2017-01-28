package lab.tiyo.trigonometry.helpers;

/**
 * Created by root on 25/12/16.
 */
public class AngleConverterHelper {
    public static double degToRad(double angle){
        return angle * 3.14 / 180;
    }

    public static double degToPiRad(double angle){
        return angle / 180;
    }

    public static double radToDeg(double angle){
        return angle * 180 / 3.14;
    }

    public static double piRadToDeg(double angle){
        return angle * 180;
    }
}
