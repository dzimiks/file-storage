package models;

import exceptions.CreateFileException;

/**
 * @author dzimiks
 * Date: 17-03-2019 at 20:13
 */
public interface BasicFile {

	/**
	 * Creates new file instance on given path.
	 *
	 * @param name Name of the file.
	 * @param path Path of the file.
	 */
	public void create(String name, String path) throws CreateFileException;

	/**
	 * Deletes given file from given path.
	 *
	 * @param path Path of the file on the storage.
	 */
	public void delete(String path);

	/**
	 * Downloads file on given path.
	 *
	 * @param src  Path of the file on the storage.
	 * @param dest Path of the file where we want to download it.
	 */
	public void download(String src, String dest);

	/**
	 * Uploads file in storage on given path.
	 *
	 * @param src  Path of the file on the storage.
	 * @param dest Path of the file where we want to upload it.
	 */
	public void upload(String src, String dest);

	/**
	 * Moves file to given path.
	 *
	 * @param src  Path of the file on the storage.
	 * @param dest Path where we want to move file.
	 */
	public void move(String src, String dest);

	/**
	 * Renames current file.
	 *
	 * @param name New name for the file.
	 * @param path Path of the file on the storage.
	 */
	public void rename(String name, String path);
}
