package TransportApp.src.appSkeleton.tickets.personTicket;

import TransportApp.src.appSkeleton.Basket;
import TransportApp.src.appSkeleton.tickets.RepeatBuying;
import TransportApp.src.appSkeleton.tickets.Ticket;

import java.io.IOException;
import java.util.Scanner;

public class PersonMenu {
    Scanner scanner = new Scanner(System.in);

    public void personMenu() throws IOException {

        System.out.println("Kupujesz bilet osobowy. Imię i nazwisko: ");
        String owner = scanner.nextLine().toLowerCase();
        System.out.println("Podaj wiek podróżującego:");
        int age = scanner.nextInt();
        Ticket ticket = parsePerson(age, owner);
        ticket.ownerData();
        Basket.INSTANCE.addBalance(ticket.getPrice());
        Basket.INSTANCE.addNewTicket(ticket);
        System.out.println("Za bilet zapłacisz: " + ticket.getPrice() + " zł. Na promie zostało: "
                + Basket.INSTANCE.getLeftQuantity() + " jednostek miejsca." );
        new RepeatBuying().repeatBuying();
    }

    public Ticket parsePerson(int age, String owner) {
        if (age > 0 && age <= 3) return new ChildTicket(owner);
        if (age > 3 && age < 18) return new YoungTicket(owner);
        if (age > 18 && age < 70) return new AdultTicket(owner);
        if (age >= 70) return new SeniorTicket(owner);
        else throw new IllegalArgumentException("Podałeś błędny wiek.");
    }

}
