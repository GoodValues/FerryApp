package pl.exercise.ferry.fileWriterAndPrinter;

import pl.exercise.ferry.ticket.personTicket.ChildTicket;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

//public class FileScan {
//    Scanner scanner = new Scanner(System.in);
//
//    public void rozdzielenie() throws FileNotFoundException {
//        System.out.println("Podaj nazwę pliku (z podanych poniżej), z którego chcesz odczytać dane: ");
//        Printer printer = new Printer();
//        printer.displayNamesOfFiles();
//        String nameOfFile = scanner.next();
//        //System.out.println(printer.readExternalData(nameOfFile));
//        String s = printer.readExternalData(nameOfFile);
//        String[] holden = s.split(",");
//
//        String ownerData = holden[0];
//        String ticketType = holden[1];
//        String ticketSubtype = holden[2];
//        String price = holden[3];
//        String balance = holden[4];
//
//        System.out.println("bilet dla: " + ownerData + ", typ: " + ticketType + ", podtyp: " + ticketSubtype
//                + ", kwota biletu: " + price + ", łączna kwota: " + balance);
//        return;
//    }
//}
