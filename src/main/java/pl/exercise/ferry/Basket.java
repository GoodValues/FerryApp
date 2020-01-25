package pl.exercise.ferry;

import pl.exercise.ferry.prom.Prom;
import pl.exercise.ferry.prom.PromNames;
import pl.exercise.ferry.ticket.Ticket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {

    public static final Basket INSTANCE = new Basket();
    private BigDecimal balance = BigDecimal.ZERO;
    private Prom prom = new Prom(PromNames.JAGIENKA);
//    private List<Ticket> tickets = new ArrayList<>();


    private Basket() {
    }

    public void addBalance(BigDecimal price){
        this.balance = balance.add(price);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance=balance;
    }


    public void addNewTicket (Ticket ticket) {
        prom.getListOfTickets().add(ticket);
    }

    public List listOfTickets() {
        return prom.getListOfTickets();
    }






}

