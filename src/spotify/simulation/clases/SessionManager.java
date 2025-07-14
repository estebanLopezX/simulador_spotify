package spotify.simulation.clases;

public class SessionManager {

    private static User currentUser;
    private static int indexCombo = 0;

    public static void login(User user) {
        currentUser = user;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void logout() {
        currentUser = null;
        User.resetInstance(); 
    }

    public static boolean isLoggedIn() {
        return currentUser != null;
    }

    public static void setIndexCombo(int index) {
        indexCombo = index;
    }

    public static int getIndexCombo() {
        return indexCombo;
    }
}
