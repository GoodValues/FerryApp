package pl.exercise.ferry.ticket;

import pl.exercise.ferry.Singleton;
import pl.exercise.ferry.screen.MainScreen;

import java.math.BigDecimal;
import java.util.Scanner;

public class RepeatBuying {
    Scanner scanner = new Scanner(System.in);

    public void repeatBuying () {
        boolean repaetBuying;
        System.out.println("Czy chcesz kupić kolejny bilet?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("tak")) repaetBuying = true;
        if (answer.equalsIgnoreCase("nie")) {
            repaetBuying = false;
            System.out.println("Dziękujemy za zakupy.");
            System.out.println();
            new MainScreen().interact();
        }
    }
}
