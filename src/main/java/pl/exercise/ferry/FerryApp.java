package pl.exercise.ferry;

import pl.exercise.ferry.screen.MainScreen;
import pl.exercise.ferry.ticket.Ticket;

import java.math.BigDecimal;

public class FerryApp {

  public static void main(String[] args) {
    MainScreen mainScreen = new MainScreen();
    mainScreen.interact();
  }
}
