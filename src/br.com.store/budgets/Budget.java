package br.com.store.budgets;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;

    private int itemsCount;

    public Budget(BigDecimal value, int itemsCount) {
        this.value = value;
        this.itemsCount = itemsCount;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public int getItemsCount() {
        return this.itemsCount;
    }
}