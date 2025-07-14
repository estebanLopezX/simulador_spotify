package spotify.simulation.dao;

import spotify.simulation.conexion.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import spotify.simulation.clases.Artist;

public class ArtistDAO {

    public void insertArtist(Artist artist) {
        String sql = "INSERT INTO artistas (nombre_artista) VALUES (?)";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, artist.getArtistName());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateArtist(Artist artist) {
        String sql = "UPDATE artistas SET nombre_artista = ? WHERE id_artista = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, artist.getArtistName());
            stmt.setInt(2, artist.getIdArtist());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteArtist(int id) {
        String sql = "DELETE FROM artistas WHERE id_artista = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Artist> getArtists() {
        List<Artist> artists = new ArrayList<>();
        String sql = "SELECT * FROM artistas";

        try (Connection conn = ConexionBD.getInstancia().getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Artist a = new Artist();
                a.setIdArtist(rs.getInt("id_artista"));
                a.setArtistName(rs.getString("nombre_artista"));
                artists.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return artists;
    }
}
