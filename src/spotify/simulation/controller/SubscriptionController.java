package spotify.simulation.controller;

import spotify.simulation.clases.Subscription;
import spotify.simulation.dao.SubscriptionDAO;

import java.util.List;

public class SubscriptionController {
    private SubscriptionDAO subscriptionDAO;

    public SubscriptionController() {
        this.subscriptionDAO = new SubscriptionDAO();
    }

    // Insertar nueva suscripción (sin id)
    public void addSubscription(String subscriptionName, String benefits, String description) {
        Subscription subscription = new Subscription(subscriptionName, benefits, description);
        subscriptionDAO.insertSubscription(subscription);
    }

    // Actualizar suscripción existente (con id)
    public void updateSubscription(int id, String subscriptionName, String benefits, String description) {
        Subscription subscription = new Subscription(id, subscriptionName, benefits, description);
        subscriptionDAO.updateSubscription(subscription);
    }

    // Eliminar suscripción por id
    public void deleteSubscription(int id) {
        subscriptionDAO.deleteSubscription(id);
    }

    // Obtener todas las suscripciones
    public List<Subscription> getAllSubscriptions() {
        return subscriptionDAO.getSubscriptions();
    }
}
