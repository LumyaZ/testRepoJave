package com.ynovApp;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/client")
public class ClientRessource {
    private ClientData data = new ClientData();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> getListClient() {
        return data.getListClient();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Client getClient(@PathParam("id") int id) {
        return data.getClient(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addClient(Client client) {
        data.addClient(client);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateClient(@PathParam("id") int id, Client updatedClient) {
        updatedClient.setId(id);
        data.updateClient(updatedClient);
    }

    @DELETE
    @Path("/{id}")
    public void deleteClient(@PathParam("id") int id) {
        data.deleteClient(id);
    }
}
