
package models;

import exceptions.*;

import java.io.File;
import java.util.List;

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
	public void create(String name, String path) throws CreateDirectoryException;

	/**
	 * Deletes directory from given path.
	 *
	 * @param path Path of the directory on the storage.
	 */
	public void delete(String path) throws DeleteException;

	/**
	 * Downloads directory on given path.
	 *
	 * @param src  Path of the directory on the storage.
	 * @param dest Path of the directory where we want to download it.
	 */
	public void download(String src, String dest) throws DownloadException;

	/**
	 * Uploads directory in storage on given path.
	 *
	 * @param src  Path of the directory on the storage.
	 * @param dest Path of the directory where we want to upload it.
	 */
	public void upload(String src, String dest) throws UploadException;

	/**
	 * Uploads multiple directories on given path in storage.
	 *
	 * @param directories List of directories.
	 * @param dest        Path on the storage where we want to upload directories.
	 * @param name        Name of created zip.
	 */
	public void uploadMultiple(List<File> directories, String dest, String name) throws UploadMultipleException;

	/**
	 * Uploads multiple zipped directories on given path in storage.
	 *
	 * @param directories List of directories.
	 * @param dest        Path on the storage where we want to upload zipped directories.
	 * @param name        Name of created zip
	 */
	public void uploadMultipleZip(List<File> directories, String dest, String name) throws UploadMultipleZipException;

	/**
	 * Moves directory to given path.
	 *
	 * @param src  Path of the directory on the storage.
	 * @param dest Path where we want to move directory.
	 */
	public void move(String src, String dest) throws MoveException;

	/**
	 * Renames current directory.
	 *
	 * @param name New name for the directory.
	 * @param path Path of the directory on the storage.
	 */
	public void rename(String name, String path) throws RenameException;

	/**
	 * Lists all files in directory from given path.
	 *
	 * @param path   Path of the directory on the storage.
	 * @param sorted True if we want to list files in sorted order.
	 * @return Returns list of files.
	 */
	public List<File> listFiles(String path, boolean sorted) throws ListFilesException;

	/**
	 * Lists all files with given extensions in directory from given path.
	 *
	 * @param path       Path of the directory on the storage.
	 * @param extensions Array of file extensions.
	 * @param sorted     True if we want to list files in sorted order.
	 * @return Returns list of files with given extensions.
	 */
	public List<File> listFilesWithExtensions(String path, String[] extensions, boolean sorted) throws ListFilesException;

	/**
	 * Lists all directories in directory from given path.
	 *
	 * @param path   Path of the directory on the storage.
	 * @param sorted True if we want to list files in sorted order.
	 * @return Returns list of directories.
	 */
	public List<File> listDirs(String path, boolean sorted) throws ListDirectoryException;
}