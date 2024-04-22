package com.ynovApp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Chambre {
    private int id;
    private String type;
    private double prix;

    public Chambre() {
        // Constructor vide
    }

    public Chambre(int id, String type, double prix) {
        super();
        this.id = id;
        this.type = type;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
