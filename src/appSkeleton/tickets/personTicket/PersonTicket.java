package TransportApp.src.appSkeleton.tickets.personTicket;

import TransportApp.src.appSkeleton.tickets.Ticket;

import java.math.BigDecimal;

public abstract class PersonTicket implements Ticket {

    private PaxType paxType;
    private String owner;
    private String personType;
    private BigDecimal price;

    public PersonTicket(PaxType paxType, String owner) {
        this.paxType = paxType;
        this.owner = owner;
    }

    @Override
    public String getType() {
        return "Person";
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

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
