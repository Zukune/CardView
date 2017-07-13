package com.mangaschool_app.cardview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by shins on 7/10/2017.
 */

public class AlbumsResponse {


    @SerializedName("Album")

    @Expose

    private List<Album> albums;


    public List<Album> getAlbums() {

        return albums;

    }

    public void setAlbums(List<Album> albums) {

        this.albums = albums;

    }

}