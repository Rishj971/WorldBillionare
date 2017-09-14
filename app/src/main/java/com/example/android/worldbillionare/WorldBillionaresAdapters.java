package com.example.android.worldbillionare;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by RJ on 13-08-2017.
 */

public class WorldBillionaresAdapters extends ArrayAdapter <Billionares> {


    public  WorldBillionaresAdapters(Context context , ArrayList<Billionares> billionares)
    {
super (context , 0 ,  billionares);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

if(convertView == null)
{
    convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

}

Billionares currentWord = getItem(position);


        TextView name = (TextView) convertView.findViewById(R.id.name);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.thumbnail);

        Picasso.with(getContext()).load(currentWord.getThumbnailUrl()).into(imageView);

        TextView worth = (TextView) convertView.findViewById(R.id.worth);
        TextView source = (TextView) convertView.findViewById(R.id.source);
        TextView year = (TextView) convertView.findViewById(R.id.inYear);

TextView textView;

        name.setText(currentWord.getName());
        worth.setText(currentWord.getWorth());
        source.setText(currentWord.getSource());
        year.setText(currentWord.getYear());




        return  convertView;

    }
}
