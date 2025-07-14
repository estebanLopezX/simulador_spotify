package spotify.simulation.clases;


public class Role {
    private int idRole;
    private String roleName;
    private int status;

    public Role() {}

    public Role( String roleName, int status) {
        this.roleName = roleName;
        this.status = status;
    }
    
    public Role(int idRole, String roleName, int status) {
        this.idRole = idRole;
        this.roleName = roleName;
        this.status = status;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
