package spotify.simulation.infrastructure;

import spotify.simulation.interfaces.Playlist;

public class DoublyLinkendList<T> implements Playlist<T> {

    private NodoUserSongDoble<T> head;
    private NodoUserSongDoble<T> current;

    @Override
    public void addItem(T item) {
        System.out.println("Agregando item: " + item);

        NodoUserSongDoble<T> nuevoNodo = new NodoUserSongDoble<>(item);

        if (head == null) {
            head = nuevoNodo;
            current = head;
        } else {
            NodoUserSongDoble<T> temp = head;

            int pasos = 0;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
                pasos++;
            }

            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(temp);

            System.out.println("Item agregado después de " + pasos + " pasos. Nuevo nodo enlazado.");
        }
        System.out.println("Item agregado correctamente.\n");
    }

    @Override
    public void removeCurrentItem() {
        if (current == null) {
            return;
        }

        if (current == head) {
            head = current.getSiguiente();
            if (head != null) {
                head.setAnterior(null);
            }
            current = head;
        } else {
            NodoUserSongDoble<T> prev = current.getAnterior();
            NodoUserSongDoble<T> next = current.getSiguiente();

            if (prev != null) {
                prev.setSiguiente(next);
            }
            if (next != null) {
                next.setAnterior(prev);
            }
            current = next != null ? next : prev;
        }
    }

    @Override
    public T getCurrentItem() {
        if (current != null) {
            return current.getDato();
        }
        return null;
    }

    @Override
    public T nextItem() {
        if (current != null && current.getSiguiente() != null) {
            current = current.getSiguiente();
            return current.getDato();
        }
        return null;
    }

    @Override
    public T previousItem() {
        if (current != null && current.getAnterior() != null) {
            current = current.getAnterior();
            return current.getDato();
        }
        return null;
    }

    @Override
    public void reset() {
        current = head;
    }

    @Override
    public void showAll() {
        NodoUserSongDoble<T> temp = head;
        while (temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        }
    }
}
