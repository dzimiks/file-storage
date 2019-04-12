package models;

import java.io.File;

/**
 * @author dzimiks
 * Date: 19-03-2019 at 19:26
 */
public class Storage implements Directory {

	private String name;
	private static Storage instance = null;

	private Storage() {
		this.name = "Storage";
	}

	/**
	 * Creates new instance of Storage object.
	 *
	 * @return New instance of Storage object.
	 */
	public static Storage getInstance() {
		if (instance == null) {
			return new Storage();
		}

		return instance;
	}

	/**
	 * Returns name of storage.
	 *
	 * @return Name of storage.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Renames current storage.
	 *
	 * @param name New name of storage.
	 */
	public void rename(String name) {
		this.name = name;
	}

	@Override
	public void create(String path) {

	}

	@Override
	public void delete(File directory, String path) {

	}

	@Override
	public void download(String path) {

	}

	@Override
	public void upload(File directory, String path) {

	}
}
