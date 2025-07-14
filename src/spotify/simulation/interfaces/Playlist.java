
package spotify.simulation.interfaces;

public interface Playlist<T> {

    void addItem(T item);

    void removeCurrentItem();

    T getCurrentItem();

    T nextItem();

    T previousItem();

    void reset();

    void showAll();
}
