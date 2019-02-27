package remon.com.my_recyler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<User> userList;
    private RecyclerView userRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userRecyclerView = findViewById(R.id.recyclerViewId);
        userRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        userList = new ArrayList<>();

        //User u = new User();
        userList.add(new User("Shihan","Male","01744862138",R.drawable.shihan));
        userList.add(new User("Mehran","Male","12345879632",R.drawable.arko));
        userList.add(new User("Shihan","Male","01744862138",R.drawable.shihan));
        userList.add(new User("Mehran","Male","12345879632",R.drawable.arko));


        CustomAdapter customAdapter = new CustomAdapter(userList);
        userRecyclerView.setAdapter(customAdapter);


    }
}
