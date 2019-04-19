package models;

import java.io.File;
import java.util.ArrayList;

/**
 * @author dzimiks
 * Date: 17-03-2019 at 20:15
 */
public interface Directory {

	/**
	 * Creates new directory instance on given path.
	 *
	 * @param name Name of the directory.
	 * @param path Path of the directory on the storage.
	 */
	public void create(String name, String path);

	/**
	 * Deletes directory from given path.
	 *
	 * @param path Path of the directory on the storage.
	 */
	public void delete(String path);

	/**
	 * Downloads directory on given path.
	 *
	 * @param src  Path of the directory on the storage.
	 * @param dest Path of the directory where we want to download it.
	 */
	public void download(String src, String dest);

	/**
	 * Uploads directory in storage on given path.
	 *
	 * @param src  Path of the directory on the storage.
	 * @param dest Path of the directory where we want to upload it.
	 */
	public void upload(String src, String dest);

	/**
	 * Uploads multiple directories on given path in storage.
	 *
	 * @param directories 	List of directories.
	 * @param dest 			Path on the storage where we want to upload directories.
	 * @param name 			Name of created zip
	 */
	public void uploadMultiple(ArrayList<File> directories, String dest,String name);

	/**
	 * Uploads multiple zipped directories on given path in storage.
	 *
	 * @param directories List of directories.
	 * @param dest        Path on the storage where we want to upload zipped directories.
	 * @param name 		Name of created zip
	 */
	public void uploadMultipleZip(ArrayList<File> directories, String dest,String name);

	/**
	 * Moves directory to given path.
	 *
	 * @param src  Path of the directory on the storage.
	 * @param dest Path where we want to move directory.
	 */
	public void move(String src, String dest);

	/**
	 * Renames current directory.
	 *
	 * @param name New name for the directory.
	 * @param path Path of the directory on the storage.
	 */
	public void rename(String name, String path);

	/**
	 * Lists all files in directory from given path.
	 *
	 * @param path   Path of the directory on the storage.
	 * @param sorted True if we want to list files in sorted order.
	 */
	public void listFiles(String path, boolean sorted);

	/**
	 * Lists all files with given extensions in directory from given path.
	 *
	 * @param path       Path of the directory on the storage.
	 * @param extensions Array of file extensions.
	 * @param sorted     True if we want to list files in sorted order.
	 */
	public void listFilesWithExtensions(String path, String[] extensions, boolean sorted);

	/**
	 * Lists all directories in directory from given path.
	 *
	 * @param path   Path of the directory on the storage.
	 * @param sorted True if we want to list files in sorted order.
	 */
	public void listDirs(String path, boolean sorted);
}
