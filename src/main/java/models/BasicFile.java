package models;

import java.io.File;

/**
 * @author dzimiks
 * Date: 17-03-2019 at 20:13
 */
public interface BasicFile {

    /**
     * Creates new file instance on given path.
     *
     * @param path Path of the file.
     */
    public void create(String path);

    /**
     * Deletes given file from given path.
     *
     * @param file File which we want to delete.
     * @param path Path of the file on the storage.
     */
    public void delete(File file, String path);

    /**
     * Downloads file on given path.
     *
     * @param path Path of the file where we want to download it.
     */
    public void download(String path);

    /**
     * Uploads file in storage on given path.
     *
     * @param file File which we want to upload.
     * @param path Path of the file on the storage.
     */
    public void upload(File file, String path);
}
