package com.kazishihan.dclean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class DataAdd_Activity extends AppCompatActivity {

    private TextView display_Information;
    private Button add_button;

    private DatabaseReference databaseCleaner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_add_);

        databaseCleaner= FirebaseDatabase.getInstance().getReference("cleaner");

        display_Information=(TextView)findViewById(R.id.text_View);
        add_button=(Button)findViewById(R.id.add_button);

        final Intent getData_intent = getIntent();

        final String bin_information = getData_intent.getStringExtra("information");
        String [] strs = bin_information.split ("\n");
        final  String Bin_Number = strs[0].trim();
        final String Cleaner_name = strs[1].trim();
        final String Bin_location = strs[2].trim();
        final  String Phone_number = strs[3].trim();

        display_Information.setText(bin_information);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Query query = FirebaseDatabase.getInstance().getReference("cleaner")
                        .orderByChild("binNumber")
                        .equalTo(Bin_Number);


                query.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(final DataSnapshot dataSnapshot) {
                        for (DataSnapshot data : dataSnapshot.getChildren())
                        {
                            //If email exists then toast shows else store the data on new key
                            if (data.getValue(AddCleaner.class).getBinNumber().equals(Bin_Number))
                            {
                                Toast.makeText(DataAdd_Activity.this, "Already Requested Someone", Toast.LENGTH_SHORT).show();
                                return;
                            }

                        }
                        // Toast.makeText(DataAdd_Activity.this, "not exists.", Toast.LENGTH_SHORT).show();
                        String id = databaseCleaner.push().getKey();
                        AddCleaner Cleaner = new AddCleaner(id,Bin_Number,Cleaner_name,Bin_location,Phone_number);
                        databaseCleaner.child(id).setValue(Cleaner);
                        Toast.makeText(DataAdd_Activity.this, "Data added Successfully", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onCancelled(final DatabaseError databaseError) {
                    }
                });

            }
        });

    }


}
