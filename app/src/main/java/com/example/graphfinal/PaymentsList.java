package com.example.graphfinal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PaymentsList extends ArrayAdapter<Transaction> {
    private Activity context;
    private List<Transaction> transactionList;
    public PaymentsList(Activity context,List<Transaction> transactionList){
        super(context,R.layout.list_layout,transactionList);
        this.context=context;
        this.transactionList=transactionList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewName = (TextView)listViewItem.findViewById(R.id.names);
        TextView textViewAmount = (TextView)listViewItem.findViewById(R.id.amount);
        TextView textViewMode = (TextView)listViewItem.findViewById(R.id.mode);

        Transaction transaction=transactionList.get(position);

        textViewName.setText(transaction.getTrName());
        textViewAmount.setText(transaction.getTrAmount());
        textViewMode.setText(transaction.getTrMode());

        return listViewItem;

    }
}
