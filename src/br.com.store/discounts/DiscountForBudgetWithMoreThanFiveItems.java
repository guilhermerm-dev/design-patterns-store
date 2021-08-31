package br.com.store.discounts;

import br.com.store.budgets.Budget;
import java.math.BigDecimal;

public class DiscountForBudgetWithMoreThanFiveItems extends Discount {

    private static final int MINIMUM_ITEMS_TO_DISCOUNT = 5;

    public DiscountForBudgetWithMoreThanFiveItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getItemsCount() > MINIMUM_ITEMS_TO_DISCOUNT) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return nextDiscount.calculate(budget);
    }

}