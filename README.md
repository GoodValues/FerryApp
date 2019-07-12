### Wprowadzenie
Naszej firmie udało się uzyskać nowe i ekscytujące zlecenie, mamy zbudować system opłat dla przewoźnika morskiego. Nasz klient jest właścicielem firmy oferującej przewóz ludzi, pojazdów i towarów drogą morską. Naszym zadaniem jest zaprojektowanie i wykonanie systemu poboru opłat za taką usługę. 

### Podstawowe wytyczne
Podstawowy interfejs może być wykonany na podstawie konsoli i interakcji z nią. W trakcie poszczególnych zadań będziemy posługiwali się terminem ekran pod tym pojęciem rozumiem wydruk z konsoli możliwych komend i oczewkianie na informacje od użytkownika np: 
```

-------------------------------------------
Witamy w systemie twój rejs, wybierz akcję:
1. Utworzenie nowego rejsu
2. Odczyt zapisanych danych rejsu
3. Wyszukanie uczestnika rejsu
...
1 // użytkownik wybiera pierwszą opcję i konsola drukuje interfejs zgodnie w wyborem
-------------------------------------------
Witamy w systemie twój rejs, wybierz akcję:
1. Dodanie osoby do rejsu
2. Dodanie pojazdu do rejsu
3. Dodanie towaru do rejsu
4. Zakończenie rejsu
5. Odczyt zapisanych danych rejsu
6. Wyszukanie uczestnika rejsu
```
Podczas samego zadania, klient wymaga od nas aby kod był jak najwyższej jakości, do pomocy nam przyjdą wzorce projektowe, a cały kod postaramy się pokryć testami, które pozwolą nam ze spokojnym sumieniem wdrożyć aplikację na produkcję. Pamiętajcie, nie ma programistów którzy wiedzą wszystko, nie bójcie się korzystać z zewnętrznych źródeł czy nawet bibliotek.

### Zadania
#### Przygotowanie podstawowego interfejsu
Zadanie to polega na przygotowaniu podstawowego interfejsu na kontakt z użytkownikiem, na tym etapie projektowania aplikacji, wystarczający będzie kontakt za pomocą konsoli. `System.out` drukuje pytania w konsoli, natomiast `new Scanner(System.in)` przyjmuje odpowiedzi. Do wykonania będzie:
- Uzyskanie informacji o rodzaju biletu, osoba czy pojazd, po wyborze, przeniesienie do odpowiedniego ekranu po czym  danie możliwości powrotu do poprzedniego ekranu.
######Podpowiedź: Można wykorzystać wzorzec projektowy strategia i fabryka abstrakcyjna.
#### Napisanie obsługi sprzedaży bilety dla osoby
W ekranie osoby, musimy poprosić o wiek, w zależności od niego dostosować cenę biletu, wyświetlić ją na ekranie i dać możliwość powrotu do ekranu głównego. 

**Stawki**:
- do 3 lat: 0zł
- od 3 do 18 lat: 5zł
- od 18 do 70 lat: 10zł
- powyżej 70 lat: 5zł
######Podpowiedź: Można wykorzystać wzorzec projektowy visitor i factory.
#### Napisanie obsługi sprzedaży biletu dla pojazdu
W ekranie pojazdu, musimy wybrać typ pojazdu, w zależności od wybranego typu w taki sposób naliczane będą opłaty za przejazd.

**Stawki**:
- osobowy: 20zł
- motor: 10zł
- ciężarówka: 10zł za **tonę**
- autobus: 5zł za **metr**

