package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/main/resources/newfile.txt");
            boolean fstatus = file.createNewFile();
            if (fstatus) {
                System.out.println("File is created successfully");
            } else {
                System.out.println("File already exists in this path");
            }
            //Get the file object
            File fileUtil = FileUtils.getFile("src/main/resources/newfile.txt");
            System.out.println("Data in File: " + FileUtils.readFileToString(fileUtil, "UTF8"));
            //Create directory
            File destDir = new File("resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
        } catch (IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}