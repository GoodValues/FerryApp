package pl.exercise.ferry.ticket;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.screen.MainScreen;
import pl.exercise.ferry.screen.TicketScreen;

import java.io.IOException;
import java.util.Scanner;

public class RepeatBuying {
    Scanner scanner = new Scanner(System.in);

    public void repeatBuying () throws IOException {

        System.out.println("Czy chcesz kupić kolejny bilet?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("tak")) {
            new TicketScreen().interact();
        }
        if (answer.equalsIgnoreCase("nie")) {
            System.out.println("Dziękujemy za zakupy.");
            System.out.println("Łączna kwota transakcji to: " + Basket.INSTANCE.getBalance() + " zł.");
            System.out.println();
            new MainScreen().interact();
        }
    }
}
