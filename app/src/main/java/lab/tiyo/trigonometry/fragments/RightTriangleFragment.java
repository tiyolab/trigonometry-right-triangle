package lab.tiyo.trigonometry.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lab.tiyo.trigonometry.R;
import lab.tiyo.trigonometry.adapters.AnswerItemAdapter;
import lab.tiyo.trigonometry.adapters.DescriptionItemAdapter;
import lab.tiyo.trigonometry.adapters.QuestionItemAdapter;
import lab.tiyo.trigonometry.dialogs.RightTriangleDescriptionDialog;
import lab.tiyo.trigonometry.dialogs.RightTriangleQuestionDialog;
import lab.tiyo.trigonometry.helpers.ConstantHelper;
import lab.tiyo.trigonometry.listeners.ItemDescriptionDialogListener;
import lab.tiyo.trigonometry.models.CustomExpandableContainer;
import lab.tiyo.trigonometry.models.ItemDescriptionDialog;
import lab.tiyo.trigonometry.models.ItemAnswer;
import lab.tiyo.trigonometry.models.RightTriangleRule;

/**
 * A simple {@link Fragment} subclass.
 */
public class RightTriangleFragment extends Fragment {
    private String TAG = "Right Triangle Fragment";
    /**
     * describe view
     */
    CustomExpandableContainer descriptionCustomExpandable, questionCustomExpandable, answerCustomExpandable;
    RelativeLayout descriptionExpandableContent, questionExpandableContent, answerExpandableContent;
    Button addDescriptionButton, addQuestionButton, addAnswerButton;
    ListView descriptionListView, questionListView, answerListView;

    DescriptionItemAdapter descriptionItemAdapter;
    QuestionItemAdapter questionItemAdapter;
    AnswerItemAdapter answerItemAdapter;

    ArrayList<ItemDescriptionDialog> listItemsDescription = new ArrayList<>();
    Map<String, ItemDescriptionDialog> mapItemsDescription = new HashMap<>();
    ArrayList<ItemDescriptionDialog> listItemsQuestion = new ArrayList<>();
    ArrayList<ItemAnswer> listItemsAnswer = new ArrayList<>();

    public RightTriangleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_right_triangle, container, false);

        /**
         * generate expandable view
         */
        descriptionCustomExpandable = (CustomExpandableContainer)v.findViewById(R.id.description_custom_expandable);
        questionCustomExpandable = (CustomExpandableContainer)v.findViewById(R.id.question_custom_expandable);
        answerCustomExpandable = (CustomExpandableContainer)v.findViewById(R.id.answer_custom_expandable);

        /**
         * set title to each expandable section
         */
        descriptionCustomExpandable.setTitle("Description");
        questionCustomExpandable.setTitle("Question");
        answerCustomExpandable.setTitle("Answer");

        /**
         * describe expandable content view
         */
        descriptionExpandableContent = (RelativeLayout) inflater.inflate(R.layout.custom_expandable_content, null);
        questionExpandableContent = (RelativeLayout)inflater.inflate(R.layout.custom_expandable_content, null);
        answerExpandableContent = (RelativeLayout)inflater.inflate(R.layout.custom_expandable_content, null);

        /**
         * describe add button each expandable section
         */
        addDescriptionButton = (Button)descriptionExpandableContent.findViewById(R.id.btn_add);
        addQuestionButton = (Button)questionExpandableContent.findViewById(R.id.btn_add);
        addAnswerButton = (Button)answerExpandableContent.findViewById(R.id.btn_add);

        /**
         * describe list view each expandable sectoin
         */
        descriptionListView = (ListView)descriptionExpandableContent.findViewById(R.id.list_item);
        questionListView = (ListView)questionExpandableContent.findViewById(R.id.list_item);
        answerListView = (ListView)answerExpandableContent.findViewById(R.id.list_item);

        /**
         * describe adapter
         */
        descriptionItemAdapter = new DescriptionItemAdapter(getActivity(), listItemsDescription);
        questionItemAdapter = new QuestionItemAdapter(getActivity(), listItemsQuestion);
        answerItemAdapter = new AnswerItemAdapter(getActivity(), listItemsAnswer);

        /**
         * add adapter to list in each expandable section
         */
        descriptionListView.setAdapter(descriptionItemAdapter);
        questionListView.setAdapter(questionItemAdapter);
        answerListView.setAdapter(answerItemAdapter);

        /**
         * add event to add button
         */
        addDescriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final RightTriangleDescriptionDialog descriptionDialog = new RightTriangleDescriptionDialog();
                descriptionDialog.setTitle("Available Description Item");
                descriptionDialog.setOnItemChoosed(new ItemDescriptionDialogListener() {
                    @Override
                    public void onClick(ItemDescriptionDialog itemDescription) {
                        listItemsDescription.add(itemDescription);
                        mapItemsDescription.put(itemDescription.getId(), itemDescription);

                        descriptionItemAdapter.notifyDataSetChanged();
                        descriptionDialog.dismiss();
                    }
                });
                descriptionDialog.show(getChildFragmentManager(), "description_dialog");
            }
        });

        addQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final RightTriangleQuestionDialog questionDialog = new RightTriangleQuestionDialog();
                questionDialog.setTitle("Available Question Item");
                questionDialog.setOnItemChoosed(new ItemDescriptionDialogListener() {
                    @Override
                    public void onClick(ItemDescriptionDialog itemDescription) {
                        listItemsQuestion.add(itemDescription);

                        questionItemAdapter.notifyDataSetChanged();
                        questionDialog.dismiss();
                    }
                });
                questionDialog.show(getChildFragmentManager(), "description_dialog");
            }
        });

        addAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RightTriangleRule rule = new RightTriangleRule();
                listItemsAnswer.addAll(rule.resolve(mapItemsDescription, listItemsQuestion));
                answerItemAdapter.notifyDataSetChanged();

                Log.i(TAG, "size = " + listItemsAnswer.size()+"");

                for (ItemAnswer i : listItemsAnswer) {
                    String out = "";
                    if (i.getLeftOperand().getInputType().equals(ConstantHelper.INPUT_CONSTANTA)) {
                        out += i.getLeftOperand().getTitle();
                    } else {
                        out += i.getLeftOperand().getTNumber().getValue();
                    }

                    out += " = ";

                    for (ItemDescriptionDialog j : i.getRightOperand()) {
                        if (j.getInputType().equals(ConstantHelper.INPUT_CONSTANTA)) {
                            out += j.getTitle();
                        } else {
                            out += j.getTNumber().getValue();
                        }
                    }
                    Log.i(TAG, out);
                }
            }
        });

        /**
         * add expandable content to expandable container
         */
        descriptionCustomExpandable.addView(descriptionExpandableContent);
        questionCustomExpandable.addView(questionExpandableContent);
        answerCustomExpandable.addView(answerExpandableContent);

        return v;
    }


}
