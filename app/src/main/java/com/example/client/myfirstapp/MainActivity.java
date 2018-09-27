package com.example.client.myfirstapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText number1,number2;
     TextView result;
     Button add;
     LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.number1_input);
        number2 = (EditText) findViewById(R.id.number2_input);
        result = (TextView) findViewById(R.id.result_text);
        add = (Button) findViewById(R.id.add_button);
        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if((number1.getText().toString().equals(""))||(number2.getText().toString().equals(""))){
                    result.setTextColor(Color.RED);
                    result.setTypeface(null, Typeface.NORMAL);
                    result.setText(String.valueOf("Empty!"));

                    //hide a keyboard after displaying of result
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);

                } else {
                    int num1 = Integer.parseInt(number1.getText().toString());
                    int num2 = Integer.parseInt(number2.getText().toString());
                    int resultNum = num1 + num2;
                    result.setTextColor(Color.BLACK);
                    result.setTypeface(null, Typeface.BOLD);
                    result.setText(String.valueOf(resultNum));

                    //hide a keyboard after displaying of result
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);
                }
            }
        });
    }
}
