package TransportApp.src.appSkeleton.tickets.vehicleTicket;

import java.math.BigDecimal;
import java.util.Scanner;

import TransportApp.src.appSkeleton.tickets.Ticket;

public abstract class VehicleTicket implements Ticket {
  Scanner scanner = new Scanner(System.in);

  private final VehicleType vehicleType;
  private String owner;
  private BigDecimal price;

  public VehicleTicket(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }

  @Override
  public String getType() {
    return "Vehicle";
  }

  @Override
  public String ownerData() {
    return owner;
  }

  @Override
  public void setOwner(String owner) {
      this.owner=owner;
  }

  @Override
  public void setPrice(String price) {
    this.price = new BigDecimal(price);
  }

}
