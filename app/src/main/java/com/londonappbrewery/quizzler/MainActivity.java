package com.londonappbrewery.quizzler;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here:
        Button mTrueButton;
        Button mFalseButton;
        TextView mQuestionTextView;
        int mIndex;
        int mQuestion;


    // TODO: Create question bank
    private TrueFalse[] mQuestionBank = new TrueFalse[] {
            new TrueFalse(R.string.question_1, true),
            new TrueFalse(R.string.question_2, true),
            new TrueFalse(R.string.question_3, true),
            new TrueFalse(R.string.question_4, true),
            new TrueFalse(R.string.question_5, true),
            new TrueFalse(R.string.question_6, false),
            new TrueFalse(R.string.question_7, true),
            new TrueFalse(R.string.question_8, false),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, false),
            new TrueFalse(R.string.question_12, false),
            new TrueFalse(R.string.question_13, true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);

        // fetch the first TrueFalse object at the value of mIndex which is 0.
        mQuestion = mQuestionBank[mIndex].getQuestionID();
        mQuestionTextView.setText(mQuestion);


        // true / false buttons
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });
    }

    private void updateQuestion() {
        mIndex = (mIndex + 1) % mQuestionBank.length; // mIndex is currently 0
        mQuestion = mQuestionBank[mIndex].getQuestionID();
        mQuestionTextView.setText(mQuestion);

    }
}
