package spotify.simulation.dao;

import spotify.simulation.conexion.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import spotify.simulation.clases.UserSong;

public class UserSongDAO {

    public void insertUserSong(UserSong userSong) {
        String sql = "INSERT INTO canciones_usuarios (id_cancion, id_usuario) VALUES (?, ?)";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userSong.getSongId());
            stmt.setInt(2, userSong.getUserId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUserSong(UserSong userSong) {
        String sql = "UPDATE canciones_usuarios SET id_cancion = ?, id_usuario = ? WHERE id_suscripcion_cancion = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userSong.getSongId());
            stmt.setInt(2, userSong.getUserId());
            stmt.setInt(3, userSong.getIdSubscriptionSong());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUserSong(int id) {
        String sql = "DELETE FROM canciones_usuarios WHERE id_suscripcion_cancion = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<UserSong> getUserSongs() {
        List<UserSong> userSongs = new ArrayList<>();
        String sql = "SELECT * FROM canciones_usuarios";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                UserSong us = new UserSong();
                us.setIdSubscriptionSong(rs.getInt("id_suscripcion_cancion"));
                us.setSongId(rs.getInt("id_cancion"));
                us.setUserId(rs.getInt("id_usuario"));
                userSongs.add(us);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userSongs;
    }

    public List<UserSong> getUserSongsByUserId(int userId) {
        List<UserSong> userSongs = new ArrayList<>();
        String sql = "SELECT * FROM canciones_usuarios WHERE id_usuario = ?";

        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    UserSong us = new UserSong();
                    us.setIdSubscriptionSong(rs.getInt("id_suscripcion_cancion"));
                    us.setSongId(rs.getInt("id_cancion"));
                    us.setUserId(rs.getInt("id_usuario"));
                    userSongs.add(us);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userSongs;
    }

}
