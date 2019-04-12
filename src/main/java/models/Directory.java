package models;

import java.io.File;

/**
 * @author dzimiks
 * Date: 17-03-2019 at 20:15
 */
public interface Directory {

	/**
	 * Creates new directory instance on given path.
	 *
	 * @param path Path of the file.
	 */
	public void create(String path);

	/**
	 * Deletes directory from given path.
	 *
	 * @param directory Directory which we want to delete.
	 * @param path      Path of the directory on the storage.
	 */
	public void delete(File directory, String path);

	/**
	 * Downloads zipped directory.
	 *
	 * @param path Path of the directory where we want to download it.
	 */
	public void download(String path);

	/**
	 * Uploads directory in storage on given path.
	 *
	 * @param directory Directory which we want to upload.
	 * @param path      Path of the directory on the storage.
	 */
	public void upload(File directory, String path);

	/**
	 * Moves directory to given path.
	 *
	 * @param path Path where we want to move directory.
	 */
	public void move(String path);

	/**
	 * Renames current directory.
	 *
	 * @param file Directory which we want to rename.
	 * @param name New name for the directory.
	 */
	public void rename(File file, String name);
}
