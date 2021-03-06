package com.example.administrador.petshopfragments;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrador on 22/06/2016.
 */
public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.CatalgoViewHolder>{
    ArrayList<PetCatalog> petCatalogs;
    Activity activity;
    int count;

    public CatalogAdapter( ArrayList<PetCatalog> petCatalogs, Activity activity){
        this.petCatalogs = petCatalogs;
        this.activity = activity;
    }

    public CatalogAdapter( ArrayList<PetCatalog> petCatalogs){
        this.petCatalogs = petCatalogs;
    }

    //infla el layout y lo pasara al viewholder para obtener los views(cada elemento del cardview)
    @Override
    public CatalgoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewpet, parent, false);
        return new CatalgoViewHolder(v);
    }

    //asocia cada elemento de la lista a cada view
    @Override
    public void onBindViewHolder(final CatalgoViewHolder catalgoViewHolder, int position) {
        PetCatalog petCatalog = petCatalogs.get(position);
        catalgoViewHolder.txtCVPetName.setText(petCatalog.getStrPetName());
        catalgoViewHolder.txtCVPetLikes.setText(petCatalog.getStrPetLikes());
        catalgoViewHolder.txtCVPetDisLikes.setText(petCatalog.getStrPetDisLikes());
        catalgoViewHolder.imgCVPetPicture.setImageResource(petCatalog.getIntPetPicture());

        catalgoViewHolder.imgLikes.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                count = count + 1;
                catalgoViewHolder.txtCVPetLikes.setText(String.valueOf(count));
            }
        });
    }

    @Override
    public int getItemCount() {

        return petCatalogs.size();
    }

    public static class CatalgoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgCVPetPicture;
        private TextView txtCVPetName;
        private TextView txtCVPetLikes;
        private TextView txtCVPetDisLikes;
        private ImageView imgLikes;



        public CatalgoViewHolder(View itemView) {
            super(itemView);
            imgCVPetPicture = (ImageView) itemView.findViewById(R.id.imgCVPetPicture)  ;
            txtCVPetName = (TextView) itemView.findViewById(R.id.txtCVPetName) ;
            txtCVPetLikes = (TextView)itemView.findViewById(R.id.txtCVPetLikes) ;
            txtCVPetDisLikes = (TextView) itemView.findViewById(R.id.txtCVPetDisLike);
            imgLikes = (ImageView) itemView.findViewById(R.id.imgCVLike);
        }
    }
}
