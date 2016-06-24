package com.example.administrador.petshopfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrador on 22/06/2016.
 */
public class RecyclerViewFragment extends Fragment {
    ArrayList<PetCatalog> petCatalogs;
    RecyclerView rvCatalogList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view,container,false);
        //return super.onCreateView(inflater, container, savedInstanceState);

        rvCatalogList = (RecyclerView) view.findViewById(R.id.recPetCatalog);

        //GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);
        //rvCatalogList.setLayoutManager(glm);

        LinearLayoutManager myLinLayout = new LinearLayoutManager(getActivity());
        myLinLayout.setOrientation(LinearLayoutManager.VERTICAL);

        rvCatalogList.setLayoutManager(myLinLayout);
        startPetCatalogList();
        startAdapter();

        return  view;
    }

    public void startPetCatalogList(){
        petCatalogs = new ArrayList<PetCatalog>();
        petCatalogs.add( new PetCatalog(R.drawable.benito ,"1", "1", "Benito"));
        petCatalogs.add( new PetCatalog(R.drawable.perro,"1", "3", "Baby Dog"));
        petCatalogs.add( new PetCatalog(R.drawable.atom_ant,"1", "4", "Atom Ant"));
    }

    public void startAdapter(){
        CatalogAdapter catalogAdapter = new CatalogAdapter(petCatalogs);
        rvCatalogList.setAdapter(catalogAdapter);
    }
}
