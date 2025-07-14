package models;

public class Genere {
    private int idGenere;
    private String genereName;
    private String description;

    public Genere() {}

    public Genere(String genereName, String description) {
        this.genereName = genereName;
        this.description = description;
    }
    
     public Genere(int idGenere, String genereName, String description) {
        this.idGenere = idGenere;
        this.genereName = genereName;
        this.description = description;
    }

    public int getIdGenere() {
        return idGenere;
    }

    public void setIdGenere(int idGenere) {
        this.idGenere = idGenere;
    }

    public String getGenereName() {
        return genereName;
    }

    public void setGenereName(String genereName) {
        this.genereName = genereName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
