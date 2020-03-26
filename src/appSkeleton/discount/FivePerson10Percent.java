package TransportApp.src.appSkeleton.discount;

import TransportApp.src.appSkeleton.Basket;
import TransportApp.src.appSkeleton.tickets.Ticket;

import java.math.BigDecimal;
import java.util.List;

// 10% zniżki na bilety typu Person, jeśli zakupionych biletów typu Person będzie min. 5 szt.
public class FivePerson10Percent implements Discounts {
    @Override
    public BigDecimal getBalance() {

        List<Ticket> tickets = Basket.INSTANCE.listOfTickets();
        int numberOfPeople = 0;
        BigDecimal personBalance = BigDecimal.ZERO;
        for (Ticket ticket : tickets) {
            if (ticket.getType().equals("Person")) {
                numberOfPeople++;
                personBalance = personBalance.add(ticket.getPrice());
            }
        }

        BigDecimal balance = Basket.INSTANCE.getBalance();
        if (numberOfPeople >= 5) {
            balance = balance.subtract(personBalance.multiply(BigDecimal.valueOf(0.1)));
        }

        return balance;
    }
}
