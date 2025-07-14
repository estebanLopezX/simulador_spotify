package spotify.simulation.controller;

import spotify.simulation.clases.User;
import spotify.simulation.dao.UserDAO;

import java.util.List;

public class UserController {

    private UserDAO userDAO;

    public UserController() {
        this.userDAO = new UserDAO();
    }

    public void addUser(int subscriptionId, int roleId, String name, String phone, String email, String password) {
        User user = User.getInstance(0, subscriptionId, roleId, name, phone, email, password);
        userDAO.insertUser(user);
    }

    public void updateUser(int id, int subscriptionId, int roleId, String name, String phone, String email) {
        User user = User.getInstance();
        user.setId(id);
        user.setSubscriptionId(subscriptionId);
        user.setRoleId(roleId);
        user.setName(name);
        user.setPhone(phone);
        user.setEmail(email);
        userDAO.updateUser(user);
    }

    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    public List<User> getAllUsers() {
        return userDAO.getUsers();
    }

    public Boolean hasUserWithRol(int idRol) {
        return userDAO.tieneUsuariosConRol(idRol);
    }

    public Boolean hasUserWithSubscription(int idSubscription) {
        return userDAO.tieneUsuariosConSuscripcion(idSubscription);
    }

    public User obtenerUsuarioPorCorreoYClave(String correo, String clave) {
        User user = userDAO.obtenerUsuarioPorCorreoYClave(correo, clave);

        if (user != null) {
            User singletonUser = User.getInstance(
                    user.getId(),
                    user.getSubscriptionId(),
                    user.getRoleId(),
                    user.getName(),
                    user.getPhone(),
                    user.getEmail(),
                    user.getPassword()
            );
            return singletonUser;
        }

        return null;
    }

    public boolean validatePassword(int userId, String inputPassword) {
        User user = userDAO.getUserById(userId);
        return user != null && user.getPassword().equals(inputPassword);
    }

    public void updatePassword(int userId, String newPassword) {
        userDAO.updatePassword(userId, newPassword);
    }

    public void updateSubscription(int userId, int subscriptionId) {
        userDAO.updateSubscription(userId, subscriptionId);
    }

}
