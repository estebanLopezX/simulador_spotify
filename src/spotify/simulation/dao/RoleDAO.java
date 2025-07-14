package spotify.simulation.dao;

import spotify.simulation.conexion.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import spotify.simulation.clases.Role;

public class RoleDAO {

    public void insertRole(Role role) {
        String sql = "INSERT INTO roles (nombre_rol, estado_rol) VALUES (?, ?)";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, role.getRoleName());
            stmt.setInt(2, role.getStatus());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateRole(Role role) {
        String sql = "UPDATE roles SET nombre_rol = ?, estado_rol = ? WHERE id_rol = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, role.getRoleName());
            stmt.setInt(2, role.getStatus());
            stmt.setInt(3, role.getIdRole());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRole(int id) {
        String sql = "DELETE FROM roles WHERE id_rol = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Role> getRoles() {
        List<Role> roles = new ArrayList<>();
        String sql = "SELECT * FROM roles";

        try (Connection conn = ConexionBD.getInstancia().getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Role r = new Role();
                r.setIdRole(rs.getInt("id_rol"));
                r.setRoleName(rs.getString("nombre_rol"));
                r.setStatus(rs.getInt("estado_rol"));
                roles.add(r);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roles;
    }
}
