package com.example.client.myfirstapp;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1 = findViewById(R.id.number1_input);
        final EditText number2 = findViewById(R.id.number2_input);
        final TextView result = findViewById(R.id.result_text);
        final Button add = findViewById(R.id.add_button);
        final Button sub = findViewById(R.id.sub_button);
        final LinearLayout mainLayout = findViewById(R.id.mainLayout);

        add.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                if((number1.getText().toString().equals(""))||(number2.getText().toString().equals(""))){
                    result.setTextColor(Color.RED);
                    result.setText(String.valueOf("Empty field(s)!"));

                    //hide a keyboard after displaying of result
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);

                } else {
                    int num1 = Integer.parseInt(number1.getText().toString());
                    int num2 = Integer.parseInt(number2.getText().toString());
                    int resultNum = num1 + num2;
                    result.setTextColor(Color.BLACK);
                    result.setText(String.valueOf(resultNum));

                    //hide a keyboard after displaying of result
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if((number1.getText().toString().equals(""))||(number2.getText().toString().equals(""))){
                    result.setTextColor(Color.RED);
                    result.setText(String.valueOf("Empty field(s)!"));

                    //hide a keyboard after displaying of result
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);

                } else {
                    int num1 = Integer.parseInt(number1.getText().toString());
                    int num2 = Integer.parseInt(number2.getText().toString());
                    int resultNum = num1 - num2;
                    result.setTextColor(Color.BLACK);
                    result.setText(String.valueOf(resultNum));

                    //hide a keyboard after displaying of result
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);
                }
            }
        });
    }
}
