package pl.exercise.ferry.prom;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.ticket.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Prom {

    private final float quantity = 1000;
    private float leftQuantity = 1000;

    List<Ticket> listOfTickets = new ArrayList<>();
//    List<Ticket> listOfTickets = Basket.INSTANCE.listOfTickets();

    public Prom(PromNames promName) {

    }

    public List<Ticket> getListOfTickets() {
        return listOfTickets;
    }


    public float getLeftQuantity() {

        for(Ticket ticket : listOfTickets) {
            leftQuantity = leftQuantity - ticket.getUnitQuantity();
        }
        return leftQuantity;
    }

    public boolean checkCanAddNewTicket(Ticket ticket) {
        if(ticket.getUnitQuantity()>leftQuantity) return false;
        return true;
    }

}
