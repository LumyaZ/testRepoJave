package com.ynovApp;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/chambreClient")
public class ChambreClientRessource {
    private ChambreClientData data = new ChambreClientData();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ChambreClient> getListChambreClient() {
        return data.getListChambreClient();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ChambreClient getChambreClient(@PathParam("id") int id) {
        return data.getChambreClient(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addChambreClient(ChambreClient chambreClient) {
        data.addChambreClient(chambreClient);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateChambreClient(@PathParam("id") int id, ChambreClient updatedChambreClient) {
        data.updateChambreClient(updatedChambreClient);
    }

    @DELETE
    @Path("/{id}")
    public void deleteChambreClient(@PathParam("id") int id) {
        data.deleteChambreClient(id);
    }
}
