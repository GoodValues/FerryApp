package pl.exercise.ferry.ticket.vehicleTicket;

import pl.exercise.ferry.ticket.vehicleTicket.VehicleTicket;
import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;

public class TruckTicket extends VehicleTicket {

    private float weight;
    public final float unitQuantity = 50;

    public TruckTicket(float weight, String owner) {
        super(VehicleType.TRUCK, owner);
        this.weight=weight;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10).multiply(BigDecimal.valueOf(weight));
    }

    @Override
    public String getSubType() {
        return "Truck";
    }

    @Override
    public float getUnitQuantity() {
        return unitQuantity;
    }


}
