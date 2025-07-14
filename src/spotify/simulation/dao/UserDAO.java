package spotify.simulation.dao;

import spotify.simulation.conexion.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import spotify.simulation.clases.User;

public class UserDAO {

    public void insertUser(User user) {
        String sql = "INSERT INTO usuarios (id_suscripcion, id_rol, nombre_usuario, telefono_usuario, correo_usuario, clave_usuario) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getSubscriptionId());
            stmt.setInt(2, user.getRoleId());
            stmt.setString(3, user.getName());
            stmt.setString(4, user.getPhone());
            stmt.setString(5, user.getEmail());
            stmt.setString(6, user.getPassword());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        String sql = "UPDATE usuarios SET id_suscripcion = ?, id_rol = ?, nombre_usuario = ?, telefono_usuario = ?, correo_usuario = ? WHERE id_usuario = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getSubscriptionId());
            stmt.setInt(2, user.getRoleId());
            stmt.setString(3, user.getName());
            stmt.setString(4, user.getPhone());
            stmt.setString(5, user.getEmail());
            stmt.setInt(6, user.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                User u = new User(
                        rs.getInt("id_usuario"),
                        rs.getInt("id_suscripcion"),
                        rs.getInt("id_rol"),
                        rs.getString("nombre_usuario"),
                        rs.getString("telefono_usuario"),
                        rs.getString("correo_usuario"),
                        rs.getString("clave_usuario")
                );
                users.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public boolean tieneUsuariosConRol(int idRol) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE id_rol = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idRol);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean tieneUsuariosConSuscripcion(int idSuscripcion) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE id_suscripcion = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idSuscripcion);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public User obtenerUsuarioPorCorreoYClave(String correo, String clave) {
        String sql = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND clave_usuario = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, correo);
            stmt.setString(2, clave);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return User.getInstance(
                        rs.getInt("id_usuario"),
                        rs.getInt("id_suscripcion"),
                        rs.getInt("id_rol"),
                        rs.getString("nombre_usuario"),
                        rs.getString("telefono_usuario"),
                        rs.getString("correo_usuario"),
                        rs.getString("clave_usuario")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public User getUserById(int id) {
        String sql = "SELECT * FROM usuarios WHERE id_usuario = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            rs.getInt("id_usuario"),
                            rs.getInt("id_suscripcion"),
                            rs.getInt("id_rol"),
                            rs.getString("nombre_usuario"),
                            rs.getString("telefono_usuario"),
                            rs.getString("correo_usuario"),
                            rs.getString("clave_usuario")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updatePassword(int userId, String newPassword) {
        String sql = "UPDATE usuarios SET clave_usuario = ? WHERE id_usuario = ?";

        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newPassword);
            pstmt.setInt(2, userId);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSubscription(int userId, int subscriptionId) {
        String sql = "UPDATE usuarios SET id_suscripcion = ? WHERE id_usuario = ?";

        try (Connection conn = ConexionBD.getInstancia().getConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, subscriptionId);
            stmt.setInt(2, userId);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