Więc w ekranie pojazdu, pytamy o rodzaj pojazdu, w zależności od rodzaju, możemy ale nie musimy zadać dodatkowe pytanie, np o ciężar czy długość, wyświetlamy naliczoną cenę, po czym dajemy możliwość powrotu do poprzedniego ekranu.
######Podpowiedź: Można wykorzystać wzorzec projektowy visitor i factory.
#### Dodanie obsługi stanu aplikacji
Do tej pory wszystkie akcje które wykonywaliśmy były "jednorazowe", naszym kolenym zadaniem jest dodanie stanu. Pod pojęciem stan rozumiem modyfikację ekranu głównego o możliwość rozpoczęcia sesji sprzedaży i wyświetlanie całkowitego salda transakcji w ramach jednej sesji. Spowoduje to że każdy powrót do ekranu głównego z ekranu bieltu nie spowoduje zapomnienia kwoty biletu a powiększenie aktualnego salda o kwotę wyliczoną w ekranie biletu.
######Podpowiedź: Można wykorzystać wzorzec projektowy singleton.
#### Dodanie obsługi wyświetlenia dokładnego stanu aplikacji
Ekran główny powinien posiadać możliwość wyświetlenia aktualnego stanu aplikacji. Pod tym pojęciem rozumiem dodanie możliwości wyświetlenia wszystkich dotychczasowych transakcji. Czli typu biletu (pojazd/osoba), rodzaju (dziecko/nastolatek/ciężarówka/motor) biletu oraz jego całkowitej ceny.
#### Dodanie obsługi zapisania stanu aplikacji
Ekran główny powinien posiadać opcję zapisu całego obecnego stanu aplikacji. Zapisać powinniśmy do pliku tak aby w przyszłości móc go odczytać.
#### Odczytanie stanu poprzednich sesji
Ekran główny powinien mieć możliwość przywrócenia dowolnej sesji zapisanej w pliku, po wyborze opcji powinny wyświetlić nam się dostępne pliki zapisu. Po wyborze dowolnego z nich, zapisana sesja powinna być przywrócona, i wszystkie możliwe opcje dotyczące sesji powinny być aktywne (sprawdzenie stanu/dodanie blietu itp.).
#### Zakończenie sesji
Powinniśmy mieć możliwość zakończenia obecnej sesji, co powoduje zapisanie do pliku i wyczyszczenie wszystkich danych w pamięci aplikacji związanych z nią.
#### Testy jednostkowe
Powinniśmy napisać testy jednostkowe pokrywające wszystkie klasy serwisowe, a więc wszystkie metody przeliczeniowo-pomocnicze.
#### Zadania dodatkowe
- Dodajmy obsługę przewozu towaru, wyliczanie ceny na podstawie i ciężaru i objętości - 50 zł za m3.
- Dodajmy możliwość wyszukiwania osób po imieniu i nazwisku we wszystkich rejsach, tak więc osoba musi dostać kontekst nazwy, a stan musi wzbogacić się o jego przechowywanie. Wszytko to musi być zapisane podczas kończenia poszczególnych sesji.
- Dodajmy łączenie pojazdu z właścicielem który też płynie danym promem, i ograniczenie unimożliwiające dodanie auta bez właściciela.
- Niech każdy rejs będzie powiązany z promem. Promy mają jednostki miejsca. Każdy prom może przewieźć 1000 jednostek, człowiek zabiera 5/10 jednostek, pojazdy 15/30/50 a towar 5 za m3, wprowadźmy możliwość sprawdzenia ile promowi zostało miejsca, oraz walidację przy sprzedaży kolejnego biletu, czy na promie będzie miejsce biorąc pod uwagę dotychczasowe sprzedane bilety.  
### Pomoce

####Wzorce projektowe do wykorzystania:
1. Singleton:

    ```
    public enum EnumIvoryTower {
       INSTANCE;
       
       String foo = "test";
       
       String getFoo() {
        return foo;
     }
     
     EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
     EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
     assertEquals(enumIvoryTower1, enumIvoryTower2); // true
     assertEquals(enumIvoryTower1.getFoo(), "test");
     ```
 2. Strategy
    ```
      public interface TextFormatterStrategy {
    
        public String format(String text);
      }
    
      public class LowerCaseFormatter implements TextFormatterStrategy {
    
        public String format(String text) {
          return text.toLowerCase();
        }
      }
    
      public class UpperCaseFormatter implements TextFormatterStrategy {
    
        public String format(String text) {
          return text.toUpperCase();
        }
      }
    
      public class FormatterContext {
    
        private TextFormatterStrategy strategy;
    
        public void set(TextFormatterStrategy strategy) {
          this.strategy = strategy;
        }
    
        public void print(String text) {
          String formattedText = strategy.format(text);
          System.out.println(formattedText);
        }
      }
    
      public class Client {
    
        private static final String TEXT = "Strategy Design Pattern";
    
        public static void main(String[] args) {
          FormatterContext context = new FormatterContext();
    
          context.set(new CapitalizeFormatter());
          context.print(TEXT);
    
          context.set(new UpperCaseFormatter());
          context.print(TEXT);
    
          context.set(new LowerCaseFormatter());
          context.print(TEXT);
        }
      }
    ```
    więcej informacji i źródło: https://javadeveloper.pl/wzorzec-strategia/
