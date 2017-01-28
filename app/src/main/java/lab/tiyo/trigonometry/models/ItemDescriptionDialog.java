package lab.tiyo.trigonometry.models;

import android.graphics.Bitmap;

import lab.tiyo.fraction.models.TNumber;

/**
 * Created by root on 31/12/16.
 */
public class ItemDescriptionDialog {
    private String id;
    private String title;
    private Bitmap background;
    private String inputType;
    private TNumber tNumber;

    public static final String INPUT_LENGTH_TYPE = "input_length_type";
    public static final String INPUT_CONSTANTA = "input_constanta";

    public ItemDescriptionDialog(){

    }

    public ItemDescriptionDialog(String id, String title, Bitmap background) {
        this.id = id;
        this.title = title;
        this.background = background;
    }

    public ItemDescriptionDialog(String id, String title, Bitmap background, String inputType) {
        this.id = id;
        this.title = title;
        this.background = background;
        this.inputType = inputType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bitmap getBackground() {
        return background;
    }

    public void setBackground(Bitmap background) {
        this.background = background;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public TNumber getTNumber() {
        return tNumber;
    }

    public void setTNumber(TNumber tNumber) {
        this.tNumber = tNumber;
    }

    public boolean isBackgroundExists(){
        return background != null;
    }

}
