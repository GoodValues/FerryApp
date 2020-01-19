package pl.exercise.ferry;

import java.math.BigDecimal;

public class Singleton {

    public static final Singleton INSTANCE = new Singleton();
    private BigDecimal balance = BigDecimal.ZERO;
    private String ticketType;
    private String ticketSubtype;

    private Singleton() {
    }

    public void addBalance(BigDecimal price){
        this.balance = balance.add(price);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}

