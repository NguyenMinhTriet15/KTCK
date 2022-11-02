package com.example.gk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class mancity extends AppCompatActivity {

    ListView lvmanc;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mancity);
        lvmanc = (ListView) findViewById(R.id.lvmc);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("Ederson Moraes (GK)");
        arrayCourse.add("Joao Cancelo");
        arrayCourse.add("John Stones");
        arrayCourse.add("Aymeric Larpote");
        arrayCourse.add("Kyle Walker");
        arrayCourse.add("Rodrigo Hernandez Cascante");
        arrayCourse.add("Ikay Gundogan");
        arrayCourse.add("Kevin De Bruyne (C)");
        arrayCourse.add("Jack Grealish");
        arrayCourse.add("Erling Haaland");
        arrayCourse.add("Riyad Mahrez");
        ArrayAdapter adapter = new ArrayAdapter(mancity.this, android.R.layout.simple_list_item_1, arrayCourse);
        lvmanc.setAdapter(adapter);
    }
}