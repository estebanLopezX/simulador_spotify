package spotify.simulation.clases;

public class UserSong {
    private int idSubscriptionSong;
    private int songId;
    private int userId;

    public UserSong() {}

    public UserSong(int idSubscriptionSong, int songId, int userId) {
        this.idSubscriptionSong = idSubscriptionSong;
        this.songId = songId;
        this.userId = userId;
    }
    
    public UserSong( int songId, int userId) {
        this.songId = songId;
        this.userId = userId;
    }

    public int getIdSubscriptionSong() {
        return idSubscriptionSong;
    }

    public void setIdSubscriptionSong(int idSubscriptionSong) {
        this.idSubscriptionSong = idSubscriptionSong;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
