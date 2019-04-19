package models;

import exceptions.*;

import java.io.File;
import java.util.List;

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
	 *
	 */
	public void create(String name, String path) throws CreateFileException;

	/**
	 * Deletes given file from given path.
	 *
	 * @param path Path of the file on the storage.
	 *
	 */
	public void delete(String path) throws DeleteException;

	/**
	 * Downloads file on given path.
	 *
	 * @param src  Path of the file on the storage.
	 * @param dest Path on the storage where we want to download file.
	 *
	 *
	 */
	public void download(String src, String dest) throws DownloadException;

	/**
	 * Uploads file in storage on given path.
	 *
	 * @param src  Path of the file on the storage.
	 * @param dest Path on the storage where we want to upload file.
	 *
	 */
	public void upload(String src, String dest) throws UploadException;


	/**
	 * Uploads multiple file on given path in storage.
	 *
	 * @param files List of files.
	 * @param dest  Path on the storage where we want to upload files.
	 * @param name Name of created zip
	 *
	 */
	public void uploadMultiple(List<File> files, String dest,String name) throws UploadMultipleException;

	/**
	 * Uploads multiple zipped files on given path in storage.
	 *
	 * @param files List of files.
	 * @param dest  Path on the storage where we want to upload zipped files.
	 * @param name Name of created zip
	 *
	 */
	public void uploadMultipleZip(List<File> files, String dest, String name)throws UploadMultipleZipException;

	/**
	 * Moves file to given path.
	 *
	 * @param src  Path of the file on the storage.
	 * @param dest Path on the storage where we want to move file.
	 *
	 */
	public void move(String src, String dest) throws MoveException;

	/**
	 * Renames current file.
	 *
	 * @param name New name for the file.
	 * @param path Path of the file on the storage.
	 *
	 */
	public void rename(String name, String path) throws RenameException;
}
