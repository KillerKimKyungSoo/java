package io.file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class NewFielsMain {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("temp/xample.txt");
        Path directory = Path.of("tmep/exampleDir");
        System.out.println("File exists :" + Files.exists(file));
        //새로운 파일 생성
        try{
            Files.createFile(file);
            System.out.println("File created");
        } catch (FileAlreadyExistsException e) {
            System.out.println(file + " File already exists");
        }
        //Created Directory
        try{
            Files.createDirectories(directory);
            System.out.println("Directory cereated");
        }catch (FileAlreadyExistsException e)
        {
            System.out.println(directory + " Directory already exists");
        }
        BasicFileAttributes attrs = Files.readAttributes(file,
                BasicFileAttributes.class);
        System.out.println("===== Attributes =====");
        System.out.println("Creation time: " + attrs.creationTime());
        System.out.println("Is directory: " + attrs.isDirectory());
        System.out.println("Is regular file: " + attrs.isRegularFile());
        System.out.println("Is symbolic link: " + attrs.isSymbolicLink());
        System.out.println("Size: " + attrs.size());

    }
}
