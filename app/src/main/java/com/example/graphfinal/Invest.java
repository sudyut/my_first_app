package com.example.graphfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Invest extends AppCompatActivity {
    EditText ed1,ed2;
    TextView ed3;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest);
        ed1=findViewById(R.id.empsav);
        ed2=findViewById(R.id.invest);
        ed3=findViewById(R.id.amount);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double savings = Double.parseDouble(ed1.getText().toString());
                double amt;
                double m=invest();
                amt = (savings) * (m/100);
                ed3.setText(String.valueOf(amt));

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    public double invest() {
        double perinvest = Double.parseDouble(ed1.getText().toString());
        return (perinvest);
    }
}
