package models;

/**
 * @author dzimiks
 * Date: 17-03-2019 at 20:15
 */
public interface Folder {

    /**
     * Creates new folder instance.
     */
    public void create();

    /**
     * Deletes folder.
     */
    public void delete();

    /**
     * Downloads zipped folder.
     */
    public void download();
}
