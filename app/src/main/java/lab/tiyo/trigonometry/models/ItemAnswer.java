package lab.tiyo.trigonometry.models;

import java.util.ArrayList;

/**
 * Created by root on 01/01/17.
 */
public class ItemAnswer {
    private ItemDescriptionDialog leftOperand;
    private ArrayList<ItemDescriptionDialog> rightOperand;

    public ItemAnswer() {
    }

    public ItemAnswer(ItemDescriptionDialog leftOperand, ArrayList<ItemDescriptionDialog> rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public ItemDescriptionDialog getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(ItemDescriptionDialog leftOperand) {
        this.leftOperand = leftOperand;
    }

    public ArrayList<ItemDescriptionDialog> getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(ArrayList<ItemDescriptionDialog> rightOperand) {
        this.rightOperand = rightOperand;
    }
}
