package pl.exercise.ferry.screen;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.ticket.*;
import pl.exercise.ferry.ticket.personTicket.AdultTicket;
import pl.exercise.ferry.ticket.personTicket.ChildTicket;
import pl.exercise.ferry.ticket.personTicket.SeniorTicket;
import pl.exercise.ferry.ticket.personTicket.YoungTicket;
import pl.exercise.ferry.ticket.vehicleTicket.BikeTicket;
import pl.exercise.ferry.ticket.vehicleTicket.BusTicket;
import pl.exercise.ferry.ticket.vehicleTicket.CarTicket;
import pl.exercise.ferry.ticket.vehicleTicket.TruckTicket;

import java.io.IOException;
import java.util.Scanner;

public class TicketScreen {

    private final Scanner scanner = new Scanner(System.in);
    //Basket basket = new Basket();

    public void interact() throws IOException {

        boolean repaetBuying = true;

        while (repaetBuying) {
            System.out.println("Wybierz bilet, który chcesz kupić:");
            System.out.println("1. Osoba");
            System.out.println("2. Pojazd");
            String secondResponse = scanner.nextLine();
            if ("1".equals(secondResponse)) {
                System.out.println("Kupujesz bilet osobowy. Podaj wiek podróżnego:");
                int age = scanner.nextInt();
                System.out.println("Podaj swoje imię i nazwisko");
                String owner = scanner.nextLine();
                Ticket ticket = parsePerson(age, owner);
                scanner.nextLine();
                System.out.println("Za bilet zapłacisz: " + ticket.getPrice() + " zł.");
                Basket.INSTANCE.addBalance(ticket.getPrice());
                Basket.INSTANCE.addNewTicket(ticket);
                new RepeatBuying().repeatBuying();
            }
            if ("2".equals(secondResponse)) {
                System.out.println("Kupujesz bilet dla pojazdu. Jaki to będzie pojazd? <CAR, BIKE, BUS, TRUCK>");
                String vehicle = scanner.nextLine();
                System.out.println("Podaj swoje imię i nazwisko");
                String owner = scanner.nextLine();
                Ticket ticket = parseVehicle(vehicle.toUpperCase(), owner);
                System.out.println("Za bilet zapłacisz: " + ticket.getPrice() + " zł.");
                Basket.INSTANCE.addBalance(ticket.getPrice());
                Basket.INSTANCE.addNewTicket(ticket);
                new RepeatBuying().repeatBuying();

            }
            if ("3".equals(secondResponse))
                System.out.println("Kupiłeś bilet na ładunek");

            /*System.out.println("Co chcesz dalej zrobić? <Nowy bilet> <Pokaż stan> <End>");
            scanner.nextLine();
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Nowy bilet")) repaetBuying = true;
            if (answer.equalsIgnoreCase("End")) repaetBuying = false;
            if (answer.equalsIgnoreCase("Pokaż stan")) System.out.println(basket.getBalance());*/
        }
        System.out.println("Kupiłeś bilet typu: " + " dla " + ".");
        System.out.println("Kwota transakcji to: " + Basket.INSTANCE.getBalance() + " zł.");
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

    public Ticket parsePerson(int age, String owner) {
        if (age > 0 && age <= 3) return new ChildTicket(owner);
        if (age > 3 && age < 18) return new YoungTicket(owner);
        if (age > 18 && age < 70) return new AdultTicket(owner);
        if (age >= 70) return new SeniorTicket(owner);
        else throw new IllegalArgumentException("Podałeś błędny wiek.");
    }
}
