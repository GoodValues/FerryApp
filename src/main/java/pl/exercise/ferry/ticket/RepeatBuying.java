package pl.exercise.ferry.ticket;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.screen.MainScreen;

import java.io.IOException;
import java.util.Scanner;

public class RepeatBuying {
    Scanner scanner = new Scanner(System.in);

    public void repeatBuying () throws IOException {
        boolean repaetBuying;
        System.out.println("Czy chcesz kupić kolejny bilet?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("tak")) repaetBuying = true;
        if (answer.equalsIgnoreCase("nie")) {
            repaetBuying = false;
            System.out.println("Dziękujemy za zakupy.");
            System.out.println("saldo: " + Basket.INSTANCE.getBalance());
            System.out.println();
            new MainScreen().interact();
        }
    }
}
