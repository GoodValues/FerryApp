package TransportApp.src.appSkeleton.discount;

import TransportApp.src.appSkeleton.Basket;
import TransportApp.src.appSkeleton.tickets.Ticket;

import java.math.BigDecimal;
import java.util.List;

//co najmniej 2 samochody - 10% zniżki na oba bilety
public class TwoCars10percent implements Discounts {

    @Override
    public BigDecimal getBalance() {

        List<Ticket> tickets = Basket.INSTANCE.listOfTickets();
        BigDecimal percentOfDiscount = BigDecimal.valueOf(0.10);
        BigDecimal carPrice = BigDecimal.valueOf(20);

        int car = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getSubType().equals("Car")) {
                car++;
            }
        }
        BigDecimal balance = Basket.INSTANCE.getBalance();
        if (car >= 2) {
            balance = balance.subtract((BigDecimal.valueOf(car).multiply(carPrice).multiply(percentOfDiscount)));
        }

        return balance;
    }
}
