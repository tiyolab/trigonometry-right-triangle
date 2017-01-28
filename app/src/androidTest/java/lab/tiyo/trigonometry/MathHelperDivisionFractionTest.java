package lab.tiyo.trigonometry;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import lab.tiyo.fraction.models.Fraction;
import lab.tiyo.fraction.models.FractionNumber;
import lab.tiyo.fraction.models.TNumber;
import lab.tiyo.trigonometry.helpers.MathHelper;

/**
 * Created by root on 12/01/17.
 */
public class MathHelperDivisionFractionTest extends AndroidTestCase {
    public void test1(){
        /**
         * (A // B) / (C // d)
         * (2 // 3) / (4 // 5) => (2 // 3) * (5 // 4)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(1, 0, 5, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(10.0 / 12.0, t3a.getValue());

        Assert.assertEquals(10.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(10.0, t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0, t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B) / (C // /d)
         * (2 // 3) / (4 // /5) => (2 // 3) * (/5 // 4)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(2, 0, 1, 5)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(5) / 12, t3b.getValue());

        Assert.assertEquals(2.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(5, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(5), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0, t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B) // (C // D/E)
         * (2 // 3) // (4 // 5/6) => (2 // 3) * (5/6 // 4)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(3, 0, 5, 6)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((10.0 * Math.sqrt(6) / 12), t3c.getValue());

        Assert.assertEquals(10.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(10.0 * Math.sqrt(6), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0 , t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A // B) / (/C // D)
         * (2 // 3) / (/4 // 5) => (2 // 3) * (5 // /4)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(1, 0, 5, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(10.0  / (3.0 * Math.sqrt(4)), t3d.getValue());

        Assert.assertEquals(10.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(10.0, t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(4), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B) // (/C // /d)
         * (2 // 3) // (/4 // /5) => (2 // 3) * (/5 // /4)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(1, 0, 1, 4), new FractionNumber(2, 0, 1, 5)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(5)) / (3 * Math.sqrt(4)), t3e.getValue());

        Assert.assertEquals(2.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(5, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(5), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(4), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B) // (/C // D/E)
         * (2 // 3) // (/4 // 5/6) => (2 // 3) * (5/6 // /4)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(3, 0, 5, 6)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((10.0 * Math.sqrt(6)) / (3.0 * Math.sqrt(4)), t3f.getValue());

        Assert.assertEquals(10.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(10.0 * Math.sqrt(6), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(4), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B) // (C/D // E)
         * (2 // 3) // (4/5 // 6) => (2 // 3) * (6 // 4/5)
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((12.0) / (12.0 * Math.sqrt(5)), t3g.getValue());

        Assert.assertEquals(12.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0, t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(5), t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B) // (C/D // /E)
         * (2 // 3) // (4/5 // /6) => (2 // 3) * (/6 // 4/5)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(6)) / (12 * Math.sqrt(5)), t3h.getValue());

        Assert.assertEquals(2.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(6), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(5), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B) // (C/D // E/F)
         * (2 // 3) // (4/5 // 6/7) => (2 // 3) * (6/7 // 4/5)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(1, 0, 3, 1)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((12.0 * Math.sqrt(7)) / (12.0 * Math.sqrt(5)), t3i.getValue());

        Assert.assertEquals(12.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(7, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(7), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(5), t3i.getFraction().getSecondFraction().getDecimalValue());
    }

    public void test2(){
        /**
         * (A // /B) // (C // d)
         * (2 // /3) // (4 // 5) => (2 // /3) * (5 // 4)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(1, 0, 5, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(10.0 / (Math.sqrt(3) * 4.0), t3a.getValue());

        Assert.assertEquals(10.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(10.0, t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(3, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(3) * 4.0, t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // /B) // (C // /d)
         * (2 // /3) // (4 // /5) => (2 // /3) * (/5 // 4)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(2, 0, 1, 5)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(5)/ (4 * Math.sqrt(3)), t3b.getValue());

        Assert.assertEquals(2.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(5, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(5), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(3, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(3), t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // /B) // (C // D/E)
         * (2 // /3) // (4 // 5/6) => (2 // /3) * (5/6 // 4)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(3, 0, 5, 6)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(10.0 * Math.sqrt(6)/ (4.0 * Math.sqrt(3)), t3c.getValue());

        Assert.assertEquals(10.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(10.0 * Math.sqrt(6), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(3, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(3), t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A // /B) // (/C // D)
         * (2 // /3) // (/4 // 5) => (2 // /3) * (5 // /4)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(1, 0, 5, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(10.0 / (Math.sqrt(12)), t3d.getValue());

        Assert.assertEquals(10.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(10.0, t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(12, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // /B) // (/C // /d)
         * (2 // /3) // (/4 // /5) => (2 // /3) * (/5 // /4)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(1, 0, 1, 4), new FractionNumber(2, 0, 1, 5)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(5)) / (Math.sqrt(12)), t3e.getValue());

        Assert.assertEquals(2.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(5, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(5), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(12, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // /B) // (/C // D/E)
         * (2 // /3) // (/4 // 5/6) => (2 // /3) * (5/6 // /4)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(3, 0, 5, 6)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((10.0 * Math.sqrt(6)) / (Math.sqrt(12)), t3f.getValue());

        Assert.assertEquals(10.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(10.0 * Math.sqrt(6), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(12, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // /B) // (C/D // E)
         * (2 // /3) // (4/5 // 6) => (2 // /3) * (6 // 4/5)
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((12.0) / (4.0 * Math.sqrt(15)), t3g.getValue());

        Assert.assertEquals(12.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0, t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(15, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(15) * 4.0, t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // /B) // (C/D // /E)
         * (2 // /3) // (4/5 // /6) => (2 // /3) * (/6 // 4/5)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(6)) / (4 * Math.sqrt(15)), t3h.getValue());

        Assert.assertEquals(2.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(6), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(15, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(15), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // /B) // (C/D // E/F)
         * (2 // /3) // (4/5 // 6/7) => (2 // /3) * (6/7 // 4/5)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(2, 0, 1, 3)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((12.0 * Math.sqrt(7)) / (4.0 * Math.sqrt(15)), t3i.getValue());

        Assert.assertEquals(12.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(7, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(7), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(15, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(15), t3i.getFraction().getSecondFraction().getDecimalValue());
    }

    public void test3(){
        /**
         * (A // B/C) * (D // E)
         * (2 // 3/4) * (5 // 6) => (2 // 3/4) // (6 // 5)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(1, 0, 6, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12.0 / (15.0 * Math.sqrt(4)), t3a.getValue());

        Assert.assertEquals(12.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0, t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(4), t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B/C) // (D // /E)
         * (2 // 3/4) // (5 // /6) => (2 // 3/4) * (/6 // 5)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(2, 0, 1, 6)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(6) / (15 * Math.sqrt(4)), t3b.getValue());

        Assert.assertEquals(2.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(6), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(4), t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B/C) // (D // E/F)
         * (2 // 3/4) // (5 // 6/7) => (2 // 3/4) * (6/7 // 5)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(3, 0, 6, 7)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12.0 * Math.sqrt(7)/ (15.0 * Math.sqrt(4)), t3c.getValue());

        Assert.assertEquals(12.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(7, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(7), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(4), t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A // B/C) // (/D // E)
         * (2 // 3/4) // (/5 // 6) => (2 // 3/4) * (6 // /5)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12. / (3.0 * Math.sqrt(20)), t3d.getValue());

        Assert.assertEquals(12.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(1), t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(20), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B/C) // (/D // /E)
         * (2 // 3/4) // (/5 // /6) => (2 // 3/4) * (/6 // /5)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(6)) / (3 * Math.sqrt(20)), t3e.getValue());

        Assert.assertEquals(2.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(6, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(6), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(20), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B/C) * (/D // E/F)
         * (2 // 3/4) * (/5 // 6/7) => (2 // 3/4) * (6/7 // /5)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((12.0 * Math.sqrt(7)) / (3.0 * Math.sqrt(20)), t3f.getValue());

        Assert.assertEquals(12.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(7, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(7), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(20), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B/C) // (D/E // F)
         * (2 // 3/4) // (5/6 // 7) => (2 // 3/4) * (7 // 5/6)
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(1, 0, 7, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((14.0) / (15.0 * Math.sqrt(24)), t3g.getValue());

        Assert.assertEquals(14.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(1, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0, t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(24), t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B/C) // (D/E // /F)
         * (2 // 3/4) // (5/6 // /7) => (2 // 3/4) * (/7 // 5/6)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(2, 0, 1, 7)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(7)) / (15 * Math.sqrt(24)), t3h.getValue());

        Assert.assertEquals(2.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(7, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(7), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(24), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A // B/C) // (D/E // F/G)
         * (2 // 3/4) // (5/6 // 7/8) => (2 // 3/4) * (7/8 // 5/6)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(1, 0, 2, 1), new FractionNumber(3, 0, 3, 4)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(3, 0, 7, 8)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((14.0 * Math.sqrt(8)) / (15.0 * Math.sqrt(24)), t3i.getValue());

        Assert.assertEquals(14.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(8, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(8), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(24), t3i.getFraction().getSecondFraction().getDecimalValue());
    }

    public void test4(){
        /**
         * (/A // B) // (C // d)
         * (/2 // 3) // (4 // 5) => (/2 // 3) * (5 // 4)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(1, 0, 5, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(5.0 * Math.sqrt(2) / 12.0, t3a.getValue());

        Assert.assertEquals(5.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(5.0 * Math.sqrt(2), t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0, t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B) // (C // /d)
         * (/2 // 3) // (4 // /5) => (/2 // 3) * (/5 // 4)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(2, 0, 1, 5)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(10) / 12, t3b.getValue());

        Assert.assertEquals(1.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(10, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(10), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0, t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B) // (C // D/E)
         * (/2 // 3) // (4 // 5/6) => (/2 // 3) * (5/6 // 4)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(3, 0, 5, 6)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(5.0 * Math.sqrt(12) / (12.0), t3c.getValue());

        Assert.assertEquals(5.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(5.0 * Math.sqrt(12), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0, t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A // B) // (/C // D)
         * (/2 // 3) // (/4 // 5) => (/2 // 3) * (5 // /4)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(1, 0, 5, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(5 * Math.sqrt(2) / (3.0 * Math.sqrt(4)), t3d.getValue());

        Assert.assertEquals(5.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(2), t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(4), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B) // (/C // /d)
         * (/2 // 3) // (/4 // /5) => (/2 // 3) * (/5 // /4)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(1, 0, 1, 4), new FractionNumber(2, 0, 1, 5)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((Math.sqrt(10)) / (3 * Math.sqrt(4)), t3e.getValue());

        Assert.assertEquals(1.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(10, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(10), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(4), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B) // (/C // D/E)
         * (/2 // 3) // (/4 // 5/6) => (/2 // 3) * (5/6 // /4)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(3, 0, 5, 6)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((5 * Math.sqrt(12)) / (3.0 * Math.sqrt(4)), t3f.getValue());

        Assert.assertEquals(5.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(12), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(4), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B) // (C/D // E)
         * (/2 // 3) // (4/5 // 6) => (/2 // 3) * (6 // 4/5)
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((6.0 * Math.sqrt(2)) / (12 * Math.sqrt(5)), t3g.getValue());

        Assert.assertEquals(6.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0 * Math.sqrt(2), t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(5), t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B) // (C/D // /E)
         * (/2 // 3) // (4/5 // /6) => (/2 // 3) * (/6 // 4/5)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((Math.sqrt(12)) / (12 * Math.sqrt(5)), t3h.getValue());

        Assert.assertEquals(1.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(5), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B) // (C/D // E/F)
         * (/2 // 3) // (4/5 // 6/7) => (/2 // 3) * (6/7 // 4/5)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(1, 0, 3, 1)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((6.0 * Math.sqrt(14)) / (12.0 * Math.sqrt(5)), t3i.getValue());

        Assert.assertEquals(6.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(14, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0 * Math.sqrt(14), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(12.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(5), t3i.getFraction().getSecondFraction().getDecimalValue());
    }

    public void test5(){
        /**
         * (/A // /B) // (C // d)
         * (/2 // /3) // (4 // 5) => (/2 // /3) * (5 // 4)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(1, 0, 5, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(5.0 * Math.sqrt(2) / (Math.sqrt(3) * 4.0), t3a.getValue());

        Assert.assertEquals(5.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(5.0 * Math.sqrt(2), t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(3, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(3) * 4.0, t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // /B) // (C // /d)
         * (/2 // /3) // (4 // /5) => (/2 // /3) * (/5 // 4)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(2, 0, 1, 5)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(10) / (4 * Math.sqrt(3)), t3b.getValue());

        Assert.assertEquals(1.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(10, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(10), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(3, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4 * Math.sqrt(3), t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // /B) // (C // D/E)
         * (/2 // /3) // (4 // 5/6) => (/2 // /3) * (5/6 // 4)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 4, 1), new FractionNumber(3, 0, 5, 6)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(5.0 * Math.sqrt(12) / (4.0 * Math.sqrt(3)), t3c.getValue());

        Assert.assertEquals(5.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(5.0 * Math.sqrt(12), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(3, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(3), t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A // /B) // (/C // D)
         * (/2 // /3) // (/4 // 5) => (/2 // /3) * (5 // /4)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(1, 0, 5, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(5 * Math.sqrt(2) / (Math.sqrt(12)), t3d.getValue());

        Assert.assertEquals(5.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(2), t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(12, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // /B) // (/C // /d)
         * (/2 // /3) // (/4 // /5) => (/2 // /3) * (/5 // /4)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(1, 0, 1, 4), new FractionNumber(2, 0, 1, 5)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((Math.sqrt(10)) / (Math.sqrt(12)), t3e.getValue());

        Assert.assertEquals(1.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(10, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(10), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(12, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // /B) // (/C // D/E)
         * (/2 // /3) // (/4 // 5/6) => (/2 // /3) * (5/6 // /4)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 4), new FractionNumber(3, 0, 5, 6)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((5 * Math.sqrt(12)) / (Math.sqrt(12)), t3f.getValue());

        Assert.assertEquals(5.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(12), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(12, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // /B) // (C/D // E)
         * (/2 // /3) // (4/5 // 6) => (/2 // /3) * (6 // 4/5)
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((6.0 * Math.sqrt(2)) / (4.0 * Math.sqrt(15)), t3g.getValue());

        Assert.assertEquals(6.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0 * Math.sqrt(2), t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(15, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(15) * 4.0, t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // /B) // (C/D // /E)
         * (/2 // /3) // (4/5 // /6) => (/2 // /3) * (/6 // 4/5)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((Math.sqrt(12)) / (4 * Math.sqrt(15)), t3h.getValue());

        Assert.assertEquals(1.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(15, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4 * Math.sqrt(15), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // /B) // (C/D // E/F)
         * (/2 // /3) // (4/5 // 6/7) => (/2 // /3) * (6/7 // 4/5)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(2, 0, 1, 3)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 4, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((6.0 * Math.sqrt(14)) / (4.0 * Math.sqrt(15)), t3i.getValue());

        Assert.assertEquals(6.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(14, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6.0 * Math.sqrt(14), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(15, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(15), t3i.getFraction().getSecondFraction().getDecimalValue());
    }

    public void test6(){
        /**
         * (/A // B/C) // (D // E)
         * (/2 // 3/4) // (5 // 6) => (/2 // 3/4) * (6 // 5)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(1, 0, 6, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6.0 * Math.sqrt(2)/ (15.0 * Math.sqrt(4)), t3a.getValue());

        Assert.assertEquals(6.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6 * Math.sqrt(2), t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(4), t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B/C) // (D // /E)
         * (/2 // 3/4) // (5 // /6) => (/2 // 3/4) * (/6 // 5)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(2, 0, 1, 6)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(12) / (15 * Math.sqrt(4)), t3b.getValue());

        Assert.assertEquals(1.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(4), t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B/C) // (D // E/F)
         * (/2 // 3/4) // (5 // 6/7) => (/2 // 3/4) * (6/7 // 5)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(5, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(3, 0, 6, 7)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6.0 * Math.sqrt(14)/ (15.0 * Math.sqrt(4)), t3c.getValue());

        Assert.assertEquals(6.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(14, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6 * Math.sqrt(14), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(4), t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (/A // B/C) // (/D // E)
         * (/2 // 3/4) // (/5 // 6) => (/2 // 3/4) * (6 // /5)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(6 * Math.sqrt(2) / (3.0 * Math.sqrt(20)), t3d.getValue());

        Assert.assertEquals(6.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6 * Math.sqrt(2), t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(20), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B/C) // (/D // /E)
         * (/2 // 3/4) // (/5 // /6) => (/2 // 3/4) * (/6 // /5)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(Math.sqrt(12) / (3 * Math.sqrt(20)), t3e.getValue());

        Assert.assertEquals(1.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(12, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(12), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(20), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B/C) // (/D // E/F)
         * (/2 // 3/4) // (/5 // 6/7) => (/2 // 3/4) * (6/7 // /5)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((6 * Math.sqrt(14)) / (3.0 * Math.sqrt(20)), t3f.getValue());

        Assert.assertEquals(6.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(14, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(6 * Math.sqrt(14), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(3.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(3.0 * Math.sqrt(20), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B/C) // (D/E // F)
         * (/2 // 3/4) // (5/6 // 7)  => (/2 // 3/4) * (7 // 5/6)
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(1, 0, 7, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((7.0 * Math.sqrt(2)) / (15.0 * Math.sqrt(24)), t3g.getValue());

        Assert.assertEquals(7.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(2, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(7.0 * Math.sqrt(2), t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(24), t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B/C) // (D/E // /F)
         * (/2 // 3/4) // (5/6 // /7) => (/2 // 3/4) * (/7 // 5/6)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(2, 0, 1, 7)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((Math.sqrt(14)) / (15 * Math.sqrt(24)), t3h.getValue());

        Assert.assertEquals(1.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(14, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(14), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(24), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (/A // B/C) // (D/E // F/G)
         * (/2 // 3/4) // (5/6 // 7/8) => (/2 // 3/4) * (7/8 // 5/6)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(2, 0, 1, 2), new FractionNumber(3, 0, 3, 4)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(3, 0, 7, 8)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((7.0 * Math.sqrt(16)) / (15.0 * Math.sqrt(24)), t3i.getValue());

        Assert.assertEquals(7.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(16, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(7.0 * Math.sqrt(16), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(15.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(15.0 * Math.sqrt(24), t3i.getFraction().getSecondFraction().getDecimalValue());
    }

    public void test7(){
        /**
         * (A/B // C) // (E // F)
         * (2/3 // 4) // (5 // 6) => (2/3 // 4) * (6 // 5)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(1, 0, 6, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12.0 * Math.sqrt(3)/ 20.0, t3a.getValue());

        Assert.assertEquals(12.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(3), t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(20.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(20.0, t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C) // (D // /E)
         * (2/3 // 4) // (5 // /6) => (2/3 // 4) * (/6 // 5)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(2, 0, 1, 6)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(18) / 20, t3b.getValue());

        Assert.assertEquals(2.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(18, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(18), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(20.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(20.0, t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C) // (D // E/F)
         * (2/3 // 4) // (5 // 6/7) => (2/3 // 4) * (6/7 // 5)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(3, 0, 6, 7)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12.0 * Math.sqrt(21)/ 20, t3c.getValue());

        Assert.assertEquals(12.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(21, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(21), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(20.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(1, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(20.0, t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A/B // C) // (/D // E)
         * (2/3 // 4) // (/5 // 6) => (2/3 // 4) * (6 // /5)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12.0 * Math.sqrt(3) / (4 * Math.sqrt(5)), t3d.getValue());

        Assert.assertEquals(12.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(3), t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(5), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C) // (/D // /E)
         * (2/3 // 4) // (/5 // /6) => (2/3 // 4) * (/6 // /5)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(18)) / (4 * Math.sqrt(5)), t3e.getValue());

        Assert.assertEquals(2.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(18, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(18), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(5), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C) // (/D // E/F)
         * (2/3 // 4) // (/5 // 6/7) => (2/3 // 4) * (6/7 // /5)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((12.0 * Math.sqrt(21)) / (4.0 * Math.sqrt(5)), t3f.getValue());

        Assert.assertEquals(12.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(21, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(21), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(5), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C) // (D/E // F)
         * (2/3 // 4) // (5/6 // 7) => (2/3 // 4) * (7 // 5/6)
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(1, 0, 7, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((14.0 * Math.sqrt(3)) / (20.0 * Math.sqrt(6)), t3g.getValue());

        Assert.assertEquals(14.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(3), t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(20.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(6, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(20.0 * Math.sqrt(6), t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C) // (D/E // /F)
         * (2/3 // 4) // (5/6 // /7) => (2/3 // 4) * (/7 // 5/6)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(2, 0, 1, 7)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(21)) / (20 * Math.sqrt(6)), t3h.getValue());

        Assert.assertEquals(2.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(21, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(21), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(20.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(6, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(20.0 * Math.sqrt(6), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C) // (D/E // F/G)
         * (2/3 // 4) // (5/6 // 7/8) => (2/3 // 4) * (7/8 // 5/6)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 4, 1)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(3, 0, 7, 8)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((14.0 * Math.sqrt(24)) / (20.0 * Math.sqrt(6)), t3i.getValue());

        Assert.assertEquals(14.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(24, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(24), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(20.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(6, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(20.0 * Math.sqrt(6), t3i.getFraction().getSecondFraction().getDecimalValue());
    }

    public void test8(){
        /**
         * (A/B // /C) // (E // F)
         * (2/3 // /4) // (5 // 6) => (2/3 // /4) * (6 // 5)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(1, 0, 1, 4)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(1, 0, 6, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12.0 * Math.sqrt(3)/ (5 * Math.sqrt(4)), t3a.getValue());

        Assert.assertEquals(12.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(3), t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5.0 * Math.sqrt(4), t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // /C) // (D // /E)
         * (2/3 // /4) // (5 // /6) => (2/3 // /4) * (/6 // 5)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(2, 0, 1, 6)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(18) / (5 * Math.sqrt(4)), t3b.getValue());

        Assert.assertEquals(2.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(18, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(18), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(4), t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // /C) // (D // E/F)
         * (2/3 // /4) // (5 // 6/7) => (2/3 // /4) * (6/7 // 5)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 5, 1), new FractionNumber(3, 0, 6, 7)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12.0 * Math.sqrt(21)/ (5.0 * Math.sqrt(4)), t3c.getValue());

        Assert.assertEquals(12.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(21, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(21), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(4, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5.0 * Math.sqrt(4), t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A/B // /C) // (/D // E)
         * (2/3 // /4) // (/5 // 6) => (2/3 // /4) * (6 // /5)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(1, 0, 6, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(12.0 * Math.sqrt(3) / (Math.sqrt(20)), t3d.getValue());

        Assert.assertEquals(12.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(3), t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(20), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // /C) // (/D // /E)
         * (2/3 // /4) // (/5 // /6) => (2/3 // /4) * (/6 // /5)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(2, 0, 1, 6)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(18)) / (Math.sqrt(20)), t3e.getValue());

        Assert.assertEquals(2.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(18, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(18), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(20), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // /C) // (/D // E/F)
         * (2/3 // /4) // (/5 // 6/7) => (2/3 // /4) * (6/7 // /5)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 5), new FractionNumber(3, 0, 6, 7)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((12.0 * Math.sqrt(21)) / (Math.sqrt(20)), t3f.getValue());

        Assert.assertEquals(12.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(21, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(12.0 * Math.sqrt(21), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(1.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(20, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(Math.sqrt(20), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // /C) * (D/E // F)
         * (2/3 // /4) * (5/6 // 7) => (2/3 // /4) * (7 // 5/6 )
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(1, 0, 7, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((14.0 * Math.sqrt(3)) / (5 * Math.sqrt(24)), t3g.getValue());

        Assert.assertEquals(14.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(3), t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5.0 * Math.sqrt(24), t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // /C) // (D/E // /F)
         * (2/3 // /4) // (5/6 // /7) => (2/3 // /4) * (/7 // 5/6)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(2, 0, 1, 7)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(21)) / (5 * Math.sqrt(24)), t3h.getValue());

        Assert.assertEquals(2.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(21, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(21), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5 * Math.sqrt(24), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // /C) // (D/E // F/G)
         * (2/3 // /4) // (5/6 // 7/8) => (2/3 // /4) * (7/8 // 5/6)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(2, 0, 1, 4)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 5, 6), new FractionNumber(3, 0, 7, 8)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((14.0 * Math.sqrt(24)) / (5.0 * Math.sqrt(24)), t3i.getValue());

        Assert.assertEquals(14.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(24, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(24), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(5.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(24, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(5.0 * Math.sqrt(24), t3i.getFraction().getSecondFraction().getDecimalValue());
    }

    public void test9(){
        /**
         * (A/B // C/D) // (E // F)
         * (2/3 // 4/5) // (6 // 7) => (2/3 // 4/5) * (7 // 6)
         */
        TNumber t1a = new TNumber();
        t1a.setType(TNumber.FRACTION_NUMBER);
        t1a.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2a = new TNumber();
        t2a.setType(TNumber.FRACTION_NUMBER);
        t2a.setFraction(new Fraction(new FractionNumber(1, 0, 6, 1), new FractionNumber(1, 0, 7, 1)));

        TNumber t3a = MathHelper.division(t1a, t2a);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3a.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3a.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(14.0 * Math.sqrt(3)/ (24.0 * Math.sqrt(5)), t3a.getValue());

        Assert.assertEquals(14.0, t3a.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3a.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(3), t3a.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(24.0, t3a.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3a.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(24.0 * Math.sqrt(5), t3a.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C/D) // (E // /F)
         * (2/3 // 4/5) // (6 // /7) => (2/3 // 4/5) * (/7 // 6)
         */
        TNumber t1b = new TNumber();
        t1b.setType(TNumber.FRACTION_NUMBER);
        t1b.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2b = new TNumber();
        t2b.setType(TNumber.FRACTION_NUMBER);
        t2b.setFraction(new Fraction(new FractionNumber(1, 0, 6, 1), new FractionNumber(2, 0, 1, 7)));

        TNumber t3b = MathHelper.division(t1b, t2b);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3b.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3b.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(2.0 * Math.sqrt(21) / (24 * Math.sqrt(5)), t3b.getValue());

        Assert.assertEquals(2.0, t3b.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(21, t3b.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(21), t3b.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(24.0, t3b.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3b.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(24.0 * Math.sqrt(5), t3b.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C/D) // (E // F/G)
         * (2/3 // 4/5) // (6 // 7/8) => (2/3 // 4/5) * (7/8 // 6)
         */
        TNumber t1c = new TNumber();
        t1c.setType(TNumber.FRACTION_NUMBER);
        t1c.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2c = new TNumber();
        t2c.setType(TNumber.FRACTION_NUMBER);
        t2c.setFraction(new Fraction(new FractionNumber(1, 0, 6, 1), new FractionNumber(3, 0, 7, 8)));

        TNumber t3c = MathHelper.division(t1c, t2c);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3c.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3c.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(14.0 * Math.sqrt(24)/ (24.0 * Math.sqrt(5)), t3c.getValue());

        Assert.assertEquals(14.0, t3c.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(24, t3c.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(24), t3c.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(24.0, t3c.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(5, t3c.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(24.0 * Math.sqrt(5), t3c.getFraction().getSecondFraction().getDecimalValue());

        /**
         * (A/B // C/D) // (/E // F)
         * (2/3 // 4/5) // (/6 // 7) => (2/3 // 4/5) * (7 // /6)
         */
        TNumber t1d = new TNumber();
        t1d.setType(TNumber.FRACTION_NUMBER);
        t1d.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2d = new TNumber();
        t2d.setType(TNumber.FRACTION_NUMBER);
        t2d.setFraction(new Fraction(new FractionNumber(2, 0, 1, 6), new FractionNumber(1, 0, 7, 1)));

        TNumber t3d = MathHelper.division(t1d, t2d);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3d.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3d.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals(14.0 * Math.sqrt(3) / (4.0 * Math.sqrt(30)), t3d.getValue());

        Assert.assertEquals(14.0, t3d.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3d.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(3), t3d.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3d.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(30, t3d.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(30), t3d.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C/D) // (/E // /F)
         * (2/3 // 4/5) // (/6 // /7) => (2/3 // 4/5) * (/7 // /6)
         */
        TNumber t1e = new TNumber();
        t1e.setType(TNumber.FRACTION_NUMBER);
        t1e.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2e = new TNumber();
        t2e.setType(TNumber.FRACTION_NUMBER);
        t2e.setFraction(new Fraction(new FractionNumber(2, 0, 1, 6), new FractionNumber(2, 0, 1, 7)));

        TNumber t3e = MathHelper.division(t1e, t2e);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3e.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3e.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(21)) / (4 * Math.sqrt(30)), t3e.getValue());

        Assert.assertEquals(2.0, t3e.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(21, t3e.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(21), t3e.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3e.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(30, t3e.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(30), t3e.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C/D) // (/E // F/G)
         * (2/3 // 4/5) // (/6 // 7/8) => (2/3 // 4/5) * (7/8 // /6)
         */
        TNumber t1f = new TNumber();
        t1f.setType(TNumber.FRACTION_NUMBER);
        t1f.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2f = new TNumber();
        t2f.setType(TNumber.FRACTION_NUMBER);
        t2f.setFraction(new Fraction(new FractionNumber(2, 0, 1, 6), new FractionNumber(3, 0, 7, 8)));

        TNumber t3f = MathHelper.division(t1f, t2f);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3f.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3f.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((14.0 * Math.sqrt(24)) / (4.0 * Math.sqrt(30)), t3f.getValue());

        Assert.assertEquals(14.0, t3f.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(24, t3f.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(14.0 * Math.sqrt(24), t3f.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(4.0, t3f.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(30, t3f.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(4.0 * Math.sqrt(30), t3f.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C/D) // (E/F // G)
         * (2/3 // 4/5) // (6/7 // 8) => (2/3 // 4/5) * (8 // 6/7)
         */
        TNumber t1g = new TNumber();
        t1g.setType(TNumber.FRACTION_NUMBER);
        t1g.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2g = new TNumber();
        t2g.setType(TNumber.FRACTION_NUMBER);
        t2g.setFraction(new Fraction(new FractionNumber(3, 0, 6, 7), new FractionNumber(1, 0, 8, 1)));

        TNumber t3g = MathHelper.division(t1g, t2g);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3g.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3g.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((16.0 * Math.sqrt(3)) / (24 * Math.sqrt(35)), t3g.getValue());

        Assert.assertEquals(16.0, t3g.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(3, t3g.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(16.0 * Math.sqrt(3), t3g.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(24.0, t3g.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(35, t3g.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(24.0 *Math.sqrt(35), t3g.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C/D) // (E/F // /G)
         * (2/3 // 4/5) // (6/7 // /8) => (2/3 // 4/5) * (/8 // 6/7)
         */
        TNumber t1h = new TNumber();
        t1h.setType(TNumber.FRACTION_NUMBER);
        t1h.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2h = new TNumber();
        t2h.setType(TNumber.FRACTION_NUMBER);
        t2h.setFraction(new Fraction(new FractionNumber(3, 0, 6, 7), new FractionNumber(2, 0, 1, 8)));

        TNumber t3h = MathHelper.division(t1h, t2h);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3h.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3h.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((2.0 * Math.sqrt(24)) / (24 * Math.sqrt(35)), t3h.getValue());

        Assert.assertEquals(2.0, t3h.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(24, t3h.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(2.0 * Math.sqrt(24), t3h.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(24.0, t3h.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(35, t3h.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(24.0 * Math.sqrt(35), t3h.getFraction().getSecondFraction().getDecimalValue());


        /**
         * (A/B // C/D) // (E/F // G/H)
         * (2/3 // 4/5) // (6/7 // 8/9) => (2/3 // 4/5) * (8/9 // 6/7)
         */
        TNumber t1i = new TNumber();
        t1i.setType(TNumber.FRACTION_NUMBER);
        t1i.setFraction(new Fraction(new FractionNumber(3, 0, 2, 3), new FractionNumber(3, 0, 4, 5)));

        TNumber t2i = new TNumber();
        t2i.setType(TNumber.FRACTION_NUMBER);
        t2i.setFraction(new Fraction(new FractionNumber(3, 0, 6, 7), new FractionNumber(3, 0, 8, 9)));

        TNumber t3i = MathHelper.division(t1i, t2i);

        Assert.assertEquals(TNumber.FRACTION_NUMBER, t3i.getType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getFirstFraction().getNumberType());
        Assert.assertEquals(FractionNumber.INTEGER_ROOT_TYPE, t3i.getFraction().getSecondFraction().getNumberType());

        Assert.assertEquals((16.0 * Math.sqrt(27)) / (24.0 * Math.sqrt(35)), t3i.getValue());

        Assert.assertEquals(16.0, t3i.getFraction().getFirstFraction().getIntegerValue());
        Assert.assertEquals(27, t3i.getFraction().getFirstFraction().getRootValue());
        Assert.assertEquals(16.0 * Math.sqrt(27), t3i.getFraction().getFirstFraction().getDecimalValue());

        Assert.assertEquals(24.0, t3i.getFraction().getSecondFraction().getIntegerValue());
        Assert.assertEquals(35, t3i.getFraction().getSecondFraction().getRootValue());
        Assert.assertEquals(24.0 * Math.sqrt(35), t3i.getFraction().getSecondFraction().getDecimalValue());
    }
}
