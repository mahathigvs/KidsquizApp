package com.example.android.kidsquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonEvaluate(View view) {
        score = 0;
        int numberText;
        RadioGroup dataRadio;
        RadioButton dataRadioButton;

        dataRadio = (RadioGroup) findViewById(R.id.radio1);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio1a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio1a);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio1b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio1b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio1c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio1c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio1d:
                dataRadioButton = (RadioButton) findViewById(R.id.radio1d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;

            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio1d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio1c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio1b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio1a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }

        dataRadio = (RadioGroup) findViewById(R.id.radio2);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio2a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio2a);
                dataRadioButton.setBackgroundColor(0x22FF0000);

                break;
            case R.id.radio2b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio2b);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;

            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio2b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio2a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }


        dataRadio = (RadioGroup) findViewById(R.id.radio3);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio3a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio3a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio3b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio3b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio3c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio3c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio3d:
                dataRadioButton = (RadioButton) findViewById(R.id.radio3d);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio3d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio3c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio3b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio3a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }

        dataRadio = (RadioGroup) findViewById(R.id.radio4);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio4a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio4a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio4b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio4b);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio4c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio4c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio4d:
                dataRadioButton = (RadioButton) findViewById(R.id.radio4d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio4d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio4c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio4b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio4a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }

        dataRadio = (RadioGroup) findViewById(R.id.radio5);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio5a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio5a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio5b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio5b);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio5c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio5c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio5d:
                dataRadioButton = (RadioButton) findViewById(R.id.radio5d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio5d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio5c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio5b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio5a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }

        dataRadio = (RadioGroup) findViewById(R.id.radio6);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio6a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio6a);
                dataRadioButton.setBackgroundColor(0x22FF0000);

                break;
            case R.id.radio6b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio6b);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio6c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio6c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio6d:
                dataRadioButton = (RadioButton) findViewById(R.id.radio6d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio6d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio6c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio6b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio6a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }
        dataRadio = (RadioGroup) findViewById(R.id.radio7);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio7a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio7a);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio7b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio7b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio7c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio7c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio7d:
                dataRadioButton = (RadioButton) findViewById(R.id.radio7d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio7d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio7c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio7b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio7a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }

        dataRadio = (RadioGroup) findViewById(R.id.radio8);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio8a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio8a);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio8b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio8b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio8c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio8c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio8d:
                dataRadioButton = (RadioButton) findViewById(R.id.radio8d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio8d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio8c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio8b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio8a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }

        dataRadio = (RadioGroup) findViewById(R.id.radio9);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio9a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio9a);
                dataRadioButton.setBackgroundColor(0x22FF0000);

                break;
            case R.id.radio9b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio9b);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio9c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio9c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio9d:
                dataRadioButton = (RadioButton) findViewById(R.id.radio9d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                dataRadioButton = (RadioButton) findViewById(R.id.radio9d);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio9c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio9b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                dataRadioButton = (RadioButton) findViewById(R.id.radio9a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
        }

        EditText dataText = (EditText) findViewById(R.id.edit1);
        if (dataText.getText().toString().toLowerCase().trim().contains("truth")) {
            dataText.setBackgroundColor(0x2200FF00);
            score += 1;

        } else {
            dataText.setBackgroundColor(0x22FF0000);
        }

        Float scoreP = Float.parseFloat(String.valueOf(score));
        scoreP = scoreP / 10;
        scoreP = scoreP * 100;

        Toast.makeText(this, "Your score is: " + String.valueOf(score) + " points\nYour rate is " + Math.round(scoreP) + " %", Toast.LENGTH_SHORT).show();
    }

    public void buttonReset(View view) {
        score = 0;
        RadioGroup dataRadio;
        RadioButton dataRadioButton;
        EditText dataText;

        dataRadio = (RadioGroup) findViewById(R.id.radio1);
        dataRadio.clearCheck();
        dataRadio = (RadioGroup) findViewById(R.id.radio2);
        dataRadio.clearCheck();
        dataRadio = (RadioGroup) findViewById(R.id.radio3);
        dataRadio.clearCheck();
        dataRadio = (RadioGroup) findViewById(R.id.radio4);
        dataRadio.clearCheck();
        dataRadio = (RadioGroup) findViewById(R.id.radio5);
        dataRadio.clearCheck();
        dataRadio = (RadioGroup) findViewById(R.id.radio6);
        dataRadio.clearCheck();
        dataRadio = (RadioGroup) findViewById(R.id.radio7);
        dataRadio.clearCheck();
        dataRadio = (RadioGroup) findViewById(R.id.radio8);
        dataRadio.clearCheck();
        dataRadio = (RadioGroup) findViewById(R.id.radio9);
        dataRadio.clearCheck();

        dataText = (EditText) findViewById(R.id.edit1);
        dataText.setText("");


        dataText = (EditText) findViewById(R.id.edit0);
        dataText.setText("");
        dataText.setBackgroundColor(0xFFFAFAFA);

        dataRadioButton = (RadioButton) findViewById(R.id.radio1a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio1b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio1c);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio1d);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);

        dataRadioButton = (RadioButton) findViewById(R.id.radio2a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio2b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);


        dataRadioButton = (RadioButton) findViewById(R.id.radio3a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio3b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio3c);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio3d);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);

        dataRadioButton = (RadioButton) findViewById(R.id.radio4a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio4b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio4c);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio4d);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);

        dataRadioButton = (RadioButton) findViewById(R.id.radio5a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio5b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio5c);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio5d);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);

        dataRadioButton = (RadioButton) findViewById(R.id.radio6a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio6b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio6c);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio6d);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);

        dataRadioButton = (RadioButton) findViewById(R.id.radio7a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio7b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio7c);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio7d);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);

        dataRadioButton = (RadioButton) findViewById(R.id.radio8a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio8b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio8c);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio8d);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);

        dataRadioButton = (RadioButton) findViewById(R.id.radio9a);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio9b);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio9c);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);
        dataRadioButton = (RadioButton) findViewById(R.id.radio9d);
        dataRadioButton.setBackgroundColor(0xFFFAFAFA);

        dataText = (EditText) findViewById(R.id.edit1);
        dataText.setText("");



        dataText.requestFocus();
    }
}