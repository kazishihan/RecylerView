package com.kazishihan.customlistview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ListView listView;
    private List<Product>namelist=new ArrayList<>();
    private List<Product>detailslist=new ArrayList<>();
    private List<Product>priselist=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView)findViewById(R.id.listviewId);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String details = intent.getStringExtra("details");
        String prise = intent.getStringExtra("prise");



//        ArrayList<Product> products = new ArrayList<>();
//        products.add(product);

        Product product = new Product(name,details,prise);

        namelist.add(product);

//
//        namelist.add(name);
//        detailslist.add((details));
//        priselist.add((prise));


        CustomAdapter adapter = new CustomAdapter(this,namelist,detailslist,priselist);
        listView.setAdapter(adapter);
    }
}