3. Visitor - to wzór z gwiazdką, trudniejszy ale niezwykle satysfakcjonujący
    ```
    public class Customer {
     //...
     public <T> T accept(CustomerVisitor<T> visitor){
      return visitor.visit(this);
     }
     //...
    }
    public interface CustomerVisitor<T> {
     T visit(NormalCustomer customer);
     T visit(VipCustomer customer);
     T visit(GroupCustomer customer);
    }
    public class InvitationLetterGeneratorVisitor implements CustomerVisitor<Letter> {
     Letter visit(NormalCustomer customer) {/*...*/}
     Letter visit(VipCustomer customer) {/*...*/}
     Letter visit(GroupCustomer customer) {/*...*/}
     }
     public class LetterService {
     
     public Letter generateInvitationLetter(Customer customer){
      return customer.accept(this);
     }
     }
    ```
    źródło: https://www.nurkiewicz.com/2009/03/wzorzec-visitor-realny-przykad.html
4. Abstract Factory
    ```
    public interface Animal {
        String getAnimal();
        String makeSound();
    }
    public class Duck implements Animal {
     
        @Override
        public String getAnimal() {
            return "Duck";
        }
     
        @Override
        public String makeSound() {
            return "Squeks";
        }
    }
    public interface AbstractFactory<T> {
        T create(String animalType) ;
    }
    public class AnimalFactory implements AbstractFactory<Animal> {
     
        @Override
        public Animal create(String animalType) {
            if ("Dog".equalsIgnoreCase(animalType)) {
                return new Dog();
            } else if ("Duck".equalsIgnoreCase(animalType)) {
                return new Duck();
            }
     
            return null;
        }
     
    }
    public class FactoryProvider {
        public static AbstractFactory getFactory(String choice){
             
            if("Animal".equalsIgnoreCase(choice)){
                return new AnimalFactory();
            }
            else if("Color".equalsIgnoreCase(choice)){
                return new ColorFactory();
            }
             
            return null;
        }
    }
    ```
    żródło: http://www.braintelligence.pl/wzorce-projektowe-factory/, https://www.baeldung.com/java-abstract-factory-pattern
6. Factory
    ```
    public interface Polygon {
        String getType();
    }
    public class PolygonFactory {
        public Polygon getPolygon(int numberOfSides) {
            if(numberOfSides == 3) {
                return new Triangle();
            }
            if(numberOfSides == 4) {
                return new Square();
            }
            if(numberOfSides == 5) {
                return new Pentagon();
            }
            if(numberOfSides == 7) {
                return new Heptagon();
            }
            else if(numberOfSides == 8) {
                return new Octagon();
            }
            return null;
        }
    }
    ```
    źródło: https://www.baeldung.com/creational-design-patterns
5. Builder
    ```
    public class BankAccount {
         
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;
     
        // constructors/getters
         
        public static class BankAccountBuilder {
             
            private String name;
            private String accountNumber;
            private String email;
            private boolean newsletter;
             
            public BankAccountBuilder(String name, String accountNumber) {
                this.name = name;
                this.accountNumber = accountNumber;
            }
         
            public BankAccountBuilder withEmail(String email) {
                this.email = email;
                return this;
            }
         
            public BankAccountBuilder wantNewsletter(boolean newsletter) {
                this.newsletter = newsletter;
                return this;
            }
             
            public BankAccount build() {
                return new BankAccount(this);
            }
        }
    }
    BankAccount newAccount = new BankAccount
      .BankAccountBuilder("Jon", "22738022275")
      .withEmail("jon@example.com")
      .wantNewsletter(true)
      .build();
    ```
    żródło: https://www.baeldung.com/creational-design-patterns
6. Testy jednostkowe:
W strukturze projektu obok katalogu main mamy jego odbicie w postaci tests, to jest miejsce w którym odwzorowujemy strukturę katalogu projektowego. Przydatnym skrótem w InteliJ jest Ctrl+Shift+T, automatyczne utworzenie klasy testowej w odpowiednim miejscu.
```
@Test
public void twoIsEqualToTwo() {
  assertEquals(twoService.getTwo(), 2);
}

```