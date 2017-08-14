package com.example.android.worldbillionare;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;

/**
 * Created by RJ on 13-08-2017.
 */

public class WorldBillionaresAdapters extends ArrayAdapter <Billionares> {
    ImageLoader imageloader;

    public  WorldBillionaresAdapters(Activity context , ArrayList<Billionares> billionares)
    {
super (context , 0 ,  billionares);
        imageloader = MySingleton.getInstance().getImageLoader();
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

if(convertView == null)
{
    convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

}

Billionares currentWord = getItem(position);

        NetworkImageView thumbNail = (NetworkImageView) convertView
                .findViewById(R.id.thumbnail);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView worth = (TextView) convertView.findViewById(R.id.worth);
        TextView source = (TextView) convertView.findViewById(R.id.source);
        TextView year = (TextView) convertView.findViewById(R.id.inYear);

        thumbNail.setImageUrl(currentWord.getThumbnailUrl() ,   imageloader);

        name.setText(currentWord.getName());
        worth.setText(currentWord.getWorth());
        source.setText(currentWord.getSource());
        year.setText(currentWord.getYear());




        return  convertView;

    }
}
