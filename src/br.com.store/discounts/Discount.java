package br.com.store.discounts;

import br.com.store.budgets.Budget;
import java.math.BigDecimal;


public abstract class Discount {
    protected Discount nextDiscount;

    public Discount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    //Using template method concept
    public BigDecimal calculate(Budget budget) {
        if (shouldApplyDiscount(budget)) {
            return applyCalculus(budget);
        }
        return nextDiscount.calculate(budget);
    }

    protected abstract BigDecimal applyCalculus(Budget budget);
    protected abstract boolean shouldApplyDiscount(Budget budget);
}