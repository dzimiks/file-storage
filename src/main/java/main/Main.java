package main;

import models.Arhive;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/dzimiks/Desktop/projects/file-storage/src/file/test-file.txt");
		File directory = new File("/Users/dzimiks/Desktop/projects/file-storage/src/file");
		String path = "/Users/dzimiks/Desktop/projects/file-storage/src";

		Arhive arhive = new Arhive();
		arhive.zipFile(file, file.getName().substring(0, file.getName().lastIndexOf('.')), path);
		arhive.zipDirectory(directory, directory.getName(), path);
	}
}