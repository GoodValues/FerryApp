package TransportApp.src.appSkeleton.screen;

import TransportApp.src.appSkeleton.tickets.cargoTicket.CargoMenu;
import TransportApp.src.appSkeleton.tickets.personTicket.PersonMenu;
import TransportApp.src.appSkeleton.tickets.vehicleTicket.VehicleMenu;

import java.io.IOException;
import java.util.Scanner;

public class TicketScreen {

    private final Scanner scanner = new Scanner(System.in);

    public void interact() throws IOException {
            System.out.println("Wybierz bilet, który chcesz kupić: \n"
                    + "1. Osoba \n"
                    + "2. Pojazd \n"
                    + "3. Cargo");
            String secondResponse = scanner.next();
            if ("1".equals(secondResponse)) {
                PersonMenu person = new PersonMenu();
                person.personMenu();
            }
            if ("2".equals(secondResponse)) {
                VehicleMenu vehicle = new VehicleMenu();
                vehicle.vehicleMenu();
            }
            if ("3".equals(secondResponse)) {
                CargoMenu cargo = new CargoMenu();
                cargo.cargoMenu();
            }
    }
}
