package pl.exercise.ferry.fileWriterAndPrinter;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.ticket.Ticket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer { //deserializer

    ArrayList<String> list = new ArrayList<String>();
    List<Ticket> listOfTickets = Basket.INSTANCE.listOfTickets();
    Ticket ticket;

    public String readExternalData(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:/Java-programowanie 2/projekty/" + fileName));
        while (scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }
        scanner.close();
        String allData = "";
        for(String element : list) {
            allData+= element;
        }
        return allData;
    }

    public void displayNamesOfFiles() {
        File[] files = new File("D:/Java-programowanie 2/projekty/").listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }


}
