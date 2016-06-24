package com.example.administrador.petshopfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrador on 23/06/2016.
 */
public class RecyvlerViewProfileFragment extends Fragment {
    ArrayList<PictureCatalog> petPictures;
    RecyclerView rvPictureList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recycler_view_profile,container,false);

        rvPictureList = (RecyclerView) view.findViewById(R.id.recPicturePet);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);
        rvPictureList.setLayoutManager(glm);

        startPictureList();
        startAdapter();

        //return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }

    public void startPictureList(){
        petPictures = new ArrayList<PictureCatalog>();
        petPictures.add( new PictureCatalog(R.drawable.benito ,"1","Benito"));
        petPictures.add( new PictureCatalog(R.drawable.benito ,"2","Benito"));
        petPictures.add( new PictureCatalog(R.drawable.benito ,"3","Benito"));
        petPictures.add( new PictureCatalog(R.drawable.benito ,"4","Benito"));
        petPictures.add( new PictureCatalog(R.drawable.benito ,"5","Benito"));
    }

    public void startAdapter(){
        PictureAdapter pictureAdapter = new PictureAdapter(petPictures);
        rvPictureList.setAdapter(pictureAdapter);
    }
}
