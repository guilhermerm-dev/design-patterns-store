package br.com.store.discounts;

import java.math.BigDecimal;
import br.com.store.budgets.Budget;

public class DiscountForBudgetGreaterThanFiveHundred extends Discount {

    private static final int ZERO = 0;

    public DiscountForBudgetGreaterThanFiveHundred(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal("500")) > ZERO) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return nextDiscount.calculate(budget);
    }

}
