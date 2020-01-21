package pl.exercise.ferry.ticket.personTicket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class AdultTicket extends PersonTicket {

    public AdultTicket(String owner) {
        super(PaxType.ADULT, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }

    @Override
    public String getSubType() {
        return "Adult";
    }
}
