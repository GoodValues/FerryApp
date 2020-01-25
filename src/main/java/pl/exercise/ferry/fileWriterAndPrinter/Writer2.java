package pl.exercise.ferry.fileWriterAndPrinter;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.ticket.Ticket;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Writer2 {

    /*List<Ticket> tickets = Basket.INSTANCE.listOfTickets();

    for (Ticket ticket : tickets) {
        String ticketInfo = ticket.getType() + "," + ticket.getSubType() + "," + ticket.getPrice();
    }

   public void saveFiles(String nameOfFiles) throws IOException {


       Files.write(Paths.get("D:/Java-programowanie 2/projekty/Baza transakcji" + nameOfFiles),
               ticketInfo.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
    }*/

}
