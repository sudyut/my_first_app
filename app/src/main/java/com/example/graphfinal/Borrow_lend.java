package com.example.graphfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Borrow_lend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow_lend);
        Spinner Mselector;
        Mselector = findViewById(R.id.selector);
//        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.selection,android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        select.setAdapter(adapter);
//        select.setOnItemSelectedListener(this);
//    }
//}
//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        if (parent.getItemAtPosition(position).equals("-select-"))
//        {
//            //do_nothing
//        }
//        if (parent.getItemAtPosition(position).equals("Borrow"))
//        {
//            Intent i1=new Intent(Borrow_lend.this,Borrow.class);
//            startActivity(i1);
//        }
//        if (parent.getItemAtPosition(position).equals("Lend"))
//        {
//            Intent i2=new Intent(Borrow_lend.this,Lend.class);
//            startActivity(i2);
//        }
//    }
    }}