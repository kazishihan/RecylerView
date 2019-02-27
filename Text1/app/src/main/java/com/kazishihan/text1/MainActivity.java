package com.kazishihan.text1;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText et ;
    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.et1);


    }

    public void click(View view) {



//        value = value+Integer.valueOf(et.getText().toString());
//         String st = String.valueOf(value);

        List<String>newlist = new ArrayList<>();
        newlist.add(et.getText().toString()+et.getText().toString());

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("val", (Parcelable) newlist);
        startActivity(intent);


    }
}
