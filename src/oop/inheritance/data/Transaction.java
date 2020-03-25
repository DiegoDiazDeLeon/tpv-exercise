package oop.inheritance.data;

import java.time.LocalDateTime;

public class Transaction {
    private int amountInCents;
    private Card card;
    private LocalDateTime localDateTime;

    public static Transaction builder() {
        return new TransactionBuilder();
    }

    public int getAmountInCents() {

        return amountInCents;
    }

    public void setAmountInCents(int amountInCents) {
        this.amountInCents = amountInCents;
    }

    public Card getCard() {

        return card;
    }

    public void card(Card card) {
        this.card = card;
    }

    public LocalDateTime getLocalDateTime() {

        return localDateTime;
    }

    public void localDateTime(LocalDateTime localDateTime) {

        this.localDateTime = localDateTime;
    }

}

