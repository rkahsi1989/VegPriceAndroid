package com.example.eli.vegprices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Eli on 8/5/2017.
 */

public class AllVegAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Veg> mDataSource;

    public AllVegAdapter(Context context, ArrayList<Veg> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get view for row item
        View rowView = mInflater.inflate(R.layout.list_item_veg, parent, false);

        TextView veg_name = (TextView) (rowView.findViewById(R.id.et_veg_name));
        TextView veg_price = (TextView) (rowView.findViewById(R.id.et_veg_price));
        ImageView veg_pic = (ImageView) (rowView.findViewById(R.id.ivVegPic));

        Veg curVeg = (Veg) getItem(position);
        veg_name.setText(curVeg.getName());
        veg_price.setText(curVeg.getPrice() + "");

        veg_pic.setImageResource(Veg.vegEnumToImgId.get(curVeg.getVegKind_e())); // get image id by VegKind_e

       // TODO
       // Picasso.with(mContext).load(curVeg.imageUrl).placeholder(R.mipmap.ic_launcher).into(veg_pic);


        return rowView;
    }
}
