package spotify.simulation.dao;

import spotify.simulation.conexion.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Genere;

public class GenereDAO {

    public void insertGenre(Genere genre) {
        String sql = "INSERT INTO generos (nombre_genero, descripcion_genero) VALUES (?, ?)";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, genre.getGenereName());
            stmt.setString(2, genre.getDescription());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateGenre(Genere genre) {
        String sql = "UPDATE generos SET nombre_genero = ?, descripcion_genero = ? WHERE id_genero = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, genre.getGenereName());
            stmt.setString(2, genre.getDescription());
            stmt.setInt(3, genre.getIdGenere());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteGenre(int id) {
        String sql = "DELETE FROM generos WHERE id_genero = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Genere> getGenres() {
        List<Genere> generes = new ArrayList<>();
        String sql = "SELECT * FROM generos";

        try (Connection conn = ConexionBD.getInstancia().getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Genere g = new Genere();
                g.setIdGenere(rs.getInt("id_genero"));
                g.setGenereName(rs.getString("nombre_genero"));
                g.setDescription(rs.getString("descripcion_genero"));
                generes.add(g);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return generes;
    }
}
