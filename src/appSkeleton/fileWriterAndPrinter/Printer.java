package TransportApp.src.appSkeleton.fileWriterAndPrinter;

import TransportApp.src.appSkeleton.Basket;
import TransportApp.src.appSkeleton.screen.MainScreen;
import TransportApp.src.appSkeleton.tickets.Ticket;
import TransportApp.src.appSkeleton.tickets.cargoTicket.StandardTicket;
import TransportApp.src.appSkeleton.tickets.cargoTicket.SuperTicket;
import TransportApp.src.appSkeleton.tickets.personTicket.AdultTicket;
import TransportApp.src.appSkeleton.tickets.personTicket.ChildTicket;
import TransportApp.src.appSkeleton.tickets.personTicket.SeniorTicket;
import TransportApp.src.appSkeleton.tickets.personTicket.YoungTicket;
import TransportApp.src.appSkeleton.tickets.vehicleTicket.BikeTicket;
import TransportApp.src.appSkeleton.tickets.vehicleTicket.BusTicket;
import TransportApp.src.appSkeleton.tickets.vehicleTicket.CarTicket;
import TransportApp.src.appSkeleton.tickets.vehicleTicket.TruckTicket;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer { //deserializer

    List<Ticket> listOfTickets = Basket.INSTANCE.listOfTickets();

    Scanner scanner = new Scanner(System.in);

    public void readExternalData() throws IOException {
        System.out.println("Podaj nazwę pliku (z podanych poniżej), z którego chcesz odczytać dane: ");
        displayNamesOfFiles();
        String fileName = scanner.next();
        Scanner scanner = new Scanner(new File("D:/Java-programowanie 2/projekty/Baza/" + fileName));
        String line = "";

        while (scanner.hasNextLine()){
            line+=scanner.nextLine();
        }
        scanner.close();

        String[] dataOfOneTicket = line.split(";");
        for (int i = 0; i < dataOfOneTicket.length; i++) {
            String[] simpleData = dataOfOneTicket[i].split(",");
            String ownerData = simpleData[0];
            String ticketType = simpleData[1];
            String ticketSubtype = simpleData[2];
            String price = simpleData[3];
            String balance = simpleData[4];

            Ticket ticket = getSubtypeOfTicket(ticketSubtype, ownerData, price);

            if (ticket == null)
                throw new IllegalArgumentException("Nazwa biletu z pliku jest niepoprawna.");
            ticket.setPrice(price);
            Basket.INSTANCE.addBalance(ticket.getPrice());
            listOfTickets.add(ticket);
        }
        System.out.println("Dodano bilety do koszyka. Co chcesz dalej zrobić?");
        System.out.println();
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
