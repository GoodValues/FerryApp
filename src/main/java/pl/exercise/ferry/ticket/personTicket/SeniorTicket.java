package pl.exercise.ferry.ticket.personTicket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class SeniorTicket extends PersonTicket {


    public SeniorTicket(String owner) {
        super(PaxType.SENIOR, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }
}
