package pl.exercise.ferry.ticket.vehicleTicket;

import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;

public class BusTicket extends VehicleTicket {

    private float length;

    public BusTicket(float length, String owner) {
        super(VehicleType.BUS, owner);
        this.length=length;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5).multiply(BigDecimal.valueOf(length));
    }
}
