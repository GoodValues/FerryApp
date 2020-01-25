package pl.exercise.ferry.fileWriterAndPrinter;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.screen.MainScreen;
import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.cargoTicket.StandardTicket;
import pl.exercise.ferry.ticket.cargoTicket.SuperTicket;
import pl.exercise.ferry.ticket.personTicket.*;
import pl.exercise.ferry.ticket.vehicleTicket.BikeTicket;
import pl.exercise.ferry.ticket.vehicleTicket.BusTicket;
import pl.exercise.ferry.ticket.vehicleTicket.CarTicket;
import pl.exercise.ferry.ticket.vehicleTicket.TruckTicket;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer { //deserializer

    ArrayList<String> list = new ArrayList<String>();
    List<Ticket> listOfTickets = Basket.INSTANCE.listOfTickets();
    Ticket ticket;


    Scanner scanner = new Scanner(System.in);

    public void readExternalData() throws IOException {
        System.out.println("Podaj nazwę pliku (z podanych poniżej), z którego chcesz odczytać dane: ");
        displayNamesOfFiles();
        String fileName = scanner.next();
        Scanner scanner = new Scanner(new File("D:/Java-programowanie 2/projekty/Baza/" + fileName));
        String s = "";

        while (scanner.hasNextLine()){
            s+=scanner.nextLine();
        }

        scanner.close();

        String[] dataOfOneTicket = s.split(";");

        for (int i = 0; i < dataOfOneTicket.length; i++) {
            String[] simpleData = dataOfOneTicket[i].split(",");
            String ownerData = simpleData[0];
            String ticketType = simpleData[1];
            String ticketSubtype = simpleData[2];
            String price = simpleData[3];
            String balance = simpleData[4];

            Ticket ticket = getSubtypeOfTicket(ticketSubtype, ownerData, price);

            if (ticket == null)
                throw new IllegalArgumentException("Nazwa biletu z pliku jest niepoprawna");
            ticket.setPrice(price);
            Basket.INSTANCE.addBalance(ticket.getPrice());
            listOfTickets.add(ticket);
        }
        System.out.println("Dodano bilety do koszyka. Co chcesz dalej zrobić?");
        MainScreen mainScreen = new MainScreen();
        mainScreen.interact();
    }

    private Ticket getSubtypeOfTicket(String subtype, String owner, String price) {
        switch(subtype) {
            case "Adult":
                return new AdultTicket(owner);
            case "Child":
                return new ChildTicket(owner);
            case "Senior":
                return new SeniorTicket(owner);
            case "Young":
                return new YoungTicket(owner);
            case "Bike":
                return new BikeTicket(owner);
            case "Bus":
                return new BusTicket(Float.parseFloat(price)/5, owner);
            case "Car":
                return new CarTicket(owner);
            case "Truck":
                return new TruckTicket(Float.parseFloat(price)/10, owner);
            case "Standard":
                return new StandardTicket(Float.parseFloat(price)/50, owner);
            case "Super":
                return new SuperTicket(Float.parseFloat(price)/50, owner);
            default:
                return null;
        }
    }

    public static void displayNamesOfFiles() {
        File[] files = new File("D:/Java-programowanie 2/projekty/Baza/").listFiles();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }


}
