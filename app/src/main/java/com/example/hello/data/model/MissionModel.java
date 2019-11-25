package com.example.hello.data.model;

import java.util.Date;

public class MissionModel {
    private int id;
    private String titre;
    private String description;
    private String image;
    private float gain;
    private String greener;
    private String date_creation;
    private String date_limite;
    private int surface;
    private String lieu;

    public MissionModel(int id, String titre, String description, String image, float gain, String greener, String date_creation, String date_limite,int surface,String Lieu) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.image = image;
        this.gain = gain;
        this.greener = greener;
        this.date_creation = date_creation;
        this.date_limite = date_limite;
        this.surface = surface;
        this.lieu = lieu;
    }

    public MissionModel(){

    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }
    
    public String getTitre(){
        return this.titre;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getImage(){
        return this.image;
    }

    public void setImage(String image){
        this.image = image;
    }

    public float getGain(){
        return this.gain;
    }

    public void setGain(float gain){
        this.gain = gain;
    }

    public String getGreener(){
        return this.greener;
    }

    public void setGreener(String greener){
        this.greener = greener;
    }

    public String getDate_creation(){
        return this.date_creation;
    }

    public void setDate_creation(String date_creation){
        this.date_creation = date_creation;
    }

    public String getDate_limite(){
        return this.date_limite;
    }

    public void setDate_limite(String date_limite){
        this.date_limite = date_limite;
    }

    public String getLieu(){
        return this.lieu;
    }

    public void setLieu(String lieu){
        this.lieu = lieu;
    }
}
