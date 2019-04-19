package models;

import java.io.File;
import java.util.ArrayList;

/**
 * @author dzimiks
 * Date: 19-03-2019 at 19:26
 */
public class Storage implements Directory {

	/**
	 * Name of the storage.
	 */
	private String name;

	/**
	 * Instance of Storage object.
	 */
	private static Storage instance = null;

	/**
	 * Storage constructor.
	 */
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

	@Override
	public void create(String name, String path) {

	}

	@Override
	public void delete(String path) {

	}

	@Override
	public void download(String src, String dest) {

	}

	@Override
	public void upload(String src, String dest) {

	}

	@Override
	public void uploadMultiple(ArrayList<File> directories, String dest,String name) {

	}

	@Override
	public void uploadMultipleZip(ArrayList<File> directories, String dest,String name) {

	}

	@Override
	public void move(String src, String dest) {

	}

	@Override
	public void rename(String name, String path) {
		this.name = name;
	}

	@Override
	public void listFiles(String path, boolean sorted) {

	}

	@Override
	public void listFilesWithExtensions(String path, String[] extensions, boolean sorted) {

	}

	@Override
	public ArrayList<File> listDirs(String path, boolean sorted) {
		return null;
	}
}
