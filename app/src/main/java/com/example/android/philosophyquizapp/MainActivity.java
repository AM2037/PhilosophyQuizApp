package com.example.android.philosophyquizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private EditText nameField = null;
    private EditText responseField = null;
    private CheckBox firstCheckBox = null;
    private CheckBox secondCheckBox = null;
    private CheckBox checkBox = null;
    private CheckBox fourthCheckBox = null;
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameField = (EditText) findViewById(R.id.name_field);
        responseField = (EditText) findViewById(R.id.response_field);
        firstCheckBox = (CheckBox) findViewById(R.id.first_checkbox);
        secondCheckBox = (CheckBox) findViewById(R.id.second_checkbox)
        checkBox = (CheckBox) findViewById(R.id.wrong_answer_q3);
        fourthCheckBox = (CheckBox) findViewById(R.id.fourth_checkbox);
    }


    public void inputFields (View view) {
        String name = nameField.getText().toString();

    }

    // First Question
    public void radioq1(View view){

        switch (view.getId()) {
            case R.id.answer_q1:
                if (true) {
                    score += 1;
                }
                break;

            case R.id.false_q1:
                if(true)
                    score += 0;
                break;

        }
    }

    // Second Question
    public void radioq2(View view){

        switch (view.getId()) {
            case R.id.false_q2:
                if (true) {
                    score += 0;
                }
                break;

            case R.id.answer_q2:
                if(true)
                    score += 1;
                break;

        }
    }

    // Third Question
    public void checkBoxAnswers (View view) {
        //figure out if user checks correct boxes
        boolean choseFirstBox = firstCheckBox.isChecked();
        boolean choseSecondBox = secondCheckBox.isChecked();
        //boolean choseThirdBox = checkBox.isChecked(); <-- WRONG ANSWER
        boolean choseFourthBox = fourthCheckBox.isChecked();

    }
}

    // Fourth Question
    public void radioq4(View view){

        switch (view.getId()) {
            case R.id.false_q4:
                if (true) {
                    score += 0;
                }
                break;

            case R.id.answer_q4:
                if(true)
                    score += 1;
                break;

            case R.id.not_q4:
                if(true)
                    score += 0;
                break;

            case R.id.wrong_q4:
                if(true)
                    score += 0;
                break;
        }
    }

    // Fifth Question
    String name = responseField.getText().toString();

    // Sixth Question
    public void radioq6(View view){

        switch (view.getId()) {
            case R.id.false_q6:
                if (true) {
                    score += 0;
                }
                break;

            case R.id.not_q6:
                if(true)
                    score += 0;
                break;

            case R.id.answer_q6:
                if(true)
                    score += 1;
                break;

            case R.id.wrong_q6:
                if(true)
                    score += 0;
                break;
        }
    }
