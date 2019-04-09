package models;

import java.io.File;

/**
 * @author dzimiks
 * Date: 17-03-2019 at 20:15
 */
public interface Folder {

    /**
     * Creates new folder instance on given path.
     *
     * @param path Path of the file.
     */
    public void create(String path);

    /**
     * Deletes folder from given path.
     *
     * @param folder Folder which we want to delete.
     * @param path   Path of the folder on the storage.
     */
    public void delete(File folder, String path);

    /**
     * Downloads zipped folder.
     *
     * @param path Path of the folder where we want to download it.
     */
    public void download(String path);

    /**
     * Uploads folder in storage on given path.
     *
     * @param folder Folder which we want to upload.
     * @param path   Path of the folder on the storage.
     */
    public void upload(File folder, String path);
}
