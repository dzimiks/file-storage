package models;

/**
 * @author dzimiks
 * Date: 19-03-2019 at 19:26
 */
public interface Storage {

    /**
     * Creates new storage instance on given path.
     *
     * @param path Path of the storage.
     */
    public void create(String path);

    /**
     * Deletes storage from given path.
     *
     * @param path Path of the storage.
     */
    public void delete(String path);
}
