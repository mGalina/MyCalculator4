package com.example.mycalculator4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        InitView();

        final Group engineeringCalculator = findViewById(R.id.engineering_calculator);

        Button view = findViewById(R.id.bt_view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                engineeringCalculator.setVisibility(View.GONE);

            }
        });
    }

    private void InitView() {
        resultField = findViewById(R.id.resultField);

        Button numeral1 = findViewById(R.id.bt_1);
        numeral1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._1));
            }
        });

        Button numeral2 = findViewById(R.id.bt_2);
        numeral2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._2));
            }
        });

        Button numeral3 = findViewById(R.id.bt_3);
        numeral3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._3));
            }
        });

        Button numeral4 = findViewById(R.id.bt_4);
        numeral4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._4));
            }
        });

        Button numeral5 = findViewById(R.id.bt_5);
        numeral5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._5));
            }
        });

        Button numeral6 = findViewById(R.id.bt_6);
        numeral6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._6));
            }
        });

        Button numeral7 = findViewById(R.id.bt_7);
        numeral7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._7));
            }
        });

        Button numeral8 = findViewById(R.id.bt_8);
        numeral8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._8));
            }
        });

        Button numeral9 = findViewById(R.id.bt_9);
        numeral9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._9));
            }
        });

        Button numeral0 = findViewById(R.id.bt_0);
        numeral0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string._0));
            }
        });

        Button point = findViewById(R.id.bt_point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultField.setText(getText(R.string.point));
            }
        });

        final Button clean = findViewById(R.id.bt_clean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button sign = findViewById(R.id.bt_sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button percent = findViewById(R.id.bt_percent);
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button division = findViewById(R.id.bt_division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button multiplication = findViewById(R.id.bt_multiplication);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button minus = findViewById(R.id.bt_minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button plus = findViewById(R.id.bt_plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        Button equal = findViewById(R.id.bt_equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}