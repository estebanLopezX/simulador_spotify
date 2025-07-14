package spotify.simulation.infrastructure;

import spotify.simulation.interfaces.Playlist;

public class CircularLinkedList<T> implements Playlist<T> {

    private NodosUserSong head;
    private NodosUserSong last;
    private NodosUserSong current;

    @Override
    public void addItem(T item) {

        NodosUserSong newNode = new NodosUserSong(null);
        newNode.setDato((spotify.simulation.clases.UserSong) item);

        int pasos = 0;

        if (head == null) {
            head = newNode;
            last = newNode;
            current = newNode;
            newNode.setSiguiente(head);
            System.out.println("Pasos recorridos: " + pasos);
        } else {
            // Contar pasos recorriendo desde head hasta last
            NodosUserSong temp = head;
            while (temp != last) {
                temp = temp.getSiguiente();
                pasos++;
            }

            last.setSiguiente(newNode);
            newNode.setSiguiente(head);
            last = newNode;

            System.out.println("Pasos recorridos: " + pasos);
        }
    }

    @Override
    public void removeCurrentItem() {
        if (current == null || head == null) {
            return;
        }

        if (head == last && current == head) {
            head = null;
            last = null;
            current = null;
            return;
        }

        NodosUserSong prev = head;
        while (prev.getSiguiente() != current) {
            prev = prev.getSiguiente();
            if (prev == head) {
                return;
            }
        }

        prev.setSiguiente(current.getSiguiente());

        if (current == head) {
            head = current.getSiguiente();
        }
        if (current == last) {
            last = prev;
        }

        current = current.getSiguiente();
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
        if (current == null || head == null) {
            return null;
        }
        NodosUserSong prev = head;
        while (prev.getSiguiente() != current) {
            prev = prev.getSiguiente();
            if (prev == head) {
                return null;
            }
        }
        current = prev;
        return (T) current.getDato();
    }

    @Override
    public void reset() {
        current = head;
    }

    @Override
    public void showAll() {
        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }
        NodosUserSong temp = head;
        do {
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        } while (temp != head);
    }
}
