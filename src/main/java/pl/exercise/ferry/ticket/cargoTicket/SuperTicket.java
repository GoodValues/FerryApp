package pl.exercise.ferry.ticket.cargoTicket;

import java.math.BigDecimal;

public class SuperTicket extends CargoTicket {

    private float size;
    private float unitQuantity = (float)Math.ceil(5 * size);

    public SuperTicket(float size, String owner) {
        super(CargoType.SUPER, owner);
        this.size = size;
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }

    @Override
    public String getSubType() {
        return "Super";
    }

    public float getUnitQuantity() {
        return unitQuantity;
    }


}
