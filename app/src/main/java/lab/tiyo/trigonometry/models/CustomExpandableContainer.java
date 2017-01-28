package lab.tiyo.trigonometry.models;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import lab.tiyo.trigonometry.R;

/**
 * Created by root on 29/12/16.
 */
public class CustomExpandableContainer extends RelativeLayout{
    private View rootView;
    private LinearLayout expandableContainer;
    private RelativeLayout expandableHeader;
    private TextView expandableTitle;
    private RelativeLayout expandableContent;
    private LinearLayout.LayoutParams contentParam;

    private Boolean isExpand = false;

    public CustomExpandableContainer(Context context) {
        super(context);
        init(context);
    }

    public CustomExpandableContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        rootView = inflate(context, R.layout.custom_expandable_container, this);

        expandableContainer = (LinearLayout)rootView.findViewById(R.id.expandable_container);
        expandableHeader = (RelativeLayout)rootView.findViewById(R.id.expandable_header);
        expandableTitle = (TextView)rootView.findViewById(R.id.title);
        expandableContent = (RelativeLayout)rootView.findViewById(R.id.expandable_content);


        contentParam = (LinearLayout.LayoutParams)expandableContent.getLayoutParams();
        expandableHeader.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isExpand) {
                    contentParam.height = 0;
                    isExpand = false;
                } else {
                    contentParam.height = LayoutParams.WRAP_CONTENT;
                    isExpand = true;
                }

                expandableContent.setLayoutParams(contentParam);
            }
        });
    }

    @Override
    public void addView(View child) {
        //super.addView(child);
        expandableContent.addView(child);
    }

    public void setTitle(String title){
        expandableTitle.setText(title);
    }
}
