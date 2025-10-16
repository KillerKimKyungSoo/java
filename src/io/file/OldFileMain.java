package io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class OldFileMain {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");
        System.out.println("File exists : " + file.exists());
        boolean created = file.createNewFile();
        System.out.println("File Created : " + created);
        boolean dirCreated = directory.mkdir();
        System.out.println("Directory created : " + dirCreated);
        long lastModified = file.lastModified();
        System.out.println("Last Modified: " + new Date(lastModified));
    }
}
