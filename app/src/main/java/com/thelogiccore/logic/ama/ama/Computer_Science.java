package com.thelogiccore.logic.ama.ama;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.thelogiccore.logic.ama.*;
import com.thelogiccore.logic.ama.Question;
import com.thelogiccore.logic.ama.QuestionBank;

/**
 * Created by Shawn on 5/23/2015.
 */
public class Computer_Science extends Fragment{

    final com.thelogiccore.logic.ama.ama.QuestionBank qBank = new com.thelogiccore.logic.ama.ama.QuestionBank();
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.compsci_fragment,
                container, false);
        final TextView questionshow = (TextView) view.findViewById(R.id.question_compsci);
        questionshow.setText("");
        Button button = (Button) view.findViewById(R.id.compsci_gen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                com.thelogiccore.logic.ama.ama.Question question = qBank.getRandomQuestion("Computer Science");

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
                qBank.add(addQuestion, "Computer Science");
            }
        });
        return view;
    }
}