package pl.exercise.ferry.fileWriterAndPrinter;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.ticket.Ticket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Writer { //serializer

    List<Ticket> tickets = Basket.INSTANCE.listOfTickets();
    List<String> namesOfFiles = new ArrayList<>();

    public void writeToFile(List<String> lines, String nameOfFile) throws IOException {
        File file = new File("D:/Java-programowanie 2/projekty/" + nameOfFile);
if(!file.exists()){
    file.createNewFile();
}
        FileWriter zapis = new FileWriter("D:/Java-programowanie 2/projekty/" + nameOfFile);
        for (Ticket ticket : tickets) {
            String ticketInfo = ticket.getType() + "," + ticket.getSubType() + "," + ticket.getPrice();
            zapis.write(ticketInfo);
        }
        zapis.close();
        namesOfFiles.add(nameOfFile);
    }
}







    /*public Writer() throws IOException {
    }

    public void writeToFile(List<String> lines) {
        FileWriter writer = new FileWriter("output.txt");
        for (String str : lines) {
            writer.write(str + System.lineSeparator());
        }
    }
    writer.close();
*/

