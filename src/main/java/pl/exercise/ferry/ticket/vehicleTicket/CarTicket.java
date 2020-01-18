package pl.exercise.ferry.ticket.vehicleTicket;

import pl.exercise.ferry.vehicle.VehicleType;

import java.math.BigDecimal;

public class CarTicket extends VehicleTicket {

    public CarTicket( String owner) {
        super(VehicleType.CAR, owner);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(20);
    }
}
