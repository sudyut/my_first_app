package com.example.graphfinal;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.sql.BatchUpdateException;

public class Layout extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//Button graph;
    TextView income;
    FirebaseFirestore fstore;
    FirebaseAuth fauth;
    String userId;
    Button borrow,lend1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        //graph = findViewById(R.id.graph);
        income =findViewById(R.id.Savingleft);
        borrow=findViewById(R.id.b);
        lend1=findViewById(R.id.lend);
        fauth=FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();

        userId=fauth.getCurrentUser().getUid();

        DocumentReference documentReference=fstore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                income.setText(documentSnapshot.getString("income"));
            }
        });

        Spinner spinner=findViewById(R.id.spin1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.days,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        borrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent( Layout.this,Borrow.class);
            startActivity(i);
            }
        });
        lend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Layout.this,Lend.class);
                startActivity(i);
            }
        });
    }

    public void ainvest(View view)
    {
        Intent i=new Intent(this,Invest.class);
        startActivity(i);
    }
    public void salltransact(View view)
    {
        Intent i=new Intent(this,All_transact.class);
        startActivity(i);
    }
//    public void sblend(View view)
//    {
//        Intent i=new Intent(this,Borrow_lend.class);
//        startActivity(i);
//    }
    public void sdtransact(View view)
    {
        Intent i=new Intent(this,Det_transact.class);
        startActivity(i);
    }

    public void stransact(View view)
    {
        Intent i=new Intent(this,Transact.class);
        startActivity(i);
    }
    public void sincome(View view)
    {
        Intent i=new Intent(this,Income.class);
        startActivity(i);
    }
    public void logout(View view)
    {
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
    public void loadIncome( View v)
    {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getItemAtPosition(position).equals("-select-"))
        {
            //do_nothing
        }
        if (parent.getItemAtPosition(position).equals("DAILY"))
        {
            Intent i1=new Intent(this,Dgraph.class);
            startActivity(i1);
        }
        if (parent.getItemAtPosition(position).equals("WEEKLY"))
        {
            Intent i1=new Intent(this,Wgraph.class);
            startActivity(i1);
        }
        if (parent.getItemAtPosition(position).equals("MONTHLY"))
        {
            Intent i1=new Intent(this,Mgraph.class);
            startActivity(i1);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
