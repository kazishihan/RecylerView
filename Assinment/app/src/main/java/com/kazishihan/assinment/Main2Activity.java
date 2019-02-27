package com.kazishihan.assinment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ListView listView;
    private List<Product> products=new ArrayList<>();
   //private List<Product>detailslist=new ArrayList<>();
//    private List<Product>priselist=new ArrayList<>();
   private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.list_view);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String details = intent.getStringExtra("details");
        String prise = intent.getStringExtra("prise");

        List<String> nameList = new ArrayList<>();
        List<String> detailsList = new ArrayList<>();
        List<String> priseList = new ArrayList<>();

//       nameList.add(name);
//       detailsList.add(details);
//       priseList.add(prise);

        Product product = new Product();
//        product.setName(name);
//        product.setDetails(details);
//        product.setPrise(prise);
////
////        namelist.add(product);

        for(String p: nameList)
        {
            product.setName(p);
        }

        for(String q: detailsList)
        {
            product.setDetails(q);
        }
        for(String r: priseList)
        {
            product.setPrise(r);
//        }

        products.add(product);
       //products.add(name);

       // products.add(new Product(name,details,prise));
       // products.add(product);


        customAdapter = new CustomAdapter(this,products);
        listView.setAdapter(customAdapter);

    }
}
