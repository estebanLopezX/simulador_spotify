package spotify.simulation.clases;

public class User {

    private static User instance;

    private int id;
    private int subscriptionId;
    private int roleId;
    private String name;
    private String phone;
    private String email;
    private String password;

    public User() {
    }

    public User(int id, int subscriptionId, int roleId, String name, String phone, String email, String password) {
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.roleId = roleId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public static User getInstance(int id, int subscriptionId, int roleId, String name, String phone, String email, String password) {
        if (instance == null) {
            instance = new User();
        }
        instance.id = id;
        instance.subscriptionId = subscriptionId;
        instance.roleId = roleId;
        instance.name = name;
        instance.phone = phone;
        instance.email = email;
        instance.password = password;
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
