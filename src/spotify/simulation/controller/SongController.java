package spotify.simulation.controller;

import spotify.simulation.clases.Song;
import spotify.simulation.dao.SongDAO;

import java.math.BigDecimal;
import java.util.List;

public class SongController {

    private SongDAO songDAO;

    public SongController() {
        this.songDAO = new SongDAO();
    }

    public void addSong(int genereId, int artistId, String title, BigDecimal duration, byte[] file) {
        Song song = new Song(genereId, artistId, title, duration, file);
        songDAO.insertSong(song);
    }

    public void updateSong(int idSong, int genereId, int artistId, String title, BigDecimal duration, byte[] file) {
        Song song = new Song(idSong, genereId, artistId, title, duration, file);
        songDAO.updateSong(song);
    }

    public void deleteSong(int idSong) {
        songDAO.deleteSong(idSong);
    }

    public List<Song> getAllSongs() {
        return songDAO.getSongs();
    }

    public boolean hasAssociatedSongs(int idGenero){
        return songDAO.tieneCancionesAsociadas(idGenero);
    }
}
