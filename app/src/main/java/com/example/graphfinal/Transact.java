package com.example.graphfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Transact extends AppCompatActivity {
    Button enter;
    EditText amount,reciver;
    Spinner mode;
    DatabaseReference dataTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transact);
        dataTransaction = FirebaseDatabase.getInstance().getReference("payments");
        enter = findViewById(R.id.enter);
        amount = findViewById(R.id.amount);
        reciver = findViewById(R.id.RName);
        mode = findViewById(R.id.PayMode);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Payment();
            }
        });
    }
        private void Payment()
        {
        String amt= amount.getText().toString();
        String rn= reciver.getText().toString();
        String pMode= mode.getSelectedItem().toString();
        if(!TextUtils.isEmpty(amt)||!TextUtils.isEmpty(rn)) {
            String id= dataTransaction.push().getKey();
            Transaction transaction= new Transaction(id,amt,rn,pMode);
            dataTransaction.child(id).setValue(transaction);
        Toast.makeText(this,"Transaction added",Toast.LENGTH_LONG).show();
        }
         else{
            Toast.makeText(this,"Enter details properly",Toast.LENGTH_LONG).show();
        }
        }


    }
