package TransportApp.src.appSkeleton.discount;

import TransportApp.src.appSkeleton.Basket;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

// Wzorzec projektowy strategia.
public class LogicOfDiscounts {

    FormatterContext context = new FormatterContext();
    Map<String, BigDecimal> mapOfDiscounts = new HashMap<>();
    String nameOfDiscount;

    public BigDecimal getBalance() {

            context.set(new AdultAndChild20Percent());
            mapOfDiscounts.put(context.getClassName(), context.getBalance());

            context.set(new FivePerson10Percent());
            mapOfDiscounts.put(context.getClassName(), context.getBalance());

            context.set(new TwoCars10percent());
            mapOfDiscounts.put(context.getClassName(), context.getBalance());

        BigDecimal balance = Basket.INSTANCE.getBalance();

        for (Map.Entry<String, BigDecimal> entry : mapOfDiscounts.entrySet()) {
            String discount = entry.getKey();
            BigDecimal balanceAfterDiscount = entry.getValue();
            if (balanceAfterDiscount.compareTo(balance) < 0) {
                balance = balanceAfterDiscount;
                setNameOfDiscount(discount);
            }
        }

        return balance;
    }

    private void setNameOfDiscount(String nameOfDiscount) {
        this.nameOfDiscount = nameOfDiscount;
    }

    public String getNameOfDiscount() {
        return nameOfDiscount;
    }

    public void displayBalance() {
        if (getBalance().compareTo(Basket.INSTANCE.getBalance()) == 0) System.out.println("Nie przyznano dodatkowego rabatu. Kwota do zapłąty wynosi: " + getBalance() + " zł.");
        else System.out.println("Łączna kwota do zapłaty po uwzględnieniu najkorzystniejszego dla Państwa rabatu (typ: " + getNameOfDiscount() + ") wynosi: " + getBalance() + " zł.");
    }
}
