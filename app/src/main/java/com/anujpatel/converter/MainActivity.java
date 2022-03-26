package com.anujpatel.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //widget
        EditText editText=findViewById(R.id.editText);
        Button button=findViewById(R.id.button);
        TextView textView2=findViewById(R.id.textView2);
        TextView textView3=findViewById(R.id.textView3);



        //2- kilo to pound
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //1- get kilo value
                String kilogram = editText.getText().toString();

                //str into float
                float kilo = Float.parseFloat(kilogram);

                float pound = (float) (kilo * 2.20462);

                textView3.setText(""+pound);
            }
        });


    }
}