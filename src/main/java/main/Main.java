package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import models.Arhive;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject object = new JsonObject();
        object.addProperty("test", 1);
        object.addProperty("test2", "second");
        String string = gson.toJson(object);
        System.out.println(string);

        File file = new File("/Users/dzimiks/Desktop/projects/file-storage/src/file");
        String path = "/Users/dzimiks/Desktop/projects/file-storage/src";
        Arhive arhive = new Arhive();
        arhive.zipFolder(file, path);
    }
}