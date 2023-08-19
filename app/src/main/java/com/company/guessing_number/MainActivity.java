package com.company.guessing_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonStart;
    RadioButton radio1,radio2,radio3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        radio1=findViewById(R.id.radio1);
        radio2=findViewById(R.id.radio2);
        radio3=findViewById(R.id.radio3);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GameActivity.class);

                if(!radio1.isChecked() && !radio2.isChecked() && !radio3.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Please select a number of digits!!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(radio1.isChecked())
                    {
                        intent.putExtra("two",true);
                    }
                    if(radio2.isChecked())
                    {
                        intent.putExtra("three",true);
                    }
                    if(radio3.isChecked())
                    {
                        intent.putExtra("four",true);
                    }
                    startActivity(intent);
                }


            }
        });
    }
}