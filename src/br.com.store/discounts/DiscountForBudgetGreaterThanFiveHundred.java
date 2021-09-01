package br.com.store.discounts;

import java.math.BigDecimal;
import br.com.store.budgets.Budget;

public class DiscountForBudgetGreaterThanFiveHundred extends Discount {

    private static final int ZERO = 0;

    public DiscountForBudgetGreaterThanFiveHundred(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyCalculus(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldApplyDiscount(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > ZERO;
    }

}
