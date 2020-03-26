package TransportApp.src.appSkeleton.tickets.vehicleTicket;

import java.math.BigDecimal;

public class CarTicket extends VehicleTicket {

    public final float unitQuantity = 30;

    public CarTicket( String owner) {
        super(VehicleType.CAR, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(20);
    }

    @Override
    public String getSubType() {
        return "Car";
    }

    @Override
    public float getUnitQuantity() {
        return unitQuantity;
    }

}
