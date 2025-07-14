package spotify.simulation.controller;

import spotify.simulation.clases.Role;
import spotify.simulation.dao.RoleDAO;

import java.util.List;

public class RoleController {
    private RoleDAO roleDAO;

    public RoleController() {
        this.roleDAO = new RoleDAO();
    }

    // Insertar nuevo rol
    public void addRole(String roleName, int status) {
        Role role = new Role(roleName, status);
        roleDAO.insertRole(role);
    }

    // Actualizar rol existente
    public void updateRole(int id,String roleName, int status) {
        Role role = new Role(id, roleName, status);
        roleDAO.updateRole(role);
    }

    // Eliminar rol por ID
    public void deleteRole(int id) {
        roleDAO.deleteRole(id);
    }

    // Obtener todos los roles
    public List<Role> getAllRoles() {
        return roleDAO.getRoles();
    }
}
