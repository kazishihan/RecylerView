package com.kazishihan.customlistview2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

        String name = nameEt.getText().toString();
        String details = detailsEt.getText().toString();
        String prise = prisEt.getText().toString();

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("name",name);
        intent.putExtra("details",details);
        intent.putExtra("prise",prise);
        startActivity(intent);
    }
}
