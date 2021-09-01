package br.com.store.discounts;

import br.com.store.budgets.Budget;
import java.math.BigDecimal;

public class DiscountForBudgetWithMoreThanFiveItems extends Discount {

    private static final int MINIMUM_ITEMS_TO_DISCOUNT = 5;

    public DiscountForBudgetWithMoreThanFiveItems(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public BigDecimal applyCalculus(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApplyDiscount(Budget budget) {
        return budget.getItemsCount() > MINIMUM_ITEMS_TO_DISCOUNT;
    }

}