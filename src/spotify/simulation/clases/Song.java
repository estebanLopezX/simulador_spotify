package spotify.simulation.clases;

import java.math.BigDecimal;

public class Song {
    private int idSong;
    private int genereId;
    private int artistId;
    private String title;
    private BigDecimal duration;
    private byte[] file;

    public Song() {}

    public Song(int idSong, int genereId, int artistId, String title, BigDecimal duration, byte[] file) {
        this.idSong = idSong;
        this.genereId = genereId;
        this.artistId = artistId;
        this.title = title;
        this.duration = duration;
        this.file = file;
    }
    
    public Song(int genereId, int artistId, String title, BigDecimal duration, byte[] file) {
        this.genereId = genereId;
        this.artistId = artistId;
        this.title = title;
        this.duration = duration;
        this.file = file;
    }

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public int getGenereId() {
        return genereId;
    }

    public void setGenereId(int genereId) {
        this.genereId = genereId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
