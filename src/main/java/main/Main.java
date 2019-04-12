package main;

import models.Arhive;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/dzimiks/Desktop/projects/file-storage/src/file/file.txt");
		File directory = new File("/Users/dzimiks/Desktop/projects/file-storage/src/file");
		String path = "/Users/dzimiks/Desktop/projects/file-storage/src";

		Arhive arhive = new Arhive();
		arhive.zipFile(file, path);
		arhive.zipDirectory(directory, path);
	}
}