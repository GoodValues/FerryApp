package pl.exercise.ferry.screen;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MainScreen {

  private final Scanner in = new Scanner(System.in);

  public void interact() {
    System.out.println("Witamy w systemie zakupu biletów, wybierz akcję: ");
    System.out.println("1 <Kup bilet>");
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
