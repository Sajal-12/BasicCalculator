package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add;
    Button subtract;
    Button multiply;
    Button divide = findViewById(R.id.btnDivide);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns);
         add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue , secondValue , ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue + secondValue;

                tvAns.setText("Answer is = "+ans);
            }
        });



        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue , secondValue;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                int ans = firstValue - secondValue;

                tvAns.setText("Answer is = "+ans);
            }
        });

       multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue , secondValue , ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue * secondValue;

                tvAns.setText("Answer is = "+ans);
            }
        });


       divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue , secondValue , ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue / secondValue;

                tvAns.setText("Answer is = "+ans);
            }
        });



    }
}