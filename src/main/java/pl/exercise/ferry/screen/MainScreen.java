package pl.exercise.ferry.screen;

import pl.exercise.ferry.Basket;
import pl.exercise.ferry.fileWriterAndPrinter.Printer;
import pl.exercise.ferry.fileWriterAndPrinter.Writer;

import java.io.IOException;
import java.util.Scanner;

public class MainScreen {

  private final Scanner scanner = new Scanner(System.in);
  //Basket basket = new Basket();

  public void interact() throws IOException {
    System.out.println("Witamy w systemie zakupu biletów.");
    //System.out.println("Aktualny status: . Kwota transakcji to: " + Basket.INSTANCE.getBalance() + " zł.");
    System.out.println("Wybierz akcję: ");
    System.out.println("1 <Kup bilet>");
    System.out.println("2 <Wyświetl dane>");
    System.out.println("3 <Zapisz danych>");
    System.out.println("4 <Odczytaj zapisanych danych>");
    System.out.println("5 <End>");
    String firstResponse = scanner.nextLine();
    if ("1".equalsIgnoreCase(firstResponse)) {
      TicketScreen ticketScreen = new TicketScreen();
      ticketScreen.interact(); }
    if ("2".equalsIgnoreCase(firstResponse)) {
      DisplayScreen displayScreen = new DisplayScreen();
      displayScreen.display();
      }
    if ("3".equalsIgnoreCase(firstResponse)) {
      Writer writer = new Writer();
      System.out.println("Podaj nazwę pliku z rozszerzeniem .txt: ");
      String nameOfFile = scanner.nextLine();
      writer.writeToFile(Basket.INSTANCE.listOfTickets(), nameOfFile);
      //System.out.println(Basket.INSTANCE.listOfTickets());
    }
    if ("4".equalsIgnoreCase(firstResponse)) {
      System.out.println("Podaj nazwę pliku (z podanych poniżej), z którego chcesz odczytać dane: ");
      Printer printer = new Printer();
      printer.displayNamesOfFiles();
      String nameOfFile = scanner.nextLine();
      System.out.println(printer.readExternalData(nameOfFile));
    }
    if("5".equalsIgnoreCase(firstResponse)) {
      return;
    }

    else {
      MainScreen mainScreen = new MainScreen();
      mainScreen.interact();
    }
  }
}
