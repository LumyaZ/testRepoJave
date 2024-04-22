package com.ynovApp;

import java.util.ArrayList;
import java.util.List;

public class ChambreClientData {
    private List<ChambreClient> listChambreClient;

    public ChambreClientData() {
       
    }

    public List<ChambreClient> getListChambreClient() {
        return listChambreClient;
    }

    public ChambreClient getChambreClient(int id) {
        for (ChambreClient chambreClient : listChambreClient) {
            if (chambreClient.getClient().getId() == id) {
                return chambreClient;
            }
        }
        return null;
    }

    public void addChambreClient(ChambreClient chambreClient) {
        listChambreClient.add(chambreClient);
    }

    public void updateChambreClient(ChambreClient updatedChambreClient) {
        for (int i = 0; i < listChambreClient.size(); i++) {
            if (listChambreClient.get(i).getClient().getId() == updatedChambreClient.getClient().getId()) {
                listChambreClient.set(i, updatedChambreClient);
                return;
            }
        }
    }

    public void deleteChambreClient(int id) {
        listChambreClient.removeIf(chambreClient -> chambreClient.getClient().getId() == id);
    }
}
