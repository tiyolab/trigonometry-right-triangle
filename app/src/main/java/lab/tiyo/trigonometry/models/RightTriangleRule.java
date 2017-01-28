package lab.tiyo.trigonometry.models;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import lab.tiyo.fraction.models.FractionNumber;
import lab.tiyo.fraction.models.TNumber;
import lab.tiyo.trigonometry.helpers.AngleConverterHelper;
import lab.tiyo.trigonometry.helpers.ConstantHelper;
import lab.tiyo.trigonometry.helpers.MathHelper;
import lab.tiyo.trigonometry.helpers.TrigonometryHelper;

/**
 * Created by root on 01/01/17.
 */
public class RightTriangleRule {
    ArrayList<ItemAnswer> finalAnswers = new ArrayList<ItemAnswer>();
    Map<String, ItemDescriptionDialog> globalListItemsDescription = new HashMap<String, ItemDescriptionDialog>();

    /**
     * level of search that determine the deep of recursive
     */

    public ArrayList<ItemAnswer> resolve(Map<String, ItemDescriptionDialog> listItemsDescription, ArrayList<ItemDescriptionDialog> listItemsQuestion){
        globalListItemsDescription.putAll(listItemsDescription);
        int searchLevel = 0;
        Object isNull = null;

        for(int i = 0; i < listItemsQuestion.size(); i++){
            if(listItemsQuestion.get(i).getId().equals(ConstantHelper.ANGLE_A)){
                isNull = ruleAngleA1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA2a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA2b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA2c(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA3a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA3b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA3c(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleA6(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.ANGLE_C)){
                isNull = ruleAngleC1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC2a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC2b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC2c(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC3a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC3b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC3c(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAngleC6(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.SIN_A)){
                isNull = ruleSinA0(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA9(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA10(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA11(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA12(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA13(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA14(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA15(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA16(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA17(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA18(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA19(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinA20(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.COS_A)){
                isNull = ruleCosA1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA9(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA10(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA11(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA12(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA13(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA14(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA15(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA16(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA17(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA18(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA19(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA20(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosA21(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.TAN_A)){
                isNull = ruleTanA1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA9(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA10(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA11(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA12(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA13(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA14(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA15(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA16(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA17(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA18(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA19(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA20(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanA21(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.SIN_C)){
                isNull = ruleSinC1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC9(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC10(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC11(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC12(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC13(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC14(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC15(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC16(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC17(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC18(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC19(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC20(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleSinC21(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.COS_C)){
                isNull = ruleCosC0(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC9(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC10(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC11(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC12(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC13(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC14(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC15(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC16(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC17(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC18(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC19(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCosC20(globalListItemsDescription, searchLevel);


            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.TAN_C)){
                isNull = ruleTanC1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC9(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC10(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC11(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC12(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC13(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC14(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC15(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC16(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC17(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC18(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC19(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC20(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleTanC21(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.AB_LENGTH)){
                isNull = ruleAB1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB9a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB9b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB10a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB10b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB10c(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB11a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleAB11b(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.BC_LENGTH)){
                isNull = ruleBC1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC9a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC9b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC9c(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC10a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC10b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC11a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleBC11b(globalListItemsDescription, searchLevel);

            }else if(listItemsQuestion.get(i).getId().equals(ConstantHelper.CA_LENGTH)){
                isNull = ruleCA1(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA2(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA3(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA4(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA5(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA6(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA7(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA8(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA9a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA9b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA10a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA10b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA11a(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA11b(globalListItemsDescription, searchLevel);
                if(isNull == null)isNull = ruleCA11c(globalListItemsDescription, searchLevel);

            }

            /**
             * if still null, deeper the search
             */
            if(isNull == null && searchLevel == 0){
                searchLevel = 1;
                i--;
            }else{
                searchLevel = 0;
            }
        }

        return finalAnswers;
    }

    /**
     * 1.1
     * search angle A when angle <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.ANGLE_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_3 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);
            listRightOperand1.add(rightOperand1_2);
            listRightOperand1.add(rightOperand1_3);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("<A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("90");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_2.setTitle(" - ");
            rightOperand1_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_3.setTitle("<C");
            rightOperand1_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_3 = listItemsDescription.get(ConstantHelper.ANGLE_C);

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("<A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("90");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_2.setTitle(" - ");
            rightOperand2_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("<A");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(90 - rightOperand2_3.getTNumber().getValue());

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);


            globalListItemsDescription.put(ConstantHelper.ANGLE_A, rightOperand3_1);
            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findAngleC = new ItemDescriptionDialog();
            findAngleC.setId(ConstantHelper.ANGLE_C);
            findAngleC.setTitle("<C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findAngleC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAngleA1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 1.2a
     * search angle A when SIN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA2a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("<A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("asin(sin <A)");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("<A");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(AngleConverterHelper.radToDeg(Math.asin(listItemsDescription.get(ConstantHelper.SIN_A).getTNumber().getValue())));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.ANGLE_A, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findSinA = new ItemDescriptionDialog();
            findSinA.setId(ConstantHelper.SIN_A);
            findSinA.setTitle("sin <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findSinA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAngleA2a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 1.2b
     * search angle A when COS <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA2b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("<A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("acos(cos <A)");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("<A");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(AngleConverterHelper.radToDeg(Math.acos(
                    rightOperand1_1.getTNumber().getValue())));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.ANGLE_A, rightOperand3_1);
            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findCosA = new ItemDescriptionDialog();
            findCosA.setId(ConstantHelper.COS_A);
            findCosA.setTitle("cos <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findCosA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAngleA2b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 1.2c
     * search angle A when TAN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA2c(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTNumber(listItemsDescription.get(ConstantHelper.TAN_A).getTNumber());
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("<A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("atan(tan <A)");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("<A");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(AngleConverterHelper.radToDeg(Math.atan(
                    listItemsDescription.get(ConstantHelper.TAN_A).getTNumber().getValue())));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.ANGLE_A, rightOperand3_1);
            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findTanA = new ItemDescriptionDialog();
            findTanA.setId(ConstantHelper.TAN_A);
            findTanA.setTitle("tan <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findTanA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAngleA2c(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 1.3a
     * search angle A when SIN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA3a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAngleC2a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleA1(listItemsDescription, searchLevel);
    }


    /**
     * 1.3b
     * search angle A when COS <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA3b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAngleC2b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleA1(listItemsDescription, searchLevel);
    }


    /**
     * 1.3c
     * search angle A when COS <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA3c(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAngleC2c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleA1(listItemsDescription, searchLevel);
    }


    /**
     * 1.4
     * search angle A when BC dan CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleSinA1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleA2a(listItemsDescription, searchLevel);
    }


    /**
     * 1.5
     * search angle A when AB dan CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCosA2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleA2b(listItemsDescription, searchLevel);
    }


    /**
     * 1.6
     * search angle A when AB dan BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleA6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleTanA2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleA2c(listItemsDescription, searchLevel);
    }


    /**
     * 2.1
     * search angle C when angle <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.ANGLE_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_3 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);
            listRightOperand1.add(rightOperand1_2);
            listRightOperand1.add(rightOperand1_3);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("<C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("90");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_2.setTitle("-");
            rightOperand1_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_3.setTitle("<A");
            rightOperand1_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_3 = listItemsDescription.get(ConstantHelper.ANGLE_A);

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("<C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("90");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_2.setTitle("-");
            rightOperand2_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("<A");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(90 - rightOperand2_3.getTNumber().getValue());

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.ANGLE_C, rightOperand3_1);
            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findAngleA = new ItemDescriptionDialog();
            findAngleA.setId(ConstantHelper.ANGLE_A);
            findAngleA.setTitle("<A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findAngleA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAngleC1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 2.2a
     * search angle C when SIN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC2a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_C) != null){

            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("<C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("asin(sin <C)");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("<C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("asin(" + listItemsDescription.get(ConstantHelper.SIN_C).getTNumber().getIntegerNumber() + ")");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("<C");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(AngleConverterHelper.radToDeg(Math.asin(listItemsDescription.get(ConstantHelper.SIN_C).getTNumber().getIntegerNumber().getDecimalValue())));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.ANGLE_C, rightOperand3_1);
            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findSinC = new ItemDescriptionDialog();
            findSinC.setId(ConstantHelper.SIN_C);
            findSinC.setTitle("sin <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findSinC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAngleC2a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 2.2b
     * search angle C when COS <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC2b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_C) != null){

            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("<C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("acos(cos C)");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("<C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("acos(" + listItemsDescription.get(ConstantHelper.COS_C)
                    .getTNumber().getIntegerNumber() + ")");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("<C");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(AngleConverterHelper.radToDeg(
                    Math.acos(listItemsDescription.get(ConstantHelper.COS_C).getTNumber().
                            getIntegerNumber().getDecimalValue())));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.ANGLE_C, rightOperand3_1);
            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findCosC = new ItemDescriptionDialog();
            findCosC.setId(ConstantHelper.COS_C);
            findCosC.setTitle("cos <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findCosC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAngleC2b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 2.2c
     * search angle C when TAN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC2c(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_C) != null){

            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("<C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("atan(tan C)");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("<C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("atan(" + listItemsDescription.get(ConstantHelper.TAN_C)
                    .getTNumber().getIntegerNumber() + ")");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("<C");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(AngleConverterHelper.radToDeg(
                    Math.acos(listItemsDescription.get(ConstantHelper.TAN_C).getTNumber().
                            getIntegerNumber().getDecimalValue())));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.ANGLE_C, rightOperand3_1);
            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findTanC = new ItemDescriptionDialog();
            findTanC.setId(ConstantHelper.TAN_C);
            findTanC.setTitle("tan <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findTanC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAngleC2c(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 2.3a
     * search angle <C when SIN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC3a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAngleA2a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleC1(listItemsDescription, searchLevel);
    }


    /**
     * 2.3b
     * search angle <C when COS <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC3b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAngleA2b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleC1(listItemsDescription, searchLevel);
    }


    /**
     * 2.3c
     * search angle <C when COS <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC3c(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAngleA2c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleC1(listItemsDescription, searchLevel);
    }


    /**
     * 2.4
     * search when AB and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleSinC2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleC2a(listItemsDescription, searchLevel);
    }


    /**
     * 2.5
     * search when BC and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCosC1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleC2b(listItemsDescription, searchLevel);
    }


    /**
     * 2.6
     * search when AB and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAngleC6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleTanC2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleAngleC2c(listItemsDescription, searchLevel);
    }


    /**
     * 3.0
     * search SIN A when angle <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA0(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.ANGLE_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_2 = listItemsDescription.get(ConstantHelper.ANGLE_A);

            listRightOperand1.add(rightOperand1_1);
            listRightOperand1.add(rightOperand1_2);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("sin ");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight2_1 = new TNumber();
            tNumberRight2_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber2_1 = new FractionNumber();
            fractionNumber2_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber2_1.setIntegerValue(Math.sin(AngleConverterHelper.degToRad(rightOperand1_2.getTNumber().getValue())));

            tNumberRight2_1.setIntegerNumber(fractionNumber2_1);

            rightOperand2_1.setTNumber(tNumberRight2_1);
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.SIN_A, rightOperand2_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findAngleA = new ItemDescriptionDialog();
            findAngleA.setId(ConstantHelper.ANGLE_A);
            findAngleA.setTitle("<A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findAngleA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleSinA0(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 3.1
     * search SIN A when b and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.BC_LENGTH) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("BC // CA");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand2_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_3 = listItemsDescription.get(ConstantHelper.CA_LENGTH);

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_2.setTitle(" // ");
            rightOperand2_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("sin <A");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTNumber(MathHelper.division(rightOperand2_1.getTNumber(), rightOperand2_3.getTNumber()));
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.SIN_A, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean bcFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(bcFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleSinA1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 3.2
     * search SIN A when b and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.3
     * search SIN A when a and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.4
     * search SIN A when COS A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.5
     * search SIN A when COS A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.6
     * search SIN A when TAN A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.7
     * search SIN A when TAN A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC7(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.8
     * search SIN A when SIN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.9
     * search SIN A when SIN C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA9(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.10
     * search SIN A when COS C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA10(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.11
     * search SIN A when TAN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA11(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.12
     * search SIN A when TAN C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA12(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.13
     * search SIN A when COS A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA13(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC5(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.14
     * search SIN A when COS A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA14(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.15
     * search SIN A when TAN A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA15(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA7(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.16
     * search SIN A when TAN A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA16(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA8(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.17
     * search SIN A when SIN C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA17(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.18
     * search SIN A when SIN C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA18(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.19
     * search SIN A when TAN C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA19(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 3.20
     * search SIN A when TAN C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinA20(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinA1(listItemsDescription, searchLevel);
    }


    /**
     * 4.1
     * search COS A when angle <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.ANGLE_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_2 = listItemsDescription.get(ConstantHelper.ANGLE_A);

            listRightOperand1.add(rightOperand1_1);
            listRightOperand1.add(rightOperand1_2);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("cos ");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight2_1 = new TNumber();
            tNumberRight2_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber2_1 = new FractionNumber();
            fractionNumber2_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber2_1.setIntegerValue(Math.cos(AngleConverterHelper.degToRad(
                    rightOperand1_2.getTNumber().getValue())));

            tNumberRight2_1.setIntegerNumber(fractionNumber2_1);

            rightOperand2_1.setTNumber(tNumberRight2_1);
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.COS_A, rightOperand2_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findAngleA = new ItemDescriptionDialog();
            findAngleA.setId(ConstantHelper.ANGLE_A);
            findAngleA.setTitle("<A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findAngleA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCosA1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 4.2
     * search COS A when a and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.AB_LENGTH) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("AB // CA");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand2_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_3 = listItemsDescription.get(ConstantHelper.CA_LENGTH);

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_2.setTitle(" // ");
            rightOperand2_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("cos <A");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTNumber(MathHelper.division(rightOperand2_1.getTNumber(), rightOperand2_3.getTNumber()));
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.COS_A, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean abFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.AB_LENGTH);
                findBCLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(abFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCosA2(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 4.3
     * search COS A when a and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.4
     * search COS A when b and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.5
     * search COS A when SIN A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.6
     * search COS A when SIN A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.7
     * search COS A when SIN A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB3(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.8
     * search COS A when SIN A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.9
     * search COS A when TAN A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA9(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.10
     * search COS A when TAN A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA10(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA7(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.11
     * search COS A when TAN A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA11(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA8(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.12
     * search COS A when TAN A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA12(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB7(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.13
     * search COS A when SIN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA13(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.14
     * search COS A when COS C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA14(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.15
     * search COS A when COS C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA15(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.16
     * search COS A when COS C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA16(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.17
     * search COS A when COS C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA17(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.18
     * search COS A when TAN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA18(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.19
     * search COS A when TAN C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA19(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.20
     * search COS A when TAN C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA20(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 4.21
     * search COS A when TAN C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosA21(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.1
     * search TAN A when angle <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.ANGLE_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_2 = listItemsDescription.get(ConstantHelper.ANGLE_A);

            listRightOperand1.add(rightOperand1_1);
            listRightOperand1.add(rightOperand1_2);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("tan ");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight2_1 = new TNumber();
            tNumberRight2_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber2_1 = new FractionNumber();
            fractionNumber2_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber2_1.setIntegerValue(Math.tan(AngleConverterHelper.degToRad(
                    rightOperand1_2.getTNumber().getValue())));

            tNumberRight2_1.setIntegerNumber(fractionNumber2_1);

            rightOperand2_1.setTNumber(tNumberRight2_1);
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.TAN_A, rightOperand2_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findAngleA = new ItemDescriptionDialog();
            findAngleA.setId(ConstantHelper.ANGLE_A);
            findAngleA.setTitle("<A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findAngleA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleTanA1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 5.2
     * search TAN A when a and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.AB_LENGTH) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("b // a");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand2_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_3 = listItemsDescription.get(ConstantHelper.AB_LENGTH);

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_2.setTitle(" // ");
            rightOperand2_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("tan A");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTNumber(MathHelper.division(rightOperand2_1.getTNumber(), rightOperand2_3.getTNumber()));
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.TAN_A, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean abFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.AB_LENGTH);
                findBCLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(abFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleTanA2(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 5.3
     * search TAN A when a and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.4
     * search TAN A when b and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.5
     * search TAN A when SIN A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.6
     * search TAN A when SIN A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.7
     * search TAN A when SIN A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB3(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.8
     * search TAN A when SIN A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.9
     * search TAN A when COS A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA9(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.10
     * search TAN A when COS A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA10(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC5(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.11
     * search TAN A when COS A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA11(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB5(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.12
     * search TAN A when COS A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA12(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.13
     * search TAN A when SIN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA13(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.14
     * search TAN A when SIN C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA14(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.15
     * search TAN A when SIN C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA15(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.16
     * search TAN A when SIN C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA16(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.17
     * search TAN A when COS C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA17(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.18
     * search TAN A when COS C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA18(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.19
     * search TAN A when COS C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA19(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.20
     * search TAN A when COS C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA20(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 5.21
     * search TAN A when TAN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanA21(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanA2(listItemsDescription, searchLevel);
    }


    /**
     * 6.1
     * search SIN C when angle <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.ANGLE_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_2 = listItemsDescription.get(ConstantHelper.ANGLE_A);

            listRightOperand1.add(rightOperand1_1);
            listRightOperand1.add(rightOperand1_2);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("sin ");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight2_1 = new TNumber();
            tNumberRight2_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber2_1 = new FractionNumber();
            fractionNumber2_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber2_1.setIntegerValue(Math.cos(AngleConverterHelper.degToRad(
                    rightOperand1_2.getTNumber().getValue())));

            tNumberRight2_1.setIntegerNumber(fractionNumber2_1);

            rightOperand2_1.setTNumber(tNumberRight2_1);
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.SIN_C, rightOperand2_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findAngleA = new ItemDescriptionDialog();
            findAngleA.setId(ConstantHelper.ANGLE_A);
            findAngleA.setTitle("<A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findAngleA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleSinC1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 6.2
     * search SIN C when a and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.AB_LENGTH) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("a // c");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand2_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_3 = listItemsDescription.get(ConstantHelper.CA_LENGTH);

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_2.setTitle(" // ");
            rightOperand2_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("sin C");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTNumber(MathHelper.division(rightOperand2_1.getTNumber(), rightOperand2_3.getTNumber()));
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.SIN_C, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean abFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.AB_LENGTH);
                findBCLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(abFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleSinC2(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 6.3
     * search SIN C when a and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.4
     * search SIN C when b and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.5
     * search SIN C when SIN A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.6
     * search SIN C when SIN A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.7
     * search SIN C when SIN A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB3(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.8
     * search SIN C when SIN A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.9
     * search SIN C when TAN A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC9(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.10
     * search SIN C when TAN A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC10(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA7(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.11
     * search SIN C when TAN A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC11(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA8(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.12
     * search SIN C when TAN A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC12(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB7(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.13
     * search SIN C when SIN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC13(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.14
     * search SIN C when COS C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC14(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.15
     * search SIN C when COS C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC15(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.16
     * search SIN C when COS C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC16(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.17
     * search SIN C when COS C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC17(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.18
     * search SIN C when TAN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC18(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.19
     * search SIN C when TAN C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC19(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.20
     * search SIN C when TAN C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC20(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 6.21
     * search SIN C when TAN C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleSinC21(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleSinC2(listItemsDescription, searchLevel);
    }


    /**
     * 7.0
     * search COS C when angle <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC0(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.ANGLE_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_2 = listItemsDescription.get(ConstantHelper.ANGLE_A);

            listRightOperand1.add(rightOperand1_1);
            listRightOperand1.add(rightOperand1_2);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("cos ");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight2_1 = new TNumber();
            tNumberRight2_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber2_1 = new FractionNumber();
            fractionNumber2_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber2_1.setIntegerValue(Math.sin(AngleConverterHelper.degToRad(rightOperand1_2.getTNumber().getValue())));

            tNumberRight2_1.setIntegerNumber(fractionNumber2_1);

            rightOperand2_1.setTNumber(tNumberRight2_1);
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.COS_C, rightOperand2_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findAngleA = new ItemDescriptionDialog();
            findAngleA.setId(ConstantHelper.ANGLE_A);
            findAngleA.setTitle("<A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findAngleA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCosC0(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 7.1
     * search COS C when b and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.BC_LENGTH) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("b // c");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand2_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_3 = listItemsDescription.get(ConstantHelper.CA_LENGTH);

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_2.setTitle(" // ");
            rightOperand2_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("cos C");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTNumber(MathHelper.division(rightOperand2_1.getTNumber(), rightOperand2_3.getTNumber()));
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.COS_C, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean bcFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(bcFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCosC1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 7.2
     * search COS C when b and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.3
     * search COS C when a and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.4
     * search COS C when COS A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.5
     * search COS C when COS A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.6
     * search COS C when TAN A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.7
     * search COS C when TAN A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC7(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.8
     * search COS C when SIN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.9
     * search COS C when SIN C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC9(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.10
     * search COS C when COS C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC10(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.11
     * search COS C when TAN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC11(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.12
     * search COS C when TAN C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC12(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.13
     * search COS C when COS A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC13(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC5(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.14
     * search COS C when COS A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC14(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.15
     * search COS C when TAN A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC15(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA7(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.16
     * search COS C when TAN A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC16(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA8(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.17
     * search COS C when SIN C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC17(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.18
     * search COS C when SIN C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC18(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.19
     * search ruleCosC when TAN C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC19(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 7.20
     * search SIN A when TAN C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCosC20(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleCA11c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleCosC1(listItemsDescription, searchLevel);
    }


    /**
     * 8.1
     * search TAN C when angle <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.ANGLE_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand1_2 = listItemsDescription.get(ConstantHelper.ANGLE_A);

            listRightOperand1.add(rightOperand1_1);
            listRightOperand1.add(rightOperand1_2);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("tan ");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight2_1 = new TNumber();
            tNumberRight2_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber2_1 = new FractionNumber();
            fractionNumber2_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber2_1.setIntegerValue(1 / Math.tan(AngleConverterHelper.degToRad(
                    rightOperand1_2.getTNumber().getValue())));

            tNumberRight2_1.setIntegerNumber(fractionNumber2_1);

            rightOperand2_1.setTNumber(tNumberRight2_1);
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.TAN_C, rightOperand2_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            ItemDescriptionDialog findAngleA = new ItemDescriptionDialog();
            findAngleA.setId(ConstantHelper.ANGLE_A);
            findAngleA.setTitle("<A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findAngleA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleTanC1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 8.2
     * search TAN C when a and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.AB_LENGTH) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("b // a");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand2_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_3 = listItemsDescription.get(ConstantHelper.BC_LENGTH);

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_2.setTitle(" // ");
            rightOperand2_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("tan C");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTNumber(MathHelper.division(rightOperand2_1.getTNumber(), rightOperand2_3.getTNumber()));
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.TAN_C, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean abFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.AB_LENGTH);
                findBCLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(abFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleTanC2(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 8.3
     * search TAN C when a and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.4
     * search TAN C when b and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB1(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.5
     * search TAN C when SIN A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.6
     * search TAN C when SIN A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC2(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.7
     * search TAN C when SIN A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB3(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.8
     * search TAN C when SIN A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.9
     * search TAN C when COS A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC9(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC4(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.10
     * search TAN C when COS A and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC10(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC5(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.11
     * search TAN C when COS A and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC11(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB5(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.12
     * search TAN C when COS A and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC12(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.13
     * search TAN C when SIN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC13(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.14
     * search TAN C when SIN C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC14(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC9b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.15
     * search TAN C when SIN C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC15(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB9a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.16
     * search TAN C when SIN C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC16(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC6(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.17
     * search TAN C when COS C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC17(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.18
     * search TAN C when COS C and a has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC18(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleBC10a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.19
     * search TAN C when COS C and b has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC19(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10b(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.20
     * search TAN C when COS C and c has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC20(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB10c(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 8.21
     * search TAN C when TAN C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleTanC21(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        if(ruleAB11a(listItemsDescription, searchLevel) == null){
            return null;
        }
        return ruleTanC2(listItemsDescription, searchLevel);
    }


    /**
     * 9.1
     * search AB when BC and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.BC_LENGTH) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("AB^2");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("CA^2 - BC^2");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_2 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand2_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_4 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand2_5 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);
            listRightOperand2.add(rightOperand2_4);
            listRightOperand2.add(rightOperand2_5);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("AB");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("/(");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_3.setTitle(")^2 - (");
            rightOperand2_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_5.setTitle(")^2");
            rightOperand2_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand2_2.getTNumber().getValue(),2) - Math.pow(rightOperand2_4.getTNumber().getValue(),2)));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean bcFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(caFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.2
     * search AB when SIN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = new ItemDescriptionDialog();

            listRightOperand4.add(rightOperand4_1);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB^2");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_1.setTitle("CA^2 - BC^2");
            rightOperand4_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_2 = rightOperand3_1_1;
            ItemDescriptionDialog rightOperand5_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_4 = rightOperand3_2_1;
            ItemDescriptionDialog rightOperand5_5 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);
            listRightOperand5.add(rightOperand5_2);
            listRightOperand5.add(rightOperand5_3);
            listRightOperand5.add(rightOperand5_4);
            listRightOperand5.add(rightOperand5_5);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTitle("/(");
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_3.setTitle(")^2 - (");
            rightOperand5_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_5.setTitle(")^2");
            rightOperand5_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("AB");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight6_1 = new TNumber();
            tNumberRight6_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber6_1 = new FractionNumber();
            fractionNumber6_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber6_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand5_2.getTNumber().getValue(),2) - Math.pow(rightOperand5_4.getTNumber().getValue(),2)));

            tNumberRight6_1.setIntegerNumber(fractionNumber6_1);

            rightOperand6_1.setTNumber(tNumberRight6_1);
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand6_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findSinA = new ItemDescriptionDialog();
            findSinA.setId(ConstantHelper.SIN_A);
            findSinA.setTitle("sin <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findSinA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB2(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.3
     * search AB when SIN <A and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_A) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("CA");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("BC // sin A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("AB^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("CA^2 - BC^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("AB");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 - (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("AB");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) - Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean sinAFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.SIN_A) == null){
                ItemDescriptionDialog findSinALength = new ItemDescriptionDialog();
                findSinALength.setId(ConstantHelper.SIN_A);
                findSinALength.setTitle("sin A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    sinAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(sinAFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB3(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.4
     * search AB when SIN <A and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_A) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("CA * sin A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("AB^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("CA^2 - BC^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("AB");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 - (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("AB");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) - Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean sinAFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.SIN_A) == null){
                ItemDescriptionDialog findSinALength = new ItemDescriptionDialog();
                findSinALength.setId(ConstantHelper.SIN_A);
                findSinALength.setTitle("sin A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    sinAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(sinAFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB4(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.5
     * search AB when COS <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findCosA = new ItemDescriptionDialog();
            findCosA.setId(ConstantHelper.COS_A);
            findCosA.setTitle("cos <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findCosA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB5(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.6
     * search AB when COS <A and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_A) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("CA * cos A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand5_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosAFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.COS_A) == null){
                ItemDescriptionDialog findCosALength = new ItemDescriptionDialog();
                findCosALength.setId(ConstantHelper.COS_A);
                findCosALength.setTitle("cos A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCosALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(cosAFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB6(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.7
     * search AB when TAN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // AB");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("AB");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("AB");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findTanA = new ItemDescriptionDialog();
            findTanA.setId(ConstantHelper.TAN_A);
            findTanA.setTitle("tan <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findTanA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB7(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.8
     * search AB when TAN <A and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_A) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // AB");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("BC // tan A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand5_1);


            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean tanAFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.TAN_A) == null){
                ItemDescriptionDialog findTanALength = new ItemDescriptionDialog();
                findTanALength.setId(ConstantHelper.TAN_A);
                findTanALength.setTitle("tan A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findTanALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    tanAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(tanAFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB8(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.9.a
     * search AB when SIN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB9a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findSinC = new ItemDescriptionDialog();
            findSinC.setId(ConstantHelper.SIN_C);
            findSinC.setTitle("sin <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findSinC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB9a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.9.b
     * search AB when SIN <C and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB9b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_C) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("CA * cos A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand5_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosAFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.SIN_C) == null){
                ItemDescriptionDialog findCosALength = new ItemDescriptionDialog();
                findCosALength.setId(ConstantHelper.SIN_C);
                findCosALength.setTitle("sin C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCosALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(cosAFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB9b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.10.a
     * search AB when COS <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB10a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = new ItemDescriptionDialog();

            listRightOperand4.add(rightOperand4_1);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB^2");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_1.setTitle("CA^2 - BC^2");
            rightOperand4_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_2 = rightOperand3_1_1;
            ItemDescriptionDialog rightOperand5_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_4 = rightOperand3_2_1;
            ItemDescriptionDialog rightOperand5_5 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);
            listRightOperand5.add(rightOperand5_2);
            listRightOperand5.add(rightOperand5_3);
            listRightOperand5.add(rightOperand5_4);
            listRightOperand5.add(rightOperand5_5);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTitle("/(");
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_3.setTitle(")^2 - (");
            rightOperand5_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_5.setTitle(")^2");
            rightOperand5_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("AB");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight6_1 = new TNumber();
            tNumberRight6_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber6_1 = new FractionNumber();
            fractionNumber6_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber6_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand5_2.getTNumber().getValue(),2) - Math.pow(rightOperand5_4.getTNumber().getValue(),2)));

            tNumberRight6_1.setIntegerNumber(fractionNumber6_1);

            rightOperand6_1.setTNumber(tNumberRight6_1);
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand6_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findCosC = new ItemDescriptionDialog();
            findCosC.setId(ConstantHelper.COS_C);
            findCosC.setTitle("cos <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findCosC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB2(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.10.b
     * search AB when COS C and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB10b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_C) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("CA");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("BC // cos C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("AB^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("CA^2 - BC^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("AB");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 - (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("AB");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) - Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosCFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.COS_C) == null){
                ItemDescriptionDialog findSinALength = new ItemDescriptionDialog();
                findSinALength.setId(ConstantHelper.COS_C);
                findSinALength.setTitle("cos C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(cosCFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB10b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.10.c
     * search AB when COS <C and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB10c(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_C) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("CA * cos C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("AB^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("CA^2 - BC^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("AB");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 - (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("AB");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) - Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosCFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.COS_C) == null){
                ItemDescriptionDialog findSinALength = new ItemDescriptionDialog();
                findSinALength.setId(ConstantHelper.COS_C);
                findSinALength.setTitle("cos <C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(cosCFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB10c(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.11.a
     * search AB when TAN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB11a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // BC");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("BC");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("BC");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findTanC = new ItemDescriptionDialog();
            findTanC.setId(ConstantHelper.TAN_C);
            findTanC.setTitle("tan <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findTanC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB11a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 9.11.b
     * search AB when TAN <C and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleAB11b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_C) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // BC");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("BC * tan <C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand5_1);


            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean tanCFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.TAN_C) == null){
                ItemDescriptionDialog findTanCLength = new ItemDescriptionDialog();
                findTanCLength.setId(ConstantHelper.TAN_C);
                findTanCLength.setTitle("tan C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findTanCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    tanCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(tanCFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleAB11b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.1
     * search BC when AB and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.AB_LENGTH) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("BC^2");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("AB^2 - BC^2");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_2 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand2_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_4 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand2_5 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);
            listRightOperand2.add(rightOperand2_4);
            listRightOperand2.add(rightOperand2_5);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("BC");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("/(");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_3.setTitle(")^2 - (");
            rightOperand2_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_5.setTitle(")^2");
            rightOperand2_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand2_2.getTNumber().getValue(),2) - Math.pow(rightOperand2_4.getTNumber().getValue(),2)));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean abFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(caFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.2
     * search BC when SIN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findSinA = new ItemDescriptionDialog();
            findSinA.setId(ConstantHelper.SIN_A);
            findSinA.setTitle("sin <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findSinA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC2(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.3
     * search BC when SIN <A and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_A) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("CA * sin <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand5_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean sinAFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.SIN_A) == null){
                ItemDescriptionDialog findSinALength = new ItemDescriptionDialog();
                findSinALength.setId(ConstantHelper.SIN_A);
                findSinALength.setTitle("sin <A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    sinAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(sinAFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC3(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.4
     * search BC when COS <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = new ItemDescriptionDialog();

            listRightOperand4.add(rightOperand4_1);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC^2");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_1.setTitle("CA^2 - AB^2");
            rightOperand4_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_2 = rightOperand3_1_1;
            ItemDescriptionDialog rightOperand5_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_4 = rightOperand3_2_1;
            ItemDescriptionDialog rightOperand5_5 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);
            listRightOperand5.add(rightOperand5_2);
            listRightOperand5.add(rightOperand5_3);
            listRightOperand5.add(rightOperand5_4);
            listRightOperand5.add(rightOperand5_5);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTitle("/(");
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_3.setTitle(")^2 - (");
            rightOperand5_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_5.setTitle(")^2");
            rightOperand5_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("BC");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight6_1 = new TNumber();
            tNumberRight6_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber6_1 = new FractionNumber();
            fractionNumber6_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber6_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand5_2.getTNumber().getValue(),2) - Math.pow(rightOperand5_4.getTNumber().getValue(),2)));

            tNumberRight6_1.setIntegerNumber(fractionNumber6_1);

            rightOperand6_1.setTNumber(tNumberRight6_1);
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand6_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findCosA = new ItemDescriptionDialog();
            findCosA.setId(ConstantHelper.COS_A);
            findCosA.setTitle("cos <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findCosA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC4(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.5
     * search BC when COS <A and AB has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_A) != null && listItemsDescription.get(ConstantHelper.AB_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("CA");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("AB // cos <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("BC^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("CA^2 - AB^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("BC");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 - (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("BC");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) - Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosAFound = true;
            boolean abFound = true;

            if(listItemsDescription.get(ConstantHelper.COS_A) == null){
                ItemDescriptionDialog findCosALength = new ItemDescriptionDialog();
                findCosALength.setId(ConstantHelper.COS_A);
                findCosALength.setTitle("cos <A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCosALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(cosAFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC5(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.6
     * search BC when COS <A and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_A) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("CA * cos <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("BC^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("CA^2 - AB^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("CA");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 - (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("CA");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) - Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosAFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.COS_A) == null){
                ItemDescriptionDialog findCosALength = new ItemDescriptionDialog();
                findCosALength.setId(ConstantHelper.COS_A);
                findCosALength.setTitle("cos <A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCosALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(cosAFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC6(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.7
     * search BC when TAN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // AB");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("AB");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("AB");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findTanA = new ItemDescriptionDialog();
            findTanA.setId(ConstantHelper.TAN_A);
            findTanA.setTitle("tan <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findTanA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC7(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.8
     * search BC when TAN <A and AB has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_A) != null && listItemsDescription.get(ConstantHelper.AB_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // AB");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("AB // tan <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand5_1);


            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean tanAFound = true;
            boolean abFound = true;

            if(listItemsDescription.get(ConstantHelper.TAN_A) == null){
                ItemDescriptionDialog findTanALength = new ItemDescriptionDialog();
                findTanALength.setId(ConstantHelper.TAN_A);
                findTanALength.setTitle("tan A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findTanALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    tanAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(tanAFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC8(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.9.a
     * search BC when SIN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC9a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = new ItemDescriptionDialog();

            listRightOperand4.add(rightOperand4_1);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC^2");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_1.setTitle("CA^2 - AB^2");
            rightOperand4_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_2 = rightOperand3_1_1;
            ItemDescriptionDialog rightOperand5_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_4 = rightOperand3_2_1;
            ItemDescriptionDialog rightOperand5_5 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);
            listRightOperand5.add(rightOperand5_2);
            listRightOperand5.add(rightOperand5_3);
            listRightOperand5.add(rightOperand5_4);
            listRightOperand5.add(rightOperand5_5);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTitle("/(");
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_3.setTitle(")^2 - (");
            rightOperand5_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_5.setTitle(")^2");
            rightOperand5_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("BC");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight6_1 = new TNumber();
            tNumberRight6_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber6_1 = new FractionNumber();
            fractionNumber6_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber6_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand5_2.getTNumber().getValue(),2) - Math.pow(rightOperand5_4.getTNumber().getValue(),2)));

            tNumberRight6_1.setIntegerNumber(fractionNumber6_1);

            rightOperand6_1.setTNumber(tNumberRight6_1);
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand6_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findSinC = new ItemDescriptionDialog();
            findSinC.setId(ConstantHelper.SIN_C);
            findSinC.setTitle("sin <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findSinC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC9a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.9.b
     * search BC when SIN <C and AB has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC9b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_C) != null && listItemsDescription.get(ConstantHelper.AB_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("CA");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("AB // sin <C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("BC^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("CA^2 - AB^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("BC");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 - (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("BC");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) - Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean sinCFound = true;
            boolean abFound = true;

            if(listItemsDescription.get(ConstantHelper.SIN_C) == null){
                ItemDescriptionDialog findSinCLength = new ItemDescriptionDialog();
                findSinCLength.setId(ConstantHelper.SIN_C);
                findSinCLength.setTitle("sin <C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    sinCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(sinCFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC9b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.9.c
     * search BC when SIN <C and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC9c(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_C) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("CA * sin <C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("BC^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("CA^2 - AB^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("CA");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 - (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("CA");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) - Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean sinCFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.SIN_C) == null){
                ItemDescriptionDialog findSinCLength = new ItemDescriptionDialog();
                findSinCLength.setId(ConstantHelper.SIN_C);
                findSinCLength.setTitle("sin <C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    sinCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(sinCFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC9c(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.10.a
     * search BC when COS <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC10a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findCosC = new ItemDescriptionDialog();
            findCosC.setId(ConstantHelper.COS_C);
            findCosC.setTitle("cos <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findCosC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC10a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.10.b
     * search BC when COS <C and CA has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC10b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_C) != null && listItemsDescription.get(ConstantHelper.CA_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("CA * cos <C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.CA_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand5_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosCFound = true;
            boolean caFound = true;

            if(listItemsDescription.get(ConstantHelper.COS_C) == null){
                ItemDescriptionDialog findCosCLength = new ItemDescriptionDialog();
                findCosCLength.setId(ConstantHelper.COS_C);
                findCosCLength.setTitle("cos <C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCosCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.CA_LENGTH) == null){
                ItemDescriptionDialog findCALength = new ItemDescriptionDialog();
                findCALength.setId(ConstantHelper.CA_LENGTH);
                findCALength.setTitle("CA");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    caFound = false;
                }
            }

            if(cosCFound && caFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC10b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.11.a
     * search BC when TAN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC11a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // BC");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("BC");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("BC");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findTanC = new ItemDescriptionDialog();
            findTanC.setId(ConstantHelper.TAN_C);
            findTanC.setTitle("tan <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findTanC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC11a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 10.11.b
     * search BC when TAN <C and AB has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleBC11b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_C) != null && listItemsDescription.get(ConstantHelper.AB_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // BC");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("AB // tan <C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand5_1);


            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean tanCFound = true;
            boolean abFound = true;

            if(listItemsDescription.get(ConstantHelper.TAN_C) == null){
                ItemDescriptionDialog findTanCLength = new ItemDescriptionDialog();
                findTanCLength.setId(ConstantHelper.TAN_C);
                findTanCLength.setTitle("tan C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findTanCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    tanCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(tanCFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleBC11b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.1
     * search CA when AB and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA1(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.AB_LENGTH) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = new ItemDescriptionDialog();

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("CA^2");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand1_1.setTitle("AB^2 + BC^2");
            rightOperand1_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_2 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand2_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand2_4 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand2_5 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);
            listRightOperand2.add(rightOperand2_2);
            listRightOperand2.add(rightOperand2_3);
            listRightOperand2.add(rightOperand2_4);
            listRightOperand2.add(rightOperand2_5);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("CA");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("/(");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_3.setTitle(")^2 - (");
            rightOperand2_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_5.setTitle(")^2");
            rightOperand2_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight3_1 = new TNumber();
            tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber3_1 = new FractionNumber();
            fractionNumber3_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber3_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand2_2.getTNumber().getValue(),2) + Math.pow(rightOperand2_4.getTNumber().getValue(),2)));

            tNumberRight3_1.setIntegerNumber(fractionNumber3_1);

            rightOperand3_1.setTNumber(tNumberRight3_1);
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){
            boolean abFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(bcFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA1(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.2
     * search CA when SIN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA2(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findSinA = new ItemDescriptionDialog();
            findSinA.setId(ConstantHelper.SIN_A);
            findSinA.setTitle("sin <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findSinA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA2(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.3
     * search CA when SIN <A and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA3(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_A) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("CA");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("BC // sin <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand5_1);


            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean sinAFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.SIN_A) == null){
                ItemDescriptionDialog findSinALength = new ItemDescriptionDialog();
                findSinALength.setId(ConstantHelper.SIN_A);
                findSinALength.setTitle("sin <A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    sinAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(sinAFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA3(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.4
     * search CA when COS <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA4(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findCosA = new ItemDescriptionDialog();
            findCosA.setId(ConstantHelper.COS_A);
            findCosA.setTitle("cos <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findCosA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA4(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.5
     * search CA when COS <A and AB has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA5(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_A) != null && listItemsDescription.get(ConstantHelper.AB_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("CA");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("AB // cos <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand5_1);


            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosAFound = true;
            boolean abFound = true;

            if(listItemsDescription.get(ConstantHelper.COS_A) == null){
                ItemDescriptionDialog findCosALength = new ItemDescriptionDialog();
                findCosALength.setId(ConstantHelper.COS_A);
                findCosALength.setTitle("cos <A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCosALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(cosAFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA5(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.6
     * search CA when TAN <A has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA6(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_A) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // AB");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("AB");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("AB");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_2_1);
            }


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = new ItemDescriptionDialog();

            listRightOperand4.add(rightOperand4_1);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA^2");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_1.setTitle("AB^2 + BC^2");
            rightOperand4_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_2 = rightOperand3_1_1;
            ItemDescriptionDialog rightOperand5_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_4 = rightOperand3_2_1;
            ItemDescriptionDialog rightOperand5_5 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);
            listRightOperand5.add(rightOperand5_2);
            listRightOperand5.add(rightOperand5_3);
            listRightOperand5.add(rightOperand5_4);
            listRightOperand5.add(rightOperand5_5);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTitle("/(");
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_3.setTitle(")^2 - (");
            rightOperand5_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_5.setTitle(")^2");
            rightOperand5_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("CA");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight6_1 = new TNumber();
            tNumberRight6_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber6_1 = new FractionNumber();
            fractionNumber6_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber6_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand5_2.getTNumber().getValue(),2) + Math.pow(rightOperand5_4.getTNumber().getValue(),2)));

            tNumberRight6_1.setIntegerNumber(fractionNumber6_1);

            rightOperand6_1.setTNumber(tNumberRight6_1);
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand6_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findTanA = new ItemDescriptionDialog();
            findTanA.setId(ConstantHelper.TAN_A);
            findTanA.setTitle("tan <A");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findTanA);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA6(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.7
     * search CA when TAN <A and AB has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA7(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_A) != null && listItemsDescription.get(ConstantHelper.AB_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // AB");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("AB * tan <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("CA^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("AB^2 + BC^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("CA");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 + (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("CA");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) + Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean tanAFound = true;
            boolean abFound = true;

            if(listItemsDescription.get(ConstantHelper.TAN_A) == null){
                ItemDescriptionDialog findTanALength = new ItemDescriptionDialog();
                findTanALength.setId(ConstantHelper.TAN_A);
                findTanALength.setTitle("tan <A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findTanALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    tanAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(tanAFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA7(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.8
     * search CA when TAN <A and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA8(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_A) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_A);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <A");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan <A");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // AB");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("BC // tan <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("CA^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("AB^2 + BC^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("CA");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 + (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("CA");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) + Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean tanAFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.TAN_A) == null){
                ItemDescriptionDialog findTanALength = new ItemDescriptionDialog();
                findTanALength.setId(ConstantHelper.TAN_A);
                findTanALength.setTitle("tan <A");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findTanALength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    tanAFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(tanAFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA8(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }

    /**
     * 11.9.a
     * search CA when SIN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA9a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findSinC = new ItemDescriptionDialog();
            findSinC.setId(ConstantHelper.SIN_C);
            findSinC.setTitle("sin <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findSinC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA9a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.9.b
     * search CA when SIN <C and AB has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA9b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.SIN_C) != null && listItemsDescription.get(ConstantHelper.AB_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.SIN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("sin <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("sin <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("CA");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("AB // sin <C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand5_1);


            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean sinCFound = true;
            boolean abFound = true;

            if(listItemsDescription.get(ConstantHelper.SIN_C) == null){
                ItemDescriptionDialog findSinCLength = new ItemDescriptionDialog();
                findSinCLength.setId(ConstantHelper.SIN_C);
                findSinCLength.setTitle("sin <C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findSinCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    sinCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(sinCFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA9b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.10.a
     * search CA when COS <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA10a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("BC");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("CA");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand3_2_1);
            }

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findCosC = new ItemDescriptionDialog();
            findCosC.setId(ConstantHelper.COS_C);
            findCosC.setTitle("cos <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findCosC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA10a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.10.b
     * search CA when COS <C and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA10b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.COS_C) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.COS_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("cos <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("cos <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("BC // CA");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("CA");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("BC // cos <C");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand5_1);


            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean cosCFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.COS_C) == null){
                ItemDescriptionDialog findCosCLength = new ItemDescriptionDialog();
                findCosCLength.setId(ConstantHelper.COS_C);
                findCosCLength.setTitle("cos <C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findCosCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    cosCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(cosCFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA10b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.11.a
     * search CA when TAN <C has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA11a(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_C) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // BC");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3_1 = new ItemAnswer();
            ItemAnswer answer3_2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog leftOperand3_2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3_1 = new ArrayList<>();
            ArrayList<ItemDescriptionDialog> listRightOperand3_2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand3_2_1 = new ItemDescriptionDialog();

            listRightOperand3_1.add(rightOperand3_1_1);
            listRightOperand3_2.add(rightOperand3_2_1);

            answer3_1.setLeftOperand(leftOperand3_1);
            answer3_2.setLeftOperand(leftOperand3_2);
            answer3_1.setRightOperand(listRightOperand3_1);
            answer3_2.setRightOperand(listRightOperand3_2);

            finalAnswers.add(answer3_1);
            finalAnswers.add(answer3_2);
            answers.add(answer3_1);
            answers.add(answer3_2);


            if(rightOperand1_1.getTNumber().isFractionNumber()){
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getFirstFraction());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("BC");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_2.setIntegerNumber(rightOperand1_1.getTNumber().getFraction().getSecondFraction());

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_2_1);
            }else{
                leftOperand3_1.setTitle("AB");
                leftOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_1 = new TNumber();
                tNumberRight3_1.setType(TNumber.INTEGER_NUMBER);

                tNumberRight3_1.setIntegerNumber(rightOperand1_1.getTNumber().getIntegerNumber());

                rightOperand3_1_1.setTNumber(tNumberRight3_1);
                rightOperand3_1_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand3_1_1);

                leftOperand3_2.setTitle("BC");
                leftOperand3_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

                TNumber tNumberRight3_2 = new TNumber();
                tNumberRight3_2.setType(TNumber.INTEGER_NUMBER);

                FractionNumber fractionNumber3_2 = new FractionNumber();
                fractionNumber3_2.setNumberType(FractionNumber.INTEGER_TYPE);
                fractionNumber3_2.setIntegerValue(1);

                tNumberRight3_2.setIntegerNumber(fractionNumber3_2);

                rightOperand3_2_1.setTNumber(tNumberRight3_2);
                rightOperand3_2_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

                globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand3_2_1);
            }


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = new ItemDescriptionDialog();

            listRightOperand4.add(rightOperand4_1);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("CA^2");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_1.setTitle("AB^2 + BC^2");
            rightOperand4_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_2 = rightOperand3_1_1;
            ItemDescriptionDialog rightOperand5_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand5_4 = rightOperand3_2_1;
            ItemDescriptionDialog rightOperand5_5 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);
            listRightOperand5.add(rightOperand5_2);
            listRightOperand5.add(rightOperand5_3);
            listRightOperand5.add(rightOperand5_4);
            listRightOperand5.add(rightOperand5_5);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("CA");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTitle("/(");
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_3.setTitle(")^2 - (");
            rightOperand5_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_5.setTitle(")^2");
            rightOperand5_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("CA");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight6_1 = new TNumber();
            tNumberRight6_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber6_1 = new FractionNumber();
            fractionNumber6_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber6_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand5_2.getTNumber().getValue(),2) + Math.pow(rightOperand5_4.getTNumber().getValue(),2)));

            tNumberRight6_1.setIntegerNumber(fractionNumber6_1);

            rightOperand6_1.setTNumber(tNumberRight6_1);
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand6_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            ItemDescriptionDialog findTanC = new ItemDescriptionDialog();
            findTanC.setId(ConstantHelper.TAN_C);
            findTanC.setTitle("tan <C");

            ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
            newQuestion.add(findTanC);

            ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
            if(tmpAnswer != null && tmpAnswer.size() > 0){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA11a(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.11.b
     * search CA when TAN <C and AB has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA11b(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_C) != null && listItemsDescription.get(ConstantHelper.AB_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // BC");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("BC");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("AB // tan <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.AB_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("BC");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" // ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("BC");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.division(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.BC_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("CA^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("AB^2 + BC^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("CA");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 + (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("CA");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) + Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean tanCFound = true;
            boolean abFound = true;

            if(listItemsDescription.get(ConstantHelper.TAN_C) == null){
                ItemDescriptionDialog findTanCLength = new ItemDescriptionDialog();
                findTanCLength.setId(ConstantHelper.TAN_C);
                findTanCLength.setTitle("tan <C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findTanCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    tanCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.AB_LENGTH) == null){
                ItemDescriptionDialog findABLength = new ItemDescriptionDialog();
                findABLength.setId(ConstantHelper.AB_LENGTH);
                findABLength.setTitle("AB");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findABLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    abFound = false;
                }
            }

            if(tanCFound && abFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA11b(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }


    /**
     * 11.11.c
     * search CA when TAN <C and BC has been known
     * @param listItemsDescription
     * @param searchLevel
     * @return
     */
    private ArrayList<ItemAnswer> ruleCA11c(Map<String, ItemDescriptionDialog> listItemsDescription, int searchLevel){
        ArrayList<ItemAnswer> answers = new ArrayList<ItemAnswer>();
        if(listItemsDescription.get(ConstantHelper.TAN_C) != null && listItemsDescription.get(ConstantHelper.BC_LENGTH) != null){
            /**
             * describe answer 1
             */
            ItemAnswer answer1 = new ItemAnswer();

            ItemDescriptionDialog leftOperand1 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand1 = new ArrayList<>();
            ItemDescriptionDialog rightOperand1_1 = listItemsDescription.get(ConstantHelper.TAN_C);

            listRightOperand1.add(rightOperand1_1);

            answer1.setLeftOperand(leftOperand1);
            answer1.setRightOperand(listRightOperand1);

            finalAnswers.add(answer1);
            answers.add(answer1);

            leftOperand1.setTitle("tan <C");
            leftOperand1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 2
             */
            ItemAnswer answer2 = new ItemAnswer();

            ItemDescriptionDialog leftOperand2 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand2 = new ArrayList<>();
            ItemDescriptionDialog rightOperand2_1 = new ItemDescriptionDialog();

            listRightOperand2.add(rightOperand2_1);

            answer2.setLeftOperand(leftOperand2);
            answer2.setRightOperand(listRightOperand2);

            finalAnswers.add(answer2);
            answers.add(answer2);

            leftOperand2.setTitle("tan <C");
            leftOperand2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand2_1.setTitle("AB // BC");
            rightOperand2_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 3
             */
            ItemAnswer answer3 = new ItemAnswer();

            ItemDescriptionDialog leftOperand3 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand3 = new ArrayList<>();
            ItemDescriptionDialog rightOperand3_1 = new ItemDescriptionDialog();

            listRightOperand3.add(rightOperand3_1);

            answer3.setLeftOperand(leftOperand3);
            answer3.setRightOperand(listRightOperand3);

            finalAnswers.add(answer3);
            answers.add(answer3);

            leftOperand3.setTitle("AB");
            leftOperand3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand3_1.setTitle("BC * tan <A");
            rightOperand3_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);


            /**
             * describe answer 4
             */
            ItemAnswer answer4 = new ItemAnswer();

            ItemDescriptionDialog leftOperand4 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand4 = new ArrayList<>();
            ItemDescriptionDialog rightOperand4_1 = listItemsDescription.get(ConstantHelper.BC_LENGTH);
            ItemDescriptionDialog rightOperand4_2 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand4_3 = rightOperand1_1;

            listRightOperand4.add(rightOperand4_1);
            listRightOperand4.add(rightOperand4_2);
            listRightOperand4.add(rightOperand4_3);

            answer4.setLeftOperand(leftOperand4);
            answer4.setRightOperand(listRightOperand4);

            finalAnswers.add(answer4);
            answers.add(answer4);

            leftOperand4.setTitle("AB");
            leftOperand4.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand4_2.setTitle(" * ");
            rightOperand4_2.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 5
             */
            ItemAnswer answer5 = new ItemAnswer();

            ItemDescriptionDialog leftOperand5 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand5 = new ArrayList<>();
            ItemDescriptionDialog rightOperand5_1 = new ItemDescriptionDialog();

            listRightOperand5.add(rightOperand5_1);

            answer5.setLeftOperand(leftOperand5);
            answer5.setRightOperand(listRightOperand5);

            finalAnswers.add(answer5);
            answers.add(answer5);

            leftOperand5.setTitle("AB");
            leftOperand5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand5_1.setTNumber(MathHelper.product(rightOperand4_1.getTNumber(), rightOperand4_3.getTNumber()));
            rightOperand5_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.AB_LENGTH, rightOperand5_1);

            /**
             * describe answer 6
             */
            ItemAnswer answer6 = new ItemAnswer();

            ItemDescriptionDialog leftOperand6 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand6 = new ArrayList<>();
            ItemDescriptionDialog rightOperand6_1 = new ItemDescriptionDialog();

            listRightOperand6.add(rightOperand6_1);

            answer6.setLeftOperand(leftOperand6);
            answer6.setRightOperand(listRightOperand6);

            finalAnswers.add(answer6);
            answers.add(answer6);

            leftOperand6.setTitle("CA^2");
            leftOperand6.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand6_1.setTitle("AB^2 + BC^2");
            rightOperand6_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 7
             */
            ItemAnswer answer7 = new ItemAnswer();

            ItemDescriptionDialog leftOperand7 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand7 = new ArrayList<>();
            ItemDescriptionDialog rightOperand7_1 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_2 = rightOperand5_1;
            ItemDescriptionDialog rightOperand7_3 = new ItemDescriptionDialog();
            ItemDescriptionDialog rightOperand7_4 = rightOperand4_1;
            ItemDescriptionDialog rightOperand7_5 = new ItemDescriptionDialog();

            listRightOperand7.add(rightOperand7_1);
            listRightOperand7.add(rightOperand7_2);
            listRightOperand7.add(rightOperand7_3);
            listRightOperand7.add(rightOperand7_4);
            listRightOperand7.add(rightOperand7_5);

            answer7.setLeftOperand(leftOperand7);
            answer7.setRightOperand(listRightOperand7);

            finalAnswers.add(answer7);
            answers.add(answer7);

            leftOperand7.setTitle("CA");
            leftOperand7.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_1.setTitle("/(");
            rightOperand7_1.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_3.setTitle(")^2 + (");
            rightOperand7_3.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            rightOperand7_5.setTitle(")^2");
            rightOperand7_5.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            /**
             * describe answer 8
             */
            ItemAnswer answer8 = new ItemAnswer();

            ItemDescriptionDialog leftOperand8 = new ItemDescriptionDialog();
            ArrayList<ItemDescriptionDialog> listRightOperand8 = new ArrayList<>();
            ItemDescriptionDialog rightOperand8_1 = new ItemDescriptionDialog();

            listRightOperand8.add(rightOperand8_1);

            answer8.setLeftOperand(leftOperand8);
            answer8.setRightOperand(listRightOperand8);

            finalAnswers.add(answer8);
            answers.add(answer8);

            leftOperand8.setTitle("CA");
            leftOperand8.setInputType(ItemDescriptionDialog.INPUT_CONSTANTA);

            TNumber tNumberRight8_1 = new TNumber();
            tNumberRight8_1.setType(TNumber.INTEGER_NUMBER);

            FractionNumber fractionNumber8_1 = new FractionNumber();
            fractionNumber8_1.setNumberType(FractionNumber.INTEGER_TYPE);
            fractionNumber8_1.setIntegerValue(Math.sqrt(
                    Math.pow(rightOperand7_2.getTNumber().getValue(),2) + Math.pow(rightOperand7_4.getTNumber().getValue(),2)));

            tNumberRight8_1.setIntegerNumber(fractionNumber8_1);

            rightOperand8_1.setTNumber(tNumberRight8_1);
            rightOperand8_1.setInputType(ItemDescriptionDialog.INPUT_LENGTH_TYPE);

            globalListItemsDescription.put(ConstantHelper.CA_LENGTH, rightOperand8_1);

            /**
             * return all answer
             */
            return answers;
        }else if(searchLevel == 1){

            boolean tanCFound = true;
            boolean bcFound = true;

            if(listItemsDescription.get(ConstantHelper.TAN_C) == null){
                ItemDescriptionDialog findTanCLength = new ItemDescriptionDialog();
                findTanCLength.setId(ConstantHelper.TAN_C);
                findTanCLength.setTitle("tan <C");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findTanCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    tanCFound = false;
                }
            }

            if(listItemsDescription.get(ConstantHelper.BC_LENGTH) == null){
                ItemDescriptionDialog findBCLength = new ItemDescriptionDialog();
                findBCLength.setId(ConstantHelper.BC_LENGTH);
                findBCLength.setTitle("BC");

                ArrayList<ItemDescriptionDialog> newQuestion = new ArrayList<>();
                newQuestion.add(findBCLength);

                ArrayList<ItemAnswer> tmpAnswer = resolve(listItemsDescription, newQuestion);
                if(tmpAnswer == null || tmpAnswer.size() == 0){
                    bcFound = false;
                }
            }

            if(tanCFound && bcFound){
                /**
                 * calculate back after finding the lost description needed
                 */
                return ruleCA11c(globalListItemsDescription, 0);
            }else{
                return null;
            }
        }

        return null;
    }
}
