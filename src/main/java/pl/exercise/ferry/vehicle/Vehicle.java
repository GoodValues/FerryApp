package pl.exercise.ferry.vehicle;

public abstract class Vehicle {
  private final VehicleType vehicleType;
  private final String owner;

  Vehicle(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }
}
