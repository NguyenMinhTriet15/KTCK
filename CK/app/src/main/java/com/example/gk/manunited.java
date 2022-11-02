package com.example.gk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class manunited extends AppCompatActivity {
    ListView lvmanu;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manunited);
        lvmanu = (ListView) findViewById(R.id.lvmu);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("David de Gea (GK)");
        arrayCourse.add("Diogo Dalot");
        arrayCourse.add("Raphael Varane");
        arrayCourse.add("Lissandro Martinez");
        arrayCourse.add("Tyrell Malacia");
        arrayCourse.add("Scott Mctominay");
        arrayCourse.add("Cristian Eriksen");
        arrayCourse.add("Bruno Fernandes");
        arrayCourse.add("Atony");
        arrayCourse.add("Cristiano Ronaldo (C)");
        arrayCourse.add("Jadon Sancho");
        ArrayAdapter adapter = new ArrayAdapter(manunited.this, android.R.layout.simple_list_item_1, arrayCourse);
        lvmanu.setAdapter(adapter);
    }
}