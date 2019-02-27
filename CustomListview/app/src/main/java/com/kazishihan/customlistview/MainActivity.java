package com.kazishihan.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private List<Country> countires=new ArrayList<>();
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.list_view);
        countires.add(new Country("bangladesh"));
        countires.add(new Country("nepal"));
        countires.add(new Country("india"));
        countires.add(new Country("japan"));
        countires.add(new Country("USA"));



        customAdapter = new CustomAdapter(this,countires);
        listview.setAdapter(customAdapter);
    }
}
