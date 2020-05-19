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

public class Lend extends AppCompatActivity {
    Button enter;
    EditText amount,reciver;
    Spinner mode;
    DatabaseReference dataLend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transact);
        dataLend = FirebaseDatabase.getInstance().getReference("LendRecord");
        enter = findViewById(R.id.enter);
        amount = findViewById(R.id.Lamount);
        reciver = findViewById(R.id.BName);
        mode = findViewById(R.id.PaymentMode);
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
            String id= dataLend.push().getKey();
            LendRecord lendRecord= new LendRecord(id,amt,rn,pMode);
            dataLend.child(id).setValue(dataLend);
            Toast.makeText(this,"Transaction added",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Enter details properly",Toast.LENGTH_LONG).show();
        }
    }
    


}
