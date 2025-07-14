package spotify.simulation.controller;

import spotify.simulation.clases.UserSong;
import spotify.simulation.dao.UserSongDAO;

import java.util.List;

public class UserSongController {

    private UserSongDAO userSongDAO;

    public UserSongController() {
        this.userSongDAO = new UserSongDAO();
    }

    public void addUserSong(int songId, int userId) {
        UserSong userSong = new UserSong(songId, userId);
        userSongDAO.insertUserSong(userSong);
    }

    public void updateUserSong(int idSubscriptionSong, int songId, int userId) {
        UserSong userSong = new UserSong(idSubscriptionSong, songId, userId);
        userSongDAO.updateUserSong(userSong);
    }

    public void deleteUserSong(int idSubscriptionSong) {
        userSongDAO.deleteUserSong(idSubscriptionSong);
    }

    public List<UserSong> getAllUserSongs() {
        return userSongDAO.getUserSongs();
    }

    public List<UserSong> getUserSongsByUserId(int userId) {
        return userSongDAO.getUserSongsByUserId(userId);
    }
}
