package spotify.simulation.infrastructure;

import spotify.simulation.interfaces.Playlist;

public class DoublyCircularLinkedList<T> implements Playlist<T> {

    private NodoUserSongDoble head;
    private NodoUserSongDoble current;

    @Override
    public void addItem(T item) {
        NodoUserSongDoble newNode = new NodoUserSongDoble((spotify.simulation.clases.UserSong) item);

        int pasos = 0;

        if (head == null) {
            head = newNode;
            head.setSiguiente(head);
            head.setAnterior(head);
            current = head;
            System.out.println("Pasos recorridos: " + pasos);
        } else {
            NodoUserSongDoble last = head.getAnterior();

            // Contar pasos desde head hasta last
            NodoUserSongDoble temp = head;
            while (temp != last) {
                temp = temp.getSiguiente();
                pasos++;
            }

            last.setSiguiente(newNode);
            newNode.setAnterior(last);

            newNode.setSiguiente(head);
            head.setAnterior(newNode);

            System.out.println("Pasos recorridos: " + pasos);
        }
    }

    @Override
    public void removeCurrentItem() {
        if (current == null) {
            return;
        }

        // Si solo hay un nodo
        if (current.getSiguiente() == current) {
            head = null;
            current = null;
            return;
        }

        NodoUserSongDoble prev = current.getAnterior();
        NodoUserSongDoble next = current.getSiguiente();

        prev.setSiguiente(next);
        next.setAnterior(prev);

        if (current == head) {
            head = next;
        }

        current = next;
    }

    @Override
    public T getCurrentItem() {
        if (current != null) {
            return (T) current.getDato();
        }
        return null;
    }

    @Override
    public T nextItem() {
        if (current != null) {
            current = current.getSiguiente();
            return (T) current.getDato();
        }
        return null;
    }

    @Override
    public T previousItem() {
        if (current != null) {
            current = current.getAnterior();
            return (T) current.getDato();
        }
        return null;
    }

    @Override
    public void reset() {
        current = head;
    }

    @Override
    public void showAll() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        NodoUserSongDoble temp = head;
        do {
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        } while (temp != head);
    }
}
