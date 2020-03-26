package TransportApp.src.appSkeleton.discount;

import javafx.scene.effect.Light;

import java.math.BigDecimal;

// Wzorzec projektowy strategia.
public class FormatterContext {

    private Discounts strategy;

    public void set(Discounts strategy){
        this.strategy = strategy;
    }

    public BigDecimal getBalance() {
        BigDecimal balance = strategy.getBalance();
        return balance;
    }

    public String getClassName() {
        return strategy.getClass().getSimpleName();
    }

}
