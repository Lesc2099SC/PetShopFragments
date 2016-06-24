package com.example.administrador.petshopfragments;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrador on 23/06/2016.
 */
public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.PictureViewHolder>{
    ArrayList<PictureCatalog> pictureCatalogs;

    public PictureAdapter(ArrayList<PictureCatalog> pictureCatalogs){
        this.pictureCatalogs = pictureCatalogs;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewpetpicture, parent, false);
        return new PictureViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder pictureViewHolder, int position) {
        PictureCatalog pictureCatalog = pictureCatalogs.get(position);
        pictureViewHolder.imgCVPetPicture.setImageResource(pictureCatalog.getIntPetPicture());
        pictureViewHolder.txtCVPetLikes.setText(pictureCatalog.getStrPetLikes());

    }

    @Override
    public int getItemCount() {
        return pictureCatalogs.size();
    }


    public static class PictureViewHolder extends RecyclerView.ViewHolder{

            private ImageView imgCVPetPicture;
            private TextView txtCVPetLikes;

            public PictureViewHolder(View itemView) {
                super(itemView);

                imgCVPetPicture = (ImageView) itemView.findViewById(R.id.imgPetPicture);
                txtCVPetLikes = (TextView)itemView.findViewById(R.id.txtPetLikes);
            }
        }
    }
