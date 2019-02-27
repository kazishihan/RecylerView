package com.kazishihan.customlistview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.NameList;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    List<Product> namelist;
    List<Product> detailslist;
    List<Product> priselist;
    Context context;
    private LayoutInflater inflater;

    public CustomAdapter( Context context,List<Product> namelist, List<Product> detailslist, List<Product> priselist) {
        this.namelist = namelist;
        this.detailslist = detailslist;
        this.priselist = priselist;
        this.context = context;
    }

    public CustomAdapter() {
    }

    @Override
    public int getCount() {
        return namelist.size();
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
        if(convertView==null)
        {
           inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView=inflater.inflate(R.layout.layout_design,parent,false);

        }
        TextView nametv =(TextView) convertView.findViewById(R.id.productNameID);
        TextView detailstv =(TextView)convertView.findViewById(R.id.productDetailsID);
        TextView prisetv =(TextView)convertView.findViewById(R.id.productPriseID);

       // String nameList = namelist.get(position);

        nametv.setText(namelist.);
        detailstv.setText(detailslist.get(position));
        prisetv.setText(priselist.get(position));

        return convertView;
    }
}
