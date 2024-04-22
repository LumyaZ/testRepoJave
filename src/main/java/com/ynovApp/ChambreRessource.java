package com.ynovApp;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/chambre")
public class ChambreRessource {
    private ChambreData data = new ChambreData();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Chambre> getListChambre() {
        return data.getListChambre();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Chambre getChambre(@PathParam("id") int id) {
        return data.getChambre(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addChambre(Chambre chambre) {
        data.addChambre(chambre);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateChambre(@PathParam("id") int id, Chambre updatedChambre) {
        updatedChambre.setId(id);
        data.updateChambre(updatedChambre);
    }

    @DELETE
    @Path("/{id}")
    public void deleteChambre(@PathParam("id") int id) {
        data.deleteChambre(id);
    }
}
