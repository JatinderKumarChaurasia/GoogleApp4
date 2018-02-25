package com.example.jatinderkumar.googleapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v = findViewById(R.id.listView);
        ArrayList<Grades> grades = new ArrayList<Grades>();
        grades.add(new Grades("Ajay",'A','B','C','D','E'));
        grades.add(new Grades("Ajay",'A','B','C','D','E'));
        grades.add(new Grades("Ajay",'A','B','C','D','E'));
        grades.add(new Grades("Ajay",'A','B','C','D','E'));
        grades.add(new Grades("Ajay",'A','B','C','D','E'));
        grades.add(new Grades("Ajay",'A','B','C','D','E'));
        grades.add(new Grades("Ajay",'A','B','C','D','E'));
        grades.add(new Grades("Ajay",'A','B','C','D','E'));
        grades.add(new Grades("Ajay",'A','B','C','D','E'));

        ReportAdapter adapter = new ReportAdapter(this,grades);
        v.setAdapter(adapter);

    }
}
