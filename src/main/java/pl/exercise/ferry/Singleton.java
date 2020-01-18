package pl.exercise.ferry;

import java.math.BigDecimal;

public class Singleton {

    public static final Singleton INSTANCE = new Singleton();
    private BigDecimal balance = BigDecimal.valueOf(0);

    private Singleton() {
    }

    public void addBalance(BigDecimal price){
        this.balance = balance.add(price);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
