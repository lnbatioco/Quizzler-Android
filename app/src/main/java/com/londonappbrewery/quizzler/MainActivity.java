package com.londonappbrewery.quizzler;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here: (accessible everywhere!)
        // create a variable that will hold our button so we can access it anywhere
        Button mTrueButton; // refer to onCreate
        Button mFalseButton;


    // TODO: Uncomment to create question bank
//    private TrueFalse[] mQuestionBank = new TrueFalse[] {
//            new TrueFalse(R.string.question_1, true),
//            new TrueFalse(R.string.question_2, true),
//            new TrueFalse(R.string.question_3, true),
//            new TrueFalse(R.string.question_4, true),
//            new TrueFalse(R.string.question_5, true),
//            new TrueFalse(R.string.question_6, false),
//            new TrueFalse(R.string.question_7, true),
//            new TrueFalse(R.string.question_8, false),
//            new TrueFalse(R.string.question_9, true),
//            new TrueFalse(R.string.question_10, true),
//            new TrueFalse(R.string.question_11, false),
//            new TrueFalse(R.string.question_12, false),
//            new TrueFalse(R.string.question_13,true)
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button); // convert a view to a button
        mFalseButton = (Button) findViewById(R.id.false_button);


    }
}
