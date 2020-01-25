package pl.exercise.ferry.fileWriterAndPrinter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Printer2 {

    public void displayNamesOfFiles() {
        File[] files = new File("D:/Java-programowanie 2/projekty/Baza/").listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }

    public void readFiles(String nameOfFile) throws IOException {
        List<String> readFiles = Files.readAllLines(Paths.get("D:/Java-programowanie 2/projekty/Baza/" + nameOfFile));
        for (String readFile : readFiles) {
            System.out.println(readFile);
        }
        return;
    }


}