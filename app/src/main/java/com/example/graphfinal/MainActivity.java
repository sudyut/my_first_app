package com.example.graphfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);

    }
    public void daily(View view)
    {
        Intent i1=new Intent(this,Dgraph.class);
        startActivity(i1);
    }
    public void weekly(View view)
    {
        Intent i2=new Intent(this,Wgraph.class);
        startActivity(i2);
    }
    public void monthly(View view)
    {
        Intent i3=new Intent(this,Mgraph.class);
        startActivity(i3);
    }
}
