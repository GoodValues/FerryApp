package pl.exercise.ferry.ticket.personTicket;

import java.math.BigDecimal;

public class YoungTicket extends PersonTicket {

    public final float unitQuantity = 10;

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

    @Override
    public float getUnitQuantity() {
        return unitQuantity;
    }

}
