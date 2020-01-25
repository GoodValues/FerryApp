package pl.exercise.ferry.ticket.cargoTicket;

import pl.exercise.ferry.ticket.TicketType;

import java.math.BigDecimal;

public class StandardTicket extends CargoTicket {

    private float size;
    private float unitQuantity = (float) Math.ceil(5 * size);

    public StandardTicket(float size, String owner) {
        super(CargoType.STANDARD, owner);
        this.size = size;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(50).multiply(BigDecimal.valueOf(size));
    }

    @Override
    public String getSubType() {
        return "Standard";
    }

    public float getUnitQuantity() {
        return unitQuantity;
    }

}
