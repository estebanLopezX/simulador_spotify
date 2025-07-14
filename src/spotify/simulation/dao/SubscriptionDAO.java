package spotify.simulation.dao;

import spotify.simulation.conexion.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import spotify.simulation.clases.Subscription;

public class SubscriptionDAO {

    public void insertSubscription(Subscription subscription) {
        String sql = "INSERT INTO suscripciones (nombre_suscripcion, beneficios_suscripcion, descripcion_suscripcion) VALUES (?, ?, ?)";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, subscription.getSubscriptionName());
            stmt.setString(2, subscription.getBenefits());
            stmt.setString(3, subscription.getDescription());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSubscription(Subscription subscription) {
        String sql = "UPDATE suscripciones SET nombre_suscripcion = ?, beneficios_suscripcion = ?, descripcion_suscripcion = ? WHERE id_suscripcion = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, subscription.getSubscriptionName());
            stmt.setString(2, subscription.getBenefits());
            stmt.setString(3, subscription.getDescription());
            stmt.setInt(4, subscription.getIdSubscription());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSubscription(int id) {
        String sql = "DELETE FROM suscripciones WHERE id_suscripcion = ?";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Subscription> getSubscriptions() {
        List<Subscription> subscriptions = new ArrayList<>();
        String sql = "SELECT * FROM suscripciones";
        try (Connection conn = ConexionBD.getInstancia().getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Subscription s = new Subscription();
                s.setIdSubscription(rs.getInt("id_suscripcion"));
                s.setSubscriptionName(rs.getString("nombre_suscripcion"));
                s.setBenefits(rs.getString("beneficios_suscripcion"));
                s.setDescription(rs.getString("descripcion_suscripcion"));
                subscriptions.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subscriptions;
    }
}
