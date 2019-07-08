package pl.exercise.ferry.screen;

import java.util.Scanner;

public class MainScreen implements Screen {

  private final Scanner in = new Scanner(System.in);

  public void interact() {
    System.out.println("To jak, do bierzemy się za robote?");
    String firstResponse = in.nextLine();
    if ("tak".equalsIgnoreCase(firstResponse)) {
      System.out.println("To super!");
    }
  }
}
