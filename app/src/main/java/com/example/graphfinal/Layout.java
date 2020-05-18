package com.example.graphfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

public class Layout extends AppCompatActivity {
Button graph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        graph=(Button)findViewById(R.id.graph);
    }
    public void sgraph(View view)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
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

}
