package com.kazishihan.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Country> {

    List<Country>countries;
    Context context;
    public CustomAdapter(Context context,List<Country> countries) {
        super(context, R.layout.country_name,countries);
        this.context=context;
        this.countries=countries;
    }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView =layoutInflater.inflate(R.layout.country_name,parent,false);
        Country country=countries.get(position);
        TextView textView = convertView.findViewById(R.id.textViewId);
        textView.setText(country.getName());
        return convertView;
    }
}
