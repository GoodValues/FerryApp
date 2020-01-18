package pl.exercise.ferry;

import pl.exercise.ferry.ticket.Ticket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Ticket> tickets;
    BigDecimal balance = BigDecimal.ZERO;
    Ticket ticket;

    public Basket() {
        this.tickets = new ArrayList<>();
    }

    public void addToPrice(BigDecimal price) {
        this.balance=balance.add(price);
    }

    public void addToBasket (Ticket ticket) {
        tickets.add(ticket);
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
