package com.mangaschool_app.cardview.api;

import com.mangaschool_app.cardview.model.AlbumsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by shins on 7/10/2017.
 */


    public interface Service {

        @GET("albums/images.json")
        Call<AlbumsResponse> getAlbums();
}
