package spotify.simulation.infrastructure;

import spotify.simulation.interfaces.Playlist;

import spotify.simulation.interfaces.Playlist;

public class SimpleLinkedList<T> implements Playlist<T> {

    private NodosUserSong<T> head;
    private NodosUserSong<T> current;

    @Override
    public void addItem(T item) {
        NodosUserSong<T> newNode = new NodosUserSong<>(item);
        int pasos = 0;

        if (head == null) {
            head = newNode;
            current = head;
            System.out.println("Pasos recorridos: " + pasos);
        } else {
            NodosUserSong<T> temp = head;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
                pasos++;
            }
            temp.setSiguiente(newNode);
            System.out.println("Pasos recorridos: " + pasos);
        }
    }

    @Override
    public void removeCurrentItem() {
        if (current == null || head == null) {
            System.out.println("No hay elemento actual para eliminar.");
            return;
        }

        System.out.println("Eliminando item actual: " + current.getDato());

        if (current == head) {
            head = head.getSiguiente();
            current = head;
            System.out.println("Item era head. Nuevo head es: " + (head != null ? head.getDato() : "null"));
            return;
        }

        NodosUserSong<T> prev = head;
        while (prev.getSiguiente() != null && prev.getSiguiente() != current) {
            prev = prev.getSiguiente();
        }

        if (prev.getSiguiente() == current) {
            prev.setSiguiente(current.getSiguiente());
            current = prev.getSiguiente() != null ? prev.getSiguiente() : head;
            System.out.println("Item eliminado. Nuevo current es: " + (current != null ? current.getDato() : "null"));
        }
    }

    @Override
    public T getCurrentItem() {
        System.out.println("Obteniendo item actual: " + (current != null ? current.getDato() : "null"));
        return current != null ? current.getDato() : null;
    }

    @Override
    public T nextItem() {
        if (current != null && current.getSiguiente() != null) {
            current = current.getSiguiente();
            System.out.println("Movido al siguiente item: " + current.getDato());
            return current.getDato();
        }
        System.out.println("No hay siguiente item disponible.");
        return null;
    }

    @Override
    public T previousItem() {
        if (current == null) {
            throw new IllegalStateException("No se puede retroceder: la lista está vacía o el cursor no está definido.");
        }

        if (current == head) {
            throw new IllegalStateException("No se puede retroceder: ya estás en el primer elemento.");
        }

        NodosUserSong<T> prev = head;
        while (prev.getSiguiente() != null && prev.getSiguiente() != current) {
            prev = prev.getSiguiente();
        }

        current = prev;
        System.out.println("Movido al item anterior: " + current.getDato());
        return current.getDato();
    }

    @Override
    public void reset() {
        current = head;
        System.out.println("Reiniciado al principio de la lista. Current es: " + (current != null ? current.getDato() : "null"));
    }

    @Override
    public void showAll() {
        System.out.println("Mostrando todos los elementos de la lista:");
        NodosUserSong<T> temp = head;
        while (temp != null) {
            System.out.println(" - " + temp.getDato());
            temp = temp.getSiguiente();
        }
    }
}
