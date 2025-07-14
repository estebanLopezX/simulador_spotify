package spotify.simulation.infrastructure;

import spotify.simulation.clases.UserSong;

public class NodosUserSong<T> {

    private T dato;
    private NodosUserSong<T> siguiente;

    public NodosUserSong(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodosUserSong<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosUserSong<T> siguiente) {
        this.siguiente = siguiente;
    }
}
