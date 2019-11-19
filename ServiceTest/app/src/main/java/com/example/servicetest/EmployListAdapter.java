package com.example.servicetest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class EmployListAdapter extends ArrayAdapter<employ> {

    private List<employ> employss;
    private Context context;

    public EmployListAdapter(List<employ> employss, Context context){

        super(context,R.layout.product_layout,employss);
        this.context = context;
        this.employss = employss;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.product_layout,parent,false);


        employ e = employss.get(position);

        TextView textViewid = view.findViewById(R.id.text_id);
        textViewid.setText(String.valueOf(e.getId()));


        TextView textViewName = view.findViewById(R.id.text_fname);
        textViewName.setText(e.getFname());

        TextView textviewl = view.findViewById(R.id.text_lname);
        textviewl.setText(e.getLname());


        TextView textViewg = view.findViewById(R.id.text_gender);
        textViewg.setText(e.getGender());

        TextView textViewsa = view.findViewById(R.id.text_salary);
        textViewsa.setText(String.valueOf(e.getSalary()));




        return view;

    }
}
