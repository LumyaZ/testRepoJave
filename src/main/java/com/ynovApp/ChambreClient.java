package com.ynovApp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ChambreClient {
    private Client client;
    private Chambre chambre;

    public ChambreClient() {
    }

    public ChambreClient(Client client, Chambre chambre) {
        super();
        this.client = client;
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
}
