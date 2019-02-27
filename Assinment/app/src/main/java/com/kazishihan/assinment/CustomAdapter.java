package com.kazishihan.assinment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Product> {


    List<Product> products;
    Context context;
    public CustomAdapter(Context context,List<Product> products) {
        super(context, R.layout.layout_design,products);
        this.context=context;
        this.products=products;
    }


    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView =layoutInflater.inflate(R.layout.layout_design,parent,false);
        Product product=products.get(position);
       // TextView textView = convertView.findViewById(R.id.t);
        TextView nametv =(TextView) convertView.findViewById(R.id.productNameID);
        TextView detailstv =(TextView)convertView.findViewById(R.id.productDetailsID);
        TextView prisetv =(TextView)convertView.findViewById(R.id.productPriseID);

        nametv.setText(product.getName());
        detailstv.setText(product.getDetails());
        prisetv.setText(product.getPrise());


        return convertView;
    }

}
