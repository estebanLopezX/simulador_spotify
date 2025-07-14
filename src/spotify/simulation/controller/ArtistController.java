package spotify.simulation.controller;

import spotify.simulation.clases.Artist;
import spotify.simulation.dao.ArtistDAO;

import java.util.List;

public class ArtistController {
    private ArtistDAO artistDAO;

    public ArtistController() {
        this.artistDAO = new ArtistDAO();
    }

    // Insertar nuevo artista
    public void addArtist(String name) {
        Artist artist = new Artist(name);
        artistDAO.insertArtist(artist);
    }

    // Actualizar artista existente
    public void updateArtist(int id, String name) {
        Artist artist = new Artist(id, name);
        artistDAO.updateArtist(artist);
    }

    // Eliminar artista por ID
    public void deleteArtist(int id) {
        artistDAO.deleteArtist(id);
    }

    // Obtener lista de todos los artistas
    public List<Artist> getAllArtists() {
        return artistDAO.getArtists();
    }
}
