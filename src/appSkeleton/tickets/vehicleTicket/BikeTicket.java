package TransportApp.src.appSkeleton.tickets.vehicleTicket;

import java.math.BigDecimal;

public class BikeTicket extends VehicleTicket {

    public final float unitQuantity = 15;

    public BikeTicket(String owner) {
        super(VehicleType.BIKE, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }

    @Override
    public String getSubType() {
        return "Bike";
    }

    @Override
    public float getUnitQuantity() {
        return unitQuantity;
    }

}
