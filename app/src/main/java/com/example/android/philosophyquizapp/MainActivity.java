package com.example.android.philosophyquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    EditText nameField;
    EditText responseField = null;
    CheckBox firstCheckBox = null;
    CheckBox secondCheckBox = null;
    CheckBox thirdCheckBox = null;
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
        thirdCheckBox = findViewById(R.id.third_checkbox);
        fourthCheckBox = findViewById(R.id.fourth_checkbox);
    }


    // First Question
    public void radioq1(View view) {
        if(view.getId() == R.id.answer_q1) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }


    // Second Question
    public void radioq2(View view) {
        if(view.getId() == R.id.answer_q2) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }



    //Third Question
    public void checkBox(View view){

        if (firstCheckBox.isChecked() && secondCheckBox.isChecked() && fourthCheckBox.isChecked()) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        }

        if (thirdCheckBox.isChecked()) {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }


    // Fourth Question
    public void radioq4(View view) {
        if(view.getId() == R.id.answer_q4) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }


    //Fifth Question
    public void Q5Result() {
        EditText et = findViewById(R.id.response_field);
        String answer = et.getText().toString();

        if (answer.isEmpty()){
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        } else {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();

        }
    }

    // Sixth Question -- Trying to make more concise
    public void radioq6(View view) {
        if(view.getId() == R.id.answer_q6) {
            score += 1;
            Toast.makeText(this, getString(R.string.toast_correct), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_wrong), Toast.LENGTH_SHORT).show();
        }
    }



    //for score Summary
    public void setScore(View view) {
        Q5Result();
        String scoreSummary = createScoreSummary(nameField.getText().toString(), score);
        Toast.makeText(this, scoreSummary,Toast.LENGTH_SHORT).show();
    }


   private String createScoreSummary(String name, int score) {
        String scoreSummary = String.format(getString(R.string.score_summary_name), name);
        scoreSummary += "\n" + getString(R.string.score_summary_score) + score;
        return scoreSummary;



    }
}