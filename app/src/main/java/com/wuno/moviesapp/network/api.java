package com.wuno.moviesapp.network;

import com.wuno.moviesapp.model.Movie;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by wuno on 11/6/15.
 */
public interface api {

    @GET("/3/discover/movie?sort_by=popularity.desc&api_key=e2a8069c1e18c3b7545db574817b218e")
    public void getData(Callback<List<Movie>> response);

}
