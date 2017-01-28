package lab.tiyo.trigonometry;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lab.tiyo.fraction.models.Fraction;
import lab.tiyo.fraction.models.FractionNumber;
import lab.tiyo.fraction.models.TNumber;
import lab.tiyo.trigonometry.helpers.AngleConverterHelper;
import lab.tiyo.trigonometry.helpers.ConstantHelper;
import lab.tiyo.trigonometry.helpers.MathHelper;
import lab.tiyo.trigonometry.models.ItemAnswer;
import lab.tiyo.trigonometry.models.ItemDescriptionDialog;
import lab.tiyo.trigonometry.models.RightTriangleRule;

/**
 * Created by root on 25/01/17.
 */
public class FindAngleATest extends AndroidTestCase {

    /**
     * test ruleAngleA1, angle C known
     */
    public void testRuleAngleA1_1(){
        Map<String, ItemDescriptionDialog> listItemsDescription = new HashMap<String, ItemDescriptionDialog>();
        ArrayList<ItemDescriptionDialog> listItemsQuestion = new ArrayList<ItemDescriptionDialog>();

        TNumber t1 = new TNumber();
        t1.setType(TNumber.INTEGER_NUMBER);
        t1.setIntegerNumber(new FractionNumber(1, 0, 30, 1));

        ItemDescriptionDialog id = new ItemDescriptionDialog(ConstantHelper.ANGLE_C,"<C",null);
        id.setTNumber(t1);

        listItemsDescription.put(ConstantHelper.ANGLE_C, id);

        listItemsQuestion.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_A, "<A", null));

        RightTriangleRule resolver = new RightTriangleRule();
        ArrayList<ItemAnswer> asw = resolver.resolve(listItemsDescription, listItemsQuestion);

        Assert.assertEquals(3, asw.size());
        Assert.assertEquals("<A", asw.get(0).getLeftOperand().getTitle());
        Assert.assertEquals("90", asw.get(0).getRightOperand().get(0).getTitle());
        Assert.assertEquals(" - ", asw.get(0).getRightOperand().get(1).getTitle());
        Assert.assertEquals("<C", asw.get(0).getRightOperand().get(2).getTitle());

        Assert.assertEquals("<A", asw.get(1).getLeftOperand().getTitle());
        Assert.assertEquals("90", asw.get(1).getRightOperand().get(0).getTitle());
        Assert.assertEquals(" - ", asw.get(1).getRightOperand().get(1).getTitle());
        Assert.assertEquals(id.getTNumber(), asw.get(1).getRightOperand().get(2).getTNumber());

        Assert.assertEquals("<A", asw.get(2).getLeftOperand().getTitle());
        Assert.assertEquals(90 - id.getTNumber().getValue(), asw.get(2).getRightOperand().get(0).getTNumber().getValue());
    }

    /**
     * test ruleAngleA1, sin <C known
     */
    public void testRuleAngleA1_2(){
        Map<String, ItemDescriptionDialog> listItemsDescription = new HashMap<String, ItemDescriptionDialog>();
        ArrayList<ItemDescriptionDialog> listItemsQuestion = new ArrayList<ItemDescriptionDialog>();

        TNumber t1 = new TNumber();
        t1.setType(TNumber.INTEGER_NUMBER);
        t1.setIntegerNumber(new FractionNumber(1, 0, 0.5f, 1));

        ItemDescriptionDialog id = new ItemDescriptionDialog(ConstantHelper.SIN_C,"sin <C",null);
        id.setTNumber(t1);

        listItemsDescription.put(ConstantHelper.SIN_C, id);

        listItemsQuestion.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_A, "<A", null));

        RightTriangleRule resolver = new RightTriangleRule();
        ArrayList<ItemAnswer> asw = resolver.resolve(listItemsDescription, listItemsQuestion);

        Assert.assertEquals(6, asw.size());

        Assert.assertEquals("<C", asw.get(0).getLeftOperand().getTitle());
        Assert.assertEquals("asin(sin <C)", asw.get(0).getRightOperand().get(0).getTitle());

        Assert.assertEquals("<C", asw.get(1).getLeftOperand().getTitle());
        Assert.assertEquals("asin("+t1.getIntegerNumber()+")", asw.get(1).getRightOperand().get(0).getTitle());

        Assert.assertEquals("<C", asw.get(2).getLeftOperand().getTitle());
        Assert.assertEquals(AngleConverterHelper.radToDeg(Math.asin(0.5)), asw.get(2).getRightOperand().get(0).getTNumber().getIntegerNumber().getIntegerValue());

        Assert.assertEquals("<A", asw.get(3).getLeftOperand().getTitle());
        Assert.assertEquals("90", asw.get(3).getRightOperand().get(0).getTitle());
        Assert.assertEquals(" - ", asw.get(3).getRightOperand().get(1).getTitle());
        Assert.assertEquals("<C", asw.get(3).getRightOperand().get(2).getTitle());

        Assert.assertEquals("<A", asw.get(4).getLeftOperand().getTitle());
        Assert.assertEquals("90", asw.get(4).getRightOperand().get(0).getTitle());
        Assert.assertEquals(" - ", asw.get(4).getRightOperand().get(1).getTitle());
        Assert.assertEquals(AngleConverterHelper.radToDeg(Math.asin(0.5)), asw.get(4).getRightOperand().get(2).getTNumber().getIntegerNumber().getIntegerValue());

        Assert.assertEquals("<A", asw.get(5).getLeftOperand().getTitle());
        Assert.assertEquals(90 - AngleConverterHelper.radToDeg(Math.asin(0.5)), asw.get(5).getRightOperand().get(0).getTNumber().getValue());
    }

    /**
     * test ruleAngleA2a, sin <A known
     */
    public void testRuleAngleA2a_1(){
        Map<String, ItemDescriptionDialog> listItemsDescription = new HashMap<String, ItemDescriptionDialog>();
        ArrayList<ItemDescriptionDialog> listItemsQuestion = new ArrayList<ItemDescriptionDialog>();

        TNumber t1 = new TNumber();
        t1.setType(TNumber.INTEGER_NUMBER);
        t1.setIntegerNumber(new FractionNumber(1, 0, 0.5f, 1));

        ItemDescriptionDialog id = new ItemDescriptionDialog(ConstantHelper.SIN_A,"sin <A",null);
        id.setTNumber(t1);

        listItemsDescription.put(ConstantHelper.SIN_A, id);

        listItemsQuestion.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_A, "<A", null));

        RightTriangleRule resolver = new RightTriangleRule();
        ArrayList<ItemAnswer> asw = resolver.resolve(listItemsDescription, listItemsQuestion);

        Assert.assertEquals(3, asw.size());

        Assert.assertEquals("sin <A", asw.get(0).getLeftOperand().getTitle());
        Assert.assertEquals(id.getTNumber().getValue(), asw.get(0).getRightOperand().get(0).getTNumber().getValue());

        Assert.assertEquals("<A", asw.get(1).getLeftOperand().getTitle());
        Assert.assertEquals("asin(sin <A)", asw.get(1).getRightOperand().get(0).getTitle());

        Assert.assertEquals("<A", asw.get(2).getLeftOperand().getTitle());
        Assert.assertEquals(AngleConverterHelper.radToDeg(Math.asin(0.5)), asw.get(2).getRightOperand().get(0).getTNumber().getIntegerNumber().getIntegerValue());
    }

    /**
     * test ruleAngleA2a, b and c known
     */
    public void testRuleAngleA2a_2(){
        Map<String, ItemDescriptionDialog> listItemsDescription = new HashMap<String, ItemDescriptionDialog>();
        ArrayList<ItemDescriptionDialog> listItemsQuestion = new ArrayList<ItemDescriptionDialog>();

        TNumber t1 = new TNumber();
        t1.setType(TNumber.INTEGER_NUMBER);
        t1.setIntegerNumber(new FractionNumber(1, 0, 4, 1));

        TNumber t2 = new TNumber();
        t2.setType(TNumber.INTEGER_NUMBER);
        t2.setIntegerNumber(new FractionNumber(1, 0, 7, 1));

        ItemDescriptionDialog id1 = new ItemDescriptionDialog(ConstantHelper.BC_LENGTH,"BC",null);
        id1.setTNumber(t1);

        ItemDescriptionDialog id2 = new ItemDescriptionDialog(ConstantHelper.CA_LENGTH,"CA",null);
        id2.setTNumber(t1);

        listItemsDescription.put(ConstantHelper.BC_LENGTH, id1);
        listItemsDescription.put(ConstantHelper.CA_LENGTH, id2);

        listItemsQuestion.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_A, "<A", null));

        RightTriangleRule resolver = new RightTriangleRule();
        ArrayList<ItemAnswer> asw = resolver.resolve(listItemsDescription, listItemsQuestion);

        Assert.assertEquals(6, asw.size());

        Assert.assertEquals("sin <A", asw.get(0).getLeftOperand().getTitle());
        Assert.assertEquals("BC // CA", asw.get(0).getRightOperand().get(0).getTitle());

        Assert.assertEquals("sin <A", asw.get(1).getLeftOperand().getTitle());
        Assert.assertEquals(id1.getTNumber().getValue(), asw.get(1).getRightOperand().get(0).getTNumber().getValue());
        Assert.assertEquals(" // ", asw.get(1).getRightOperand().get(1).getTitle());
        Assert.assertEquals(id2.getTNumber().getValue(), asw.get(1).getRightOperand().get(2).getTNumber().getValue());

        Assert.assertEquals("sin <A", asw.get(2).getLeftOperand().getTitle());
        Assert.assertEquals(MathHelper.division(id1.getTNumber(), id2.getTNumber()).getValue(), asw.get(2).getRightOperand().get(0).getTNumber().getValue());

        Assert.assertEquals("sin <A", asw.get(3).getLeftOperand().getTitle());
        Assert.assertEquals(MathHelper.division(id1.getTNumber(), id2.getTNumber()).getValue(), asw.get(3).getRightOperand().get(0).getTNumber().getValue());

        Assert.assertEquals("<A", asw.get(4).getLeftOperand().getTitle());
        Assert.assertEquals("asin(sin <A)", asw.get(4).getRightOperand().get(0).getTitle());

        Assert.assertEquals("<A", asw.get(5).getLeftOperand().getTitle());
        Assert.assertEquals(AngleConverterHelper.radToDeg(Math.asin(MathHelper.division(id1.getTNumber(), id2.getTNumber()).getValue())), asw.get(5).getRightOperand().get(0).getTNumber().getValue());
    }

    /**
     * test ruleAngleA2b, cos <A known
     */
    public void testRuleAngleA2b_1(){
        Map<String, ItemDescriptionDialog> listItemsDescription = new HashMap<String, ItemDescriptionDialog>();
        ArrayList<ItemDescriptionDialog> listItemsQuestion = new ArrayList<ItemDescriptionDialog>();

        TNumber t1 = new TNumber();
        t1.setType(TNumber.INTEGER_NUMBER);
        t1.setIntegerNumber(new FractionNumber(1, 0, 0.5f, 1));

        ItemDescriptionDialog id = new ItemDescriptionDialog(ConstantHelper.COS_A,"cos <A",null);
        id.setTNumber(t1);

        listItemsDescription.put(ConstantHelper.COS_A, id);

        listItemsQuestion.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_A, "<A", null));

        RightTriangleRule resolver = new RightTriangleRule();
        ArrayList<ItemAnswer> asw = resolver.resolve(listItemsDescription, listItemsQuestion);

        Assert.assertEquals(3, asw.size());

        Assert.assertEquals("cos <A", asw.get(0).getLeftOperand().getTitle());
        Assert.assertEquals(id.getTNumber().getValue(), asw.get(0).getRightOperand().get(0).getTNumber().getValue());

        Assert.assertEquals("<A", asw.get(1).getLeftOperand().getTitle());
        Assert.assertEquals("acos(cos <A)", asw.get(1).getRightOperand().get(0).getTitle());

        Assert.assertEquals("<A", asw.get(2).getLeftOperand().getTitle());
        Assert.assertEquals(AngleConverterHelper.radToDeg(Math.acos(0.5)), asw.get(2).getRightOperand().get(0).getTNumber().getIntegerNumber().getIntegerValue());
    }

    /**
     * test ruleAngleA2b, a and c known
     */
    public void testRuleAngleA2b_2(){
        Map<String, ItemDescriptionDialog> listItemsDescription = new HashMap<String, ItemDescriptionDialog>();
        ArrayList<ItemDescriptionDialog> listItemsQuestion = new ArrayList<ItemDescriptionDialog>();

        TNumber t1 = new TNumber();
        t1.setType(TNumber.INTEGER_NUMBER);
        t1.setIntegerNumber(new FractionNumber(1, 0, 2, 1));

        TNumber t2 = new TNumber();
        t2.setType(TNumber.INTEGER_NUMBER);
        t2.setIntegerNumber(new FractionNumber(1, 0, 7, 1));

        ItemDescriptionDialog id1 = new ItemDescriptionDialog(ConstantHelper.AB_LENGTH,"AB",null);
        id1.setTNumber(t1);

        ItemDescriptionDialog id2 = new ItemDescriptionDialog(ConstantHelper.CA_LENGTH,"CA",null);
        id2.setTNumber(t1);

        listItemsDescription.put(ConstantHelper.AB_LENGTH, id1);
        listItemsDescription.put(ConstantHelper.CA_LENGTH, id2);

        listItemsQuestion.add(new ItemDescriptionDialog(ConstantHelper.ANGLE_A, "<A", null));

        RightTriangleRule resolver = new RightTriangleRule();
        ArrayList<ItemAnswer> asw = resolver.resolve(listItemsDescription, listItemsQuestion);

        Assert.assertEquals(6, asw.size());

        Assert.assertEquals("cos <A", asw.get(0).getLeftOperand().getTitle());
        Assert.assertEquals("AB // CA", asw.get(0).getRightOperand().get(0).getTitle());

        Assert.assertEquals("cos <A", asw.get(1).getLeftOperand().getTitle());
        Assert.assertEquals(id1.getTNumber().getValue(), asw.get(1).getRightOperand().get(0).getTNumber().getValue());
        Assert.assertEquals(" // ", asw.get(1).getRightOperand().get(1).getTitle());
        Assert.assertEquals(id2.getTNumber().getValue(), asw.get(1).getRightOperand().get(2).getTNumber().getValue());

        Assert.assertEquals("cos <A", asw.get(2).getLeftOperand().getTitle());
        Assert.assertEquals(MathHelper.division(id1.getTNumber(), id2.getTNumber()).getValue(), asw.get(2).getRightOperand().get(0).getTNumber().getValue());

        Assert.assertEquals("cos <A", asw.get(3).getLeftOperand().getTitle());
        Assert.assertEquals(MathHelper.division(id1.getTNumber(), id2.getTNumber()).getValue(), asw.get(3).getRightOperand().get(0).getTNumber().getValue());

        Assert.assertEquals("<A", asw.get(4).getLeftOperand().getTitle());
        Assert.assertEquals("acos(cos <A)", asw.get(4).getRightOperand().get(0).getTitle());

        Assert.assertEquals("<A", asw.get(5).getLeftOperand().getTitle());
        Assert.assertEquals(AngleConverterHelper.radToDeg(Math.acos(MathHelper.division(id1.getTNumber(), id2.getTNumber()).getValue())), asw.get(5).getRightOperand().get(0).getTNumber().getValue());
    }
}
