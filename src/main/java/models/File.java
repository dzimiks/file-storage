package models;

/**
 * @author dzimiks
 * Date: 17-03-2019 at 20:13
 */
public interface File {

    /**
     * Creates new file instance.
     */
    public void create();

    /**
     * Deletes file.
     */
    public void delete();

    /**
     * Downloads file.
     */
    public void download();
}
