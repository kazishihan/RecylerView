package com.kazishihan.customlayout3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ListView listView;


    ArrayList<String> name = new ArrayList<>( Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
    ArrayList<String> details = new ArrayList<>( Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
    ArrayList<String> prise = new ArrayList<>( Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        listView = findViewById(R.id.list_view);

        Intent intent = getIntent();
//        String namei = intent.getStringExtra("name");
//        String detailsi = intent.getStringExtra("details");
//        String prisei = intent.getStringExtra("prise");


//        name.add(namei);
//        details.add(detailsi);
//        prise.add(prisei);

        name = getIntent().getStringArrayListExtra("namelist");
        details = getIntent().getStringArrayListExtra("detailslist");
        prise = getIntent().getStringArrayListExtra("priselist");



        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return name.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.custom_layout,null);

            TextView nametv =(TextView) convertView.findViewById(R.id.productNameID);
            TextView detailstv =(TextView)convertView.findViewById(R.id.productDetailsID);
            TextView prisetv =(TextView)convertView.findViewById(R.id.productPriseID);
            nametv.setText(name.get(position));
            detailstv.setText(details.get(position));
            prisetv.setText(prise.get(position));


            return convertView;
        }
    }
}
