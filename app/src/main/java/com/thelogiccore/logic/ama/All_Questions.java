package com.thelogiccore.logic.ama;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Shawn on 5/23/2015.
 */
public class All_Questions extends Fragment {
    final QuestionBank qBank = new QuestionBank();
    public String questionthing;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.compsci_fragment,
                container, false);
        final TextView questionshow = (TextView) view.findViewById(R.id.question_compsci);
        questionshow.setText("");
        Button button = (Button) view.findViewById(R.id.compsci_gen);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Question question = qBank.getRandomQuestion();

                questionshow.setText(question.getQuestion());

            }
        });
        return view;
    }
}
