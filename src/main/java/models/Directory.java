package models;

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
}
