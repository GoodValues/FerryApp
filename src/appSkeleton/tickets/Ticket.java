package TransportApp.src.appSkeleton.tickets;

import java.math.BigDecimal;

public interface Ticket {

  BigDecimal getPrice();
  String getType();
  String getSubType();
  String ownerData();
  void setOwner(String owner);
  void setPrice(String price);
  float getUnitQuantity();
}
