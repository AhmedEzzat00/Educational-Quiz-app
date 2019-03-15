package com.educ.ahmed.educationaljavaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void quiz1OnClickedRadioButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.quiz_1_answer_1_radio_button:
            case R.id.quiz_1_answer_2_radio_button:
            case R.id.quiz_1_answer_4_radio_button:

                if (checked)
                    break;
            case R.id.quiz_1_answer_3_radio_button:

                if (checked)
                    addOnePoint();
                break;
        }
    }


    public void quiz2OnClickedRadioButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.quiz_2_answer_1_radio_button:
                if (checked)
                    addOnePoint();
                break;
            case R.id.quiz_2_answer_2_radio_button:
                if (checked)
                    break;
        }
    }

    public void quiz3OnClickedRadioButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.quiz_3_answer_1_radio_button:
                if (checked)
                    addOnePoint();
                break;
            case R.id.quiz_3_answer_2_radio_button:
                if (checked)

                    break;
        }
    }

    public void quiz4OnClickedCheckBox(View view) {


        CheckBox firstAnswer= (CheckBox) findViewById(R.id.quiz_4_answer_1_check_box);

        CheckBox secondAnswer= (CheckBox) findViewById(R.id.quiz_4_answer_2_check_box);

        CheckBox thirdAnswer= (CheckBox) findViewById(R.id.quiz_4_answer_3_check_box);

        CheckBox fourthAnswer= (CheckBox) findViewById(R.id.quiz_4_answer_4_check_box);

        if(firstAnswer.isChecked()&&thirdAnswer.isChecked())
        {
            if (secondAnswer.isChecked() || fourthAnswer.isChecked())
            {
                return;
            }
            else
                addOnePoint();
        }

    }

    public void quiz5OnClickedRadioButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.quiz_5_answer_1_radio_button:
            case R.id.quiz_5_answer_2_radio_button:

                if (checked)
                    break;
            case R.id.quiz_5_answer_3_radio_button:

                if (checked)
                    addOnePoint();
                break;
        }
    }


    private void addOnePoint() {
        correctAnswers++;
    }

    public void submitButton(View view) {
        String report = "You Have Answered " + correctAnswers + " Correct Answers From 5 Questions";
        Toast.makeText(getApplicationContext(), report,
                Toast.LENGTH_SHORT).show();

        correctAnswers = 0;
    }
}
