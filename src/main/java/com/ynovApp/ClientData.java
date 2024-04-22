package com.ynovApp;

import java.util.ArrayList;
import java.util.List;

public class ClientData {
	
List<Client> ListClient;
	
	public ClientData() {
	}
	// return Article list
	public List<Client> getListClient () {
		return ListClient;
	}
	
	//return a element of the list
	public Client getClient(int id) {
		for( Client s: ListClient) {
			if(s.getId()==id) {
				return s;
			}
		}
		return new Client();
	}
	
	public void addClient(Client client) {
        ListClient.add(client);
    }

    public void updateClient(Client updatedClient) {
        for (int i = 0; i < ListClient.size(); i++) {
            if (ListClient.get(i).getId() == updatedClient.getId()) {
            	ListClient.set(i, updatedClient);
                return;
            }
        }
    }

    public void deleteClient(int id) {
    	ListClient.removeIf(client -> client.getId() == id);
    }

}
