package com.greekquiz.admin.ancientgreekphilosophyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitAnswers(View v) {

        int score = 0;
        int scoreAdd = 1;

        // First Question method

        RadioButton firstQuestionCorrect = findViewById(R.id.greece);
        boolean hasTheFirstQuestionCorrect = firstQuestionCorrect.isChecked();

        if (hasTheFirstQuestionCorrect) {
            score += scoreAdd;
        }

        //Second question

        CheckBox secondQuestionFirstCorrect = findViewById(R.id.artystoteles);
        boolean hasThesecondQuestionFirstCorrect = secondQuestionFirstCorrect.isChecked();

        CheckBox secondQuestionSecondCorrect = findViewById(R.id.socrates);
        boolean hasThesecondQuestionSecondCorrect = secondQuestionSecondCorrect.isChecked();

        if (hasThesecondQuestionFirstCorrect && hasThesecondQuestionSecondCorrect) {
            score += scoreAdd;
        }

        // Third question

        EditText thirdQuestionCorrect = findViewById(R.id.nothing);
        String hasThirdQuestionCorrect = thirdQuestionCorrect.getText().toString();

        String correctAnswer = getString(R.string.third_question_answer);

        if (correctAnswer.equals(hasThirdQuestionCorrect)) {
            score += scoreAdd;
        }

        // Fourth Question

        RadioButton fourthQuestionCorrect = findViewById(R.id.love_of_wisdom);
        boolean hasTheFourthQuestionCorrect = fourthQuestionCorrect.isChecked();

        if (hasTheFourthQuestionCorrect) {
            score += scoreAdd;
        }

        // Fifth Question

        RadioButton fifthQuestionCorrect = findViewById(R.id.plato);
        boolean hasfifthQuestionCorrect = fifthQuestionCorrect.isChecked();

        if (hasfifthQuestionCorrect) {
            score += scoreAdd;
        }

        // Sixth Question

        RadioButton sixthQuestionCrrect = findViewById(R.id.thales);
        boolean hasSixthQuestionCorrect = sixthQuestionCrrect.isChecked();

        if (hasSixthQuestionCorrect) {
            score += scoreAdd;
        }

        // Takes user name
        EditText userNameField = findViewById(R.id.user_name);
        String userName = userNameField.getText().toString();

        // Shows a toast with the results

        Toast.makeText(this, userName + " ,your score is " + score, Toast.LENGTH_SHORT).show();

    }
}