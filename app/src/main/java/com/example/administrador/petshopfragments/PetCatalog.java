package com.example.administrador.petshopfragments;

/**
 * Created by Administrador on 22/06/2016.
 */
public class PetCatalog {

    private String strPetName;
    private String strPetLikes;
    private String strPetDisLikes;
    private int intPetPicture;

    public PetCatalog(int intPetPicture, String strPetDisLikes, String strPetLikes, String strPetName) {
        this.intPetPicture = intPetPicture;
        this.strPetDisLikes = strPetDisLikes;
        this.strPetLikes = strPetLikes;
        this.strPetName = strPetName;
    }

    public PetCatalog(int intPetPicture, String strPetLikes) {
        this.intPetPicture = intPetPicture;
        this.strPetLikes = strPetLikes;
        this.strPetDisLikes = "0";
        this.strPetName = "xxxx";


    }

    public int getIntPetPicture() {
        return intPetPicture;
    }

    public void setIntPetPicture(int intPetPicture) {
        this.intPetPicture = intPetPicture;
    }

    public String getStrPetDisLikes() {
        return strPetDisLikes;
    }

    public void setStrPetDisLikes(String strPetDisLikes) {
        this.strPetDisLikes = strPetDisLikes;
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
