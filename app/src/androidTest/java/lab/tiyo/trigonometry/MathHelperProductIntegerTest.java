package lab.tiyo.trigonometry;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import org.junit.Test;

import lab.tiyo.fraction.models.Fraction;
import lab.tiyo.fraction.models.FractionNumber;
import lab.tiyo.fraction.models.TNumber;
import lab.tiyo.trigonometry.helpers.MathHelper;

/**
 * Created by root on 07/01/17.
 */
public class MathHelperProductIntegerTest extends AndroidTestCase {

    public void testIntegerNumberTypeInteger(){
        /**
         * A * A
         * 2 * 2
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.INTEGER_NUMBER);
        t1a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t1b = new TNumber();
        t1b.setType(TNumber.INTEGER_NUMBER);
        t1b.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t1c = MathHelper.product(t1a, t1b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t1c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t1c.getIntegerNumber().getNumberType());

        Assert.assertEquals(4.0, t1c.getValue());
        Assert.assertEquals(4.0, t1c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(4.0, t1c.getIntegerNumber().getDecimalValue());

        /**
         * A * /A
         * 2 * /2
         */
        TNumber t2a = new TNumber();
        t2a.setType(TNumber.INTEGER_NUMBER);
        t2a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.INTEGER_NUMBER);
        t2b.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t2c = MathHelper.product(t2a, t2b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t2c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t2c.getIntegerNumber().getNumberType());

