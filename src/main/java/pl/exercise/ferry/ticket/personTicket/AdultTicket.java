package pl.exercise.ferry.ticket.personTicket;

import java.math.BigDecimal;

public class AdultTicket extends PersonTicket {

    public final float unitQuantity = 10;

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

    @Override
    public float getUnitQuantity() {
        return unitQuantity;
    }

}
