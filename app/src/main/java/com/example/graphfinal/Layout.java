package com.example.graphfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.sql.BatchUpdateException;

public class Layout extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//Button graph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        //graph = findViewById(R.id.graph);

        Spinner spinner=findViewById(R.id.spin1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.days,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
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
    public void sblend(View view)
    {
        Intent i=new Intent(this,Borrow_lend.class);
        startActivity(i);
    }
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
