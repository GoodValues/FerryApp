package pl.exercise.ferry.screen;

import com.sun.tools.javac.Main;
import pl.exercise.ferry.Singleton;

import java.util.Scanner;

public class MainScreen {

  private final Scanner in = new Scanner(System.in);

  public void interact() {
    System.out.println("Witamy w systemie zakupu biletów.");
    System.out.println("Aktualny status: . Kwota transakcji to: " + Singleton.INSTANCE.getBalance() + " zł.");
    System.out.println("Wybierz akcję: ");
    System.out.println("1 <Kup bilet>");
    //System.out.println("2 <Odczyt zapisanych danych>");
    //System.out.println("3 <Wyszukanie uczestnika rejsu>");
    String firstResponse = in.nextLine();
    if ("1".equalsIgnoreCase(firstResponse)) {
      TicketScreen ticketScreen = new TicketScreen();
      ticketScreen.interact(); }
    else {
      MainScreen mainScreen = new MainScreen();
      mainScreen.interact();
    }
  }
}
