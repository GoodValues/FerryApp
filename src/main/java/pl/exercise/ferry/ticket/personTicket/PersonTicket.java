package pl.exercise.ferry.ticket.personTicket;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.Ticket;

public abstract class PersonTicket implements Ticket {

    //private BigDecimal price;

   /* public PersonTicket(BigDecimal price) {
        this.price = price;
    }*/

    private PaxType paxType;
    private String owner;
    private String personType;

    public PersonTicket(PaxType paxType, String owner) {
        this.paxType = paxType;
        this.owner = owner;
    }

    @Override
    public String getType() {
        return "Person";
    }
}
