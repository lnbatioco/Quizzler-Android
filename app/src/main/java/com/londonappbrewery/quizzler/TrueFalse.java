package com.londonappbrewery.quizzler;

/**
 * Created by Lory on 12/29/2017.
 */

public class TrueFalse {
    private int mQuestionID; // integer
    private boolean mAnswer; // true/false

    public TrueFalse(int questionResourceID, boolean trueOrFalse) {
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    // getter & setter for QuestionID
    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    // getter & setter for Answer
    public boolean isAnswer() { // GETTER
        return mAnswer;
    }

    public void setAnswer(boolean answer) { // SETTER
        mAnswer = answer;
    }
}


