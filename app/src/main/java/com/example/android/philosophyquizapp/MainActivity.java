package com.example.android.philosophyquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    EditText nameField = null;
    EditText responseField = null;
    CheckBox firstCheckBox = null;
    CheckBox secondCheckBox = null;
    CheckBox checkBox = null;
    CheckBox fourthCheckBox = null;
    //private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameField = findViewById(R.id.name_field);
        responseField = findViewById(R.id.response_field);
        firstCheckBox = findViewById(R.id.first_checkbox);
        secondCheckBox = findViewById(R.id.second_checkbox);
        checkBox = findViewById(R.id.wrong_answer_q3);
        fourthCheckBox = findViewById(R.id.fourth_checkbox);
    }

    //space for user to enter name
    String name = nameField.getText().toString();


    // First Question
    public void radioq1(View view) {

        switch (view.getId()) {
            case R.id.answer_q1:
                score += 1;
                Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
                break;

            case R.id.false_q1:
                Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
                break;

        }
    }

    // Second Question
    public void radioq2(View view) {

        switch (view.getId()) {
            case R.id.false_q2:
                break;

            case R.id.answer_q2:
                score += 1;
                Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
                break;

        }
    }

    // Third Question
    public void checkBoxAnswers(View view) {
        //figure out if user checks correct boxes
        boolean choseFirstBox = firstCheckBox.isChecked();
        boolean choseSecondBox = secondCheckBox.isChecked();
        boolean choseThirdBox = checkBox.isChecked();
        boolean choseFourthBox = fourthCheckBox.isChecked();

    }


    // Fourth Question
    public void radioq4(View view) {

        switch (view.getId()) {
            case R.id.false_q4:
                Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
                break;

            case R.id.answer_q4:
                score += 1;
                Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
                break;

            case R.id.not_q4:
                Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
                break;

            case R.id.wrong_q4:
                Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    // Fifth Question
    String response = responseField.getText().toString();


    // Sixth Question
    public void radioq6(View view) {

        switch (view.getId()) {
            case R.id.false_q6:
                Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
                break;
            case R.id.not_q6:
                Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
                break;

            case R.id.answer_q6:
                score += 1;
                Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
                break;

            case R.id.wrong_q6:
                Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //for score Summary

    public void setScore(View view) {
        String scoreSummary = createScoreSummary(name, score);
        Toast.makeText(this, scoreSummary,Toast.LENGTH_SHORT).show();
    }


    private String createScoreSummary(String name, int score) {
        String scoreSummary = getString(R.string.score_summary_name, name);
        scoreSummary += "\n" + getString(R.string.score_summary_score) + score;
        return scoreSummary;



    }
}