package pl.exercise.ferry.ticket.vehicleTicket;

import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;

public class BikeTicket extends VehicleTicket {

    public BikeTicket(String owner) {
        super(VehicleType.BIKE, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }
}
