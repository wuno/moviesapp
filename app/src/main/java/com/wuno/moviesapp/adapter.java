package com.wuno.moviesapp;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wuno.moviesapp.model.Movie;

import java.util.List;


/**
 * Created by wuno on 11/6/15.
 */



public class adapter extends ArrayAdapter<Movie> {

    String url = "http://image.tmdb.org/t/p/w185";
    private Context context;
    private List<Movie> movieList;
    public adapter(Context context, int resource, List<Movie> objects) {
        super(context, resource, objects);
        this.context = context;
        this.movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_file,parent,false);
        Movie movie = movieList.get(position);
        TextView tv = (TextView) view.findViewById(R.id.name);
        tv.setText(movie.getTitle());
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Picasso.with(getContext()).load(url+movie.getPoster_path()).into(img);
        return view;
    }
}

