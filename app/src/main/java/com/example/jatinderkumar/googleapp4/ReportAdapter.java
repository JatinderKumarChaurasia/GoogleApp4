package com.example.jatinderkumar.googleapp4;

import android.content.Context;
import android.provider.UserDictionary;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jatinder Kumar on 24-02-2018.
 */

public class ReportAdapter extends ArrayAdapter<Grades> {


    public ReportAdapter(@NonNull Context context, @NonNull ArrayList<Grades> objects) {
        super(context, 0, objects);
    }

    public ReportAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list = convertView;
        if(list == null)
        {
            list = LayoutInflater.from(getContext()).inflate(R.layout.report,parent,false);
        }
        Grades grades = getItem(position);
        TextView txt1 = list.findViewById(R.id.english);
        txt1.setText("English : "+ grades.getEnglishGrade());
        TextView txt2 = list.findViewById(R.id.biology);

        txt2.setText("Biology : "+ grades.getBiologyGrade());
        TextView txt3 = list.findViewById(R.id.chemistry);
        txt3.setText("Chemistry : "+ grades.getBiologyGrade());
        TextView txt4 = list.findViewById(R.id.history);
        txt4.setText("History : " + grades.getHistoryGrade());
        TextView txt5 = list.findViewById(R.id.math);
        txt5.setText("Math : "+ grades.getMathGrade());
        TextView txt6 = list.findViewById(R.id.name);
        txt6.setText(grades.getName());
        return list;
    }
}
