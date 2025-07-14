package spotify.simulation.controller;

import models.Genere;
import spotify.simulation.dao.GenereDAO;

import java.util.List;

public class GenereController {
    private GenereDAO genereDAO;

    public GenereController() {
        this.genereDAO = new GenereDAO();
    }

    // Crear género (sin ID)
    public void addGenere(String name, String description) {
        Genere genre = new Genere(name, description);
        genereDAO.insertGenre(genre);
    }

    // Actualizar género (requiere ID)
    public void updateGenere(int id, String name, String description) {
        Genere genre = new Genere(id, name, description);
        genereDAO.updateGenre(genre);
    }

    // Eliminar género por ID
    public void deleteGenere(int id) {
        genereDAO.deleteGenre(id);
    }

    // Obtener todos los géneros
    public List<Genere> getAllGeneres() {
        return genereDAO.getGenres();
    }
}
