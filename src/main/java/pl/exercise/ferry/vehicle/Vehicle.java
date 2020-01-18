package pl.exercise.ferry.vehicle;

public abstract class Vehicle {
  private final VehicleType vehicleType;

  Vehicle(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }
}
