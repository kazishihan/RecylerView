package com.kazishihan.project1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dashboard dashboardFragment = new Dashboard();
        FragmentManager fragmentManagerDashboard = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionDashboard = fragmentManagerDashboard.beginTransaction();
        fragmentTransactionDashboard.replace(R.id.frame_layout_id,dashboardFragment);
        fragmentTransactionDashboard.addToBackStack("dashboard");
        fragmentTransactionDashboard.commit();


    }

    public void dashboard(View view) {

        Dashboard dashboardFragment = new Dashboard();
        FragmentManager fragmentManagerDashboard = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionDashboard = fragmentManagerDashboard.beginTransaction();
        fragmentTransactionDashboard.replace(R.id.frame_layout_id,dashboardFragment);
        fragmentTransactionDashboard.addToBackStack("dashboard");
        fragmentTransactionDashboard.commit();


    }

    public void expenses(View view) {

        Expenses expensesFragment = new Expenses();
        FragmentManager fragmentManagerExpense = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionExpense = fragmentManagerExpense.beginTransaction();
        fragmentTransactionExpense.replace(R.id.frame_layout_id,expensesFragment);
        fragmentTransactionExpense.addToBackStack("Expense");
        fragmentTransactionExpense.commit();
    }
}
