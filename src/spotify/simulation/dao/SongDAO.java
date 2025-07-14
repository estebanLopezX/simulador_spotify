package spotify.simulation.dao;

import spotify.simulation.conexion.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import spotify.simulation.clases.Song;

public class SongDAO {

    public void insertSong(Song song) {
        String sql = "INSERT INTO canciones (id_genero, id_artista, titulo_cancion, duracion_cancion, archivo_cancion) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, song.getGenereId());
            stmt.setInt(2, song.getArtistId());
            stmt.setString(3, song.getTitle());
            stmt.setBigDecimal(4, song.getDuration());
            stmt.setBytes(5, song.getFile());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSong(Song song) {
        String sql = "UPDATE canciones SET id_genero = ?, id_artista = ?, titulo_cancion = ?, duracion_cancion = ?, archivo_cancion = ? WHERE id_cancion = ?";

        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, song.getGenereId());
            stmt.setInt(2, song.getArtistId());
            stmt.setString(3, song.getTitle());
            stmt.setBigDecimal(4, song.getDuration());
            stmt.setBytes(5, song.getFile());
            stmt.setInt(6, song.getIdSong());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSong(int id) {
        String sql = "DELETE FROM canciones WHERE id_cancion = ?";

        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();
        String sql = "SELECT * FROM canciones";

        try (Connection conn = ConexionBD.getInstancia().getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Song s = new Song();
                s.setIdSong(rs.getInt("id_cancion"));
                s.setGenereId(rs.getInt("id_genero"));
                s.setArtistId(rs.getInt("id_artista"));
                s.setTitle(rs.getString("titulo_cancion"));
                s.setDuration(rs.getBigDecimal("duracion_cancion"));
                s.setFile(rs.getBytes("archivo_cancion"));
                songs.add(s);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return songs;
    }
    
     public boolean tieneCancionesAsociadas(int idGenero) {
        String sql = "SELECT COUNT(*) FROM canciones WHERE id_genero = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idGenero);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
