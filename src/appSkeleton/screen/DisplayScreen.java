package TransportApp.src.appSkeleton.screen;

import TransportApp.src.appSkeleton.Basket;
import TransportApp.src.appSkeleton.discount.LogicOfDiscounts;
import TransportApp.src.appSkeleton.tickets.Ticket;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;


public class DisplayScreen {

    Scanner scanner = new Scanner(System.in);

    List<Ticket> tickets = Basket.INSTANCE.listOfTickets();

    public void display() throws IOException {
        for (Ticket ticket : tickets) {
            System.out.println("Kupiłeś bilet dla: " + ticket.ownerData()
                    + " , typu: " + ticket.getType()
                    + ", podtypu: " + ticket.getSubType()
                    + ", kwota: " + ticket.getPrice() + " zł. ");
        }
        System.out.println("Łączna kwota transakcji to: " + Basket.INSTANCE.getBalance() + " zł.");
    }

    public void displayFinalData() throws IOException {
        display();
        LogicOfDiscounts logicOfDiscounts = new LogicOfDiscounts();
        logicOfDiscounts.displayBalance();
    }

    public void displayForSpecificUser() throws IOException {
        System.out.println("Podaj imię i nazwisko użytkownika:");
        String name = scanner.nextLine().toLowerCase();

        BigDecimal totalForUser = BigDecimal.ZERO;
        for (Ticket ticket : tickets) {
            if (ticket.ownerData().equalsIgnoreCase(name)) {
                System.out.println("Kupiłeś bilet dla: " + ticket.ownerData()
                        + " , typu: " + ticket.getType()
                        + ", podtypu: " + ticket.getSubType()
                        + ", kwota: " + ticket.getPrice() + " zł. ");
                totalForUser = totalForUser.add(ticket.getPrice());
            }
        }
        System.out.println("Łączna kwota rejsów dla użytkownika to: " + totalForUser + " zł.");
    }


}
