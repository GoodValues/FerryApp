package pl.exercise.ferry.ticket.personTicket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public class YoungTicket extends PersonTicket {

    public YoungTicket(String owner) {
        super(PaxType.YOUNG, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }

    @Override
    public String getSubType() {
        return "Young";
    }
}
