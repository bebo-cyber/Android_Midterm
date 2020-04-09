package com.example.anchal_c0763596_midterm;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    Button b1, b2;
    EditText et1, et2;

    TextView txt1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);

        b2 = (Button) findViewById(R.id.button2);
        txt1 = (TextView) findViewById(R.id.textView3);
        txt1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("student1") &&
                        et2.getText().toString().equals("123456")) {
                    Toast.makeText(getApplicationContext(),
                            "Logging in...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();

                    txt1.setVisibility(View.VISIBLE);
                    txt1.setBackgroundColor(Color.RED);
                    counter--;
                    txt1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logIn();
            }
        });
    }

    public void logIn() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }

}
