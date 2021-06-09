package com.example.calculatorgeekbrains;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView inputView;
    private TextView resultView;
    private String process;
    private InputButtons inputButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputButton = new InputButtons();
        initView();
    }

    private void initView() {
        inputView = findViewById(R.id.inputfield);
        resultView = findViewById(R.id.resultfield);
        initButtonOnClickListener();
    }

    private void setInputText(TextView inputView, String symbol) {
        process = ((String) inputView.getText()).concat(symbol);
        inputView.setText(String.format(Locale.getDefault(), "%s", process));
    }

    private void initButtonOnClickListener() {
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonDot = findViewById(R.id.buttondot);
        Button buttonMultiply = findViewById(R.id.buttonmultiply);
        Button buttonSubstract = findViewById(R.id.buttonsubstract);
        Button buttonDevide = findViewById(R.id.buttondevide);
        Button buttonEqual = findViewById(R.id.buttonequal);
        Button buttonRightBracket = findViewById(R.id.buttonrightbracket);
        Button buttonLeftBracket = findViewById(R.id.buttonleftbracket);


        button0.setOnClickListener(v -> setInputText(inputView, inputButton.getButton0()));
        button1.setOnClickListener(v -> setInputText(inputView, inputButton.getButton1()));
        button2.setOnClickListener(v -> setInputText(inputView, inputButton.getButton2()));
        button3.setOnClickListener(v -> setInputText(inputView, inputButton.getButton3()));
        button4.setOnClickListener(v -> setInputText(inputView, inputButton.getButton4()));
        button5.setOnClickListener(v -> setInputText(inputView, inputButton.getButton5()));
        button6.setOnClickListener(v -> setInputText(inputView, inputButton.getButton6()));
        button7.setOnClickListener(v -> setInputText(inputView, inputButton.getButton7()));
        button8.setOnClickListener(v -> setInputText(inputView, inputButton.getButton8()));
        button9.setOnClickListener(v -> setInputText(inputView, inputButton.getButton9()));

        buttonDot.setOnClickListener(v -> setInputText(inputView, inputButton.getButtondot()));
        buttonMultiply.setOnClickListener(v -> setInputText(inputView, inputButton.getButtonmultiply()));
        buttonSubstract.setOnClickListener(v -> setInputText(inputView, inputButton.getButtonsubstract()));
        buttonDevide.setOnClickListener(v -> setInputText(inputView, inputButton.getButtondevide()));
        buttonEqual.setOnClickListener(v -> setInputText(inputView, inputButton.getButtonequal()));
        buttonRightBracket.setOnClickListener(v -> setInputText(inputView, inputButton.getButtonrightbracket()));
        buttonLeftBracket.setOnClickListener(v -> setInputText(inputView, inputButton.getButtonleftbracket()));


    }

}
