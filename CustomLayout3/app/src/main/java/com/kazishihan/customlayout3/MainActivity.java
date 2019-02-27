package com.kazishihan.customlayout3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText nameEt,detailsEt,prisEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEt=findViewById(R.id.productnameEdittext);
        detailsEt=findViewById(R.id.productdetailsEdittext);
        prisEt=findViewById(R.id.productpriseEdittext);

    }


    public void submit(View view) {

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> detailsList = new ArrayList<>();
        ArrayList<String> priseList = new ArrayList<>();

        String name = nameEt.getText().toString();
        String details = detailsEt.getText().toString();
        String prise = prisEt.getText().toString();

    nameList.add(name);
    detailsList.add(details);
    priseList.add(prise);



        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putStringArrayListExtra("namelist",nameList);
        intent.putStringArrayListExtra("detailslist",detailsList);
        intent.putStringArrayListExtra("priselist",priseList);



//        intent.putExtra("name",name);
//        intent.putExtra("details",details);
//        intent.putExtra("prise",prise);
        startActivity(intent);
    }
}
