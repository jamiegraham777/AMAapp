package com.thelogiccore.logic.ama.ama;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.thelogiccore.logic.ama.Question;
import com.thelogiccore.logic.ama.QuestionBank;

/**
 * Created by Shawn on 5/23/2015.
 */
public class Formal extends Fragment{
    final QuestionBank qBank = new QuestionBank();
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.formal_fragment,
                container, false);
        final TextView questionshow = (TextView) view.findViewById(R.id.question_XXX);
        questionshow.setText("");
        Button button = (Button) view.findViewById(R.id.XXX_gen);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Question question = qBank.getRandomQuestion("XXX");

                questionshow.setText(question.getQuestion());

            }
        });

        final EditText addstuff = (EditText) view.findViewById(R.id.string_add);
        Button add = (Button) view.findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String addQuestion = addstuff.getText().toString();
                qBank.add(addQuestion, "XXX");
            }
        });
        return view;
    }
}
