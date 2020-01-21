package pl.exercise.ferry.screen;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.personTicket.PersonTicket;

import java.util.List;


public class DisplayScreen {

    Basket basket;
    PersonTicket personTicket;
    Ticket ticket;
    List<Ticket> tickets = basket.INSTANCE.listOfTickets();

    public void display() {
        // osoba/maszyna, typ osoby/typ maszyny, saldo
        for (Ticket ticket : tickets) {
            System.out.println("Bilet typu: " + ticket.getType() + ", podtypu: " + ticket.getSubType() + ", a saldo wynosi: " + Basket.INSTANCE.getBalance());
        }
    }

    /*public String getDataToString() {
       return display();
    }*/
}
