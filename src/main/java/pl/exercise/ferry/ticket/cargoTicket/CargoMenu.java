package pl.exercise.ferry.ticket.cargoTicket;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.ticket.RepeatBuying;
import pl.exercise.ferry.ticket.Ticket;

import java.io.IOException;
import java.util.Scanner;

public class CargoMenu {

    Scanner scanner = new Scanner(System.in);

    public void cargoMenu() throws IOException {
        System.out.println("Kupiłeś bilet na ładunek. Podaj imię i nazwisko:");
        String owner = scanner.nextLine().toLowerCase();
        float size = sizeCargo();
        Ticket ticket = parseCargo(size, owner);
        ticket.ownerData();
        System.out.println("Za bilet zapłacisz: " + ticket.getPrice() + " zł.");
        Basket.INSTANCE.addBalance(ticket.getPrice());
        Basket.INSTANCE.addNewTicket(ticket);
        new RepeatBuying().repeatBuying();
    }

    private float sizeCargo(){
        System.out.println("Podaj długość ładunku (w metrach): ");
        float length = scanner.nextFloat();
        System.out.println("Podaj szerokość ładunku (w metrach): ");
        float width = scanner.nextFloat();
        System.out.println("Podaj wysokość ładunku (w metrach): ");
        float height = scanner.nextFloat();
        float size = length * width * height;
        return size;
    }

    public Ticket parseCargo(float size, String owner){
        if (size < 20)
        return new StandardTicket(size, owner);
        else return new SuperTicket(size, owner);
    }
}
