package com.mangaschool_app.cardview;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.mangaschool_app.cardview.model.Album;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by shins on 7/10/2017.
 */

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {



    private Context mContext;

    private List<Album> albumList;





    public AlbumsAdapter(Context mContext, List<Album> albumList) {

        this.mContext = mContext;

        this.albumList = albumList;

    }



    @Override

    public AlbumsAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())

                .inflate(R.layout.album_card, viewGroup, false);



        return new MyViewHolder(view);

    }



    @Override

    public void onBindViewHolder(final AlbumsAdapter.MyViewHolder viewHolder, int i) {


        //load album cover using picasso

        Picasso.with(mContext)

                .load(albumList.get(i).getThumbnail())

                .placeholder(R.drawable.loading)

                .into(viewHolder.thumbnail);




    }








    @Override
    public int getItemCount() {
        return albumList.size();
    }





    public class MyViewHolder extends RecyclerView.ViewHolder {


        public ImageView thumbnail;



        public MyViewHolder(View view) {

            super(view);


            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);


            //on item click

            thumbnail.setOnClickListener(new View.OnClickListener(){

                @Override

                public void onClick(View v){

                    int pos = getAdapterPosition();

                    if (pos != RecyclerView.NO_POSITION){

                        Album clickedDataItem = albumList.get(pos);

                       Intent intent = new Intent(mContext, Slidershow.class);
                        intent.putExtra("album", albumList.get(pos).getClass());
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(intent);


                    }

                        Toast.makeText(v.getContext(), "You clicked " + getAdapterPosition(), Toast.LENGTH_LONG).show();

                    }

            });

        }

    }

}