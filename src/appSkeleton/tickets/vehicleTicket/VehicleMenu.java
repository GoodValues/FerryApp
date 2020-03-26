package TransportApp.src.appSkeleton.tickets.vehicleTicket;

import TransportApp.src.appSkeleton.Basket;
import TransportApp.src.appSkeleton.tickets.RepeatBuying;
import TransportApp.src.appSkeleton.tickets.Ticket;

import java.io.IOException;
import java.util.Scanner;

public class VehicleMenu {

    Scanner scanner = new Scanner(System.in);

    public void vehicleMenu() throws IOException {
        System.out.println("Kupujesz bilet dla pojazdu. Podaj imię i nazwisko:");
        String owner = scanner.nextLine().toLowerCase();
        System.out.println("Jaki to będzie pojazd? <CAR, BIKE, BUS, TRUCK>");
        String vehicle = scanner.nextLine().toUpperCase();
        Ticket ticket = parseVehicle(vehicle.toUpperCase(), owner);
        ticket.ownerData();
        Basket.INSTANCE.addBalance(ticket.getPrice());
        Basket.INSTANCE.addNewTicket(ticket);
        System.out.println("Za bilet zapłacisz: " + ticket.getPrice() + " zł. Na promie zostało : " + Basket.INSTANCE.getLeftQuantity() );
        new RepeatBuying().repeatBuying();
    }

    private Ticket parseVehicle(String vehicle, String owner) {
        switch (vehicle) {
            case "CAR":
                return new CarTicket(owner);
            case "BIKE":
                return new BikeTicket(owner);
            case "BUS":
                System.out.println("Podaj długość autobusu (w metrach): ");
                float length = scanner.nextFloat();
                scanner.nextLine();
                return new BusTicket(length, owner);
            case "TRUCK":
                System.out.println("Podaj wagę ciężarówki (w tonach):");
                float weight = scanner.nextFloat();
                scanner.nextLine();
                return new TruckTicket(weight, owner);
            default:
                System.out.println("Podałeś zły typ pojazdu.");
                return null;
        }
    }
}
