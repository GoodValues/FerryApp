package TransportApp.src.appSkeleton.tickets.personTicket;

import java.math.BigDecimal;

public class SeniorTicket extends PersonTicket {

    public final float unitQuantity = 10;

    public SeniorTicket(String owner) {
        super(PaxType.SENIOR, owner);
    }


    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }

    @Override
    public String getSubType() {
        return "Senior";
    }

    @Override
    public float getUnitQuantity() {
        return unitQuantity;
    }

}
