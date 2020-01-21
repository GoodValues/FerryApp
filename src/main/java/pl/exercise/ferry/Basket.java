package pl.exercise.ferry;

import pl.exercise.ferry.ticket.Ticket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    public static final Basket INSTANCE = new Basket();
    private BigDecimal balance = BigDecimal.ZERO;
    private List<Ticket> tickets = new ArrayList<>();
    private String ticketType;
    private String ticketSubtype;

    private Basket() {
    }

    public void addBalance(BigDecimal price){
        this.balance = balance.add(price);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addNewTicket (Ticket ticket) {
        tickets.add(ticket);
    }

    public List listOfTickets() {
        return tickets;
    }






}

