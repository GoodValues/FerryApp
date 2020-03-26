package TransportApp.src.appSkeleton;

import TransportApp.src.appSkeleton.screen.MainScreen;

import java.io.IOException;

public class TransportAppMain {

  public static void main(String[] args) throws IOException {
    MainScreen mainScreen = new MainScreen();
    mainScreen.interact();
  }
}

