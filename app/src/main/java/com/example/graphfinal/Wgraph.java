package com.example.graphfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Wgraph extends AppCompatActivity {
    LineGraphSeries<DataPoint> series;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wgraph);
            double x,y;
            x=-0.5;
            GraphView wgraph=(GraphView)findViewById(R.id.wgraph);
            series=new LineGraphSeries<DataPoint>();
            for(int i=0;i<500;i++)
            {
                x=x+0.1;
                y=Math.sin(x);
                series.appendData(new DataPoint(x,y),true,500);
            }
            wgraph.addSeries(series);
    }
}
