package models;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author dzimiks
 * Date: 09-04-2019 at 22:06
 */
public class Arhive {

	/**
	 * Creates zipped file on given path.
	 *
	 * @param file File we want to zip.
	 * @param name File name.
	 * @param path Path where we want to save zipped file.
	 * @throws IOException Throws IOException if file doesn't exists on given path.
	 */
	public void zipFile(File file, String name, String path) throws IOException {
		if (!file.isDirectory()) {
			FileOutputStream fileOutputStream = new FileOutputStream(path + File.separator + name + ".zip");
			ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
			FileInputStream fileInputStream = new FileInputStream(file);
			ZipEntry zipEntry = new ZipEntry(file.getName());
			zipOutputStream.putNextEntry(zipEntry);

			byte[] bytes = new byte[1024];
			int length;

			while ((length = fileInputStream.read(bytes)) > 0) {
				zipOutputStream.write(bytes, 0, length);
			}

			zipOutputStream.close();
			fileInputStream.close();
			fileOutputStream.close();
		}
	}

	/**
	 * Creates zipped directory on given path.
	 *
	 * @param file Directory we want to zip.
	 * @param name Directory name.
	 * @param path Path where we want to save zipped directory.
	 * @throws IOException Throws IOException if directory doesn't exists on given path.
	 */
	public void zipDirectory(File file, String name, String path) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(path + File.separator + name + ".zip");
		ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

		zip(file, file.getName(), zipOutputStream);
		zipOutputStream.close();
		fileOutputStream.close();
	}

	/**
	 * Recursively zip a given directory.
	 *
	 * @param file            File/directory we want to zip.
	 * @param fileName        Name of given file/directory.
	 * @param zipOutputStream ZIP output stream.
	 * @throws IOException Throws IOException if ZIP output stream doesn't work correctly.
	 */
	private void zip(File file, String fileName, ZipOutputStream zipOutputStream) throws IOException {
		if (file.isHidden()) {
			return;
		}

		if (file.isDirectory()) {
			if (fileName.endsWith(File.separator)) {
				zipOutputStream.putNextEntry(new ZipEntry(fileName));
				zipOutputStream.closeEntry();
			} else {
				zipOutputStream.putNextEntry(new ZipEntry(fileName + File.separator));
				zipOutputStream.closeEntry();
			}

			File[] children = file.listFiles();

			if (children != null) {
				for (File childFile : children) {
					zip(childFile, fileName + File.separator + childFile.getName(), zipOutputStream);
				}
			}

			return;
		}

		FileInputStream fileInputStream = new FileInputStream(file);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zipOutputStream.putNextEntry(zipEntry);
		byte[] bytes = new byte[1024];
		int length;

		while ((length = fileInputStream.read(bytes)) >= 0) {
			zipOutputStream.write(bytes, 0, length);
		}

		fileInputStream.close();
	}
}

