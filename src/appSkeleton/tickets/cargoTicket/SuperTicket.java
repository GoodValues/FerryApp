package TransportApp.src.appSkeleton.tickets.cargoTicket;

import java.math.BigDecimal;

public class SuperTicket extends CargoTicket {

    private float size;
    private float unitQuantity;

    public SuperTicket(float size, String owner) {
        super(CargoType.SUPER, owner);
        this.size = size;
        this.unitQuantity = (float) Math.ceil(5 * size);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(40).multiply(BigDecimal.valueOf(size));
    }

    @Override
    public String getSubType() {
        return "Super";
    }

    public float getUnitQuantity() {
        return unitQuantity;
    }


}
