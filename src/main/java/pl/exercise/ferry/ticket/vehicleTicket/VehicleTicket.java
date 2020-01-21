package pl.exercise.ferry.ticket.vehicleTicket;

import java.math.BigDecimal;

import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.vehicle.VehicleType;

public abstract class VehicleTicket implements Ticket {

  private final VehicleType vehicleType;
  private final String owner;

  public VehicleTicket(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }

  @Override
  public String getType() {
    return "Vehicle";
  }



}
