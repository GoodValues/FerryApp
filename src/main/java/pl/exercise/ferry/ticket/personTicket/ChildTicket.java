package pl.exercise.ferry.ticket.personTicket;

import java.math.BigDecimal;

public class ChildTicket extends PersonTicket {

    public final float unitQuantity = 5;

    public ChildTicket(String owner) {
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

    @Override
    public float getUnitQuantity() {
        return unitQuantity;
    }


}
