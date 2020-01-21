package pl.exercise.ferry.ticket.personTicket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class ChildTicket extends PersonTicket {

    public ChildTicket( String owner) {
        super(PaxType.CHILD, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(0);
    }

    @Override
    public String getSubType() {
        return "Child";
    }
}
