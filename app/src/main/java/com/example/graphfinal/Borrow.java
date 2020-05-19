package com.example.graphfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Borrow extends AppCompatActivity {
        Button enter1;
        EditText amount1, reciver1;
        Spinner mode1;
        DatabaseReference dataBorrow;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_borrow);

            dataBorrow = FirebaseDatabase.getInstance().getReference("BorrowRecord");
            enter1 = findViewById(R.id.enter);
            amount1 = findViewById(R.id.Bamount);
            reciver1 = findViewById(R.id.LName);
            mode1 = findViewById(R.id.PaymentMode);
            enter1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Payment1();
                }
            });

        }
        private void Payment1 () {
            String amt = amount1.getText().toString();
            String rn = reciver1.getText().toString();
            String pMode = mode1.getSelectedItem().toString();
            if (!TextUtils.isEmpty(amt) || !TextUtils.isEmpty(rn)) {
                String id = dataBorrow.push().getKey();
                BorrowRecord borrowRecord = new BorrowRecord(id, amt, rn, pMode);
                dataBorrow.child(id).setValue(borrowRecord);
                Toast.makeText(this, "Transaction added", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Enter details properly", Toast.LENGTH_LONG).show();
            }
        }

    }