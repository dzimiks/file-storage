package models;

import exceptions.CreateFileException;

import java.io.File;

/**
 * @author dzimiks
 * Date: 17-03-2019 at 20:13
 */
public interface BasicFile {

	/**
	 * Creates new file instance on given path.
	 *
	 * @param name      Name of the file.
	 * @param extension Extension of the file.
	 * @param path      Path of the file.
	 */
	public void create(String name, String extension, String path) throws CreateFileException;

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

	/**
	 * Moves file to given path.
	 *
	 * @param path Path where we want to move file.
	 */
	public void move(String path);

	/**
	 * Renames current file.
	 *
	 * @param file File which we want to rename.
	 * @param name New name for the file.
	 */
	public void rename(File file, String name);
}