        Assert.assertEquals(2 * Math.sqrt(2), t2c.getValue());
        Assert.assertEquals(2.0, t2c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(2,t2c.getIntegerNumber().getRootValue());
        Assert.assertEquals(2 * Math.sqrt(2), t2c.getIntegerNumber().getDecimalValue());

        /**
         * A * A/B
         * 2 * 2/2
         */
        TNumber t3a = new TNumber();
        t3a.setType(TNumber.INTEGER_NUMBER);
        t3a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t3b = new TNumber();
        t3b.setType(TNumber.INTEGER_NUMBER);
        t3b.setIntegerNumber(new FractionNumber(3, 0, 2, 2));

        TNumber t3c = MathHelper.product(t3a, t3b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getIntegerNumber().getNumberType());

        Assert.assertEquals(4 * Math.sqrt(2), t3c.getValue());
        Assert.assertEquals(4.0, t3c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(2,t3c.getIntegerNumber().getRootValue());
        Assert.assertEquals(4 * Math.sqrt(2), t3c.getIntegerNumber().getDecimalValue());

        /**
         * (A) * (A // B)
         * 2 * 3 // 4
         */
        TNumber t4a = new TNumber();
        t4a.setType(TNumber.INTEGER_NUMBER);
        t4a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t4b = new TNumber();
        t4b.setType(TNumber.FRACTION_NUMBER);
        t4b.setFraction(new Fraction(new FractionNumber(1, 0, 3, 1), new FractionNumber(1, 0, 4, 1)));

        TNumber t4c = MathHelper.product(t4a, t4b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t4c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t4c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t4c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6.0 / 4.0, t4c.getValue());

        Assert.assertEquals(6.0, t4c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1,t4c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0, t4c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t4c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1,t4c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0, t4c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A) * (A // /B)
         * 2 * 3 // /4
         */
        TNumber t5a = new TNumber();
        t5a.setType(TNumber.INTEGER_NUMBER);
        t5a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t5b = new TNumber();
        t5b.setType(TNumber.FRACTION_NUMBER);
        t5b.setFraction(new Fraction(new FractionNumber(1, 0, 3, 1), new FractionNumber(2, 0, 1, 4)));

        TNumber t5c = MathHelper.product(t5a, t5b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t5c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t5c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t5c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6.0 / Math.sqrt(4), t5c.getValue());

        Assert.assertEquals(6.0, t5c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1,t5c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0, t5c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t5c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4,t5c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(4), t5c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A) * (A // B/C)
         * 2 * 3 // 4/5
         */
        TNumber t6a = new TNumber();
        t6a.setType(TNumber.INTEGER_NUMBER);
        t6a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t6b = new TNumber();
        t6b.setType(TNumber.FRACTION_NUMBER);
        t6b.setFraction(new Fraction(new FractionNumber(1, 0, 3, 1), new FractionNumber(3, 0, 4, 5)));

        TNumber t6c = MathHelper.product(t6a, t6b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t6c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t6c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t6c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6.0 / (4.0 * Math.sqrt(5)), t6c.getValue());

        Assert.assertEquals(6.0, t6c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1,t6c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0, t6c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t6c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t6c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4 * Math.sqrt(5), t6c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A) * (/A // B)
         * 2 * /3 // 4
         */
        TNumber t7a = new TNumber();
        t7a.setType(TNumber.INTEGER_NUMBER);
        t7a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t7b = new TNumber();
        t7b.setType(TNumber.FRACTION_NUMBER);
        t7b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t7c = MathHelper.product(t7a, t7b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t7c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t7c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t7c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(3.0) / 4.0, t7c.getValue());

        Assert.assertEquals(2.0, t7c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3,t7c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2 * Math.sqrt(3), t7c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t7c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t7c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0, t7c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A) * (/A // /B)
         * 2 * /3 // /4
         */
        TNumber t8a = new TNumber();
        t8a.setType(TNumber.INTEGER_NUMBER);
        t8a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t8b = new TNumber();
        t8b.setType(TNumber.FRACTION_NUMBER);
        t8b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t8c = MathHelper.product(t8a, t8b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t8c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t8c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t8c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(3.0) / Math.sqrt(4), t8c.getValue());

        Assert.assertEquals(2.0, t8c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3,t8c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2 * Math.sqrt(3), t8c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t8c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t8c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(4), t8c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A) * (/A // B/C)
         * 2 * /3 // 4/5
         */
        TNumber t9a = new TNumber();
        t9a.setType(TNumber.INTEGER_NUMBER);
        t9a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t9b = new TNumber();
        t9b.setType(TNumber.FRACTION_NUMBER);
        t9b.setFraction(new Fraction(new FractionNumber(1, 0, 1, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t9c = MathHelper.product(t9a, t9b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t9c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t9c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t9c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(3.0) / (4.0 * Math.sqrt(5)), t9c.getValue());

        Assert.assertEquals(2.0, t9c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3,t9c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2 * Math.sqrt(3), t9c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t9c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t9c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4 * Math.sqrt(5), t9c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A) * (A/B // C)
         * 2 * 3/4 // 5
         */
        TNumber t10a = new TNumber();
        t10a.setType(TNumber.INTEGER_NUMBER);
        t10a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t10b = new TNumber();
        t10b.setType(TNumber.FRACTION_NUMBER);
        t10b.setFraction(new Fraction(new FractionNumber(2, 0, 3, 4), new FractionNumber(1, 0, 5, 1)));

        TNumber t10c = MathHelper.product(t10a, t10b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t10c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t10c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t10c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6.0 * Math.sqrt(4.0) / 5.0, t10c.getValue());

        Assert.assertEquals(6.0, t10c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(4,t10c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0 * Math.sqrt(4), t10c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t10c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t10c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5.0, t10c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A) * (A/B // /C)
         * 2 * 3/4 // /5
         */
        TNumber t11a = new TNumber();
        t11a.setType(TNumber.INTEGER_NUMBER);
        t11a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t11b = new TNumber();
        t11b.setType(TNumber.FRACTION_NUMBER);
        t11b.setFraction(new Fraction(new FractionNumber(3, 0, 3, 4), new FractionNumber(2, 0, 1, 5)));

        TNumber t11c = MathHelper.product(t11a, t11b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t11c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t11c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t11c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6.0 * Math.sqrt(4.0) / Math.sqrt(5), t11c.getValue());

        Assert.assertEquals(6.0, t11c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(4,t11c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0 * Math.sqrt(4), t11c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t11c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t11c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(5), t11c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A) * (A/B // C/CD)
         * 2 * 3/4 // 5/6
         */
        TNumber t12a = new TNumber();
        t12a.setType(TNumber.INTEGER_NUMBER);
        t12a.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t12b = new TNumber();
        t12b.setType(TNumber.FRACTION_NUMBER);
        t12b.setFraction(new Fraction(new FractionNumber(3, 0, 3, 4), new FractionNumber(3, 0, 5, 6)));

        TNumber t12c = MathHelper.product(t12a, t12b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t12c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t12c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t12c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6.0 * Math.sqrt(4.0) / (5.0 * Math.sqrt(6)), t12c.getValue());

        Assert.assertEquals(6.0, t12c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(4,t12c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6 * Math.sqrt(4), t12c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t12c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(6, t12c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(6), t12c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * /A * A
         * /2 * 2
         */
        TNumber t13a = new TNumber();
        t13a.setType(TNumber.INTEGER_NUMBER);
        t13a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t13b = new TNumber();
        t13b.setType(TNumber.INTEGER_NUMBER);
        t13b.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t13c = MathHelper.product(t13a, t13b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t13c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t13c.getIntegerNumber().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(2), t13c.getValue());
        Assert.assertEquals(2.0, t13c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(2, t13c.getIntegerNumber().getRootValue());

        /**
         * /A * /A
         * /2 * /2
         */
        TNumber t14a = new TNumber();
        t14a.setType(TNumber.INTEGER_NUMBER);
        t14a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t14b = new TNumber();
        t14b.setType(TNumber.INTEGER_NUMBER);
        t14b.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t14c = MathHelper.product(t14a, t14b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t14c.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t14c.getIntegerNumber().getNumberType());

        Assert.assertEquals(2.0, t14c.getValue());
        Assert.assertEquals(1.0, t14c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(4,t14c.getIntegerNumber().getRootValue());
        Assert.assertEquals(2.0, t14c.getIntegerNumber().getDecimalValue());

        /**
         * /A * A/B
         * /2 * 3/4
         */
        TNumber t15a = new TNumber();
        t15a.setType(TNumber.INTEGER_NUMBER);
        t15a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t15b = new TNumber();
        t15b.setType(TNumber.INTEGER_NUMBER);
        t15b.setIntegerNumber(new FractionNumber(3, 0, 3, 4));

        TNumber t15c = MathHelper.product(t15a, t15b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t15c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t15c.getIntegerNumber().getNumberType());

        Assert.assertEquals(Math.sqrt(2) * 3 * Math.sqrt(4), t15c.getValue());
        Assert.assertEquals(3.0, t15c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(8,t15c.getIntegerNumber().getRootValue());
        Assert.assertEquals(Math.sqrt(2) * 3 * Math.sqrt(4), t15c.getIntegerNumber().getDecimalValue());

        /**
         * (/A) * (A // B)
         * /2 * 3 // 4
         */
        TNumber t16a = new TNumber();
        t16a.setType(TNumber.INTEGER_NUMBER);
        t16a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t16b = new TNumber();
        t16b.setType(TNumber.FRACTION_NUMBER);
        t16b.setFraction(new Fraction(new FractionNumber(1, 0, 3, 1), new FractionNumber(1, 0, 4, 1)));

        TNumber t16c = MathHelper.product(t16a, t16b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t16c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t16c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t16c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(2) * 3.0 / 4.0, t16c.getValue());

        Assert.assertEquals(3.0, t16c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2,t16c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(3 * Math.sqrt(2), t16c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t16c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1,t16c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0, t16c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A) * (A // /B)
         * /2 * 3 // /4
         */
        TNumber t17a = new TNumber();
        t17a.setType(TNumber.INTEGER_NUMBER);
        t17a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t17b = new TNumber();
        t17b.setType(TNumber.FRACTION_NUMBER);
        t17b.setFraction(new Fraction(new FractionNumber(1, 0, 3, 1), new FractionNumber(2, 0, 1, 4)));

        TNumber t17c = MathHelper.product(t17a, t17b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t17c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t17c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t17c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(2) * 3 / Math.sqrt(4), t17c.getValue());

        Assert.assertEquals(3.0, t17c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2,t17c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(2) * 3.0, t17c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t17c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4,t17c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(4), t17c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A) * (B // C/D)
         * /2 * 3 // 4/5
         */
        TNumber t18a = new TNumber();
        t18a.setType(TNumber.INTEGER_NUMBER);
        t18a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t18b = new TNumber();
        t18b.setType(TNumber.FRACTION_NUMBER);
        t18b.setFraction(new Fraction(new FractionNumber(1, 0, 3, 1), new FractionNumber(3, 0, 4, 5)));

        TNumber t18c = MathHelper.product(t18a, t18b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t18c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t18c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t18c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(2) * 3 / (4.0 * Math.sqrt(5)), t18c.getValue());

        Assert.assertEquals(3.0, t18c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2,t18c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(2) * 3, t18c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t18c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t18c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4 * Math.sqrt(5), t18c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A) * (/B // C)
         * /2 * /3 // 4
         */
        TNumber t19a = new TNumber();
        t19a.setType(TNumber.INTEGER_NUMBER);
        t19a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t19b = new TNumber();
        t19b.setType(TNumber.FRACTION_NUMBER);
        t19b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t19c = MathHelper.product(t19a, t19b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t19c.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t19c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t19c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(6) / 4.0, t19c.getValue());

        Assert.assertEquals(1.0, t19c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t19c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(6), t19c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t19c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t19c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0, t19c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A) * (/B // /C)
         * /2 * (/3 // /4)
         */
        TNumber t20a = new TNumber();
        t20a.setType(TNumber.INTEGER_NUMBER);
        t20a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t20b = new TNumber();
        t20b.setType(TNumber.FRACTION_NUMBER);
        t20b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t20c = MathHelper.product(t20a, t20b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t20c.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t20c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t20c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(6) / Math.sqrt(4), t20c.getValue());

        Assert.assertEquals(1.0, t20c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t20c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(6), t20c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t20c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t20c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(4), t20c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A) * (/B // C/D)
         * /2 * (/3 // 4/5)
         */
        TNumber t21a = new TNumber();
        t21a.setType(TNumber.INTEGER_NUMBER);
        t21a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t21b = new TNumber();
        t21b.setType(TNumber.FRACTION_NUMBER);
        t21b.setFraction(new Fraction(new FractionNumber(1, 0, 1, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t21c = MathHelper.product(t21a, t21b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t21c.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t21c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t21c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(6.0) / (4.0 * Math.sqrt(5)), t21c.getValue());

        Assert.assertEquals(1.0, t21c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t21c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(6), t21c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t21c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t21c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4 * Math.sqrt(5), t21c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A) * (B/C // D)
         * /2 * (3/4 // 5)
         */
        TNumber t22a = new TNumber();
        t22a.setType(TNumber.INTEGER_NUMBER);
        t22a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t22b = new TNumber();
        t22b.setType(TNumber.FRACTION_NUMBER);
        t22b.setFraction(new Fraction(new FractionNumber(2, 0, 3, 4), new FractionNumber(1, 0, 5, 1)));

        TNumber t22c = MathHelper.product(t22a, t22b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t22c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t22c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t22c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(3.0 * Math.sqrt(8.0) / 5.0, t22c.getValue());

        Assert.assertEquals(3.0, t22c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(8, t22c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(8), t22c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t22c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t22c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5.0, t22c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A) * (B/C // /D)
         * /2 * (3/4 // /5)
         */
        TNumber t23a = new TNumber();
        t23a.setType(TNumber.INTEGER_NUMBER);
        t23a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t23b = new TNumber();
        t23b.setType(TNumber.FRACTION_NUMBER);
        t23b.setFraction(new Fraction(new FractionNumber(3, 0, 3, 4), new FractionNumber(2, 0, 1, 5)));

        TNumber t23c = MathHelper.product(t23a, t23b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t23c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t23c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t23c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(3.0 * Math.sqrt(8.0) / Math.sqrt(5), t23c.getValue());

        Assert.assertEquals(3.0, t23c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(8,t23c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(3 * Math.sqrt(8), t23c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t23c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t23c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(5), t23c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A) * (B/C // D/E)
         * /2 * (3/4 // 5/6)
         */
        TNumber t24a = new TNumber();
        t24a.setType(TNumber.INTEGER_NUMBER);
        t24a.setIntegerNumber(new FractionNumber(2, 0, 1, 2));

        TNumber t24b = new TNumber();
        t24b.setType(TNumber.FRACTION_NUMBER);
        t24b.setFraction(new Fraction(new FractionNumber(3, 0, 3, 4), new FractionNumber(3, 0, 5, 6)));

        TNumber t24c = MathHelper.product(t24a, t24b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t24c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t24c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t24c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(3 * Math.sqrt(8) / (5.0 * Math.sqrt(6)), t24c.getValue());

        Assert.assertEquals(3.0, t24c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(8, t24c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(3 * Math.sqrt(8), t24c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t24c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(6, t24c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(6), t24c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * A/B * C
         * 2/3 * 4
         */
        TNumber t25a = new TNumber();
        t25a.setType(TNumber.INTEGER_NUMBER);
        t25a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t25b = new TNumber();
        t25b.setType(TNumber.INTEGER_NUMBER);
        t25b.setIntegerNumber(new FractionNumber(1, 0, 4, 1));

        TNumber t25c = MathHelper.product(t25a, t25b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t25c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t25c.getIntegerNumber().getNumberType());

        Assert.assertEquals(8.0 * Math.sqrt(3), t25c.getValue());
        Assert.assertEquals(8.0, t25c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(3, t25c.getIntegerNumber().getRootValue());


        /**
         * A/B * /C
         * 2/3 * /4
         */
        TNumber t26a = new TNumber();
        t26a.setType(TNumber.INTEGER_NUMBER);
        t26a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t26b = new TNumber();
        t26b.setType(TNumber.INTEGER_NUMBER);
        t26b.setIntegerNumber(new FractionNumber(2, 0, 1, 4));

        TNumber t26c = MathHelper.product(t26a, t26b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t26c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t26c.getIntegerNumber().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(12), t26c.getValue());
        Assert.assertEquals(2.0, t26c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(12,t26c.getIntegerNumber().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(12), t26c.getIntegerNumber().getDecimalValue());


        /**
         * A/B * C/D
         * 2/3 * 4/5
         */
        TNumber t27a = new TNumber();
        t27a.setType(TNumber.INTEGER_NUMBER);
        t27a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t27b = new TNumber();
        t27b.setType(TNumber.INTEGER_NUMBER);
        t27b.setIntegerNumber(new FractionNumber(3, 0, 4, 5));

        TNumber t27c = MathHelper.product(t27a, t27b);

        Assert.assertEquals(TNumber.INTEGER_NUMBER, t27c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t27c.getIntegerNumber().getNumberType());

        Assert.assertEquals(8.0 * Math.sqrt(15), t27c.getValue());
        Assert.assertEquals(8.0, t27c.getIntegerNumber().getIntegerValue());
        Assert.assertEquals(15,t27c.getIntegerNumber().getRootValue());
        Assert.assertEquals(8 * Math.sqrt(15), t27c.getIntegerNumber().getDecimalValue());


        /**
         * (A/B) * (A // B)
         * 2/3 * (4 // 5)
         */
        TNumber t28a = new TNumber();
        t28a.setType(TNumber.INTEGER_NUMBER);
        t28a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t28b = new TNumber();
        t28b.setType(TNumber.FRACTION_NUMBER);
        t28b.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(1, 0, 5, 1)));

        TNumber t28c = MathHelper.product(t28a, t28b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t28c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t28c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t28c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(8 * Math.sqrt(3) / 5.0, t28c.getValue());

        Assert.assertEquals(8.0, t28c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3,t28c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(8 * Math.sqrt(3), t28c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t28c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1,t28c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5.0, t28c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B) * (A // /B)
         * 2/3 * (4 // /5)
         */
        TNumber t29a = new TNumber();
        t29a.setType(TNumber.INTEGER_NUMBER);
        t29a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t29b = new TNumber();
        t29b.setType(TNumber.FRACTION_NUMBER);
        t29b.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(2, 0, 1, 5)));

        TNumber t29c = MathHelper.product(t29a, t29b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t29c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t29c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t29c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(3) * 8 / Math.sqrt(5), t29c.getValue());

        Assert.assertEquals(8.0, t29c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3,t29c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(3) * 8.0, t29c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t29c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5,t29c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(5), t29c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B) * (C // D/E)
         * 2/3 * (4 // 5/6)
         */
        TNumber t30a = new TNumber();
        t30a.setType(TNumber.INTEGER_NUMBER);
        t30a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t30b = new TNumber();
        t30b.setType(TNumber.FRACTION_NUMBER);
        t30b.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(3, 0, 5, 6)));

        TNumber t30c = MathHelper.product(t30a, t30b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t30c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t30c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t30c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(3) * 8 / (5.0 * Math.sqrt(6)), t30c.getValue());

        Assert.assertEquals(8.0, t30c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t30c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(3) * 8, t30c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t30c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(6, t30c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(6), t30c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B) * (/C // D)
         * 2/3 * (/4 // 5)
         */
        TNumber t31a = new TNumber();
        t31a.setType(TNumber.INTEGER_NUMBER);
        t31a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t31b = new TNumber();
        t31b.setType(TNumber.FRACTION_NUMBER);
        t31b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(1, 0, 5, 1)));

        TNumber t31c = MathHelper.product(t31a, t31b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t31c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t31c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t31c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2 * Math.sqrt(12) / 5.0, t31c.getValue());

        Assert.assertEquals(2.0, t31c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t31c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2 * Math.sqrt(12), t31c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t31c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t31c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5.0, t31c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B) * (/C // /D)
         * 2/3 * (/4 // /5)
         */
        TNumber t32a = new TNumber();
        t32a.setType(TNumber.INTEGER_NUMBER);
        t32a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t32b = new TNumber();
        t32b.setType(TNumber.FRACTION_NUMBER);
        t32b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(2, 0, 1, 5)));

        TNumber t32c = MathHelper.product(t32a, t32b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t32c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t32c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t32c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2 * Math.sqrt(12) / Math.sqrt(5), t32c.getValue());

        Assert.assertEquals(2.0, t32c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t32c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2 * Math.sqrt(12), t32c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t32c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t32c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(5), t32c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B) * (/C // D/E)
         * 2/3 * (/4 // 5/6)
         */
        TNumber t33a = new TNumber();
        t33a.setType(TNumber.INTEGER_NUMBER);
        t33a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t33b = new TNumber();
        t33b.setType(TNumber.FRACTION_NUMBER);
        t33b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(3, 0, 5, 6)));

        TNumber t33c = MathHelper.product(t33a, t33b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t33c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t33c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t33c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2 * Math.sqrt(12) / (5.0 * Math.sqrt(6)), t33c.getValue());

        Assert.assertEquals(2.0, t33c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t33c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2 * Math.sqrt(12), t33c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t33c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(6, t33c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(6), t33c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B) * (B/C // D)
         * 2/3* (4/5 // 6)
         */
        TNumber t34a = new TNumber();
        t34a.setType(TNumber.INTEGER_NUMBER);
        t34a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t34b = new TNumber();
        t34b.setType(TNumber.FRACTION_NUMBER);
        t34b.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t34c = MathHelper.product(t34a, t34b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t34c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t34c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t34c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(8.0 * Math.sqrt(15.0) / 6.0, t34c.getValue());

        Assert.assertEquals(8.0, t34c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(15, t34c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(8.0 * Math.sqrt(15), t34c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(6.0, t34c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t34c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(6.0, t34c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B) * (C/D // /E)
         * 2/3 * (4/5 // /6)
         */
        TNumber t35a = new TNumber();
        t35a.setType(TNumber.INTEGER_NUMBER);
        t35a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t35b = new TNumber();
        t35b.setType(TNumber.FRACTION_NUMBER);
        t35b.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t35c = MathHelper.product(t35a, t35b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t35c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t35c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t35c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(8.0 * Math.sqrt(15) / Math.sqrt(6), t35c.getValue());

        Assert.assertEquals(8.0, t35c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(15,t35c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(8 * Math.sqrt(15), t35c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t35c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(6, t35c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(6), t35c.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B) * (C/D // E/F)
         * 2/3 * (4/5 // 6/7)
         */
        TNumber t36a = new TNumber();
        t36a.setType(TNumber.INTEGER_NUMBER);
        t36a.setIntegerNumber(new FractionNumber(3, 0, 2, 3));

        TNumber t36b = new TNumber();
        t36b.setType(TNumber.FRACTION_NUMBER);
        t36b.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t36c = MathHelper.product(t36a, t36b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t36c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t36c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t36c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(8 * Math.sqrt(15) / (6.0 * Math.sqrt(7)), t36c.getValue());

        Assert.assertEquals(8.0, t36c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(15, t36c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(8 * Math.sqrt(15), t36c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(6.0, t36c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(7, t36c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(6 * Math.sqrt(7), t36c.getFraction().getSecondFraction().getDecimalValue());

    }
}
