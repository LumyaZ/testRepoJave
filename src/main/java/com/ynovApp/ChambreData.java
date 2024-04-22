package com.ynovApp;

import java.util.ArrayList;
import java.util.List;

public class ChambreData {
    private List<Chambre> listChambre;

    public ChambreData() {

    }

    public List<Chambre> getListChambre() {
        return listChambre;
    }

    public Chambre getChambre(int id) {
        for (Chambre chambre : listChambre) {
            if (chambre.getId() == id) {
                return chambre;
            }
        }
        return null;
    }

    public void addChambre(Chambre chambre) {
        listChambre.add(chambre);
    }

    public void updateChambre(Chambre updatedChambre) {
        for (int i = 0; i < listChambre.size(); i++) {
            if (listChambre.get(i).getId() == updatedChambre.getId()) {
                listChambre.set(i, updatedChambre);
                return;
            }
        }
    }

    public void deleteChambre(int id) {
        listChambre.removeIf(chambre -> chambre.getId() == id);
    }
}
