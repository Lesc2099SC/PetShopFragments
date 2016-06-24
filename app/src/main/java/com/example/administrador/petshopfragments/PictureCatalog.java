package com.example.administrador.petshopfragments;

/**
 * Created by Administrador on 23/06/2016.
 */
public class PictureCatalog {

    private String strPetName;
    private String strPetLikes;
    private int intPetPicture;

    public PictureCatalog(int intPetPicture,  String strPetLikes, String strPetName) {
        this.intPetPicture = intPetPicture;
        this.strPetLikes = strPetLikes;
        this.strPetName = strPetName;
    }

    public int getIntPetPicture() {
        return intPetPicture;
    }

    public void setIntPetPicture(int intPetPicture) {
        this.intPetPicture = intPetPicture;
    }

    public String getStrPetLikes() {
        return strPetLikes;
    }

    public void setStrPetLikes(String strPetLikes) {
        this.strPetLikes = strPetLikes;
    }

    public String getStrPetName() {
        return strPetName;
    }

    public void setStrPetName(String strPetName) {
        this.strPetName = strPetName;
    }
}
