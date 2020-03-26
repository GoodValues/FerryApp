package TransportApp.src.appSkeleton;

import TransportApp.src.appSkeleton.boats.Prom;
import TransportApp.src.appSkeleton.boats.PromNames;
import TransportApp.src.appSkeleton.tickets.Ticket;

import java.math.BigDecimal;
import java.util.List;

public class Basket {

    public static final Basket INSTANCE = new Basket();

    private BigDecimal balance = BigDecimal.ZERO;
    public static int a = 0;
    List<Prom> proms = List.of(new Prom(PromNames.JAGIENKA), new Prom(PromNames.MIESZKO), new Prom(PromNames.ZBYSZKO));

    private Basket() {
    }

    public void addBalance(BigDecimal price) {
        this.balance = balance.add(price);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


    public void addNewTicket(Ticket ticket) {

        if (proms.get(a).getLeftQuantity() - ticket.getUnitQuantity() < 0) {
            a++;
            if (a > proms.size()) {
                System.out.println("Brak wolnych promów.");
                return;
            }
            System.out.println("To zamówienie zostanie przewiezione na nowym promie o nazwie: " + proms.get(a).getPromName().name());
        }
        proms.get(a).getListOfTickets().add(ticket);
        proms.get(a).subtructFromLeftQuantity(ticket.getUnitQuantity());
    }

    public List listOfTickets() {
        return proms.get(a).getListOfTickets();
    }

    public float getLeftQuantity() {
        return proms.get(a).getLeftQuantity();
    }

    public List getListOfProms() {
        return proms;
    }

}

