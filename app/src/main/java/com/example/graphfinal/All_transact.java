package com.example.graphfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class All_transact extends AppCompatActivity {
    ListView listViewp;
    List<Transaction> transactionList;
    DatabaseReference dataTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_transact);
        dataTransaction= FirebaseDatabase.getInstance().getReference("payments");

        listViewp=(ListView)findViewById(R.id.listviewtransaction);

        transactionList=new ArrayList<>();

    }

    @Override
    protected void onStart() {
        super.onStart();
        dataTransaction.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                transactionList.clear();

                for (DataSnapshot transactionSnapshot : dataSnapshot.getChildren()) {
                    Transaction transaction = transactionSnapshot.getValue(Transaction.class);
                    transactionList.add(transaction);
                }
                PaymentsList adapter=new PaymentsList(All_transact.this,transactionList);
                listViewp.setAdapter(adapter);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
