package pl.exercise.ferry;

import pl.exercise.ferry.screen.MainScreen;

import java.io.IOException;

public class FerryApp {

  public static void main(String[] args) throws IOException {
    MainScreen mainScreen = new MainScreen();
    mainScreen.interact();
  }
}

