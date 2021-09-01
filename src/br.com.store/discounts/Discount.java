package br.com.store.discounts;

import br.com.store.budgets.Budget;

import java.math.BigDecimal;

//Using template method concept
public abstract class Discount {
    protected Discount nextDiscount;

    public Discount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public BigDecimal calculate(Budget budget) {
        if (shouldApplyDiscount(budget)) {
            return applyCalculus(budget);
        }
        return nextDiscount.calculate(budget);
    }

    public abstract BigDecimal applyCalculus(Budget budget);

    public abstract boolean shouldApplyDiscount(Budget budget);
}