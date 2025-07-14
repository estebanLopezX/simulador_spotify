package spotify.simulation.infrastructure;

import spotify.simulation.clases.UserSong;

public class NodoUserSongDoble<T> {

    private T dato;
    private NodoUserSongDoble<T> siguiente;
    private NodoUserSongDoble<T> anterior;

    public NodoUserSongDoble(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoUserSongDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUserSongDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoUserSongDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoUserSongDoble<T> anterior) {
        this.anterior = anterior;
    }
}
