package TransportApp.src.appSkeleton.boats;

import TransportApp.src.appSkeleton.tickets.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Prom {

    private float leftQuantity = 1000;

    List<Ticket> listOfTickets = new ArrayList<>();
//    List<Ticket> listOfTickets = Basket.INSTANCE.listOfTickets();
    PromNames promname;

    public Prom(PromNames promName) {
        this.promname=promName;
    }

    public List<Ticket> getListOfTickets() {
        return listOfTickets;
    }


    public void subtructFromLeftQuantity(float quantity) {

            leftQuantity = leftQuantity - quantity;
    }

    public boolean checkCanAddNewTicket(Ticket ticket) {
        if(ticket.getUnitQuantity()>leftQuantity) return false;
        return true;
    }

    public PromNames getPromName() {
        return promname;
    }

    public float getLeftQuantity() {
        return leftQuantity;
    }
}
